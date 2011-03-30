lexer grammar InternalScxmlxt;
@header {
package no.hal.scxml.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T15 : ';' ;
T16 : '*' ;
T17 : '[]' ;
T18 : 'true' ;
T19 : 'false' ;
T20 : 'ms' ;
T21 : 's' ;
T22 : 'm' ;
T23 : 'h' ;
T24 : 'domain' ;
T25 : 'model' ;
T26 : 'data' ;
T27 : '{' ;
T28 : '}' ;
T29 : '->' ;
T30 : 'do' ;
T31 : '<-' ;
T32 : 'on' ;
T33 : 'if' ;
T34 : '!' ;
T35 : 'enter' ;
T36 : 'exit' ;
T37 : 't' ;
T38 : '>' ;
T39 : 'after' ;
T40 : 'var' ;
T41 : ':' ;
T42 : '=' ;
T43 : '.' ;
T44 : '+' ;
T45 : '-' ;
T46 : '/ ' ;

// $ANTLR src "../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g" 6024
RULE_SCRIPT_EXPRESSION : '[[' ( options {greedy=false;} : . )*']]';

// $ANTLR src "../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g" 6026
RULE_SCRIPT_STATEMENTS : '{{' ( options {greedy=false;} : . )*'}}';

// $ANTLR src "../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g" 6028
RULE_URI_LITERAL : '@' ('a'..'z'|'A'..'Z'|'0'..'9'|':'|'_'|'-'|'+'|'.'|'/'|'#'|'?'|'='|'&'|'%'|'@'|'$')+;

// $ANTLR src "../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g" 6030
RULE_EOBJECT_URI_LITERAL : '\u20AC' ('a'..'z'|'A'..'Z'|'0'..'9'|':'|'_'|'-'|'+'|'.'|'/'|'#'|'?'|'='|'&'|'%'|'@'|'$')+;

// $ANTLR src "../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g" 6032
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g" 6034
RULE_INT : ('0'..'9')+;

// $ANTLR src "../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g" 6036
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g" 6038
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g" 6040
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g" 6042
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g" 6044
RULE_ANY_OTHER : .;


