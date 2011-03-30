package no.hal.scxml.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import no.hal.scxml.services.ScxmlxtGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalScxmlxtParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_SCRIPT_EXPRESSION", "RULE_SCRIPT_STATEMENTS", "RULE_INT", "RULE_URI_LITERAL", "RULE_EOBJECT_URI_LITERAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'domain'", "'model'", "';'", "'data'", "'{'", "'}'", "'->'", "'do'", "'<-'", "'on'", "'if'", "'!'", "'enter'", "'exit'", "'t'", "'>'", "'after'", "'var'", "':'", "'*'", "'[]'", "'='", "'true'", "'false'", "'.'", "'+'", "'-'", "'/ '", "'ms'", "'s'", "'m'", "'h'"
    };
    public static final int RULE_ML_COMMENT=11;
    public static final int RULE_ID=5;
    public static final int RULE_WS=13;
    public static final int RULE_INT=8;
    public static final int EOF=-1;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_EOBJECT_URI_LITERAL=10;
    public static final int RULE_SCRIPT_EXPRESSION=6;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_URI_LITERAL=9;
    public static final int RULE_SCRIPT_STATEMENTS=7;

        public InternalScxmlxtParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g"; }



     	private ScxmlxtGrammarAccess grammarAccess;
     	
        public InternalScxmlxtParser(TokenStream input, IAstFactory factory, ScxmlxtGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("no/hal/scxml/parser/antlr/internal/InternalScxmlxt.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "StateMachine";	
       	}
       	
       	@Override
       	protected ScxmlxtGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleStateMachine
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:78:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:79:2: (iv_ruleStateMachine= ruleStateMachine EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:80:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStateMachineRule(), currentNode); 
            pushFollow(FOLLOW_ruleStateMachine_in_entryRuleStateMachine75);
            iv_ruleStateMachine=ruleStateMachine();
            _fsp--;

             current =iv_ruleStateMachine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateMachine85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStateMachine


    // $ANTLR start ruleStateMachine
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:87:1: ruleStateMachine returns [EObject current=null] : ( ( (lv_imports_0_0= ruleResourceImport ) )* ( ( (lv_states_1_0= ruleState ) ) | ( (lv_transitions_2_0= ruleAbstractTransition ) ) | ( (lv_variables_3_0= ruleVarDef ) ) )* ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_states_1_0 = null;

        EObject lv_transitions_2_0 = null;

        EObject lv_variables_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:92:6: ( ( ( (lv_imports_0_0= ruleResourceImport ) )* ( ( (lv_states_1_0= ruleState ) ) | ( (lv_transitions_2_0= ruleAbstractTransition ) ) | ( (lv_variables_3_0= ruleVarDef ) ) )* ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:93:1: ( ( (lv_imports_0_0= ruleResourceImport ) )* ( ( (lv_states_1_0= ruleState ) ) | ( (lv_transitions_2_0= ruleAbstractTransition ) ) | ( (lv_variables_3_0= ruleVarDef ) ) )* )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:93:1: ( ( (lv_imports_0_0= ruleResourceImport ) )* ( ( (lv_states_1_0= ruleState ) ) | ( (lv_transitions_2_0= ruleAbstractTransition ) ) | ( (lv_variables_3_0= ruleVarDef ) ) )* )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:93:2: ( (lv_imports_0_0= ruleResourceImport ) )* ( ( (lv_states_1_0= ruleState ) ) | ( (lv_transitions_2_0= ruleAbstractTransition ) ) | ( (lv_variables_3_0= ruleVarDef ) ) )*
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:93:2: ( (lv_imports_0_0= ruleResourceImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=15 && LA1_0<=16)||LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:94:1: (lv_imports_0_0= ruleResourceImport )
            	    {
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:94:1: (lv_imports_0_0= ruleResourceImport )
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:95:3: lv_imports_0_0= ruleResourceImport
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStateMachineAccess().getImportsResourceImportParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleResourceImport_in_ruleStateMachine131);
            	    lv_imports_0_0=ruleResourceImport();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStateMachineRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"imports",
            	    	        		lv_imports_0_0, 
            	    	        		"ResourceImport", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:117:3: ( ( (lv_states_1_0= ruleState ) ) | ( (lv_transitions_2_0= ruleAbstractTransition ) ) | ( (lv_variables_3_0= ruleVarDef ) ) )*
            loop2:
            do {
                int alt2=4;
                switch ( input.LA(1) ) {
                case 21:
                    {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==RULE_ID) ) {
                        int LA2_6 = input.LA(3);

                        if ( (LA2_6==17||LA2_6==19) ) {
                            alt2=1;
                        }
                        else if ( (LA2_6==22||(LA2_6>=24 && LA2_6<=25)||LA2_6==39) ) {
                            alt2=2;
                        }


                    }
                    else if ( (LA2_2==22) ) {
                        alt2=1;
                    }


                    }
                    break;
                case RULE_ID:
                    {
                    int LA2_3 = input.LA(2);

                    if ( (LA2_3==17||LA2_3==19) ) {
                        alt2=1;
                    }
                    else if ( (LA2_3==23||LA2_3==39) ) {
                        alt2=2;
                    }


                    }
                    break;
                case 22:
                case 24:
                case 25:
                    {
                    alt2=2;
                    }
                    break;
                case 32:
                    {
                    alt2=3;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:117:4: ( (lv_states_1_0= ruleState ) )
            	    {
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:117:4: ( (lv_states_1_0= ruleState ) )
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:118:1: (lv_states_1_0= ruleState )
            	    {
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:118:1: (lv_states_1_0= ruleState )
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:119:3: lv_states_1_0= ruleState
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_1_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleStateMachine154);
            	    lv_states_1_0=ruleState();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStateMachineRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"states",
            	    	        		lv_states_1_0, 
            	    	        		"State", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:142:6: ( (lv_transitions_2_0= ruleAbstractTransition ) )
            	    {
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:142:6: ( (lv_transitions_2_0= ruleAbstractTransition ) )
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:143:1: (lv_transitions_2_0= ruleAbstractTransition )
            	    {
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:143:1: (lv_transitions_2_0= ruleAbstractTransition )
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:144:3: lv_transitions_2_0= ruleAbstractTransition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStateMachineAccess().getTransitionsAbstractTransitionParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractTransition_in_ruleStateMachine181);
            	    lv_transitions_2_0=ruleAbstractTransition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStateMachineRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"transitions",
            	    	        		lv_transitions_2_0, 
            	    	        		"AbstractTransition", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:167:6: ( (lv_variables_3_0= ruleVarDef ) )
            	    {
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:167:6: ( (lv_variables_3_0= ruleVarDef ) )
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:168:1: (lv_variables_3_0= ruleVarDef )
            	    {
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:168:1: (lv_variables_3_0= ruleVarDef )
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:169:3: lv_variables_3_0= ruleVarDef
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStateMachineAccess().getVariablesVarDefParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleVarDef_in_ruleStateMachine208);
            	    lv_variables_3_0=ruleVarDef();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStateMachineRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"variables",
            	    	        		lv_variables_3_0, 
            	    	        		"VarDef", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStateMachine


    // $ANTLR start entryRuleResourceImport
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:199:1: entryRuleResourceImport returns [EObject current=null] : iv_ruleResourceImport= ruleResourceImport EOF ;
    public final EObject entryRuleResourceImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceImport = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:200:2: (iv_ruleResourceImport= ruleResourceImport EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:201:2: iv_ruleResourceImport= ruleResourceImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getResourceImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleResourceImport_in_entryRuleResourceImport246);
            iv_ruleResourceImport=ruleResourceImport();
            _fsp--;

             current =iv_ruleResourceImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceImport256); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleResourceImport


    // $ANTLR start ruleResourceImport
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:208:1: ruleResourceImport returns [EObject current=null] : (this_DomainModelImport_0= ruleDomainModelImport | this_DomainDataImport_1= ruleDomainDataImport ) ;
    public final EObject ruleResourceImport() throws RecognitionException {
        EObject current = null;

        EObject this_DomainModelImport_0 = null;

        EObject this_DomainDataImport_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:213:6: ( (this_DomainModelImport_0= ruleDomainModelImport | this_DomainDataImport_1= ruleDomainDataImport ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:214:1: (this_DomainModelImport_0= ruleDomainModelImport | this_DomainDataImport_1= ruleDomainDataImport )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:214:1: (this_DomainModelImport_0= ruleDomainModelImport | this_DomainDataImport_1= ruleDomainDataImport )
            int alt3=2;
            switch ( input.LA(1) ) {
            case 15:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==18) ) {
                    alt3=2;
                }
                else if ( (LA3_1==16) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("214:1: (this_DomainModelImport_0= ruleDomainModelImport | this_DomainDataImport_1= ruleDomainDataImport )", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("214:1: (this_DomainModelImport_0= ruleDomainModelImport | this_DomainDataImport_1= ruleDomainDataImport )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:215:5: this_DomainModelImport_0= ruleDomainModelImport
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getResourceImportAccess().getDomainModelImportParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDomainModelImport_in_ruleResourceImport303);
                    this_DomainModelImport_0=ruleDomainModelImport();
                    _fsp--;

                     
                            current = this_DomainModelImport_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:225:5: this_DomainDataImport_1= ruleDomainDataImport
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getResourceImportAccess().getDomainDataImportParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDomainDataImport_in_ruleResourceImport330);
                    this_DomainDataImport_1=ruleDomainDataImport();
                    _fsp--;

                     
                            current = this_DomainDataImport_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleResourceImport


    // $ANTLR start entryRuleDomainModelImport
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:241:1: entryRuleDomainModelImport returns [EObject current=null] : iv_ruleDomainModelImport= ruleDomainModelImport EOF ;
    public final EObject entryRuleDomainModelImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModelImport = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:242:2: (iv_ruleDomainModelImport= ruleDomainModelImport EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:243:2: iv_ruleDomainModelImport= ruleDomainModelImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDomainModelImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleDomainModelImport_in_entryRuleDomainModelImport365);
            iv_ruleDomainModelImport=ruleDomainModelImport();
            _fsp--;

             current =iv_ruleDomainModelImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainModelImport375); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDomainModelImport


    // $ANTLR start ruleDomainModelImport
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:250:1: ruleDomainModelImport returns [EObject current=null] : ( ( 'domain' )? 'model' ( (lv_importURI_2_0= RULE_STRING ) ) ';' ) ;
    public final EObject ruleDomainModelImport() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:255:6: ( ( ( 'domain' )? 'model' ( (lv_importURI_2_0= RULE_STRING ) ) ';' ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:256:1: ( ( 'domain' )? 'model' ( (lv_importURI_2_0= RULE_STRING ) ) ';' )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:256:1: ( ( 'domain' )? 'model' ( (lv_importURI_2_0= RULE_STRING ) ) ';' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:256:2: ( 'domain' )? 'model' ( (lv_importURI_2_0= RULE_STRING ) ) ';'
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:256:2: ( 'domain' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:256:4: 'domain'
                    {
                    match(input,15,FOLLOW_15_in_ruleDomainModelImport411); 

                            createLeafNode(grammarAccess.getDomainModelImportAccess().getDomainKeyword_0(), null); 
                        

                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_ruleDomainModelImport423); 

                    createLeafNode(grammarAccess.getDomainModelImportAccess().getModelKeyword_1(), null); 
                
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:264:1: ( (lv_importURI_2_0= RULE_STRING ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:265:1: (lv_importURI_2_0= RULE_STRING )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:265:1: (lv_importURI_2_0= RULE_STRING )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:266:3: lv_importURI_2_0= RULE_STRING
            {
            lv_importURI_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDomainModelImport440); 

            			createLeafNode(grammarAccess.getDomainModelImportAccess().getImportURISTRINGTerminalRuleCall_2_0(), "importURI"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDomainModelImportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"importURI",
            	        		lv_importURI_2_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleDomainModelImport455); 

                    createLeafNode(grammarAccess.getDomainModelImportAccess().getSemicolonKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDomainModelImport


    // $ANTLR start entryRuleDomainDataImport
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:300:1: entryRuleDomainDataImport returns [EObject current=null] : iv_ruleDomainDataImport= ruleDomainDataImport EOF ;
    public final EObject entryRuleDomainDataImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainDataImport = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:301:2: (iv_ruleDomainDataImport= ruleDomainDataImport EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:302:2: iv_ruleDomainDataImport= ruleDomainDataImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDomainDataImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleDomainDataImport_in_entryRuleDomainDataImport491);
            iv_ruleDomainDataImport=ruleDomainDataImport();
            _fsp--;

             current =iv_ruleDomainDataImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainDataImport501); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDomainDataImport


    // $ANTLR start ruleDomainDataImport
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:309:1: ruleDomainDataImport returns [EObject current=null] : ( ( 'domain' )? 'data' ( (lv_importURI_2_0= RULE_STRING ) ) ';' ) ;
    public final EObject ruleDomainDataImport() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:314:6: ( ( ( 'domain' )? 'data' ( (lv_importURI_2_0= RULE_STRING ) ) ';' ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:315:1: ( ( 'domain' )? 'data' ( (lv_importURI_2_0= RULE_STRING ) ) ';' )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:315:1: ( ( 'domain' )? 'data' ( (lv_importURI_2_0= RULE_STRING ) ) ';' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:315:2: ( 'domain' )? 'data' ( (lv_importURI_2_0= RULE_STRING ) ) ';'
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:315:2: ( 'domain' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:315:4: 'domain'
                    {
                    match(input,15,FOLLOW_15_in_ruleDomainDataImport537); 

                            createLeafNode(grammarAccess.getDomainDataImportAccess().getDomainKeyword_0(), null); 
                        

                    }
                    break;

            }

            match(input,18,FOLLOW_18_in_ruleDomainDataImport549); 

                    createLeafNode(grammarAccess.getDomainDataImportAccess().getDataKeyword_1(), null); 
                
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:323:1: ( (lv_importURI_2_0= RULE_STRING ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:324:1: (lv_importURI_2_0= RULE_STRING )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:324:1: (lv_importURI_2_0= RULE_STRING )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:325:3: lv_importURI_2_0= RULE_STRING
            {
            lv_importURI_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDomainDataImport566); 

            			createLeafNode(grammarAccess.getDomainDataImportAccess().getImportURISTRINGTerminalRuleCall_2_0(), "importURI"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDomainDataImportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"importURI",
            	        		lv_importURI_2_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleDomainDataImport581); 

                    createLeafNode(grammarAccess.getDomainDataImportAccess().getSemicolonKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDomainDataImport


    // $ANTLR start entryRuleState
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:359:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:360:2: (iv_ruleState= ruleState EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:361:2: iv_ruleState= ruleState EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStateRule(), currentNode); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState617);
            iv_ruleState=ruleState();
            _fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState627); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleState


    // $ANTLR start ruleState
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:368:1: ruleState returns [EObject current=null] : ( ( (lv_initialTransition_0_0= ruleInitialTransition ) )? ( (lv_name_1_0= RULE_ID ) ) ( ';' | ( '{' ( ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleAbstractTransition ) ) | ( (lv_variables_6_0= ruleVarDef ) ) )* '}' ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_initialTransition_0_0 = null;

        EObject lv_states_4_0 = null;

        EObject lv_transitions_5_0 = null;

        EObject lv_variables_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:373:6: ( ( ( (lv_initialTransition_0_0= ruleInitialTransition ) )? ( (lv_name_1_0= RULE_ID ) ) ( ';' | ( '{' ( ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleAbstractTransition ) ) | ( (lv_variables_6_0= ruleVarDef ) ) )* '}' ) ) ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:374:1: ( ( (lv_initialTransition_0_0= ruleInitialTransition ) )? ( (lv_name_1_0= RULE_ID ) ) ( ';' | ( '{' ( ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleAbstractTransition ) ) | ( (lv_variables_6_0= ruleVarDef ) ) )* '}' ) ) )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:374:1: ( ( (lv_initialTransition_0_0= ruleInitialTransition ) )? ( (lv_name_1_0= RULE_ID ) ) ( ';' | ( '{' ( ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleAbstractTransition ) ) | ( (lv_variables_6_0= ruleVarDef ) ) )* '}' ) ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:374:2: ( (lv_initialTransition_0_0= ruleInitialTransition ) )? ( (lv_name_1_0= RULE_ID ) ) ( ';' | ( '{' ( ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleAbstractTransition ) ) | ( (lv_variables_6_0= ruleVarDef ) ) )* '}' ) )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:374:2: ( (lv_initialTransition_0_0= ruleInitialTransition ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:375:1: (lv_initialTransition_0_0= ruleInitialTransition )
                    {
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:375:1: (lv_initialTransition_0_0= ruleInitialTransition )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:376:3: lv_initialTransition_0_0= ruleInitialTransition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getInitialTransitionInitialTransitionParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleInitialTransition_in_ruleState673);
                    lv_initialTransition_0_0=ruleInitialTransition();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"initialTransition",
                    	        		lv_initialTransition_0_0, 
                    	        		"InitialTransition", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:398:3: ( (lv_name_1_0= RULE_ID ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:399:1: (lv_name_1_0= RULE_ID )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:399:1: (lv_name_1_0= RULE_ID )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:400:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState691); 

            			createLeafNode(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:422:2: ( ';' | ( '{' ( ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleAbstractTransition ) ) | ( (lv_variables_6_0= ruleVarDef ) ) )* '}' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("422:2: ( ';' | ( '{' ( ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleAbstractTransition ) ) | ( (lv_variables_6_0= ruleVarDef ) ) )* '}' ) )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:422:4: ';'
                    {
                    match(input,17,FOLLOW_17_in_ruleState707); 

                            createLeafNode(grammarAccess.getStateAccess().getSemicolonKeyword_2_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:427:6: ( '{' ( ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleAbstractTransition ) ) | ( (lv_variables_6_0= ruleVarDef ) ) )* '}' )
                    {
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:427:6: ( '{' ( ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleAbstractTransition ) ) | ( (lv_variables_6_0= ruleVarDef ) ) )* '}' )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:427:8: '{' ( ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleAbstractTransition ) ) | ( (lv_variables_6_0= ruleVarDef ) ) )* '}'
                    {
                    match(input,19,FOLLOW_19_in_ruleState724); 

                            createLeafNode(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2_1_0(), null); 
                        
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:431:1: ( ( (lv_states_4_0= ruleState ) ) | ( (lv_transitions_5_0= ruleAbstractTransition ) ) | ( (lv_variables_6_0= ruleVarDef ) ) )*
                    loop7:
                    do {
                        int alt7=4;
                        switch ( input.LA(1) ) {
                        case 21:
                            {
                            int LA7_2 = input.LA(2);

                            if ( (LA7_2==RULE_ID) ) {
                                int LA7_6 = input.LA(3);

                                if ( (LA7_6==22||(LA7_6>=24 && LA7_6<=25)||LA7_6==39) ) {
                                    alt7=2;
                                }
                                else if ( (LA7_6==17||LA7_6==19) ) {
                                    alt7=1;
                                }


                            }
                            else if ( (LA7_2==22) ) {
                                alt7=1;
                            }


                            }
                            break;
                        case RULE_ID:
                            {
                            int LA7_3 = input.LA(2);

                            if ( (LA7_3==23||LA7_3==39) ) {
                                alt7=2;
                            }
                            else if ( (LA7_3==17||LA7_3==19) ) {
                                alt7=1;
                            }


                            }
                            break;
                        case 22:
                        case 24:
                        case 25:
                            {
                            alt7=2;
                            }
                            break;
                        case 32:
                            {
                            alt7=3;
                            }
                            break;

                        }

                        switch (alt7) {
                    	case 1 :
                    	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:431:2: ( (lv_states_4_0= ruleState ) )
                    	    {
                    	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:431:2: ( (lv_states_4_0= ruleState ) )
                    	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:432:1: (lv_states_4_0= ruleState )
                    	    {
                    	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:432:1: (lv_states_4_0= ruleState )
                    	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:433:3: lv_states_4_0= ruleState
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStatesStateParserRuleCall_2_1_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleState_in_ruleState746);
                    	    lv_states_4_0=ruleState();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"states",
                    	    	        		lv_states_4_0, 
                    	    	        		"State", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:456:6: ( (lv_transitions_5_0= ruleAbstractTransition ) )
                    	    {
                    	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:456:6: ( (lv_transitions_5_0= ruleAbstractTransition ) )
                    	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:457:1: (lv_transitions_5_0= ruleAbstractTransition )
                    	    {
                    	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:457:1: (lv_transitions_5_0= ruleAbstractTransition )
                    	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:458:3: lv_transitions_5_0= ruleAbstractTransition
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTransitionsAbstractTransitionParserRuleCall_2_1_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAbstractTransition_in_ruleState773);
                    	    lv_transitions_5_0=ruleAbstractTransition();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"transitions",
                    	    	        		lv_transitions_5_0, 
                    	    	        		"AbstractTransition", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:481:6: ( (lv_variables_6_0= ruleVarDef ) )
                    	    {
                    	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:481:6: ( (lv_variables_6_0= ruleVarDef ) )
                    	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:482:1: (lv_variables_6_0= ruleVarDef )
                    	    {
                    	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:482:1: (lv_variables_6_0= ruleVarDef )
                    	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:483:3: lv_variables_6_0= ruleVarDef
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getVariablesVarDefParserRuleCall_2_1_1_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleVarDef_in_ruleState800);
                    	    lv_variables_6_0=ruleVarDef();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"variables",
                    	    	        		lv_variables_6_0, 
                    	    	        		"VarDef", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match(input,20,FOLLOW_20_in_ruleState812); 

                            createLeafNode(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_1_2(), null); 
                        

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleState


    // $ANTLR start entryRuleInitialTransition
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:517:1: entryRuleInitialTransition returns [EObject current=null] : iv_ruleInitialTransition= ruleInitialTransition EOF ;
    public final EObject entryRuleInitialTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialTransition = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:518:2: (iv_ruleInitialTransition= ruleInitialTransition EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:519:2: iv_ruleInitialTransition= ruleInitialTransition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInitialTransitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleInitialTransition_in_entryRuleInitialTransition850);
            iv_ruleInitialTransition=ruleInitialTransition();
            _fsp--;

             current =iv_ruleInitialTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitialTransition860); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInitialTransition


    // $ANTLR start ruleInitialTransition
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:526:1: ruleInitialTransition returns [EObject current=null] : ( () '->' ( 'do' ( (lv_action_3_0= ruleAction ) ) )? ) ;
    public final EObject ruleInitialTransition() throws RecognitionException {
        EObject current = null;

        EObject lv_action_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:531:6: ( ( () '->' ( 'do' ( (lv_action_3_0= ruleAction ) ) )? ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:532:1: ( () '->' ( 'do' ( (lv_action_3_0= ruleAction ) ) )? )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:532:1: ( () '->' ( 'do' ( (lv_action_3_0= ruleAction ) ) )? )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:532:2: () '->' ( 'do' ( (lv_action_3_0= ruleAction ) ) )?
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:532:2: ()
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:533:5: 
            {
             
                    temp=factory.create(grammarAccess.getInitialTransitionAccess().getInitialTransitionAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getInitialTransitionAccess().getInitialTransitionAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,21,FOLLOW_21_in_ruleInitialTransition904); 

                    createLeafNode(grammarAccess.getInitialTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1(), null); 
                
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:547:1: ( 'do' ( (lv_action_3_0= ruleAction ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:547:3: 'do' ( (lv_action_3_0= ruleAction ) )
                    {
                    match(input,22,FOLLOW_22_in_ruleInitialTransition915); 

                            createLeafNode(grammarAccess.getInitialTransitionAccess().getDoKeyword_2_0(), null); 
                        
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:551:1: ( (lv_action_3_0= ruleAction ) )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:552:1: (lv_action_3_0= ruleAction )
                    {
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:552:1: (lv_action_3_0= ruleAction )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:553:3: lv_action_3_0= ruleAction
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getInitialTransitionAccess().getActionActionParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAction_in_ruleInitialTransition936);
                    lv_action_3_0=ruleAction();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInitialTransitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"action",
                    	        		lv_action_3_0, 
                    	        		"Action", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInitialTransition


    // $ANTLR start entryRuleAbstractTransition
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:585:1: entryRuleAbstractTransition returns [EObject current=null] : iv_ruleAbstractTransition= ruleAbstractTransition EOF ;
    public final EObject entryRuleAbstractTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractTransition = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:586:2: (iv_ruleAbstractTransition= ruleAbstractTransition EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:587:2: iv_ruleAbstractTransition= ruleAbstractTransition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbstractTransitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbstractTransition_in_entryRuleAbstractTransition976);
            iv_ruleAbstractTransition=ruleAbstractTransition();
            _fsp--;

             current =iv_ruleAbstractTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractTransition986); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAbstractTransition


    // $ANTLR start ruleAbstractTransition
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:594:1: ruleAbstractTransition returns [EObject current=null] : (this_Transition_0= ruleTransition | this_InternalTransition_1= ruleInternalTransition ) ;
    public final EObject ruleAbstractTransition() throws RecognitionException {
        EObject current = null;

        EObject this_Transition_0 = null;

        EObject this_InternalTransition_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:599:6: ( (this_Transition_0= ruleTransition | this_InternalTransition_1= ruleInternalTransition ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:600:1: (this_Transition_0= ruleTransition | this_InternalTransition_1= ruleInternalTransition )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:600:1: (this_Transition_0= ruleTransition | this_InternalTransition_1= ruleInternalTransition )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||LA10_0==21) ) {
                alt10=1;
            }
            else if ( (LA10_0==22||(LA10_0>=24 && LA10_0<=25)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("600:1: (this_Transition_0= ruleTransition | this_InternalTransition_1= ruleInternalTransition )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:601:5: this_Transition_0= ruleTransition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractTransitionAccess().getTransitionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTransition_in_ruleAbstractTransition1033);
                    this_Transition_0=ruleTransition();
                    _fsp--;

                     
                            current = this_Transition_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:611:5: this_InternalTransition_1= ruleInternalTransition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractTransitionAccess().getInternalTransitionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInternalTransition_in_ruleAbstractTransition1060);
                    this_InternalTransition_1=ruleInternalTransition();
                    _fsp--;

                     
                            current = this_InternalTransition_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAbstractTransition


    // $ANTLR start entryRuleTransition
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:627:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:628:2: (iv_ruleTransition= ruleTransition EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:629:2: iv_ruleTransition= ruleTransition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTransitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition1095);
            iv_ruleTransition=ruleTransition();
            _fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition1105); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTransition


    // $ANTLR start ruleTransition
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:636:1: ruleTransition returns [EObject current=null] : ( ( ( '->' ( ( ruleQNAME ) ) ) | ( ( ( ruleQNAME ) ) '<-' ) ) ( 'on' ( (lv_event_5_0= ruleEvent ) ) )? ( 'if' ( (lv_condition_7_0= ruleCondition ) ) )? ( 'do' ( (lv_action_9_0= ruleAction ) ) )? ';' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        EObject lv_event_5_0 = null;

        EObject lv_condition_7_0 = null;

        EObject lv_action_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:641:6: ( ( ( ( '->' ( ( ruleQNAME ) ) ) | ( ( ( ruleQNAME ) ) '<-' ) ) ( 'on' ( (lv_event_5_0= ruleEvent ) ) )? ( 'if' ( (lv_condition_7_0= ruleCondition ) ) )? ( 'do' ( (lv_action_9_0= ruleAction ) ) )? ';' ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:642:1: ( ( ( '->' ( ( ruleQNAME ) ) ) | ( ( ( ruleQNAME ) ) '<-' ) ) ( 'on' ( (lv_event_5_0= ruleEvent ) ) )? ( 'if' ( (lv_condition_7_0= ruleCondition ) ) )? ( 'do' ( (lv_action_9_0= ruleAction ) ) )? ';' )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:642:1: ( ( ( '->' ( ( ruleQNAME ) ) ) | ( ( ( ruleQNAME ) ) '<-' ) ) ( 'on' ( (lv_event_5_0= ruleEvent ) ) )? ( 'if' ( (lv_condition_7_0= ruleCondition ) ) )? ( 'do' ( (lv_action_9_0= ruleAction ) ) )? ';' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:642:2: ( ( '->' ( ( ruleQNAME ) ) ) | ( ( ( ruleQNAME ) ) '<-' ) ) ( 'on' ( (lv_event_5_0= ruleEvent ) ) )? ( 'if' ( (lv_condition_7_0= ruleCondition ) ) )? ( 'do' ( (lv_action_9_0= ruleAction ) ) )? ';'
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:642:2: ( ( '->' ( ( ruleQNAME ) ) ) | ( ( ( ruleQNAME ) ) '<-' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("642:2: ( ( '->' ( ( ruleQNAME ) ) ) | ( ( ( ruleQNAME ) ) '<-' ) )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:642:3: ( '->' ( ( ruleQNAME ) ) )
                    {
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:642:3: ( '->' ( ( ruleQNAME ) ) )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:642:5: '->' ( ( ruleQNAME ) )
                    {
                    match(input,21,FOLLOW_21_in_ruleTransition1142); 

                            createLeafNode(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_0_0_0(), null); 
                        
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:646:1: ( ( ruleQNAME ) )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:647:1: ( ruleQNAME )
                    {
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:647:1: ( ruleQNAME )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:648:3: ruleQNAME
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getTargetStateCrossReference_0_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQNAME_in_ruleTransition1165);
                    ruleQNAME();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:663:6: ( ( ( ruleQNAME ) ) '<-' )
                    {
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:663:6: ( ( ( ruleQNAME ) ) '<-' )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:663:7: ( ( ruleQNAME ) ) '<-'
                    {
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:663:7: ( ( ruleQNAME ) )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:664:1: ( ruleQNAME )
                    {
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:664:1: ( ruleQNAME )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:665:3: ruleQNAME
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getTargetStateCrossReference_0_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQNAME_in_ruleTransition1196);
                    ruleQNAME();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,23,FOLLOW_23_in_ruleTransition1206); 

                            createLeafNode(grammarAccess.getTransitionAccess().getLessThanSignHyphenMinusKeyword_0_1_1(), null); 
                        

                    }


                    }
                    break;

            }

            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:683:3: ( 'on' ( (lv_event_5_0= ruleEvent ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:683:5: 'on' ( (lv_event_5_0= ruleEvent ) )
                    {
                    match(input,24,FOLLOW_24_in_ruleTransition1219); 

                            createLeafNode(grammarAccess.getTransitionAccess().getOnKeyword_1_0(), null); 
                        
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:687:1: ( (lv_event_5_0= ruleEvent ) )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:688:1: (lv_event_5_0= ruleEvent )
                    {
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:688:1: (lv_event_5_0= ruleEvent )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:689:3: lv_event_5_0= ruleEvent
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getEventEventParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleEvent_in_ruleTransition1240);
                    lv_event_5_0=ruleEvent();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"event",
                    	        		lv_event_5_0, 
                    	        		"Event", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:711:4: ( 'if' ( (lv_condition_7_0= ruleCondition ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:711:6: 'if' ( (lv_condition_7_0= ruleCondition ) )
                    {
                    match(input,25,FOLLOW_25_in_ruleTransition1253); 

                            createLeafNode(grammarAccess.getTransitionAccess().getIfKeyword_2_0(), null); 
                        
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:715:1: ( (lv_condition_7_0= ruleCondition ) )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:716:1: (lv_condition_7_0= ruleCondition )
                    {
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:716:1: (lv_condition_7_0= ruleCondition )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:717:3: lv_condition_7_0= ruleCondition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getConditionConditionParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCondition_in_ruleTransition1274);
                    lv_condition_7_0=ruleCondition();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"condition",
                    	        		lv_condition_7_0, 
                    	        		"Condition", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:739:4: ( 'do' ( (lv_action_9_0= ruleAction ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:739:6: 'do' ( (lv_action_9_0= ruleAction ) )
                    {
                    match(input,22,FOLLOW_22_in_ruleTransition1287); 

                            createLeafNode(grammarAccess.getTransitionAccess().getDoKeyword_3_0(), null); 
                        
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:743:1: ( (lv_action_9_0= ruleAction ) )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:744:1: (lv_action_9_0= ruleAction )
                    {
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:744:1: (lv_action_9_0= ruleAction )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:745:3: lv_action_9_0= ruleAction
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getActionActionParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAction_in_ruleTransition1308);
                    lv_action_9_0=ruleAction();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"action",
                    	        		lv_action_9_0, 
                    	        		"Action", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,17,FOLLOW_17_in_ruleTransition1320); 

                    createLeafNode(grammarAccess.getTransitionAccess().getSemicolonKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTransition


    // $ANTLR start entryRuleInternalTransition
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:779:1: entryRuleInternalTransition returns [EObject current=null] : iv_ruleInternalTransition= ruleInternalTransition EOF ;
    public final EObject entryRuleInternalTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalTransition = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:780:2: (iv_ruleInternalTransition= ruleInternalTransition EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:781:2: iv_ruleInternalTransition= ruleInternalTransition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInternalTransitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleInternalTransition_in_entryRuleInternalTransition1356);
            iv_ruleInternalTransition=ruleInternalTransition();
            _fsp--;

             current =iv_ruleInternalTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalTransition1366); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInternalTransition


    // $ANTLR start ruleInternalTransition
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:788:1: ruleInternalTransition returns [EObject current=null] : ( ( 'on' ( (lv_event_1_0= ruleEvent ) ) )? ( 'if' ( (lv_condition_3_0= ruleCondition ) ) )? 'do' ( (lv_action_5_0= ruleAction ) ) ';' ) ;
    public final EObject ruleInternalTransition() throws RecognitionException {
        EObject current = null;

        EObject lv_event_1_0 = null;

        EObject lv_condition_3_0 = null;

        EObject lv_action_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:793:6: ( ( ( 'on' ( (lv_event_1_0= ruleEvent ) ) )? ( 'if' ( (lv_condition_3_0= ruleCondition ) ) )? 'do' ( (lv_action_5_0= ruleAction ) ) ';' ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:794:1: ( ( 'on' ( (lv_event_1_0= ruleEvent ) ) )? ( 'if' ( (lv_condition_3_0= ruleCondition ) ) )? 'do' ( (lv_action_5_0= ruleAction ) ) ';' )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:794:1: ( ( 'on' ( (lv_event_1_0= ruleEvent ) ) )? ( 'if' ( (lv_condition_3_0= ruleCondition ) ) )? 'do' ( (lv_action_5_0= ruleAction ) ) ';' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:794:2: ( 'on' ( (lv_event_1_0= ruleEvent ) ) )? ( 'if' ( (lv_condition_3_0= ruleCondition ) ) )? 'do' ( (lv_action_5_0= ruleAction ) ) ';'
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:794:2: ( 'on' ( (lv_event_1_0= ruleEvent ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:794:4: 'on' ( (lv_event_1_0= ruleEvent ) )
                    {
                    match(input,24,FOLLOW_24_in_ruleInternalTransition1402); 

                            createLeafNode(grammarAccess.getInternalTransitionAccess().getOnKeyword_0_0(), null); 
                        
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:798:1: ( (lv_event_1_0= ruleEvent ) )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:799:1: (lv_event_1_0= ruleEvent )
                    {
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:799:1: (lv_event_1_0= ruleEvent )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:800:3: lv_event_1_0= ruleEvent
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getInternalTransitionAccess().getEventEventParserRuleCall_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleEvent_in_ruleInternalTransition1423);
                    lv_event_1_0=ruleEvent();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInternalTransitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"event",
                    	        		lv_event_1_0, 
                    	        		"Event", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:822:4: ( 'if' ( (lv_condition_3_0= ruleCondition ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:822:6: 'if' ( (lv_condition_3_0= ruleCondition ) )
                    {
                    match(input,25,FOLLOW_25_in_ruleInternalTransition1436); 

                            createLeafNode(grammarAccess.getInternalTransitionAccess().getIfKeyword_1_0(), null); 
                        
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:826:1: ( (lv_condition_3_0= ruleCondition ) )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:827:1: (lv_condition_3_0= ruleCondition )
                    {
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:827:1: (lv_condition_3_0= ruleCondition )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:828:3: lv_condition_3_0= ruleCondition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getInternalTransitionAccess().getConditionConditionParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCondition_in_ruleInternalTransition1457);
                    lv_condition_3_0=ruleCondition();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInternalTransitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"condition",
                    	        		lv_condition_3_0, 
                    	        		"Condition", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,22,FOLLOW_22_in_ruleInternalTransition1469); 

                    createLeafNode(grammarAccess.getInternalTransitionAccess().getDoKeyword_2(), null); 
                
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:854:1: ( (lv_action_5_0= ruleAction ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:855:1: (lv_action_5_0= ruleAction )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:855:1: (lv_action_5_0= ruleAction )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:856:3: lv_action_5_0= ruleAction
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInternalTransitionAccess().getActionActionParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAction_in_ruleInternalTransition1490);
            lv_action_5_0=ruleAction();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInternalTransitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"action",
            	        		lv_action_5_0, 
            	        		"Action", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleInternalTransition1500); 

                    createLeafNode(grammarAccess.getInternalTransitionAccess().getSemicolonKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInternalTransition


    // $ANTLR start entryRuleEvent
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:890:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:891:2: (iv_ruleEvent= ruleEvent EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:892:2: iv_ruleEvent= ruleEvent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEventRule(), currentNode); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent1536);
            iv_ruleEvent=ruleEvent();
            _fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent1546); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEvent


    // $ANTLR start ruleEvent
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:899:1: ruleEvent returns [EObject current=null] : (this_SymbolicEvent_0= ruleSymbolicEvent | this_TransitionEvent_1= ruleTransitionEvent | this_EnterEvent_2= ruleEnterEvent | this_ExitEvent_3= ruleExitEvent | this_ScriptEvent_4= ruleScriptEvent | this_TimerEvent_5= ruleTimerEvent ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject this_SymbolicEvent_0 = null;

        EObject this_TransitionEvent_1 = null;

        EObject this_EnterEvent_2 = null;

        EObject this_ExitEvent_3 = null;

        EObject this_ScriptEvent_4 = null;

        EObject this_TimerEvent_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:904:6: ( (this_SymbolicEvent_0= ruleSymbolicEvent | this_TransitionEvent_1= ruleTransitionEvent | this_EnterEvent_2= ruleEnterEvent | this_ExitEvent_3= ruleExitEvent | this_ScriptEvent_4= ruleScriptEvent | this_TimerEvent_5= ruleTimerEvent ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:905:1: (this_SymbolicEvent_0= ruleSymbolicEvent | this_TransitionEvent_1= ruleTransitionEvent | this_EnterEvent_2= ruleEnterEvent | this_ExitEvent_3= ruleExitEvent | this_ScriptEvent_4= ruleScriptEvent | this_TimerEvent_5= ruleTimerEvent )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:905:1: (this_SymbolicEvent_0= ruleSymbolicEvent | this_TransitionEvent_1= ruleTransitionEvent | this_EnterEvent_2= ruleEnterEvent | this_ExitEvent_3= ruleExitEvent | this_ScriptEvent_4= ruleScriptEvent | this_TimerEvent_5= ruleTimerEvent )
            int alt17=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==26) ) {
                    alt17=1;
                }
                else if ( (LA17_1==21||LA17_1==23||LA17_1==39) ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("905:1: (this_SymbolicEvent_0= ruleSymbolicEvent | this_TransitionEvent_1= ruleTransitionEvent | this_EnterEvent_2= ruleEnterEvent | this_ExitEvent_3= ruleExitEvent | this_ScriptEvent_4= ruleScriptEvent | this_TimerEvent_5= ruleTimerEvent )", 17, 1, input);

                    throw nvae;
                }
                }
                break;
            case 21:
            case 23:
                {
                alt17=2;
                }
                break;
            case 27:
                {
                alt17=3;
                }
                break;
            case 28:
                {
                alt17=4;
                }
                break;
            case RULE_SCRIPT_EXPRESSION:
                {
                alt17=5;
                }
                break;
            case 29:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("905:1: (this_SymbolicEvent_0= ruleSymbolicEvent | this_TransitionEvent_1= ruleTransitionEvent | this_EnterEvent_2= ruleEnterEvent | this_ExitEvent_3= ruleExitEvent | this_ScriptEvent_4= ruleScriptEvent | this_TimerEvent_5= ruleTimerEvent )", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:906:5: this_SymbolicEvent_0= ruleSymbolicEvent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEventAccess().getSymbolicEventParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSymbolicEvent_in_ruleEvent1593);
                    this_SymbolicEvent_0=ruleSymbolicEvent();
                    _fsp--;

                     
                            current = this_SymbolicEvent_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:916:5: this_TransitionEvent_1= ruleTransitionEvent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEventAccess().getTransitionEventParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTransitionEvent_in_ruleEvent1620);
                    this_TransitionEvent_1=ruleTransitionEvent();
                    _fsp--;

                     
                            current = this_TransitionEvent_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:926:5: this_EnterEvent_2= ruleEnterEvent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEventAccess().getEnterEventParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnterEvent_in_ruleEvent1647);
                    this_EnterEvent_2=ruleEnterEvent();
                    _fsp--;

                     
                            current = this_EnterEvent_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:936:5: this_ExitEvent_3= ruleExitEvent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEventAccess().getExitEventParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExitEvent_in_ruleEvent1674);
                    this_ExitEvent_3=ruleExitEvent();
                    _fsp--;

                     
                            current = this_ExitEvent_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:946:5: this_ScriptEvent_4= ruleScriptEvent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEventAccess().getScriptEventParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleScriptEvent_in_ruleEvent1701);
                    this_ScriptEvent_4=ruleScriptEvent();
                    _fsp--;

                     
                            current = this_ScriptEvent_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:956:5: this_TimerEvent_5= ruleTimerEvent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEventAccess().getTimerEventParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTimerEvent_in_ruleEvent1728);
                    this_TimerEvent_5=ruleTimerEvent();
                    _fsp--;

                     
                            current = this_TimerEvent_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEvent


    // $ANTLR start entryRuleSymbolicEvent
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:972:1: entryRuleSymbolicEvent returns [EObject current=null] : iv_ruleSymbolicEvent= ruleSymbolicEvent EOF ;
    public final EObject entryRuleSymbolicEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolicEvent = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:973:2: (iv_ruleSymbolicEvent= ruleSymbolicEvent EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:974:2: iv_ruleSymbolicEvent= ruleSymbolicEvent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSymbolicEventRule(), currentNode); 
            pushFollow(FOLLOW_ruleSymbolicEvent_in_entryRuleSymbolicEvent1763);
            iv_ruleSymbolicEvent=ruleSymbolicEvent();
            _fsp--;

             current =iv_ruleSymbolicEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbolicEvent1773); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSymbolicEvent


    // $ANTLR start ruleSymbolicEvent
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:981:1: ruleSymbolicEvent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '!' ) ;
    public final EObject ruleSymbolicEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:986:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '!' ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:987:1: ( ( (lv_name_0_0= RULE_ID ) ) '!' )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:987:1: ( ( (lv_name_0_0= RULE_ID ) ) '!' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:987:2: ( (lv_name_0_0= RULE_ID ) ) '!'
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:987:2: ( (lv_name_0_0= RULE_ID ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:988:1: (lv_name_0_0= RULE_ID )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:988:1: (lv_name_0_0= RULE_ID )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:989:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSymbolicEvent1815); 

            			createLeafNode(grammarAccess.getSymbolicEventAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSymbolicEventRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,26,FOLLOW_26_in_ruleSymbolicEvent1830); 

                    createLeafNode(grammarAccess.getSymbolicEventAccess().getExclamationMarkKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSymbolicEvent


    // $ANTLR start entryRuleTransitionEvent
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1023:1: entryRuleTransitionEvent returns [EObject current=null] : iv_ruleTransitionEvent= ruleTransitionEvent EOF ;
    public final EObject entryRuleTransitionEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionEvent = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1024:2: (iv_ruleTransitionEvent= ruleTransitionEvent EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1025:2: iv_ruleTransitionEvent= ruleTransitionEvent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTransitionEventRule(), currentNode); 
            pushFollow(FOLLOW_ruleTransitionEvent_in_entryRuleTransitionEvent1866);
            iv_ruleTransitionEvent=ruleTransitionEvent();
            _fsp--;

             current =iv_ruleTransitionEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionEvent1876); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTransitionEvent


    // $ANTLR start ruleTransitionEvent
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1032:1: ruleTransitionEvent returns [EObject current=null] : ( ( ( ( ( ruleQNAME ) ) '->' ( ( ruleQNAME ) ) ) | ( ( ( ruleQNAME ) ) '<-' ( ( ruleQNAME ) ) ) ) | ( ( '->' ( ( ruleQNAME ) ) ) | ( ( ( ruleQNAME ) ) '<-' ) ) | ( ( ( ( ruleQNAME ) ) '->' ) | ( '<-' ( ( ruleQNAME ) ) ) ) ) ;
    public final EObject ruleTransitionEvent() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1037:6: ( ( ( ( ( ( ruleQNAME ) ) '->' ( ( ruleQNAME ) ) ) | ( ( ( ruleQNAME ) ) '<-' ( ( ruleQNAME ) ) ) ) | ( ( '->' ( ( ruleQNAME ) ) ) | ( ( ( ruleQNAME ) ) '<-' ) ) | ( ( ( ( ruleQNAME ) ) '->' ) | ( '<-' ( ( ruleQNAME ) ) ) ) ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1038:1: ( ( ( ( ( ruleQNAME ) ) '->' ( ( ruleQNAME ) ) ) | ( ( ( ruleQNAME ) ) '<-' ( ( ruleQNAME ) ) ) ) | ( ( '->' ( ( ruleQNAME ) ) ) | ( ( ( ruleQNAME ) ) '<-' ) ) | ( ( ( ( ruleQNAME ) ) '->' ) | ( '<-' ( ( ruleQNAME ) ) ) ) )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1038:1: ( ( ( ( ( ruleQNAME ) ) '->' ( ( ruleQNAME ) ) ) | ( ( ( ruleQNAME ) ) '<-' ( ( ruleQNAME ) ) ) ) | ( ( '->' ( ( ruleQNAME ) ) ) | ( ( ( ruleQNAME ) ) '<-' ) ) | ( ( ( ( ruleQNAME ) ) '->' ) | ( '<-' ( ( ruleQNAME ) ) ) ) )
            int alt21=3;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1038:2: ( ( ( ( ruleQNAME ) ) '->' ( ( ruleQNAME ) ) ) | ( ( ( ruleQNAME ) ) '<-' ( ( ruleQNAME ) ) ) )
                    {
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1038:2: ( ( ( ( ruleQNAME ) ) '->' ( ( ruleQNAME ) ) ) | ( ( ( ruleQNAME ) ) '<-' ( ( ruleQNAME ) ) ) )
                    int alt18=2;
                    alt18 = dfa18.predict(input);
                    switch (alt18) {
                        case 1 :
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1038:3: ( ( ( ruleQNAME ) ) '->' ( ( ruleQNAME ) ) )
                            {
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1038:3: ( ( ( ruleQNAME ) ) '->' ( ( ruleQNAME ) ) )
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1038:4: ( ( ruleQNAME ) ) '->' ( ( ruleQNAME ) )
                            {
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1038:4: ( ( ruleQNAME ) )
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1039:1: ( ruleQNAME )
                            {
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1039:1: ( ruleQNAME )
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1040:3: ruleQNAME
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getTransitionEventRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                             
                            	        currentNode=createCompositeNode(grammarAccess.getTransitionEventAccess().getSourceStateCrossReference_0_0_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleQNAME_in_ruleTransitionEvent1926);
                            ruleQNAME();
                            _fsp--;

                             
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }

                            match(input,21,FOLLOW_21_in_ruleTransitionEvent1936); 

                                    createLeafNode(grammarAccess.getTransitionEventAccess().getHyphenMinusGreaterThanSignKeyword_0_0_1(), null); 
                                
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1058:1: ( ( ruleQNAME ) )
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1059:1: ( ruleQNAME )
                            {
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1059:1: ( ruleQNAME )
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1060:3: ruleQNAME
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getTransitionEventRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                             
                            	        currentNode=createCompositeNode(grammarAccess.getTransitionEventAccess().getTargetStateCrossReference_0_0_2_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleQNAME_in_ruleTransitionEvent1959);
                            ruleQNAME();
                            _fsp--;

                             
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1075:6: ( ( ( ruleQNAME ) ) '<-' ( ( ruleQNAME ) ) )
                            {
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1075:6: ( ( ( ruleQNAME ) ) '<-' ( ( ruleQNAME ) ) )
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1075:7: ( ( ruleQNAME ) ) '<-' ( ( ruleQNAME ) )
                            {
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1075:7: ( ( ruleQNAME ) )
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1076:1: ( ruleQNAME )
                            {
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1076:1: ( ruleQNAME )
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1077:3: ruleQNAME
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getTransitionEventRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                             
                            	        currentNode=createCompositeNode(grammarAccess.getTransitionEventAccess().getTargetStateCrossReference_0_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleQNAME_in_ruleTransitionEvent1990);
                            ruleQNAME();
                            _fsp--;

                             
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }

                            match(input,23,FOLLOW_23_in_ruleTransitionEvent2000); 

                                    createLeafNode(grammarAccess.getTransitionEventAccess().getLessThanSignHyphenMinusKeyword_0_1_1(), null); 
                                
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1095:1: ( ( ruleQNAME ) )
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1096:1: ( ruleQNAME )
                            {
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1096:1: ( ruleQNAME )
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1097:3: ruleQNAME
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getTransitionEventRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                             
                            	        currentNode=createCompositeNode(grammarAccess.getTransitionEventAccess().getSourceStateCrossReference_0_1_2_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleQNAME_in_ruleTransitionEvent2023);
                            ruleQNAME();
                            _fsp--;

                             
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1112:6: ( ( '->' ( ( ruleQNAME ) ) ) | ( ( ( ruleQNAME ) ) '<-' ) )
                    {
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1112:6: ( ( '->' ( ( ruleQNAME ) ) ) | ( ( ( ruleQNAME ) ) '<-' ) )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==21) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==RULE_ID) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1112:6: ( ( '->' ( ( ruleQNAME ) ) ) | ( ( ( ruleQNAME ) ) '<-' ) )", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1112:7: ( '->' ( ( ruleQNAME ) ) )
                            {
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1112:7: ( '->' ( ( ruleQNAME ) ) )
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1112:9: '->' ( ( ruleQNAME ) )
                            {
                            match(input,21,FOLLOW_21_in_ruleTransitionEvent2043); 

                                    createLeafNode(grammarAccess.getTransitionEventAccess().getHyphenMinusGreaterThanSignKeyword_1_0_0(), null); 
                                
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1116:1: ( ( ruleQNAME ) )
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1117:1: ( ruleQNAME )
                            {
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1117:1: ( ruleQNAME )
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1118:3: ruleQNAME
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getTransitionEventRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                             
                            	        currentNode=createCompositeNode(grammarAccess.getTransitionEventAccess().getTargetStateCrossReference_1_0_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleQNAME_in_ruleTransitionEvent2066);
                            ruleQNAME();
                            _fsp--;

                             
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1133:6: ( ( ( ruleQNAME ) ) '<-' )
                            {
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1133:6: ( ( ( ruleQNAME ) ) '<-' )
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1133:7: ( ( ruleQNAME ) ) '<-'
                            {
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1133:7: ( ( ruleQNAME ) )
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1134:1: ( ruleQNAME )
                            {
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1134:1: ( ruleQNAME )
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1135:3: ruleQNAME
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getTransitionEventRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                             
                            	        currentNode=createCompositeNode(grammarAccess.getTransitionEventAccess().getTargetStateCrossReference_1_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleQNAME_in_ruleTransitionEvent2097);
                            ruleQNAME();
                            _fsp--;

                             
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }

                            match(input,23,FOLLOW_23_in_ruleTransitionEvent2107); 

                                    createLeafNode(grammarAccess.getTransitionEventAccess().getLessThanSignHyphenMinusKeyword_1_1_1(), null); 
                                

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1154:6: ( ( ( ( ruleQNAME ) ) '->' ) | ( '<-' ( ( ruleQNAME ) ) ) )
                    {
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1154:6: ( ( ( ( ruleQNAME ) ) '->' ) | ( '<-' ( ( ruleQNAME ) ) ) )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_ID) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==23) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1154:6: ( ( ( ( ruleQNAME ) ) '->' ) | ( '<-' ( ( ruleQNAME ) ) ) )", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1154:7: ( ( ( ruleQNAME ) ) '->' )
                            {
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1154:7: ( ( ( ruleQNAME ) ) '->' )
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1154:8: ( ( ruleQNAME ) ) '->'
                            {
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1154:8: ( ( ruleQNAME ) )
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1155:1: ( ruleQNAME )
                            {
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1155:1: ( ruleQNAME )
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1156:3: ruleQNAME
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getTransitionEventRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                             
                            	        currentNode=createCompositeNode(grammarAccess.getTransitionEventAccess().getSourceStateCrossReference_2_0_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleQNAME_in_ruleTransitionEvent2140);
                            ruleQNAME();
                            _fsp--;

                             
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }

                            match(input,21,FOLLOW_21_in_ruleTransitionEvent2150); 

                                    createLeafNode(grammarAccess.getTransitionEventAccess().getHyphenMinusGreaterThanSignKeyword_2_0_1(), null); 
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1175:6: ( '<-' ( ( ruleQNAME ) ) )
                            {
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1175:6: ( '<-' ( ( ruleQNAME ) ) )
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1175:8: '<-' ( ( ruleQNAME ) )
                            {
                            match(input,23,FOLLOW_23_in_ruleTransitionEvent2168); 

                                    createLeafNode(grammarAccess.getTransitionEventAccess().getLessThanSignHyphenMinusKeyword_2_1_0(), null); 
                                
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1179:1: ( ( ruleQNAME ) )
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1180:1: ( ruleQNAME )
                            {
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1180:1: ( ruleQNAME )
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1181:3: ruleQNAME
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getTransitionEventRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                             
                            	        currentNode=createCompositeNode(grammarAccess.getTransitionEventAccess().getSourceStateCrossReference_2_1_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleQNAME_in_ruleTransitionEvent2191);
                            ruleQNAME();
                            _fsp--;

                             
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTransitionEvent


    // $ANTLR start entryRuleEnterEvent
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1203:1: entryRuleEnterEvent returns [EObject current=null] : iv_ruleEnterEvent= ruleEnterEvent EOF ;
    public final EObject entryRuleEnterEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnterEvent = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1204:2: (iv_ruleEnterEvent= ruleEnterEvent EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1205:2: iv_ruleEnterEvent= ruleEnterEvent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnterEventRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnterEvent_in_entryRuleEnterEvent2229);
            iv_ruleEnterEvent=ruleEnterEvent();
            _fsp--;

             current =iv_ruleEnterEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnterEvent2239); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEnterEvent


    // $ANTLR start ruleEnterEvent
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1212:1: ruleEnterEvent returns [EObject current=null] : ( () 'enter' ) ;
    public final EObject ruleEnterEvent() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1217:6: ( ( () 'enter' ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1218:1: ( () 'enter' )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1218:1: ( () 'enter' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1218:2: () 'enter'
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1218:2: ()
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1219:5: 
            {
             
                    temp=factory.create(grammarAccess.getEnterEventAccess().getEnterEventAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getEnterEventAccess().getEnterEventAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,27,FOLLOW_27_in_ruleEnterEvent2283); 

                    createLeafNode(grammarAccess.getEnterEventAccess().getEnterKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEnterEvent


    // $ANTLR start entryRuleExitEvent
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1241:1: entryRuleExitEvent returns [EObject current=null] : iv_ruleExitEvent= ruleExitEvent EOF ;
    public final EObject entryRuleExitEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitEvent = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1242:2: (iv_ruleExitEvent= ruleExitEvent EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1243:2: iv_ruleExitEvent= ruleExitEvent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExitEventRule(), currentNode); 
            pushFollow(FOLLOW_ruleExitEvent_in_entryRuleExitEvent2319);
            iv_ruleExitEvent=ruleExitEvent();
            _fsp--;

             current =iv_ruleExitEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitEvent2329); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExitEvent


    // $ANTLR start ruleExitEvent
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1250:1: ruleExitEvent returns [EObject current=null] : ( () 'exit' ) ;
    public final EObject ruleExitEvent() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1255:6: ( ( () 'exit' ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1256:1: ( () 'exit' )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1256:1: ( () 'exit' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1256:2: () 'exit'
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1256:2: ()
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1257:5: 
            {
             
                    temp=factory.create(grammarAccess.getExitEventAccess().getExitEventAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getExitEventAccess().getExitEventAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,28,FOLLOW_28_in_ruleExitEvent2373); 

                    createLeafNode(grammarAccess.getExitEventAccess().getExitKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExitEvent


    // $ANTLR start entryRuleScriptEvent
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1279:1: entryRuleScriptEvent returns [EObject current=null] : iv_ruleScriptEvent= ruleScriptEvent EOF ;
    public final EObject entryRuleScriptEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScriptEvent = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1280:2: (iv_ruleScriptEvent= ruleScriptEvent EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1281:2: iv_ruleScriptEvent= ruleScriptEvent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getScriptEventRule(), currentNode); 
            pushFollow(FOLLOW_ruleScriptEvent_in_entryRuleScriptEvent2409);
            iv_ruleScriptEvent=ruleScriptEvent();
            _fsp--;

             current =iv_ruleScriptEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScriptEvent2419); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleScriptEvent


    // $ANTLR start ruleScriptEvent
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1288:1: ruleScriptEvent returns [EObject current=null] : ( (lv_script_0_0= RULE_SCRIPT_EXPRESSION ) ) ;
    public final EObject ruleScriptEvent() throws RecognitionException {
        EObject current = null;

        Token lv_script_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1293:6: ( ( (lv_script_0_0= RULE_SCRIPT_EXPRESSION ) ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1294:1: ( (lv_script_0_0= RULE_SCRIPT_EXPRESSION ) )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1294:1: ( (lv_script_0_0= RULE_SCRIPT_EXPRESSION ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1295:1: (lv_script_0_0= RULE_SCRIPT_EXPRESSION )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1295:1: (lv_script_0_0= RULE_SCRIPT_EXPRESSION )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1296:3: lv_script_0_0= RULE_SCRIPT_EXPRESSION
            {
            lv_script_0_0=(Token)input.LT(1);
            match(input,RULE_SCRIPT_EXPRESSION,FOLLOW_RULE_SCRIPT_EXPRESSION_in_ruleScriptEvent2460); 

            			createLeafNode(grammarAccess.getScriptEventAccess().getScriptSCRIPT_EXPRESSIONTerminalRuleCall_0(), "script"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getScriptEventRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"script",
            	        		lv_script_0_0, 
            	        		"SCRIPT_EXPRESSION", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleScriptEvent


    // $ANTLR start entryRuleTimerEvent
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1326:1: entryRuleTimerEvent returns [EObject current=null] : iv_ruleTimerEvent= ruleTimerEvent EOF ;
    public final EObject entryRuleTimerEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimerEvent = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1327:2: (iv_ruleTimerEvent= ruleTimerEvent EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1328:2: iv_ruleTimerEvent= ruleTimerEvent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTimerEventRule(), currentNode); 
            pushFollow(FOLLOW_ruleTimerEvent_in_entryRuleTimerEvent2500);
            iv_ruleTimerEvent=ruleTimerEvent();
            _fsp--;

             current =iv_ruleTimerEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimerEvent2510); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTimerEvent


    // $ANTLR start ruleTimerEvent
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1335:1: ruleTimerEvent returns [EObject current=null] : ( 't' '>' ( (lv_delay_2_0= ruleExpression ) ) 'after' ( (lv_event_4_0= ruleEvent ) ) ) ;
    public final EObject ruleTimerEvent() throws RecognitionException {
        EObject current = null;

        EObject lv_delay_2_0 = null;

        EObject lv_event_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1340:6: ( ( 't' '>' ( (lv_delay_2_0= ruleExpression ) ) 'after' ( (lv_event_4_0= ruleEvent ) ) ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1341:1: ( 't' '>' ( (lv_delay_2_0= ruleExpression ) ) 'after' ( (lv_event_4_0= ruleEvent ) ) )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1341:1: ( 't' '>' ( (lv_delay_2_0= ruleExpression ) ) 'after' ( (lv_event_4_0= ruleEvent ) ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1341:3: 't' '>' ( (lv_delay_2_0= ruleExpression ) ) 'after' ( (lv_event_4_0= ruleEvent ) )
            {
            match(input,29,FOLLOW_29_in_ruleTimerEvent2545); 

                    createLeafNode(grammarAccess.getTimerEventAccess().getTKeyword_0(), null); 
                
            match(input,30,FOLLOW_30_in_ruleTimerEvent2555); 

                    createLeafNode(grammarAccess.getTimerEventAccess().getGreaterThanSignKeyword_1(), null); 
                
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1349:1: ( (lv_delay_2_0= ruleExpression ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1350:1: (lv_delay_2_0= ruleExpression )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1350:1: (lv_delay_2_0= ruleExpression )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1351:3: lv_delay_2_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTimerEventAccess().getDelayExpressionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleTimerEvent2576);
            lv_delay_2_0=ruleExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTimerEventRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"delay",
            	        		lv_delay_2_0, 
            	        		"Expression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,31,FOLLOW_31_in_ruleTimerEvent2586); 

                    createLeafNode(grammarAccess.getTimerEventAccess().getAfterKeyword_3(), null); 
                
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1377:1: ( (lv_event_4_0= ruleEvent ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1378:1: (lv_event_4_0= ruleEvent )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1378:1: (lv_event_4_0= ruleEvent )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1379:3: lv_event_4_0= ruleEvent
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTimerEventAccess().getEventEventParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleEvent_in_ruleTimerEvent2607);
            lv_event_4_0=ruleEvent();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTimerEventRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"event",
            	        		lv_event_4_0, 
            	        		"Event", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTimerEvent


    // $ANTLR start entryRuleCondition
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1409:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1410:2: (iv_ruleCondition= ruleCondition EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1411:2: iv_ruleCondition= ruleCondition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConditionRule(), currentNode); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition2643);
            iv_ruleCondition=ruleCondition();
            _fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition2653); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCondition


    // $ANTLR start ruleCondition
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1418:1: ruleCondition returns [EObject current=null] : ( (lv_script_0_0= RULE_SCRIPT_EXPRESSION ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_script_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1423:6: ( ( (lv_script_0_0= RULE_SCRIPT_EXPRESSION ) ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1424:1: ( (lv_script_0_0= RULE_SCRIPT_EXPRESSION ) )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1424:1: ( (lv_script_0_0= RULE_SCRIPT_EXPRESSION ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1425:1: (lv_script_0_0= RULE_SCRIPT_EXPRESSION )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1425:1: (lv_script_0_0= RULE_SCRIPT_EXPRESSION )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1426:3: lv_script_0_0= RULE_SCRIPT_EXPRESSION
            {
            lv_script_0_0=(Token)input.LT(1);
            match(input,RULE_SCRIPT_EXPRESSION,FOLLOW_RULE_SCRIPT_EXPRESSION_in_ruleCondition2694); 

            			createLeafNode(grammarAccess.getConditionAccess().getScriptSCRIPT_EXPRESSIONTerminalRuleCall_0(), "script"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConditionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"script",
            	        		lv_script_0_0, 
            	        		"SCRIPT_EXPRESSION", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCondition


    // $ANTLR start entryRuleAction
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1456:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1457:2: (iv_ruleAction= ruleAction EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1458:2: iv_ruleAction= ruleAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction2734);
            iv_ruleAction=ruleAction();
            _fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction2744); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAction


    // $ANTLR start ruleAction
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1465:1: ruleAction returns [EObject current=null] : (this_SymbolicAction_0= ruleSymbolicAction | this_ScriptAction_1= ruleScriptAction | this_AssignmentAction_2= ruleAssignmentAction ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_SymbolicAction_0 = null;

        EObject this_ScriptAction_1 = null;

        EObject this_AssignmentAction_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1470:6: ( (this_SymbolicAction_0= ruleSymbolicAction | this_ScriptAction_1= ruleScriptAction | this_AssignmentAction_2= ruleAssignmentAction ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1471:1: (this_SymbolicAction_0= ruleSymbolicAction | this_ScriptAction_1= ruleScriptAction | this_AssignmentAction_2= ruleAssignmentAction )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1471:1: (this_SymbolicAction_0= ruleSymbolicAction | this_ScriptAction_1= ruleScriptAction | this_AssignmentAction_2= ruleAssignmentAction )
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==36||LA22_1==39) ) {
                    alt22=3;
                }
                else if ( (LA22_1==26||LA22_1==31) ) {
                    alt22=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1471:1: (this_SymbolicAction_0= ruleSymbolicAction | this_ScriptAction_1= ruleScriptAction | this_AssignmentAction_2= ruleAssignmentAction )", 22, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA22_0==RULE_SCRIPT_STATEMENTS) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1471:1: (this_SymbolicAction_0= ruleSymbolicAction | this_ScriptAction_1= ruleScriptAction | this_AssignmentAction_2= ruleAssignmentAction )", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1472:5: this_SymbolicAction_0= ruleSymbolicAction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActionAccess().getSymbolicActionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSymbolicAction_in_ruleAction2791);
                    this_SymbolicAction_0=ruleSymbolicAction();
                    _fsp--;

                     
                            current = this_SymbolicAction_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1482:5: this_ScriptAction_1= ruleScriptAction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActionAccess().getScriptActionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleScriptAction_in_ruleAction2818);
                    this_ScriptAction_1=ruleScriptAction();
                    _fsp--;

                     
                            current = this_ScriptAction_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1492:5: this_AssignmentAction_2= ruleAssignmentAction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActionAccess().getAssignmentActionParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAssignmentAction_in_ruleAction2845);
                    this_AssignmentAction_2=ruleAssignmentAction();
                    _fsp--;

                     
                            current = this_AssignmentAction_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAction


    // $ANTLR start entryRuleSymbolicAction
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1508:1: entryRuleSymbolicAction returns [EObject current=null] : iv_ruleSymbolicAction= ruleSymbolicAction EOF ;
    public final EObject entryRuleSymbolicAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolicAction = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1509:2: (iv_ruleSymbolicAction= ruleSymbolicAction EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1510:2: iv_ruleSymbolicAction= ruleSymbolicAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSymbolicActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSymbolicAction_in_entryRuleSymbolicAction2880);
            iv_ruleSymbolicAction=ruleSymbolicAction();
            _fsp--;

             current =iv_ruleSymbolicAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbolicAction2890); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSymbolicAction


    // $ANTLR start ruleSymbolicAction
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1517:1: ruleSymbolicAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( 'after' ( (lv_delay_2_0= ruleExpression ) ) )? '!' ) ;
    public final EObject ruleSymbolicAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_delay_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1522:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( 'after' ( (lv_delay_2_0= ruleExpression ) ) )? '!' ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1523:1: ( ( (lv_name_0_0= RULE_ID ) ) ( 'after' ( (lv_delay_2_0= ruleExpression ) ) )? '!' )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1523:1: ( ( (lv_name_0_0= RULE_ID ) ) ( 'after' ( (lv_delay_2_0= ruleExpression ) ) )? '!' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1523:2: ( (lv_name_0_0= RULE_ID ) ) ( 'after' ( (lv_delay_2_0= ruleExpression ) ) )? '!'
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1523:2: ( (lv_name_0_0= RULE_ID ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1524:1: (lv_name_0_0= RULE_ID )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1524:1: (lv_name_0_0= RULE_ID )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1525:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSymbolicAction2932); 

            			createLeafNode(grammarAccess.getSymbolicActionAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSymbolicActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1547:2: ( 'after' ( (lv_delay_2_0= ruleExpression ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1547:4: 'after' ( (lv_delay_2_0= ruleExpression ) )
                    {
                    match(input,31,FOLLOW_31_in_ruleSymbolicAction2948); 

                            createLeafNode(grammarAccess.getSymbolicActionAccess().getAfterKeyword_1_0(), null); 
                        
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1551:1: ( (lv_delay_2_0= ruleExpression ) )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1552:1: (lv_delay_2_0= ruleExpression )
                    {
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1552:1: (lv_delay_2_0= ruleExpression )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1553:3: lv_delay_2_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSymbolicActionAccess().getDelayExpressionParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleSymbolicAction2969);
                    lv_delay_2_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSymbolicActionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"delay",
                    	        		lv_delay_2_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,26,FOLLOW_26_in_ruleSymbolicAction2981); 

                    createLeafNode(grammarAccess.getSymbolicActionAccess().getExclamationMarkKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSymbolicAction


    // $ANTLR start entryRuleScriptAction
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1587:1: entryRuleScriptAction returns [EObject current=null] : iv_ruleScriptAction= ruleScriptAction EOF ;
    public final EObject entryRuleScriptAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScriptAction = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1588:2: (iv_ruleScriptAction= ruleScriptAction EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1589:2: iv_ruleScriptAction= ruleScriptAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getScriptActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleScriptAction_in_entryRuleScriptAction3017);
            iv_ruleScriptAction=ruleScriptAction();
            _fsp--;

             current =iv_ruleScriptAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScriptAction3027); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleScriptAction


    // $ANTLR start ruleScriptAction
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1596:1: ruleScriptAction returns [EObject current=null] : ( (lv_script_0_0= RULE_SCRIPT_STATEMENTS ) ) ;
    public final EObject ruleScriptAction() throws RecognitionException {
        EObject current = null;

        Token lv_script_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1601:6: ( ( (lv_script_0_0= RULE_SCRIPT_STATEMENTS ) ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1602:1: ( (lv_script_0_0= RULE_SCRIPT_STATEMENTS ) )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1602:1: ( (lv_script_0_0= RULE_SCRIPT_STATEMENTS ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1603:1: (lv_script_0_0= RULE_SCRIPT_STATEMENTS )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1603:1: (lv_script_0_0= RULE_SCRIPT_STATEMENTS )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1604:3: lv_script_0_0= RULE_SCRIPT_STATEMENTS
            {
            lv_script_0_0=(Token)input.LT(1);
            match(input,RULE_SCRIPT_STATEMENTS,FOLLOW_RULE_SCRIPT_STATEMENTS_in_ruleScriptAction3068); 

            			createLeafNode(grammarAccess.getScriptActionAccess().getScriptSCRIPT_STATEMENTSTerminalRuleCall_0(), "script"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getScriptActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"script",
            	        		lv_script_0_0, 
            	        		"SCRIPT_STATEMENTS", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleScriptAction


    // $ANTLR start entryRuleVarDef
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1634:1: entryRuleVarDef returns [EObject current=null] : iv_ruleVarDef= ruleVarDef EOF ;
    public final EObject entryRuleVarDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDef = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1635:2: (iv_ruleVarDef= ruleVarDef EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1636:2: iv_ruleVarDef= ruleVarDef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVarDefRule(), currentNode); 
            pushFollow(FOLLOW_ruleVarDef_in_entryRuleVarDef3108);
            iv_ruleVarDef=ruleVarDef();
            _fsp--;

             current =iv_ruleVarDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDef3118); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVarDef


    // $ANTLR start ruleVarDef
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1643:1: ruleVarDef returns [EObject current=null] : ( 'var' ( (lv_name_1_0= RULE_ID ) ) ( ':' ( ( ruleQNAME ) ) ( ( (lv_many_4_1= '*' | lv_many_4_2= '[]' ) ) )? )? ( '=' ( (lv_init_6_0= ruleExpression ) ) )? ';' ) ;
    public final EObject ruleVarDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_many_4_1=null;
        Token lv_many_4_2=null;
        EObject lv_init_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1648:6: ( ( 'var' ( (lv_name_1_0= RULE_ID ) ) ( ':' ( ( ruleQNAME ) ) ( ( (lv_many_4_1= '*' | lv_many_4_2= '[]' ) ) )? )? ( '=' ( (lv_init_6_0= ruleExpression ) ) )? ';' ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1649:1: ( 'var' ( (lv_name_1_0= RULE_ID ) ) ( ':' ( ( ruleQNAME ) ) ( ( (lv_many_4_1= '*' | lv_many_4_2= '[]' ) ) )? )? ( '=' ( (lv_init_6_0= ruleExpression ) ) )? ';' )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1649:1: ( 'var' ( (lv_name_1_0= RULE_ID ) ) ( ':' ( ( ruleQNAME ) ) ( ( (lv_many_4_1= '*' | lv_many_4_2= '[]' ) ) )? )? ( '=' ( (lv_init_6_0= ruleExpression ) ) )? ';' )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1649:3: 'var' ( (lv_name_1_0= RULE_ID ) ) ( ':' ( ( ruleQNAME ) ) ( ( (lv_many_4_1= '*' | lv_many_4_2= '[]' ) ) )? )? ( '=' ( (lv_init_6_0= ruleExpression ) ) )? ';'
            {
            match(input,32,FOLLOW_32_in_ruleVarDef3153); 

                    createLeafNode(grammarAccess.getVarDefAccess().getVarKeyword_0(), null); 
                
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1653:1: ( (lv_name_1_0= RULE_ID ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1654:1: (lv_name_1_0= RULE_ID )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1654:1: (lv_name_1_0= RULE_ID )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1655:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarDef3170); 

            			createLeafNode(grammarAccess.getVarDefAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVarDefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1677:2: ( ':' ( ( ruleQNAME ) ) ( ( (lv_many_4_1= '*' | lv_many_4_2= '[]' ) ) )? )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1677:4: ':' ( ( ruleQNAME ) ) ( ( (lv_many_4_1= '*' | lv_many_4_2= '[]' ) ) )?
                    {
                    match(input,33,FOLLOW_33_in_ruleVarDef3186); 

                            createLeafNode(grammarAccess.getVarDefAccess().getColonKeyword_2_0(), null); 
                        
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1681:1: ( ( ruleQNAME ) )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1682:1: ( ruleQNAME )
                    {
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1682:1: ( ruleQNAME )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1683:3: ruleQNAME
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getVarDefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getVarDefAccess().getETypeEClassifierCrossReference_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQNAME_in_ruleVarDef3209);
                    ruleQNAME();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1697:2: ( ( (lv_many_4_1= '*' | lv_many_4_2= '[]' ) ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( ((LA25_0>=34 && LA25_0<=35)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1698:1: ( (lv_many_4_1= '*' | lv_many_4_2= '[]' ) )
                            {
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1698:1: ( (lv_many_4_1= '*' | lv_many_4_2= '[]' ) )
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1699:1: (lv_many_4_1= '*' | lv_many_4_2= '[]' )
                            {
                            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1699:1: (lv_many_4_1= '*' | lv_many_4_2= '[]' )
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==34) ) {
                                alt24=1;
                            }
                            else if ( (LA24_0==35) ) {
                                alt24=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1699:1: (lv_many_4_1= '*' | lv_many_4_2= '[]' )", 24, 0, input);

                                throw nvae;
                            }
                            switch (alt24) {
                                case 1 :
                                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1700:3: lv_many_4_1= '*'
                                    {
                                    lv_many_4_1=(Token)input.LT(1);
                                    match(input,34,FOLLOW_34_in_ruleVarDef3229); 

                                            createLeafNode(grammarAccess.getVarDefAccess().getManyAsteriskKeyword_2_2_0_0(), "many"); 
                                        

                                    	        if (current==null) {
                                    	            current = factory.create(grammarAccess.getVarDefRule().getType().getClassifier());
                                    	            associateNodeWithAstElement(currentNode, current);
                                    	        }
                                    	        
                                    	        try {
                                    	       		set(current, "many", true, null, lastConsumedNode);
                                    	        } catch (ValueConverterException vce) {
                                    				handleValueConverterException(vce);
                                    	        }
                                    	    

                                    }
                                    break;
                                case 2 :
                                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1718:8: lv_many_4_2= '[]'
                                    {
                                    lv_many_4_2=(Token)input.LT(1);
                                    match(input,35,FOLLOW_35_in_ruleVarDef3258); 

                                            createLeafNode(grammarAccess.getVarDefAccess().getManyLeftSquareBracketRightSquareBracketKeyword_2_2_0_1(), "many"); 
                                        

                                    	        if (current==null) {
                                    	            current = factory.create(grammarAccess.getVarDefRule().getType().getClassifier());
                                    	            associateNodeWithAstElement(currentNode, current);
                                    	        }
                                    	        
                                    	        try {
                                    	       		set(current, "many", true, null, lastConsumedNode);
                                    	        } catch (ValueConverterException vce) {
                                    				handleValueConverterException(vce);
                                    	        }
                                    	    

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1739:5: ( '=' ( (lv_init_6_0= ruleExpression ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1739:7: '=' ( (lv_init_6_0= ruleExpression ) )
                    {
                    match(input,36,FOLLOW_36_in_ruleVarDef3288); 

                            createLeafNode(grammarAccess.getVarDefAccess().getEqualsSignKeyword_3_0(), null); 
                        
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1743:1: ( (lv_init_6_0= ruleExpression ) )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1744:1: (lv_init_6_0= ruleExpression )
                    {
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1744:1: (lv_init_6_0= ruleExpression )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1745:3: lv_init_6_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getVarDefAccess().getInitExpressionParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleVarDef3309);
                    lv_init_6_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getVarDefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"init",
                    	        		lv_init_6_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,17,FOLLOW_17_in_ruleVarDef3321); 

                    createLeafNode(grammarAccess.getVarDefAccess().getSemicolonKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVarDef


    // $ANTLR start entryRuleAssignmentAction
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1779:1: entryRuleAssignmentAction returns [EObject current=null] : iv_ruleAssignmentAction= ruleAssignmentAction EOF ;
    public final EObject entryRuleAssignmentAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentAction = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1780:2: (iv_ruleAssignmentAction= ruleAssignmentAction EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1781:2: iv_ruleAssignmentAction= ruleAssignmentAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssignmentActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssignmentAction_in_entryRuleAssignmentAction3357);
            iv_ruleAssignmentAction=ruleAssignmentAction();
            _fsp--;

             current =iv_ruleAssignmentAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentAction3367); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAssignmentAction


    // $ANTLR start ruleAssignmentAction
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1788:1: ruleAssignmentAction returns [EObject current=null] : ( ( ( ruleQNAME ) ) '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignmentAction() throws RecognitionException {
        EObject current = null;

        EObject lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1793:6: ( ( ( ( ruleQNAME ) ) '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1794:1: ( ( ( ruleQNAME ) ) '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1794:1: ( ( ( ruleQNAME ) ) '=' ( (lv_value_2_0= ruleExpression ) ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1794:2: ( ( ruleQNAME ) ) '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1794:2: ( ( ruleQNAME ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1795:1: ( ruleQNAME )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1795:1: ( ruleQNAME )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1796:3: ruleQNAME
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAssignmentActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
             
            	        currentNode=createCompositeNode(grammarAccess.getAssignmentActionAccess().getVarVarDefCrossReference_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQNAME_in_ruleAssignmentAction3415);
            ruleQNAME();
            _fsp--;

             
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,36,FOLLOW_36_in_ruleAssignmentAction3425); 

                    createLeafNode(grammarAccess.getAssignmentActionAccess().getEqualsSignKeyword_1(), null); 
                
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1814:1: ( (lv_value_2_0= ruleExpression ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1815:1: (lv_value_2_0= ruleExpression )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1815:1: (lv_value_2_0= ruleExpression )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1816:3: lv_value_2_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssignmentActionAccess().getValueExpressionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignmentAction3446);
            lv_value_2_0=ruleExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssignmentActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_2_0, 
            	        		"Expression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAssignmentAction


    // $ANTLR start entryRuleBOOLEAN_LITERAL
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1846:1: entryRuleBOOLEAN_LITERAL returns [String current=null] : iv_ruleBOOLEAN_LITERAL= ruleBOOLEAN_LITERAL EOF ;
    public final String entryRuleBOOLEAN_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN_LITERAL = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1847:2: (iv_ruleBOOLEAN_LITERAL= ruleBOOLEAN_LITERAL EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1848:2: iv_ruleBOOLEAN_LITERAL= ruleBOOLEAN_LITERAL EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBOOLEAN_LITERALRule(), currentNode); 
            pushFollow(FOLLOW_ruleBOOLEAN_LITERAL_in_entryRuleBOOLEAN_LITERAL3483);
            iv_ruleBOOLEAN_LITERAL=ruleBOOLEAN_LITERAL();
            _fsp--;

             current =iv_ruleBOOLEAN_LITERAL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOLEAN_LITERAL3494); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBOOLEAN_LITERAL


    // $ANTLR start ruleBOOLEAN_LITERAL
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1855:1: ruleBOOLEAN_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1860:6: ( (kw= 'true' | kw= 'false' ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1861:1: (kw= 'true' | kw= 'false' )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1861:1: (kw= 'true' | kw= 'false' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            else if ( (LA28_0==38) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1861:1: (kw= 'true' | kw= 'false' )", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1862:2: kw= 'true'
                    {
                    kw=(Token)input.LT(1);
                    match(input,37,FOLLOW_37_in_ruleBOOLEAN_LITERAL3532); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getBOOLEAN_LITERALAccess().getTrueKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1869:2: kw= 'false'
                    {
                    kw=(Token)input.LT(1);
                    match(input,38,FOLLOW_38_in_ruleBOOLEAN_LITERAL3551); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getBOOLEAN_LITERALAccess().getFalseKeyword_1(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBOOLEAN_LITERAL


    // $ANTLR start entryRuleFLOAT_LITERAL
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1882:1: entryRuleFLOAT_LITERAL returns [String current=null] : iv_ruleFLOAT_LITERAL= ruleFLOAT_LITERAL EOF ;
    public final String entryRuleFLOAT_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT_LITERAL = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1883:2: (iv_ruleFLOAT_LITERAL= ruleFLOAT_LITERAL EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1884:2: iv_ruleFLOAT_LITERAL= ruleFLOAT_LITERAL EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFLOAT_LITERALRule(), currentNode); 
            pushFollow(FOLLOW_ruleFLOAT_LITERAL_in_entryRuleFLOAT_LITERAL3592);
            iv_ruleFLOAT_LITERAL=ruleFLOAT_LITERAL();
            _fsp--;

             current =iv_ruleFLOAT_LITERAL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFLOAT_LITERAL3603); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFLOAT_LITERAL


    // $ANTLR start ruleFLOAT_LITERAL
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1891:1: ruleFLOAT_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | this_POS_INT_1= rulePOS_INT | this_NEG_INT_2= ruleNEG_INT ) kw= '.' this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_4=null;
        AntlrDatatypeRuleToken this_POS_INT_1 = null;

        AntlrDatatypeRuleToken this_NEG_INT_2 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1896:6: ( ( (this_INT_0= RULE_INT | this_POS_INT_1= rulePOS_INT | this_NEG_INT_2= ruleNEG_INT ) kw= '.' this_INT_4= RULE_INT ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1897:1: ( (this_INT_0= RULE_INT | this_POS_INT_1= rulePOS_INT | this_NEG_INT_2= ruleNEG_INT ) kw= '.' this_INT_4= RULE_INT )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1897:1: ( (this_INT_0= RULE_INT | this_POS_INT_1= rulePOS_INT | this_NEG_INT_2= ruleNEG_INT ) kw= '.' this_INT_4= RULE_INT )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1897:2: (this_INT_0= RULE_INT | this_POS_INT_1= rulePOS_INT | this_NEG_INT_2= ruleNEG_INT ) kw= '.' this_INT_4= RULE_INT
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1897:2: (this_INT_0= RULE_INT | this_POS_INT_1= rulePOS_INT | this_NEG_INT_2= ruleNEG_INT )
            int alt29=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt29=1;
                }
                break;
            case 40:
                {
                alt29=2;
                }
                break;
            case 41:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1897:2: (this_INT_0= RULE_INT | this_POS_INT_1= rulePOS_INT | this_NEG_INT_2= ruleNEG_INT )", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1897:7: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFLOAT_LITERAL3644); 

                    		current.merge(this_INT_0);
                        
                     
                        createLeafNode(grammarAccess.getFLOAT_LITERALAccess().getINTTerminalRuleCall_0_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1906:5: this_POS_INT_1= rulePOS_INT
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFLOAT_LITERALAccess().getPOS_INTParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePOS_INT_in_ruleFLOAT_LITERAL3677);
                    this_POS_INT_1=rulePOS_INT();
                    _fsp--;


                    		current.merge(this_POS_INT_1);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1918:5: this_NEG_INT_2= ruleNEG_INT
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFLOAT_LITERALAccess().getNEG_INTParserRuleCall_0_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNEG_INT_in_ruleFLOAT_LITERAL3710);
                    this_NEG_INT_2=ruleNEG_INT();
                    _fsp--;


                    		current.merge(this_NEG_INT_2);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            kw=(Token)input.LT(1);
            match(input,39,FOLLOW_39_in_ruleFLOAT_LITERAL3729); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getFLOAT_LITERALAccess().getFullStopKeyword_1(), null); 
                
            this_INT_4=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFLOAT_LITERAL3744); 

            		current.merge(this_INT_4);
                
             
                createLeafNode(grammarAccess.getFLOAT_LITERALAccess().getINTTerminalRuleCall_2(), null); 
                

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFLOAT_LITERAL


    // $ANTLR start entryRulePOS_INT
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1949:1: entryRulePOS_INT returns [String current=null] : iv_rulePOS_INT= rulePOS_INT EOF ;
    public final String entryRulePOS_INT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePOS_INT = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1950:2: (iv_rulePOS_INT= rulePOS_INT EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1951:2: iv_rulePOS_INT= rulePOS_INT EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPOS_INTRule(), currentNode); 
            pushFollow(FOLLOW_rulePOS_INT_in_entryRulePOS_INT3790);
            iv_rulePOS_INT=rulePOS_INT();
            _fsp--;

             current =iv_rulePOS_INT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePOS_INT3801); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePOS_INT


    // $ANTLR start rulePOS_INT
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1958:1: rulePOS_INT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulePOS_INT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1963:6: ( (kw= '+' this_INT_1= RULE_INT ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1964:1: (kw= '+' this_INT_1= RULE_INT )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1964:1: (kw= '+' this_INT_1= RULE_INT )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1965:2: kw= '+' this_INT_1= RULE_INT
            {
            kw=(Token)input.LT(1);
            match(input,40,FOLLOW_40_in_rulePOS_INT3839); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getPOS_INTAccess().getPlusSignKeyword_0(), null); 
                
            this_INT_1=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePOS_INT3854); 

            		current.merge(this_INT_1);
                
             
                createLeafNode(grammarAccess.getPOS_INTAccess().getINTTerminalRuleCall_1(), null); 
                

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePOS_INT


    // $ANTLR start entryRuleNEG_INT
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1985:1: entryRuleNEG_INT returns [String current=null] : iv_ruleNEG_INT= ruleNEG_INT EOF ;
    public final String entryRuleNEG_INT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNEG_INT = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1986:2: (iv_ruleNEG_INT= ruleNEG_INT EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1987:2: iv_ruleNEG_INT= ruleNEG_INT EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNEG_INTRule(), currentNode); 
            pushFollow(FOLLOW_ruleNEG_INT_in_entryRuleNEG_INT3900);
            iv_ruleNEG_INT=ruleNEG_INT();
            _fsp--;

             current =iv_ruleNEG_INT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNEG_INT3911); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNEG_INT


    // $ANTLR start ruleNEG_INT
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1994:1: ruleNEG_INT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleNEG_INT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:1999:6: ( (kw= '-' this_INT_1= RULE_INT ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2000:1: (kw= '-' this_INT_1= RULE_INT )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2000:1: (kw= '-' this_INT_1= RULE_INT )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2001:2: kw= '-' this_INT_1= RULE_INT
            {
            kw=(Token)input.LT(1);
            match(input,41,FOLLOW_41_in_ruleNEG_INT3949); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getNEG_INTAccess().getHyphenMinusKeyword_0(), null); 
                
            this_INT_1=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNEG_INT3964); 

            		current.merge(this_INT_1);
                
             
                createLeafNode(grammarAccess.getNEG_INTAccess().getINTTerminalRuleCall_1(), null); 
                

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNEG_INT


    // $ANTLR start entryRuleQNAME
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2021:1: entryRuleQNAME returns [String current=null] : iv_ruleQNAME= ruleQNAME EOF ;
    public final String entryRuleQNAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQNAME = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2022:2: (iv_ruleQNAME= ruleQNAME EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2023:2: iv_ruleQNAME= ruleQNAME EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQNAMERule(), currentNode); 
            pushFollow(FOLLOW_ruleQNAME_in_entryRuleQNAME4010);
            iv_ruleQNAME=ruleQNAME();
            _fsp--;

             current =iv_ruleQNAME.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQNAME4021); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleQNAME


    // $ANTLR start ruleQNAME
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2030:1: ruleQNAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQNAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2035:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2036:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2036:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2036:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQNAME4061); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getQNAMEAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2043:1: (kw= '.' this_ID_2= RULE_ID )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==39) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2044:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,39,FOLLOW_39_in_ruleQNAME4080); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getQNAMEAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQNAME4095); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getQNAMEAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleQNAME


    // $ANTLR start entryRuleExpression
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2064:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2065:2: (iv_ruleExpression= ruleExpression EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2066:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression4142);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression4152); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2073:1: ruleExpression returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_ScriptExpression_1= ruleScriptExpression | this_EPath_2= ruleEPath ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_ScriptExpression_1 = null;

        EObject this_EPath_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2078:6: ( (this_Literal_0= ruleLiteral | this_ScriptExpression_1= ruleScriptExpression | this_EPath_2= ruleEPath ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2079:1: (this_Literal_0= ruleLiteral | this_ScriptExpression_1= ruleScriptExpression | this_EPath_2= ruleEPath )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2079:1: (this_Literal_0= ruleLiteral | this_ScriptExpression_1= ruleScriptExpression | this_EPath_2= ruleEPath )
            int alt31=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_URI_LITERAL:
            case RULE_EOBJECT_URI_LITERAL:
            case 37:
            case 38:
            case 40:
            case 41:
                {
                alt31=1;
                }
                break;
            case RULE_SCRIPT_EXPRESSION:
                {
                alt31=2;
                }
                break;
            case RULE_ID:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2079:1: (this_Literal_0= ruleLiteral | this_ScriptExpression_1= ruleScriptExpression | this_EPath_2= ruleEPath )", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2080:5: this_Literal_0= ruleLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getLiteralParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLiteral_in_ruleExpression4199);
                    this_Literal_0=ruleLiteral();
                    _fsp--;

                     
                            current = this_Literal_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2090:5: this_ScriptExpression_1= ruleScriptExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getScriptExpressionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleScriptExpression_in_ruleExpression4226);
                    this_ScriptExpression_1=ruleScriptExpression();
                    _fsp--;

                     
                            current = this_ScriptExpression_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2100:5: this_EPath_2= ruleEPath
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getEPathParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEPath_in_ruleExpression4253);
                    this_EPath_2=ruleEPath();
                    _fsp--;

                     
                            current = this_EPath_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleLiteral
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2116:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2117:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2118:2: iv_ruleLiteral= ruleLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral4288);
            iv_ruleLiteral=ruleLiteral();
            _fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral4298); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLiteral


    // $ANTLR start ruleLiteral
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2125:1: ruleLiteral returns [EObject current=null] : (this_BooleanLiteral_0= ruleBooleanLiteral | this_FloatLiteral_1= ruleFloatLiteral | this_IntLiteral_2= ruleIntLiteral | this_StringLiteral_3= ruleStringLiteral | this_UriLiteral_4= ruleUriLiteral | this_EObjectUriLiteral_5= ruleEObjectUriLiteral | this_DelayLiteral_6= ruleDelayLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanLiteral_0 = null;

        EObject this_FloatLiteral_1 = null;

        EObject this_IntLiteral_2 = null;

        EObject this_StringLiteral_3 = null;

        EObject this_UriLiteral_4 = null;

        EObject this_EObjectUriLiteral_5 = null;

        EObject this_DelayLiteral_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2130:6: ( (this_BooleanLiteral_0= ruleBooleanLiteral | this_FloatLiteral_1= ruleFloatLiteral | this_IntLiteral_2= ruleIntLiteral | this_StringLiteral_3= ruleStringLiteral | this_UriLiteral_4= ruleUriLiteral | this_EObjectUriLiteral_5= ruleEObjectUriLiteral | this_DelayLiteral_6= ruleDelayLiteral ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2131:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_FloatLiteral_1= ruleFloatLiteral | this_IntLiteral_2= ruleIntLiteral | this_StringLiteral_3= ruleStringLiteral | this_UriLiteral_4= ruleUriLiteral | this_EObjectUriLiteral_5= ruleEObjectUriLiteral | this_DelayLiteral_6= ruleDelayLiteral )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2131:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_FloatLiteral_1= ruleFloatLiteral | this_IntLiteral_2= ruleIntLiteral | this_StringLiteral_3= ruleStringLiteral | this_UriLiteral_4= ruleUriLiteral | this_EObjectUriLiteral_5= ruleEObjectUriLiteral | this_DelayLiteral_6= ruleDelayLiteral )
            int alt32=7;
            switch ( input.LA(1) ) {
            case 37:
            case 38:
                {
                alt32=1;
                }
                break;
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case 39:
                    {
                    alt32=2;
                    }
                    break;
                case 43:
                case 44:
                case 45:
                case 46:
                    {
                    alt32=7;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case 17:
                case 26:
                case 31:
                    {
                    alt32=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("2131:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_FloatLiteral_1= ruleFloatLiteral | this_IntLiteral_2= ruleIntLiteral | this_StringLiteral_3= ruleStringLiteral | this_UriLiteral_4= ruleUriLiteral | this_EObjectUriLiteral_5= ruleEObjectUriLiteral | this_DelayLiteral_6= ruleDelayLiteral )", 32, 2, input);

                    throw nvae;
                }

                }
                break;
            case 40:
                {
                int LA32_3 = input.LA(2);

                if ( (LA32_3==RULE_INT) ) {
                    int LA32_11 = input.LA(3);

                    if ( (LA32_11==39) ) {
                        alt32=2;
                    }
                    else if ( (LA32_11==EOF||LA32_11==RULE_ID||LA32_11==17||LA32_11==26||LA32_11==31) ) {
                        alt32=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("2131:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_FloatLiteral_1= ruleFloatLiteral | this_IntLiteral_2= ruleIntLiteral | this_StringLiteral_3= ruleStringLiteral | this_UriLiteral_4= ruleUriLiteral | this_EObjectUriLiteral_5= ruleEObjectUriLiteral | this_DelayLiteral_6= ruleDelayLiteral )", 32, 11, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2131:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_FloatLiteral_1= ruleFloatLiteral | this_IntLiteral_2= ruleIntLiteral | this_StringLiteral_3= ruleStringLiteral | this_UriLiteral_4= ruleUriLiteral | this_EObjectUriLiteral_5= ruleEObjectUriLiteral | this_DelayLiteral_6= ruleDelayLiteral )", 32, 3, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                int LA32_4 = input.LA(2);

                if ( (LA32_4==RULE_INT) ) {
                    int LA32_12 = input.LA(3);

                    if ( (LA32_12==EOF||LA32_12==RULE_ID||LA32_12==17||LA32_12==26||LA32_12==31) ) {
                        alt32=3;
                    }
                    else if ( (LA32_12==39) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("2131:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_FloatLiteral_1= ruleFloatLiteral | this_IntLiteral_2= ruleIntLiteral | this_StringLiteral_3= ruleStringLiteral | this_UriLiteral_4= ruleUriLiteral | this_EObjectUriLiteral_5= ruleEObjectUriLiteral | this_DelayLiteral_6= ruleDelayLiteral )", 32, 12, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2131:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_FloatLiteral_1= ruleFloatLiteral | this_IntLiteral_2= ruleIntLiteral | this_StringLiteral_3= ruleStringLiteral | this_UriLiteral_4= ruleUriLiteral | this_EObjectUriLiteral_5= ruleEObjectUriLiteral | this_DelayLiteral_6= ruleDelayLiteral )", 32, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt32=4;
                }
                break;
            case RULE_URI_LITERAL:
                {
                alt32=5;
                }
                break;
            case RULE_EOBJECT_URI_LITERAL:
                {
                alt32=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2131:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_FloatLiteral_1= ruleFloatLiteral | this_IntLiteral_2= ruleIntLiteral | this_StringLiteral_3= ruleStringLiteral | this_UriLiteral_4= ruleUriLiteral | this_EObjectUriLiteral_5= ruleEObjectUriLiteral | this_DelayLiteral_6= ruleDelayLiteral )", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2132:5: this_BooleanLiteral_0= ruleBooleanLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral4345);
                    this_BooleanLiteral_0=ruleBooleanLiteral();
                    _fsp--;

                     
                            current = this_BooleanLiteral_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2142:5: this_FloatLiteral_1= ruleFloatLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFloatLiteral_in_ruleLiteral4372);
                    this_FloatLiteral_1=ruleFloatLiteral();
                    _fsp--;

                     
                            current = this_FloatLiteral_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2152:5: this_IntLiteral_2= ruleIntLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral4399);
                    this_IntLiteral_2=ruleIntLiteral();
                    _fsp--;

                     
                            current = this_IntLiteral_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2162:5: this_StringLiteral_3= ruleStringLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral4426);
                    this_StringLiteral_3=ruleStringLiteral();
                    _fsp--;

                     
                            current = this_StringLiteral_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2172:5: this_UriLiteral_4= ruleUriLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLiteralAccess().getUriLiteralParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUriLiteral_in_ruleLiteral4453);
                    this_UriLiteral_4=ruleUriLiteral();
                    _fsp--;

                     
                            current = this_UriLiteral_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2182:5: this_EObjectUriLiteral_5= ruleEObjectUriLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLiteralAccess().getEObjectUriLiteralParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEObjectUriLiteral_in_ruleLiteral4480);
                    this_EObjectUriLiteral_5=ruleEObjectUriLiteral();
                    _fsp--;

                     
                            current = this_EObjectUriLiteral_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2192:5: this_DelayLiteral_6= ruleDelayLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLiteralAccess().getDelayLiteralParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDelayLiteral_in_ruleLiteral4507);
                    this_DelayLiteral_6=ruleDelayLiteral();
                    _fsp--;

                     
                            current = this_DelayLiteral_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLiteral


    // $ANTLR start entryRuleBooleanLiteral
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2208:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2209:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2210:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral4542);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();
            _fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral4552); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBooleanLiteral


    // $ANTLR start ruleBooleanLiteral
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2217:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_booleanValue_0_0= ruleBOOLEAN_LITERAL ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_booleanValue_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2222:6: ( ( (lv_booleanValue_0_0= ruleBOOLEAN_LITERAL ) ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2223:1: ( (lv_booleanValue_0_0= ruleBOOLEAN_LITERAL ) )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2223:1: ( (lv_booleanValue_0_0= ruleBOOLEAN_LITERAL ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2224:1: (lv_booleanValue_0_0= ruleBOOLEAN_LITERAL )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2224:1: (lv_booleanValue_0_0= ruleBOOLEAN_LITERAL )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2225:3: lv_booleanValue_0_0= ruleBOOLEAN_LITERAL
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBooleanLiteralAccess().getBooleanValueBOOLEAN_LITERALParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBOOLEAN_LITERAL_in_ruleBooleanLiteral4597);
            lv_booleanValue_0_0=ruleBOOLEAN_LITERAL();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBooleanLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"booleanValue",
            	        		lv_booleanValue_0_0, 
            	        		"BOOLEAN_LITERAL", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBooleanLiteral


    // $ANTLR start entryRuleIntLiteral
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2255:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2256:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2257:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral4632);
            iv_ruleIntLiteral=ruleIntLiteral();
            _fsp--;

             current =iv_ruleIntLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral4642); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIntLiteral


    // $ANTLR start ruleIntLiteral
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2264:1: ruleIntLiteral returns [EObject current=null] : ( ( (lv_intValue_0_1= RULE_INT | lv_intValue_0_2= rulePOS_INT | lv_intValue_0_3= ruleNEG_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_intValue_0_1=null;
        AntlrDatatypeRuleToken lv_intValue_0_2 = null;

        AntlrDatatypeRuleToken lv_intValue_0_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2269:6: ( ( ( (lv_intValue_0_1= RULE_INT | lv_intValue_0_2= rulePOS_INT | lv_intValue_0_3= ruleNEG_INT ) ) ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2270:1: ( ( (lv_intValue_0_1= RULE_INT | lv_intValue_0_2= rulePOS_INT | lv_intValue_0_3= ruleNEG_INT ) ) )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2270:1: ( ( (lv_intValue_0_1= RULE_INT | lv_intValue_0_2= rulePOS_INT | lv_intValue_0_3= ruleNEG_INT ) ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2271:1: ( (lv_intValue_0_1= RULE_INT | lv_intValue_0_2= rulePOS_INT | lv_intValue_0_3= ruleNEG_INT ) )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2271:1: ( (lv_intValue_0_1= RULE_INT | lv_intValue_0_2= rulePOS_INT | lv_intValue_0_3= ruleNEG_INT ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2272:1: (lv_intValue_0_1= RULE_INT | lv_intValue_0_2= rulePOS_INT | lv_intValue_0_3= ruleNEG_INT )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2272:1: (lv_intValue_0_1= RULE_INT | lv_intValue_0_2= rulePOS_INT | lv_intValue_0_3= ruleNEG_INT )
            int alt33=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt33=1;
                }
                break;
            case 40:
                {
                alt33=2;
                }
                break;
            case 41:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2272:1: (lv_intValue_0_1= RULE_INT | lv_intValue_0_2= rulePOS_INT | lv_intValue_0_3= ruleNEG_INT )", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2273:3: lv_intValue_0_1= RULE_INT
                    {
                    lv_intValue_0_1=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral4685); 

                    			createLeafNode(grammarAccess.getIntLiteralAccess().getIntValueINTTerminalRuleCall_0_0(), "intValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntLiteralRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"intValue",
                    	        		lv_intValue_0_1, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2294:8: lv_intValue_0_2= rulePOS_INT
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getIntLiteralAccess().getIntValuePOS_INTParserRuleCall_0_1(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePOS_INT_in_ruleIntLiteral4709);
                    lv_intValue_0_2=rulePOS_INT();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntLiteralRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"intValue",
                    	        		lv_intValue_0_2, 
                    	        		"POS_INT", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;
                case 3 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2315:8: lv_intValue_0_3= ruleNEG_INT
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getIntLiteralAccess().getIntValueNEG_INTParserRuleCall_0_2(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNEG_INT_in_ruleIntLiteral4728);
                    lv_intValue_0_3=ruleNEG_INT();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntLiteralRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"intValue",
                    	        		lv_intValue_0_3, 
                    	        		"NEG_INT", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIntLiteral


    // $ANTLR start entryRuleFloatLiteral
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2347:1: entryRuleFloatLiteral returns [EObject current=null] : iv_ruleFloatLiteral= ruleFloatLiteral EOF ;
    public final EObject entryRuleFloatLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatLiteral = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2348:2: (iv_ruleFloatLiteral= ruleFloatLiteral EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2349:2: iv_ruleFloatLiteral= ruleFloatLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFloatLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral4766);
            iv_ruleFloatLiteral=ruleFloatLiteral();
            _fsp--;

             current =iv_ruleFloatLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatLiteral4776); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFloatLiteral


    // $ANTLR start ruleFloatLiteral
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2356:1: ruleFloatLiteral returns [EObject current=null] : ( (lv_floatValue_0_0= ruleFLOAT_LITERAL ) ) ;
    public final EObject ruleFloatLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_floatValue_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2361:6: ( ( (lv_floatValue_0_0= ruleFLOAT_LITERAL ) ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2362:1: ( (lv_floatValue_0_0= ruleFLOAT_LITERAL ) )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2362:1: ( (lv_floatValue_0_0= ruleFLOAT_LITERAL ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2363:1: (lv_floatValue_0_0= ruleFLOAT_LITERAL )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2363:1: (lv_floatValue_0_0= ruleFLOAT_LITERAL )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2364:3: lv_floatValue_0_0= ruleFLOAT_LITERAL
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFloatLiteralAccess().getFloatValueFLOAT_LITERALParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFLOAT_LITERAL_in_ruleFloatLiteral4821);
            lv_floatValue_0_0=ruleFLOAT_LITERAL();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFloatLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"floatValue",
            	        		lv_floatValue_0_0, 
            	        		"FLOAT_LITERAL", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFloatLiteral


    // $ANTLR start entryRuleStringLiteral
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2394:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2395:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2396:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral4856);
            iv_ruleStringLiteral=ruleStringLiteral();
            _fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral4866); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStringLiteral


    // $ANTLR start ruleStringLiteral
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2403:1: ruleStringLiteral returns [EObject current=null] : ( (lv_stringValue_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_stringValue_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2408:6: ( ( (lv_stringValue_0_0= RULE_STRING ) ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2409:1: ( (lv_stringValue_0_0= RULE_STRING ) )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2409:1: ( (lv_stringValue_0_0= RULE_STRING ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2410:1: (lv_stringValue_0_0= RULE_STRING )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2410:1: (lv_stringValue_0_0= RULE_STRING )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2411:3: lv_stringValue_0_0= RULE_STRING
            {
            lv_stringValue_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral4907); 

            			createLeafNode(grammarAccess.getStringLiteralAccess().getStringValueSTRINGTerminalRuleCall_0(), "stringValue"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStringLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"stringValue",
            	        		lv_stringValue_0_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStringLiteral


    // $ANTLR start entryRuleUriLiteral
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2441:1: entryRuleUriLiteral returns [EObject current=null] : iv_ruleUriLiteral= ruleUriLiteral EOF ;
    public final EObject entryRuleUriLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUriLiteral = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2442:2: (iv_ruleUriLiteral= ruleUriLiteral EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2443:2: iv_ruleUriLiteral= ruleUriLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUriLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleUriLiteral_in_entryRuleUriLiteral4947);
            iv_ruleUriLiteral=ruleUriLiteral();
            _fsp--;

             current =iv_ruleUriLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUriLiteral4957); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUriLiteral


    // $ANTLR start ruleUriLiteral
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2450:1: ruleUriLiteral returns [EObject current=null] : ( (lv_uri_0_0= RULE_URI_LITERAL ) ) ;
    public final EObject ruleUriLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_uri_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2455:6: ( ( (lv_uri_0_0= RULE_URI_LITERAL ) ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2456:1: ( (lv_uri_0_0= RULE_URI_LITERAL ) )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2456:1: ( (lv_uri_0_0= RULE_URI_LITERAL ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2457:1: (lv_uri_0_0= RULE_URI_LITERAL )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2457:1: (lv_uri_0_0= RULE_URI_LITERAL )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2458:3: lv_uri_0_0= RULE_URI_LITERAL
            {
            lv_uri_0_0=(Token)input.LT(1);
            match(input,RULE_URI_LITERAL,FOLLOW_RULE_URI_LITERAL_in_ruleUriLiteral4998); 

            			createLeafNode(grammarAccess.getUriLiteralAccess().getUriURI_LITERALTerminalRuleCall_0(), "uri"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUriLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"uri",
            	        		lv_uri_0_0, 
            	        		"URI_LITERAL", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUriLiteral


    // $ANTLR start entryRuleEObjectUriLiteral
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2488:1: entryRuleEObjectUriLiteral returns [EObject current=null] : iv_ruleEObjectUriLiteral= ruleEObjectUriLiteral EOF ;
    public final EObject entryRuleEObjectUriLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObjectUriLiteral = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2489:2: (iv_ruleEObjectUriLiteral= ruleEObjectUriLiteral EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2490:2: iv_ruleEObjectUriLiteral= ruleEObjectUriLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEObjectUriLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleEObjectUriLiteral_in_entryRuleEObjectUriLiteral5038);
            iv_ruleEObjectUriLiteral=ruleEObjectUriLiteral();
            _fsp--;

             current =iv_ruleEObjectUriLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEObjectUriLiteral5048); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEObjectUriLiteral


    // $ANTLR start ruleEObjectUriLiteral
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2497:1: ruleEObjectUriLiteral returns [EObject current=null] : ( (lv_uri_0_0= RULE_EOBJECT_URI_LITERAL ) ) ;
    public final EObject ruleEObjectUriLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_uri_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2502:6: ( ( (lv_uri_0_0= RULE_EOBJECT_URI_LITERAL ) ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2503:1: ( (lv_uri_0_0= RULE_EOBJECT_URI_LITERAL ) )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2503:1: ( (lv_uri_0_0= RULE_EOBJECT_URI_LITERAL ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2504:1: (lv_uri_0_0= RULE_EOBJECT_URI_LITERAL )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2504:1: (lv_uri_0_0= RULE_EOBJECT_URI_LITERAL )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2505:3: lv_uri_0_0= RULE_EOBJECT_URI_LITERAL
            {
            lv_uri_0_0=(Token)input.LT(1);
            match(input,RULE_EOBJECT_URI_LITERAL,FOLLOW_RULE_EOBJECT_URI_LITERAL_in_ruleEObjectUriLiteral5089); 

            			createLeafNode(grammarAccess.getEObjectUriLiteralAccess().getUriEOBJECT_URI_LITERALTerminalRuleCall_0(), "uri"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEObjectUriLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"uri",
            	        		lv_uri_0_0, 
            	        		"EOBJECT_URI_LITERAL", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEObjectUriLiteral


    // $ANTLR start entryRuleDelayLiteral
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2535:1: entryRuleDelayLiteral returns [EObject current=null] : iv_ruleDelayLiteral= ruleDelayLiteral EOF ;
    public final EObject entryRuleDelayLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelayLiteral = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2536:2: (iv_ruleDelayLiteral= ruleDelayLiteral EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2537:2: iv_ruleDelayLiteral= ruleDelayLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDelayLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleDelayLiteral_in_entryRuleDelayLiteral5129);
            iv_ruleDelayLiteral=ruleDelayLiteral();
            _fsp--;

             current =iv_ruleDelayLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelayLiteral5139); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDelayLiteral


    // $ANTLR start ruleDelayLiteral
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2544:1: ruleDelayLiteral returns [EObject current=null] : ( ( (lv_intValue_0_0= RULE_INT ) ) ( (lv_timeUnit_1_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleDelayLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_intValue_0_0=null;
        Enumerator lv_timeUnit_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2549:6: ( ( ( (lv_intValue_0_0= RULE_INT ) ) ( (lv_timeUnit_1_0= ruleTimeUnit ) ) ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2550:1: ( ( (lv_intValue_0_0= RULE_INT ) ) ( (lv_timeUnit_1_0= ruleTimeUnit ) ) )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2550:1: ( ( (lv_intValue_0_0= RULE_INT ) ) ( (lv_timeUnit_1_0= ruleTimeUnit ) ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2550:2: ( (lv_intValue_0_0= RULE_INT ) ) ( (lv_timeUnit_1_0= ruleTimeUnit ) )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2550:2: ( (lv_intValue_0_0= RULE_INT ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2551:1: (lv_intValue_0_0= RULE_INT )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2551:1: (lv_intValue_0_0= RULE_INT )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2552:3: lv_intValue_0_0= RULE_INT
            {
            lv_intValue_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDelayLiteral5181); 

            			createLeafNode(grammarAccess.getDelayLiteralAccess().getIntValueINTTerminalRuleCall_0_0(), "intValue"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDelayLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"intValue",
            	        		lv_intValue_0_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2574:2: ( (lv_timeUnit_1_0= ruleTimeUnit ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2575:1: (lv_timeUnit_1_0= ruleTimeUnit )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2575:1: (lv_timeUnit_1_0= ruleTimeUnit )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2576:3: lv_timeUnit_1_0= ruleTimeUnit
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDelayLiteralAccess().getTimeUnitTimeUnitEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTimeUnit_in_ruleDelayLiteral5207);
            lv_timeUnit_1_0=ruleTimeUnit();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDelayLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"timeUnit",
            	        		lv_timeUnit_1_0, 
            	        		"TimeUnit", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDelayLiteral


    // $ANTLR start entryRuleVarRef
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2606:1: entryRuleVarRef returns [EObject current=null] : iv_ruleVarRef= ruleVarRef EOF ;
    public final EObject entryRuleVarRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarRef = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2607:2: (iv_ruleVarRef= ruleVarRef EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2608:2: iv_ruleVarRef= ruleVarRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVarRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleVarRef_in_entryRuleVarRef5243);
            iv_ruleVarRef=ruleVarRef();
            _fsp--;

             current =iv_ruleVarRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarRef5253); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVarRef


    // $ANTLR start ruleVarRef
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2615:1: ruleVarRef returns [EObject current=null] : ( ( ruleQNAME ) ) ;
    public final EObject ruleVarRef() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2620:6: ( ( ( ruleQNAME ) ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2621:1: ( ( ruleQNAME ) )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2621:1: ( ( ruleQNAME ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2622:1: ( ruleQNAME )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2622:1: ( ruleQNAME )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2623:3: ruleQNAME
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getVarRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
             
            	        currentNode=createCompositeNode(grammarAccess.getVarRefAccess().getVarVarDefCrossReference_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQNAME_in_ruleVarRef5300);
            ruleQNAME();
            _fsp--;

             
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVarRef


    // $ANTLR start entryRuleEPath
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2645:1: entryRuleEPath returns [EObject current=null] : iv_ruleEPath= ruleEPath EOF ;
    public final EObject entryRuleEPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPath = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2646:2: (iv_ruleEPath= ruleEPath EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2647:2: iv_ruleEPath= ruleEPath EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEPathRule(), currentNode); 
            pushFollow(FOLLOW_ruleEPath_in_entryRuleEPath5335);
            iv_ruleEPath=ruleEPath();
            _fsp--;

             current =iv_ruleEPath; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEPath5345); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEPath


    // $ANTLR start ruleEPath
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2654:1: ruleEPath returns [EObject current=null] : ( ( (lv_var_0_0= ruleVarRef ) ) ( (lv_steps_1_0= ruleEStep ) )* ) ;
    public final EObject ruleEPath() throws RecognitionException {
        EObject current = null;

        EObject lv_var_0_0 = null;

        EObject lv_steps_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2659:6: ( ( ( (lv_var_0_0= ruleVarRef ) ) ( (lv_steps_1_0= ruleEStep ) )* ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2660:1: ( ( (lv_var_0_0= ruleVarRef ) ) ( (lv_steps_1_0= ruleEStep ) )* )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2660:1: ( ( (lv_var_0_0= ruleVarRef ) ) ( (lv_steps_1_0= ruleEStep ) )* )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2660:2: ( (lv_var_0_0= ruleVarRef ) ) ( (lv_steps_1_0= ruleEStep ) )*
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2660:2: ( (lv_var_0_0= ruleVarRef ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2661:1: (lv_var_0_0= ruleVarRef )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2661:1: (lv_var_0_0= ruleVarRef )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2662:3: lv_var_0_0= ruleVarRef
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEPathAccess().getVarVarRefParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleVarRef_in_ruleEPath5391);
            lv_var_0_0=ruleVarRef();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEPathRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"var",
            	        		lv_var_0_0, 
            	        		"VarRef", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2684:2: ( (lv_steps_1_0= ruleEStep ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==42) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2685:1: (lv_steps_1_0= ruleEStep )
            	    {
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2685:1: (lv_steps_1_0= ruleEStep )
            	    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2686:3: lv_steps_1_0= ruleEStep
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEPathAccess().getStepsEStepParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEStep_in_ruleEPath5412);
            	    lv_steps_1_0=ruleEStep();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEPathRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"steps",
            	    	        		lv_steps_1_0, 
            	    	        		"EStep", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEPath


    // $ANTLR start entryRuleEStep
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2716:1: entryRuleEStep returns [EObject current=null] : iv_ruleEStep= ruleEStep EOF ;
    public final EObject entryRuleEStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStep = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2717:2: (iv_ruleEStep= ruleEStep EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2718:2: iv_ruleEStep= ruleEStep EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEStepRule(), currentNode); 
            pushFollow(FOLLOW_ruleEStep_in_entryRuleEStep5449);
            iv_ruleEStep=ruleEStep();
            _fsp--;

             current =iv_ruleEStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStep5459); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEStep


    // $ANTLR start ruleEStep
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2725:1: ruleEStep returns [EObject current=null] : ( '/ ' ( (lv_featureName_1_0= RULE_ID ) ) ( (lv_filter_2_0= ruleEStepFilter ) )? ) ;
    public final EObject ruleEStep() throws RecognitionException {
        EObject current = null;

        Token lv_featureName_1_0=null;
        EObject lv_filter_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2730:6: ( ( '/ ' ( (lv_featureName_1_0= RULE_ID ) ) ( (lv_filter_2_0= ruleEStepFilter ) )? ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2731:1: ( '/ ' ( (lv_featureName_1_0= RULE_ID ) ) ( (lv_filter_2_0= ruleEStepFilter ) )? )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2731:1: ( '/ ' ( (lv_featureName_1_0= RULE_ID ) ) ( (lv_filter_2_0= ruleEStepFilter ) )? )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2731:3: '/ ' ( (lv_featureName_1_0= RULE_ID ) ) ( (lv_filter_2_0= ruleEStepFilter ) )?
            {
            match(input,42,FOLLOW_42_in_ruleEStep5494); 

                    createLeafNode(grammarAccess.getEStepAccess().getSolidusSpaceKeyword_0(), null); 
                
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2735:1: ( (lv_featureName_1_0= RULE_ID ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2736:1: (lv_featureName_1_0= RULE_ID )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2736:1: (lv_featureName_1_0= RULE_ID )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2737:3: lv_featureName_1_0= RULE_ID
            {
            lv_featureName_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEStep5511); 

            			createLeafNode(grammarAccess.getEStepAccess().getFeatureNameIDTerminalRuleCall_1_0(), "featureName"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEStepRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"featureName",
            	        		lv_featureName_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2759:2: ( (lv_filter_2_0= ruleEStepFilter ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_SCRIPT_EXPRESSION) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2760:1: (lv_filter_2_0= ruleEStepFilter )
                    {
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2760:1: (lv_filter_2_0= ruleEStepFilter )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2761:3: lv_filter_2_0= ruleEStepFilter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEStepAccess().getFilterEStepFilterParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleEStepFilter_in_ruleEStep5537);
                    lv_filter_2_0=ruleEStepFilter();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEStepRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"filter",
                    	        		lv_filter_2_0, 
                    	        		"EStepFilter", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEStep


    // $ANTLR start entryRuleEStepFilter
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2791:1: entryRuleEStepFilter returns [EObject current=null] : iv_ruleEStepFilter= ruleEStepFilter EOF ;
    public final EObject entryRuleEStepFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStepFilter = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2792:2: (iv_ruleEStepFilter= ruleEStepFilter EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2793:2: iv_ruleEStepFilter= ruleEStepFilter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEStepFilterRule(), currentNode); 
            pushFollow(FOLLOW_ruleEStepFilter_in_entryRuleEStepFilter5574);
            iv_ruleEStepFilter=ruleEStepFilter();
            _fsp--;

             current =iv_ruleEStepFilter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStepFilter5584); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEStepFilter


    // $ANTLR start ruleEStepFilter
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2800:1: ruleEStepFilter returns [EObject current=null] : ( (lv_script_0_0= ruleScriptExpression ) ) ;
    public final EObject ruleEStepFilter() throws RecognitionException {
        EObject current = null;

        EObject lv_script_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2805:6: ( ( (lv_script_0_0= ruleScriptExpression ) ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2806:1: ( (lv_script_0_0= ruleScriptExpression ) )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2806:1: ( (lv_script_0_0= ruleScriptExpression ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2807:1: (lv_script_0_0= ruleScriptExpression )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2807:1: (lv_script_0_0= ruleScriptExpression )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2808:3: lv_script_0_0= ruleScriptExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEStepFilterAccess().getScriptScriptExpressionParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScriptExpression_in_ruleEStepFilter5629);
            lv_script_0_0=ruleScriptExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEStepFilterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"script",
            	        		lv_script_0_0, 
            	        		"ScriptExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEStepFilter


    // $ANTLR start entryRuleScriptExpression
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2838:1: entryRuleScriptExpression returns [EObject current=null] : iv_ruleScriptExpression= ruleScriptExpression EOF ;
    public final EObject entryRuleScriptExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScriptExpression = null;


        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2839:2: (iv_ruleScriptExpression= ruleScriptExpression EOF )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2840:2: iv_ruleScriptExpression= ruleScriptExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getScriptExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleScriptExpression_in_entryRuleScriptExpression5664);
            iv_ruleScriptExpression=ruleScriptExpression();
            _fsp--;

             current =iv_ruleScriptExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScriptExpression5674); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleScriptExpression


    // $ANTLR start ruleScriptExpression
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2847:1: ruleScriptExpression returns [EObject current=null] : ( (lv_script_0_0= RULE_SCRIPT_EXPRESSION ) ) ;
    public final EObject ruleScriptExpression() throws RecognitionException {
        EObject current = null;

        Token lv_script_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2852:6: ( ( (lv_script_0_0= RULE_SCRIPT_EXPRESSION ) ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2853:1: ( (lv_script_0_0= RULE_SCRIPT_EXPRESSION ) )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2853:1: ( (lv_script_0_0= RULE_SCRIPT_EXPRESSION ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2854:1: (lv_script_0_0= RULE_SCRIPT_EXPRESSION )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2854:1: (lv_script_0_0= RULE_SCRIPT_EXPRESSION )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2855:3: lv_script_0_0= RULE_SCRIPT_EXPRESSION
            {
            lv_script_0_0=(Token)input.LT(1);
            match(input,RULE_SCRIPT_EXPRESSION,FOLLOW_RULE_SCRIPT_EXPRESSION_in_ruleScriptExpression5715); 

            			createLeafNode(grammarAccess.getScriptExpressionAccess().getScriptSCRIPT_EXPRESSIONTerminalRuleCall_0(), "script"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getScriptExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"script",
            	        		lv_script_0_0, 
            	        		"SCRIPT_EXPRESSION", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleScriptExpression


    // $ANTLR start ruleTimeUnit
    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2885:1: ruleTimeUnit returns [Enumerator current=null] : ( ( 'ms' ) | ( 's' ) | ( 'm' ) | ( 'h' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2889:6: ( ( ( 'ms' ) | ( 's' ) | ( 'm' ) | ( 'h' ) ) )
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2890:1: ( ( 'ms' ) | ( 's' ) | ( 'm' ) | ( 'h' ) )
            {
            // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2890:1: ( ( 'ms' ) | ( 's' ) | ( 'm' ) | ( 'h' ) )
            int alt36=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt36=1;
                }
                break;
            case 44:
                {
                alt36=2;
                }
                break;
            case 45:
                {
                alt36=3;
                }
                break;
            case 46:
                {
                alt36=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2890:1: ( ( 'ms' ) | ( 's' ) | ( 'm' ) | ( 'h' ) )", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2890:2: ( 'ms' )
                    {
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2890:2: ( 'ms' )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2890:4: 'ms'
                    {
                    match(input,43,FOLLOW_43_in_ruleTimeUnit5767); 

                            current = grammarAccess.getTimeUnitAccess().getMsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTimeUnitAccess().getMsEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2896:6: ( 's' )
                    {
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2896:6: ( 's' )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2896:8: 's'
                    {
                    match(input,44,FOLLOW_44_in_ruleTimeUnit5782); 

                            current = grammarAccess.getTimeUnitAccess().getSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTimeUnitAccess().getSEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2902:6: ( 'm' )
                    {
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2902:6: ( 'm' )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2902:8: 'm'
                    {
                    match(input,45,FOLLOW_45_in_ruleTimeUnit5797); 

                            current = grammarAccess.getTimeUnitAccess().getMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTimeUnitAccess().getMEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2908:6: ( 'h' )
                    {
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2908:6: ( 'h' )
                    // ../no.hal.scxml.scxmlxt/src-gen/no/hal/scxml/parser/antlr/internal/InternalScxmlxt.g:2908:8: 'h'
                    {
                    match(input,46,FOLLOW_46_in_ruleTimeUnit5812); 

                            current = grammarAccess.getTimeUnitAccess().getHEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTimeUnitAccess().getHEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTimeUnit


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA21_eotS =
        "\11\uffff";
    static final String DFA21_eofS =
        "\5\uffff\1\2\1\3\2\uffff";
    static final String DFA21_minS =
        "\1\5\1\25\2\uffff\3\5\1\25\1\uffff";
    static final String DFA21_maxS =
        "\1\27\1\47\2\uffff\1\5\2\31\1\47\1\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\2\1\3\4\uffff\1\1";
    static final String DFA21_specialS =
        "\11\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1\17\uffff\1\2\1\uffff\1\3",
            "\1\6\1\uffff\1\5\17\uffff\1\4",
            "",
            "",
            "\1\7",
            "\1\10\13\uffff\1\2\4\uffff\1\2\2\uffff\1\2",
            "\1\10\13\uffff\1\3\4\uffff\1\3\2\uffff\1\3",
            "\1\6\1\uffff\1\5\17\uffff\1\4",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1038:1: ( ( ( ( ( ruleQNAME ) ) '->' ( ( ruleQNAME ) ) ) | ( ( ( ruleQNAME ) ) '<-' ( ( ruleQNAME ) ) ) ) | ( ( '->' ( ( ruleQNAME ) ) ) | ( ( ( ruleQNAME ) ) '<-' ) ) | ( ( ( ( ruleQNAME ) ) '->' ) | ( '<-' ( ( ruleQNAME ) ) ) ) )";
        }
    }
    static final String DFA18_eotS =
        "\6\uffff";
    static final String DFA18_eofS =
        "\6\uffff";
    static final String DFA18_minS =
        "\1\5\1\25\1\5\2\uffff\1\25";
    static final String DFA18_maxS =
        "\1\5\1\47\1\5\2\uffff\1\47";
    static final String DFA18_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA18_specialS =
        "\6\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1",
            "\1\4\1\uffff\1\3\17\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\4\1\uffff\1\3\17\uffff\1\2"
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1038:2: ( ( ( ( ruleQNAME ) ) '->' ( ( ruleQNAME ) ) ) | ( ( ( ruleQNAME ) ) '<-' ( ( ruleQNAME ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleStateMachine_in_entryRuleStateMachine75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateMachine85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceImport_in_ruleStateMachine131 = new BitSet(new long[]{0x0000000103658022L});
    public static final BitSet FOLLOW_ruleState_in_ruleStateMachine154 = new BitSet(new long[]{0x0000000103600022L});
    public static final BitSet FOLLOW_ruleAbstractTransition_in_ruleStateMachine181 = new BitSet(new long[]{0x0000000103600022L});
    public static final BitSet FOLLOW_ruleVarDef_in_ruleStateMachine208 = new BitSet(new long[]{0x0000000103600022L});
    public static final BitSet FOLLOW_ruleResourceImport_in_entryRuleResourceImport246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceImport256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainModelImport_in_ruleResourceImport303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainDataImport_in_ruleResourceImport330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainModelImport_in_entryRuleDomainModelImport365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModelImport375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDomainModelImport411 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDomainModelImport423 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDomainModelImport440 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDomainModelImport455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainDataImport_in_entryRuleDomainDataImport491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainDataImport501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDomainDataImport537 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDomainDataImport549 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDomainDataImport566 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDomainDataImport581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialTransition_in_ruleState673 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState691 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_17_in_ruleState707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleState724 = new BitSet(new long[]{0x0000000103700020L});
    public static final BitSet FOLLOW_ruleState_in_ruleState746 = new BitSet(new long[]{0x0000000103700020L});
    public static final BitSet FOLLOW_ruleAbstractTransition_in_ruleState773 = new BitSet(new long[]{0x0000000103700020L});
    public static final BitSet FOLLOW_ruleVarDef_in_ruleState800 = new BitSet(new long[]{0x0000000103700020L});
    public static final BitSet FOLLOW_20_in_ruleState812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialTransition_in_entryRuleInitialTransition850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitialTransition860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleInitialTransition904 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleInitialTransition915 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_ruleAction_in_ruleInitialTransition936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractTransition_in_entryRuleAbstractTransition976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractTransition986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleAbstractTransition1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalTransition_in_ruleAbstractTransition1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition1095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTransition1142 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQNAME_in_ruleTransition1165 = new BitSet(new long[]{0x0000000003420000L});
    public static final BitSet FOLLOW_ruleQNAME_in_ruleTransition1196 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTransition1206 = new BitSet(new long[]{0x0000000003420000L});
    public static final BitSet FOLLOW_24_in_ruleTransition1219 = new BitSet(new long[]{0x0000000038A00060L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleTransition1240 = new BitSet(new long[]{0x0000000002420000L});
    public static final BitSet FOLLOW_25_in_ruleTransition1253 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleTransition1274 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_22_in_ruleTransition1287 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_ruleAction_in_ruleTransition1308 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTransition1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalTransition_in_entryRuleInternalTransition1356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalTransition1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleInternalTransition1402 = new BitSet(new long[]{0x0000000038A00060L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleInternalTransition1423 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_25_in_ruleInternalTransition1436 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleInternalTransition1457 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleInternalTransition1469 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_ruleAction_in_ruleInternalTransition1490 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInternalTransition1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent1536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolicEvent_in_ruleEvent1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionEvent_in_ruleEvent1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnterEvent_in_ruleEvent1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_ruleEvent1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScriptEvent_in_ruleEvent1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimerEvent_in_ruleEvent1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolicEvent_in_entryRuleSymbolicEvent1763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbolicEvent1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSymbolicEvent1815 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSymbolicEvent1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionEvent_in_entryRuleTransitionEvent1866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionEvent1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNAME_in_ruleTransitionEvent1926 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTransitionEvent1936 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQNAME_in_ruleTransitionEvent1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNAME_in_ruleTransitionEvent1990 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTransitionEvent2000 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQNAME_in_ruleTransitionEvent2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTransitionEvent2043 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQNAME_in_ruleTransitionEvent2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNAME_in_ruleTransitionEvent2097 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTransitionEvent2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNAME_in_ruleTransitionEvent2140 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTransitionEvent2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleTransitionEvent2168 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQNAME_in_ruleTransitionEvent2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnterEvent_in_entryRuleEnterEvent2229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnterEvent2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleEnterEvent2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_entryRuleExitEvent2319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitEvent2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleExitEvent2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScriptEvent_in_entryRuleScriptEvent2409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScriptEvent2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SCRIPT_EXPRESSION_in_ruleScriptEvent2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimerEvent_in_entryRuleTimerEvent2500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimerEvent2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleTimerEvent2545 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleTimerEvent2555 = new BitSet(new long[]{0x0000036000000770L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTimerEvent2576 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleTimerEvent2586 = new BitSet(new long[]{0x0000000038A00060L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleTimerEvent2607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition2643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SCRIPT_EXPRESSION_in_ruleCondition2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction2734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolicAction_in_ruleAction2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScriptAction_in_ruleAction2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentAction_in_ruleAction2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolicAction_in_entryRuleSymbolicAction2880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbolicAction2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSymbolicAction2932 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_31_in_ruleSymbolicAction2948 = new BitSet(new long[]{0x0000036000000770L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSymbolicAction2969 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSymbolicAction2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScriptAction_in_entryRuleScriptAction3017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScriptAction3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SCRIPT_STATEMENTS_in_ruleScriptAction3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDef_in_entryRuleVarDef3108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDef3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleVarDef3153 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarDef3170 = new BitSet(new long[]{0x0000001200020000L});
    public static final BitSet FOLLOW_33_in_ruleVarDef3186 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQNAME_in_ruleVarDef3209 = new BitSet(new long[]{0x0000001C00020000L});
    public static final BitSet FOLLOW_34_in_ruleVarDef3229 = new BitSet(new long[]{0x0000001000020000L});
    public static final BitSet FOLLOW_35_in_ruleVarDef3258 = new BitSet(new long[]{0x0000001000020000L});
    public static final BitSet FOLLOW_36_in_ruleVarDef3288 = new BitSet(new long[]{0x0000036000000770L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVarDef3309 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVarDef3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentAction_in_entryRuleAssignmentAction3357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentAction3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNAME_in_ruleAssignmentAction3415 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleAssignmentAction3425 = new BitSet(new long[]{0x0000036000000770L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignmentAction3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_LITERAL_in_entryRuleBOOLEAN_LITERAL3483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOLEAN_LITERAL3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleBOOLEAN_LITERAL3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleBOOLEAN_LITERAL3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFLOAT_LITERAL_in_entryRuleFLOAT_LITERAL3592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFLOAT_LITERAL3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFLOAT_LITERAL3644 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rulePOS_INT_in_ruleFLOAT_LITERAL3677 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleNEG_INT_in_ruleFLOAT_LITERAL3710 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleFLOAT_LITERAL3729 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFLOAT_LITERAL3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePOS_INT_in_entryRulePOS_INT3790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePOS_INT3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulePOS_INT3839 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePOS_INT3854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNEG_INT_in_entryRuleNEG_INT3900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNEG_INT3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleNEG_INT3949 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNEG_INT3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNAME_in_entryRuleQNAME4010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQNAME4021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQNAME4061 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleQNAME4080 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQNAME4095 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression4142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression4152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleExpression4199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScriptExpression_in_ruleExpression4226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPath_in_ruleExpression4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral4288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral4298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral4345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_ruleLiteral4372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral4426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUriLiteral_in_ruleLiteral4453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEObjectUriLiteral_in_ruleLiteral4480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelayLiteral_in_ruleLiteral4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral4542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_LITERAL_in_ruleBooleanLiteral4597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral4632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral4642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral4685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePOS_INT_in_ruleIntLiteral4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNEG_INT_in_ruleIntLiteral4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral4766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatLiteral4776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFLOAT_LITERAL_in_ruleFloatLiteral4821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral4856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral4866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral4907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUriLiteral_in_entryRuleUriLiteral4947 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUriLiteral4957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URI_LITERAL_in_ruleUriLiteral4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEObjectUriLiteral_in_entryRuleEObjectUriLiteral5038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEObjectUriLiteral5048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EOBJECT_URI_LITERAL_in_ruleEObjectUriLiteral5089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelayLiteral_in_entryRuleDelayLiteral5129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelayLiteral5139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDelayLiteral5181 = new BitSet(new long[]{0x0000780000000000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleDelayLiteral5207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRef_in_entryRuleVarRef5243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarRef5253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNAME_in_ruleVarRef5300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPath_in_entryRuleEPath5335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEPath5345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRef_in_ruleEPath5391 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleEStep_in_ruleEPath5412 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleEStep_in_entryRuleEStep5449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStep5459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleEStep5494 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEStep5511 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleEStepFilter_in_ruleEStep5537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStepFilter_in_entryRuleEStepFilter5574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStepFilter5584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScriptExpression_in_ruleEStepFilter5629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScriptExpression_in_entryRuleScriptExpression5664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScriptExpression5674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SCRIPT_EXPRESSION_in_ruleScriptExpression5715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleTimeUnit5767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleTimeUnit5782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTimeUnit5797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTimeUnit5812 = new BitSet(new long[]{0x0000000000000002L});

}