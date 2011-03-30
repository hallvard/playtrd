<?xml version="1.0" encoding="ASCII"?>
<tm.widgets:Composite xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:swt.layouts="http://www.eclipse.org/e4/swt/layouts.ecore" xmlns:tm.widgets="http://www.eclipse.org/e4/tm/widgets.ecore" name="librariesView" scriptSource="function init() {&#xD;&#x9;loadEPackage(&quot;http://www.eclipse.org/e4/tm/examples/library/lib.ecore&quot;, &quot;platform:/resource/org.eclipse.e4.tm.examples/library/lib.ecore&quot;);&#xA;&#x9;var uod = findInstance(getEditingDomain().resourceSet, $library.$UoD);&#xA;&#x9;this.dataObject = (uod != undefined ? uod : null);&#xA;}&#xA;&#xA;function onSetDataObject(notification) { &#xA;&#x9;var uod = this.dataObject;&#xA;&#x9;this.$libraryListView.dataObject = (uod != null ? uod.allLibraries : null);&#xA;}">
      <controls xsi:type="libui:CustomCombo"
      		xmlns:libui="http://www.eclipse.org/e4/tm/examples/library/libui.ecore"
      		xsi:schemaLocation="http://www.eclipse.org/e4/tm/examples/library/libui.ecore ./libui.ecore"
       		name="bookAuthor" scriptSource="" selectionIndex="-1" text="">
      </controls>
</tm.widgets:Composite>
