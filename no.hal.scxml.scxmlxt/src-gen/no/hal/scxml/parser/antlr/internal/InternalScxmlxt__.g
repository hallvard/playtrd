lexer grammar InternalScxmlxt;
@header {
package no.hal.scxml.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T15 : 'domain' ;
T16 : 'model' ;
T17 : ';' ;
T18 : 'data' ;
T19 : '{' ;
T20 : '}' ;
T21 : '->' ;
T22 : 'do' ;
T23 : '<-' ;
T24 : 'on' ;
T25 : 'if' ;
T26 : '!' ;
T27 : 'enter' ;
T28 : 'exit' ;
T29 : 't' ;
T30 : '>' ;
T31 : 'after' ;
T32 : 'var' ;
T33 : ':' ;
T34 : '*' ;
T35 : '[]' ;
T36 : '=' ;
T37 : 'true' ;
T38 : 'false' ;
T39 : '.' ;
T40 : '+' ;
T41 : '-' ;
T42 : '/ ' ;
T43 : 'ms' ;
T44 : 's' ;
T45 : 'm' ;
T46 : 'h' ;

// $ANTLR src "../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g" 2917
RULE_SCRIPT_EXPRESSION : '[[' ( options {greedy=false;} : . )*']]';

// $ANTLR src "../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g" 2919
RULE_SCRIPT_STATEMENTS : '{{' ( options {greedy=false;} : . )*'}}';

// $ANTLR src "../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g" 2921
RULE_URI_LITERAL : '@' ('a'..'z'|'A'..'Z'|'0'..'9'|':'|'_'|'-'|'+'|'.'|'/'|'#'|'?'|'='|'&'|'%'|'@'|'$')+;

// $ANTLR src "../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g" 2923
RULE_EOBJECT_URI_LITERAL : '\u20AC' ('a'..'z'|'A'..'Z'|'0'..'9'|':'|'_'|'-'|'+'|'.'|'/'|'#'|'?'|'='|'&'|'%'|'@'|'$')+;

// $ANTLR src "../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g" 2925
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g" 2927
RULE_INT : ('0'..'9')+;

// $ANTLR src "../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g" 2929
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g" 2931
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g" 2933
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g" 2935
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g" 2937
RULE_ANY_OTHER : .;


