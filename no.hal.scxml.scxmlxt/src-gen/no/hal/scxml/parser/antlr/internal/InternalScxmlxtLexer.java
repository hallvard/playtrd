package no.hal.scxml.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalScxmlxtLexer extends Lexer {
    public static final int T29=29;
    public static final int T36=36;
    public static final int RULE_STRING=4;
    public static final int T35=35;
    public static final int RULE_SCRIPT_EXPRESSION=6;
    public static final int T45=45;
    public static final int T20=20;
    public static final int T34=34;
    public static final int RULE_SCRIPT_STATEMENTS=7;
    public static final int T25=25;
    public static final int T18=18;
    public static final int T37=37;
    public static final int T26=26;
    public static final int RULE_INT=8;
    public static final int T32=32;
    public static final int T17=17;
    public static final int T46=46;
    public static final int T16=16;
    public static final int RULE_EOBJECT_URI_LITERAL=10;
    public static final int T38=38;
    public static final int T41=41;
    public static final int T24=24;
    public static final int T19=19;
    public static final int T39=39;
    public static final int T21=21;
    public static final int T44=44;
    public static final int RULE_ML_COMMENT=11;
    public static final int RULE_ID=5;
    public static final int T33=33;
    public static final int T22=22;
    public static final int T43=43;
    public static final int T23=23;
    public static final int T28=28;
    public static final int T42=42;
    public static final int T40=40;
    public static final int RULE_WS=13;
    public static final int T15=15;
    public static final int EOF=-1;
    public static final int Tokens=47;
    public static final int RULE_ANY_OTHER=14;
    public static final int T31=31;
    public static final int RULE_SL_COMMENT=12;
    public static final int T27=27;
    public static final int RULE_URI_LITERAL=9;
    public static final int T30=30;
    public InternalScxmlxtLexer() {;} 
    public InternalScxmlxtLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g"; }

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:10:5: ( 'domain' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:10:7: 'domain'
            {
            match("domain"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:11:5: ( 'model' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:11:7: 'model'
            {
            match("model"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:12:5: ( ';' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:12:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:13:5: ( 'data' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:13:7: 'data'
            {
            match("data"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:14:5: ( '{' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:14:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:15:5: ( '}' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:15:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:16:5: ( '->' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:16:7: '->'
            {
            match("->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:17:5: ( 'do' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:17:7: 'do'
            {
            match("do"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:18:5: ( '<-' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:18:7: '<-'
            {
            match("<-"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:19:5: ( 'on' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:19:7: 'on'
            {
            match("on"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:20:5: ( 'if' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:20:7: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:21:5: ( '!' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:21:7: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:22:5: ( 'enter' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:22:7: 'enter'
            {
            match("enter"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:23:5: ( 'exit' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:23:7: 'exit'
            {
            match("exit"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:24:5: ( 't' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:24:7: 't'
            {
            match('t'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:25:5: ( '>' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:25:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:26:5: ( 'after' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:26:7: 'after'
            {
            match("after"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:27:5: ( 'var' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:27:7: 'var'
            {
            match("var"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:28:5: ( ':' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:28:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:29:5: ( '*' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:29:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:30:5: ( '[]' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:30:7: '[]'
            {
            match("[]"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:31:5: ( '=' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:31:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:32:5: ( 'true' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:32:7: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:33:5: ( 'false' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:33:7: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:34:5: ( '.' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:34:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:35:5: ( '+' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:35:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:36:5: ( '-' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:36:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:37:5: ( '/ ' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:37:7: '/ '
            {
            match("/ "); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:38:5: ( 'ms' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:38:7: 'ms'
            {
            match("ms"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:39:5: ( 's' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:39:7: 's'
            {
            match('s'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:40:5: ( 'm' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:40:7: 'm'
            {
            match('m'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:41:5: ( 'h' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:41:7: 'h'
            {
            match('h'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start RULE_SCRIPT_EXPRESSION
    public final void mRULE_SCRIPT_EXPRESSION() throws RecognitionException {
        try {
            int _type = RULE_SCRIPT_EXPRESSION;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2917:24: ( '[[' ( options {greedy=false; } : . )* ']]' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2917:26: '[[' ( options {greedy=false; } : . )* ']]'
            {
            match("[["); 

            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2917:31: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==']') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==']') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='\\')||(LA1_1>='^' && LA1_1<='\uFFFE')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='\\')||(LA1_0>='^' && LA1_0<='\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2917:59: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("]]"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SCRIPT_EXPRESSION

    // $ANTLR start RULE_SCRIPT_STATEMENTS
    public final void mRULE_SCRIPT_STATEMENTS() throws RecognitionException {
        try {
            int _type = RULE_SCRIPT_STATEMENTS;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2919:24: ( '{{' ( options {greedy=false; } : . )* '}}' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2919:26: '{{' ( options {greedy=false; } : . )* '}}'
            {
            match("{{"); 

            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2919:31: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='}') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='}') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='|')||(LA2_1>='~' && LA2_1<='\uFFFE')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='|')||(LA2_0>='~' && LA2_0<='\uFFFE')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2919:59: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("}}"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SCRIPT_STATEMENTS

    // $ANTLR start RULE_URI_LITERAL
    public final void mRULE_URI_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_URI_LITERAL;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2921:18: ( '@' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ':' | '_' | '-' | '+' | '.' | '/' | '#' | '?' | '=' | '&' | '%' | '@' | '$' )+ )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2921:20: '@' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ':' | '_' | '-' | '+' | '.' | '/' | '#' | '?' | '=' | '&' | '%' | '@' | '$' )+
            {
            match('@'); 
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2921:24: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ':' | '_' | '-' | '+' | '.' | '/' | '#' | '?' | '=' | '&' | '%' | '@' | '$' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='#' && LA3_0<='&')||LA3_0=='+'||(LA3_0>='-' && LA3_0<=':')||LA3_0=='='||(LA3_0>='?' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:
            	    {
            	    if ( (input.LA(1)>='#' && input.LA(1)<='&')||input.LA(1)=='+'||(input.LA(1)>='-' && input.LA(1)<=':')||input.LA(1)=='='||(input.LA(1)>='?' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_URI_LITERAL

    // $ANTLR start RULE_EOBJECT_URI_LITERAL
    public final void mRULE_EOBJECT_URI_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_EOBJECT_URI_LITERAL;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2923:26: ( '\\u20AC' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ':' | '_' | '-' | '+' | '.' | '/' | '#' | '?' | '=' | '&' | '%' | '@' | '$' )+ )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2923:28: '\\u20AC' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ':' | '_' | '-' | '+' | '.' | '/' | '#' | '?' | '=' | '&' | '%' | '@' | '$' )+
            {
            match('\u20AC'); 
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2923:37: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ':' | '_' | '-' | '+' | '.' | '/' | '#' | '?' | '=' | '&' | '%' | '@' | '$' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='#' && LA4_0<='&')||LA4_0=='+'||(LA4_0>='-' && LA4_0<=':')||LA4_0=='='||(LA4_0>='?' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:
            	    {
            	    if ( (input.LA(1)>='#' && input.LA(1)<='&')||input.LA(1)=='+'||(input.LA(1)>='-' && input.LA(1)<=':')||input.LA(1)=='='||(input.LA(1)>='?' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_EOBJECT_URI_LITERAL

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2925:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2925:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2925:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2925:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2925:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2927:10: ( ( '0' .. '9' )+ )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2927:12: ( '0' .. '9' )+
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2927:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2927:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2929:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2929:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2929:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2929:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2929:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2929:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFE')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2929:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2929:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2929:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2929:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFE')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2929:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2929:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2931:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2931:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2931:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFE')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFE')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2931:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2933:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2933:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2933:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFE')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2933:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2933:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2933:41: ( '\\r' )? '\\n'
                    {
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2933:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2933:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2935:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2935:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2935:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2937:16: ( . )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2937:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:8: ( T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | RULE_SCRIPT_EXPRESSION | RULE_SCRIPT_STATEMENTS | RULE_URI_LITERAL | RULE_EOBJECT_URI_LITERAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=43;
        int LA16_0 = input.LA(1);

        if ( (LA16_0=='d') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA16_35 = input.LA(3);

                if ( (LA16_35=='t') ) {
                    int LA16_76 = input.LA(4);

                    if ( (LA16_76=='a') ) {
                        int LA16_89 = input.LA(5);

                        if ( ((LA16_89>='0' && LA16_89<='9')||(LA16_89>='A' && LA16_89<='Z')||LA16_89=='_'||(LA16_89>='a' && LA16_89<='z')) ) {
                            alt16=37;
                        }
                        else {
                            alt16=4;}
                    }
                    else {
                        alt16=37;}
                }
                else {
                    alt16=37;}
                }
                break;
            case 'o':
                {
                switch ( input.LA(3) ) {
                case 'm':
                    {
                    int LA16_77 = input.LA(4);

                    if ( (LA16_77=='a') ) {
                        int LA16_90 = input.LA(5);

                        if ( (LA16_90=='i') ) {
                            int LA16_99 = input.LA(6);

                            if ( (LA16_99=='n') ) {
                                int LA16_106 = input.LA(7);

                                if ( ((LA16_106>='0' && LA16_106<='9')||(LA16_106>='A' && LA16_106<='Z')||LA16_106=='_'||(LA16_106>='a' && LA16_106<='z')) ) {
                                    alt16=37;
                                }
                                else {
                                    alt16=1;}
                            }
                            else {
                                alt16=37;}
                        }
                        else {
                            alt16=37;}
                    }
                    else {
                        alt16=37;}
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt16=37;
                    }
                    break;
                default:
                    alt16=8;}

                }
                break;
            default:
                alt16=37;}

        }
        else if ( (LA16_0=='m') ) {
            switch ( input.LA(2) ) {
            case 's':
                {
                int LA16_38 = input.LA(3);

                if ( ((LA16_38>='0' && LA16_38<='9')||(LA16_38>='A' && LA16_38<='Z')||LA16_38=='_'||(LA16_38>='a' && LA16_38<='z')) ) {
                    alt16=37;
                }
                else {
                    alt16=29;}
                }
                break;
            case 'o':
                {
                int LA16_39 = input.LA(3);

                if ( (LA16_39=='d') ) {
                    int LA16_80 = input.LA(4);

                    if ( (LA16_80=='e') ) {
                        int LA16_91 = input.LA(5);

                        if ( (LA16_91=='l') ) {
                            int LA16_100 = input.LA(6);

                            if ( ((LA16_100>='0' && LA16_100<='9')||(LA16_100>='A' && LA16_100<='Z')||LA16_100=='_'||(LA16_100>='a' && LA16_100<='z')) ) {
                                alt16=37;
                            }
                            else {
                                alt16=2;}
                        }
                        else {
                            alt16=37;}
                    }
                    else {
                        alt16=37;}
                }
                else {
                    alt16=37;}
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'q':
            case 'r':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt16=37;
                }
                break;
            default:
                alt16=31;}

        }
        else if ( (LA16_0==';') ) {
            alt16=3;
        }
        else if ( (LA16_0=='{') ) {
            int LA16_4 = input.LA(2);

            if ( (LA16_4=='{') ) {
                alt16=34;
            }
            else {
                alt16=5;}
        }
        else if ( (LA16_0=='}') ) {
            alt16=6;
        }
        else if ( (LA16_0=='-') ) {
            int LA16_6 = input.LA(2);

            if ( (LA16_6=='>') ) {
                alt16=7;
            }
            else {
                alt16=27;}
        }
        else if ( (LA16_0=='<') ) {
            int LA16_7 = input.LA(2);

            if ( (LA16_7=='-') ) {
                alt16=9;
            }
            else {
                alt16=43;}
        }
        else if ( (LA16_0=='o') ) {
            int LA16_8 = input.LA(2);

            if ( (LA16_8=='n') ) {
                int LA16_48 = input.LA(3);

                if ( ((LA16_48>='0' && LA16_48<='9')||(LA16_48>='A' && LA16_48<='Z')||LA16_48=='_'||(LA16_48>='a' && LA16_48<='z')) ) {
                    alt16=37;
                }
                else {
                    alt16=10;}
            }
            else {
                alt16=37;}
        }
        else if ( (LA16_0=='i') ) {
            int LA16_9 = input.LA(2);

            if ( (LA16_9=='f') ) {
                int LA16_49 = input.LA(3);

                if ( ((LA16_49>='0' && LA16_49<='9')||(LA16_49>='A' && LA16_49<='Z')||LA16_49=='_'||(LA16_49>='a' && LA16_49<='z')) ) {
                    alt16=37;
                }
                else {
                    alt16=11;}
            }
            else {
                alt16=37;}
        }
        else if ( (LA16_0=='!') ) {
            alt16=12;
        }
        else if ( (LA16_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA16_51 = input.LA(3);

                if ( (LA16_51=='t') ) {
                    int LA16_83 = input.LA(4);

                    if ( (LA16_83=='e') ) {
                        int LA16_92 = input.LA(5);

                        if ( (LA16_92=='r') ) {
                            int LA16_101 = input.LA(6);

                            if ( ((LA16_101>='0' && LA16_101<='9')||(LA16_101>='A' && LA16_101<='Z')||LA16_101=='_'||(LA16_101>='a' && LA16_101<='z')) ) {
                                alt16=37;
                            }
                            else {
                                alt16=13;}
                        }
                        else {
                            alt16=37;}
                    }
                    else {
                        alt16=37;}
                }
                else {
                    alt16=37;}
                }
                break;
            case 'x':
                {
                int LA16_52 = input.LA(3);

                if ( (LA16_52=='i') ) {
                    int LA16_84 = input.LA(4);

                    if ( (LA16_84=='t') ) {
                        int LA16_93 = input.LA(5);

                        if ( ((LA16_93>='0' && LA16_93<='9')||(LA16_93>='A' && LA16_93<='Z')||LA16_93=='_'||(LA16_93>='a' && LA16_93<='z')) ) {
                            alt16=37;
                        }
                        else {
                            alt16=14;}
                    }
                    else {
                        alt16=37;}
                }
                else {
                    alt16=37;}
                }
                break;
            default:
                alt16=37;}

        }
        else if ( (LA16_0=='t') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA16_53 = input.LA(3);

                if ( (LA16_53=='u') ) {
                    int LA16_85 = input.LA(4);

                    if ( (LA16_85=='e') ) {
                        int LA16_94 = input.LA(5);

                        if ( ((LA16_94>='0' && LA16_94<='9')||(LA16_94>='A' && LA16_94<='Z')||LA16_94=='_'||(LA16_94>='a' && LA16_94<='z')) ) {
                            alt16=37;
                        }
                        else {
                            alt16=23;}
                    }
                    else {
                        alt16=37;}
                }
                else {
                    alt16=37;}
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt16=37;
                }
                break;
            default:
                alt16=15;}

        }
        else if ( (LA16_0=='>') ) {
            alt16=16;
        }
        else if ( (LA16_0=='a') ) {
            int LA16_14 = input.LA(2);

            if ( (LA16_14=='f') ) {
                int LA16_56 = input.LA(3);

                if ( (LA16_56=='t') ) {
                    int LA16_86 = input.LA(4);

                    if ( (LA16_86=='e') ) {
                        int LA16_95 = input.LA(5);

                        if ( (LA16_95=='r') ) {
                            int LA16_104 = input.LA(6);

                            if ( ((LA16_104>='0' && LA16_104<='9')||(LA16_104>='A' && LA16_104<='Z')||LA16_104=='_'||(LA16_104>='a' && LA16_104<='z')) ) {
                                alt16=37;
                            }
                            else {
                                alt16=17;}
                        }
                        else {
                            alt16=37;}
                    }
                    else {
                        alt16=37;}
                }
                else {
                    alt16=37;}
            }
            else {
                alt16=37;}
        }
        else if ( (LA16_0=='v') ) {
            int LA16_15 = input.LA(2);

            if ( (LA16_15=='a') ) {
                int LA16_57 = input.LA(3);

                if ( (LA16_57=='r') ) {
                    int LA16_87 = input.LA(4);

                    if ( ((LA16_87>='0' && LA16_87<='9')||(LA16_87>='A' && LA16_87<='Z')||LA16_87=='_'||(LA16_87>='a' && LA16_87<='z')) ) {
                        alt16=37;
                    }
                    else {
                        alt16=18;}
                }
                else {
                    alt16=37;}
            }
            else {
                alt16=37;}
        }
        else if ( (LA16_0==':') ) {
            alt16=19;
        }
        else if ( (LA16_0=='*') ) {
            alt16=20;
        }
        else if ( (LA16_0=='[') ) {
            switch ( input.LA(2) ) {
            case '[':
                {
                alt16=33;
                }
                break;
            case ']':
                {
                alt16=21;
                }
                break;
            default:
                alt16=43;}

        }
        else if ( (LA16_0=='=') ) {
            alt16=22;
        }
        else if ( (LA16_0=='f') ) {
            int LA16_20 = input.LA(2);

            if ( (LA16_20=='a') ) {
                int LA16_63 = input.LA(3);

                if ( (LA16_63=='l') ) {
                    int LA16_88 = input.LA(4);

                    if ( (LA16_88=='s') ) {
                        int LA16_97 = input.LA(5);

                        if ( (LA16_97=='e') ) {
                            int LA16_105 = input.LA(6);

                            if ( ((LA16_105>='0' && LA16_105<='9')||(LA16_105>='A' && LA16_105<='Z')||LA16_105=='_'||(LA16_105>='a' && LA16_105<='z')) ) {
                                alt16=37;
                            }
                            else {
                                alt16=24;}
                        }
                        else {
                            alt16=37;}
                    }
                    else {
                        alt16=37;}
                }
                else {
                    alt16=37;}
            }
            else {
                alt16=37;}
        }
        else if ( (LA16_0=='.') ) {
            alt16=25;
        }
        else if ( (LA16_0=='+') ) {
            alt16=26;
        }
        else if ( (LA16_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt16=40;
                }
                break;
            case ' ':
                {
                alt16=28;
                }
                break;
            case '/':
                {
                alt16=41;
                }
                break;
            default:
                alt16=43;}

        }
        else if ( (LA16_0=='s') ) {
            int LA16_24 = input.LA(2);

            if ( ((LA16_24>='0' && LA16_24<='9')||(LA16_24>='A' && LA16_24<='Z')||LA16_24=='_'||(LA16_24>='a' && LA16_24<='z')) ) {
                alt16=37;
            }
            else {
                alt16=30;}
        }
        else if ( (LA16_0=='h') ) {
            int LA16_25 = input.LA(2);

            if ( ((LA16_25>='0' && LA16_25<='9')||(LA16_25>='A' && LA16_25<='Z')||LA16_25=='_'||(LA16_25>='a' && LA16_25<='z')) ) {
                alt16=37;
            }
            else {
                alt16=32;}
        }
        else if ( (LA16_0=='@') ) {
            int LA16_26 = input.LA(2);

            if ( ((LA16_26>='#' && LA16_26<='&')||LA16_26=='+'||(LA16_26>='-' && LA16_26<=':')||LA16_26=='='||(LA16_26>='?' && LA16_26<='Z')||LA16_26=='_'||(LA16_26>='a' && LA16_26<='z')) ) {
                alt16=35;
            }
            else {
                alt16=43;}
        }
        else if ( (LA16_0=='\u20AC') ) {
            int LA16_27 = input.LA(2);

            if ( ((LA16_27>='#' && LA16_27<='&')||LA16_27=='+'||(LA16_27>='-' && LA16_27<=':')||LA16_27=='='||(LA16_27>='?' && LA16_27<='Z')||LA16_27=='_'||(LA16_27>='a' && LA16_27<='z')) ) {
                alt16=36;
            }
            else {
                alt16=43;}
        }
        else if ( (LA16_0=='^') ) {
            int LA16_28 = input.LA(2);

            if ( ((LA16_28>='A' && LA16_28<='Z')||LA16_28=='_'||(LA16_28>='a' && LA16_28<='z')) ) {
                alt16=37;
            }
            else {
                alt16=43;}
        }
        else if ( ((LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='b' && LA16_0<='c')||LA16_0=='g'||(LA16_0>='j' && LA16_0<='l')||LA16_0=='n'||(LA16_0>='p' && LA16_0<='r')||LA16_0=='u'||(LA16_0>='w' && LA16_0<='z')) ) {
            alt16=37;
        }
        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {
            alt16=38;
        }
        else if ( (LA16_0=='\"') ) {
            int LA16_31 = input.LA(2);

            if ( ((LA16_31>='\u0000' && LA16_31<='\uFFFE')) ) {
                alt16=39;
            }
            else {
                alt16=43;}
        }
        else if ( (LA16_0=='\'') ) {
            int LA16_32 = input.LA(2);

            if ( ((LA16_32>='\u0000' && LA16_32<='\uFFFE')) ) {
                alt16=39;
            }
            else {
                alt16=43;}
        }
        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
            alt16=42;
        }
        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='(' && LA16_0<=')')||LA16_0==','||LA16_0=='?'||(LA16_0>='\\' && LA16_0<=']')||LA16_0=='`'||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\u20AB')||(LA16_0>='\u20AD' && LA16_0<='\uFFFE')) ) {
            alt16=43;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | RULE_SCRIPT_EXPRESSION | RULE_SCRIPT_STATEMENTS | RULE_URI_LITERAL | RULE_EOBJECT_URI_LITERAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 16, 0, input);

            throw nvae;
        }
        switch (alt16) {
            case 1 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:10: T15
                {
                mT15(); 

                }
                break;
            case 2 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:14: T16
                {
                mT16(); 

                }
                break;
            case 3 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:18: T17
                {
                mT17(); 

                }
                break;
            case 4 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:22: T18
                {
                mT18(); 

                }
                break;
            case 5 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:26: T19
                {
                mT19(); 

                }
                break;
            case 6 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:30: T20
                {
                mT20(); 

                }
                break;
            case 7 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:34: T21
                {
                mT21(); 

                }
                break;
            case 8 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:38: T22
                {
                mT22(); 

                }
                break;
            case 9 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:42: T23
                {
                mT23(); 

                }
                break;
            case 10 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:46: T24
                {
                mT24(); 

                }
                break;
            case 11 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:50: T25
                {
                mT25(); 

                }
                break;
            case 12 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:54: T26
                {
                mT26(); 

                }
                break;
            case 13 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:58: T27
                {
                mT27(); 

                }
                break;
            case 14 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:62: T28
                {
                mT28(); 

                }
                break;
            case 15 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:66: T29
                {
                mT29(); 

                }
                break;
            case 16 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:70: T30
                {
                mT30(); 

                }
                break;
            case 17 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:74: T31
                {
                mT31(); 

                }
                break;
            case 18 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:78: T32
                {
                mT32(); 

                }
                break;
            case 19 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:82: T33
                {
                mT33(); 

                }
                break;
            case 20 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:86: T34
                {
                mT34(); 

                }
                break;
            case 21 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:90: T35
                {
                mT35(); 

                }
                break;
            case 22 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:94: T36
                {
                mT36(); 

                }
                break;
            case 23 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:98: T37
                {
                mT37(); 

                }
                break;
            case 24 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:102: T38
                {
                mT38(); 

                }
                break;
            case 25 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:106: T39
                {
                mT39(); 

                }
                break;
            case 26 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:110: T40
                {
                mT40(); 

                }
                break;
            case 27 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:114: T41
                {
                mT41(); 

                }
                break;
            case 28 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:118: T42
                {
                mT42(); 

                }
                break;
            case 29 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:122: T43
                {
                mT43(); 

                }
                break;
            case 30 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:126: T44
                {
                mT44(); 

                }
                break;
            case 31 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:130: T45
                {
                mT45(); 

                }
                break;
            case 32 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:134: T46
                {
                mT46(); 

                }
                break;
            case 33 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:138: RULE_SCRIPT_EXPRESSION
                {
                mRULE_SCRIPT_EXPRESSION(); 

                }
                break;
            case 34 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:161: RULE_SCRIPT_STATEMENTS
                {
                mRULE_SCRIPT_STATEMENTS(); 

                }
                break;
            case 35 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:184: RULE_URI_LITERAL
                {
                mRULE_URI_LITERAL(); 

                }
                break;
            case 36 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:201: RULE_EOBJECT_URI_LITERAL
                {
                mRULE_EOBJECT_URI_LITERAL(); 

                }
                break;
            case 37 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:226: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 38 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:234: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 39 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:243: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 40 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:255: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 41 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:271: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 42 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:287: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 43 :
                // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1:295: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}