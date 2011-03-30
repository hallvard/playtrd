package no.hal.scxml.generator;

import no.hal.scxml.scxmlxt.ScxmlxtPackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.parsetree.AbstractNode;

public class ScxmlxtTerminalConverters extends Ecore2XtextTerminalConverters {
	
	private static class IxesConverter implements IValueConverter<String> {
		String prefix, suffix;
		public IxesConverter(String prefix, String suffix) {
			this.prefix = prefix;
			this.suffix = suffix;
		}
		public String toValue(String s, AbstractNode node) {
			if (s != null) {
				if (prefix != null && s.startsWith(prefix)) {
					s = s.substring(prefix.length());
				}
				if (suffix != null && s.endsWith(suffix)) {
					s = s.substring(0, s.length() - suffix.length());
				}
			}
			return s;
		}
		public String toString(String value) {
			if (value != null) {
				if (prefix != null && (! value.startsWith(prefix))) {
					value = prefix + value.substring(prefix.length());
				}
				if (suffix != null && (! value.endsWith(suffix))) {
					value = value + suffix;
				}
			}
			return value;
		}
	}

	private static class EDataTypeConverter<T> implements IValueConverter<T> {
		private EDataType eDataType;
		private IValueConverter<String> valueConverter;
		
		public EDataTypeConverter(EDataType eDataType, IValueConverter<String> valueConverter) {
			this.eDataType = eDataType;
			this.valueConverter = valueConverter;
		}
		
		private EFactory getEFactory() {
			return eDataType.getEPackage().getEFactoryInstance();
		}
		
		public T toValue(String s, AbstractNode node) throws ValueConverterException {
			try {
				return (T)getEFactory().createFromString(eDataType, valueConverter != null ? valueConverter.toValue(s, node) : s);
			} catch (Exception e) {
				throw new ValueConverterException(e.getMessage(), node, e);
			}
		}
		public String toString(T value) {
			try {
				String s = getEFactory().convertToString(eDataType, value);
				return valueConverter != null ? valueConverter.toString(s) : s;
			} catch (Exception e) {
				return String.valueOf(value);
			}
		}
	};
	
	@ValueConverter(rule = "URI_LITERAL")
	public IValueConverter<URI> URI_LITERAL() {
		return new EDataTypeConverter<URI>(ScxmlxtPackage.eINSTANCE.getEURI(), new IxesConverter("@", null));
	}
	@ValueConverter(rule = "EOBJECT_URI_LITERAL")
	public IValueConverter<URI> EOBJECT_URI_LITERAL() {
		return new EDataTypeConverter<URI>(ScxmlxtPackage.eINSTANCE.getEURI(), new IxesConverter("Û", null));
	}

	@ValueConverter(rule = "SCRIPT_EXPRESSION")
	public IValueConverter<String> SCRIPT_EXPRESSION() {
		return new IxesConverter("[[", "]]");
	}

	@ValueConverter(rule = "SCRIPT_STATEMENTS")
	public IValueConverter<String> SCRIPT_STATEMENTS() {
		return new IxesConverter("{{", "}}");
	}
}
