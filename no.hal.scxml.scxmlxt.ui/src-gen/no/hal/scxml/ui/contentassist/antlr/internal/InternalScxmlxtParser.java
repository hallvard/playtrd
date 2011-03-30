package no.hal.scxml.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import no.hal.scxml.services.ScxmlxtGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalScxmlxtParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_SCRIPT_EXPRESSION", "RULE_SCRIPT_STATEMENTS", "RULE_URI_LITERAL", "RULE_EOBJECT_URI_LITERAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'*'", "'[]'", "'true'", "'false'", "'ms'", "'s'", "'m'", "'h'", "'domain'", "'model'", "'data'", "'{'", "'}'", "'->'", "'do'", "'<-'", "'on'", "'if'", "'!'", "'enter'", "'exit'", "'t'", "'>'", "'after'", "'var'", "':'", "'='", "'.'", "'+'", "'-'", "'/ '"
    };
    public static final int RULE_ML_COMMENT=11;
    public static final int RULE_ID=5;
    public static final int RULE_WS=13;
    public static final int EOF=-1;
    public static final int RULE_INT=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_EOBJECT_URI_LITERAL=10;
    public static final int RULE_SCRIPT_EXPRESSION=7;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_URI_LITERAL=9;
    public static final int RULE_SCRIPT_STATEMENTS=8;

        public InternalScxmlxtParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g"; }


     
     	private ScxmlxtGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ScxmlxtGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleStateMachine
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:61:1: entryRuleStateMachine : ruleStateMachine EOF ;
    public final void entryRuleStateMachine() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:62:1: ( ruleStateMachine EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:63:1: ruleStateMachine EOF
            {
             before(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_ruleStateMachine_in_entryRuleStateMachine61);
            ruleStateMachine();
            _fsp--;

             after(grammarAccess.getStateMachineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateMachine68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleStateMachine


    // $ANTLR start ruleStateMachine
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:70:1: ruleStateMachine : ( ( rule__StateMachine__Group__0 ) ) ;
    public final void ruleStateMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:74:2: ( ( ( rule__StateMachine__Group__0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:75:1: ( ( rule__StateMachine__Group__0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:75:1: ( ( rule__StateMachine__Group__0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:76:1: ( rule__StateMachine__Group__0 )
            {
             before(grammarAccess.getStateMachineAccess().getGroup()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:77:1: ( rule__StateMachine__Group__0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:77:2: rule__StateMachine__Group__0
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__0_in_ruleStateMachine94);
            rule__StateMachine__Group__0();
            _fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStateMachine


    // $ANTLR start entryRuleResourceImport
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:89:1: entryRuleResourceImport : ruleResourceImport EOF ;
    public final void entryRuleResourceImport() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:90:1: ( ruleResourceImport EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:91:1: ruleResourceImport EOF
            {
             before(grammarAccess.getResourceImportRule()); 
            pushFollow(FOLLOW_ruleResourceImport_in_entryRuleResourceImport121);
            ruleResourceImport();
            _fsp--;

             after(grammarAccess.getResourceImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceImport128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleResourceImport


    // $ANTLR start ruleResourceImport
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:98:1: ruleResourceImport : ( ( rule__ResourceImport__Alternatives ) ) ;
    public final void ruleResourceImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:102:2: ( ( ( rule__ResourceImport__Alternatives ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:103:1: ( ( rule__ResourceImport__Alternatives ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:103:1: ( ( rule__ResourceImport__Alternatives ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:104:1: ( rule__ResourceImport__Alternatives )
            {
             before(grammarAccess.getResourceImportAccess().getAlternatives()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:105:1: ( rule__ResourceImport__Alternatives )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:105:2: rule__ResourceImport__Alternatives
            {
            pushFollow(FOLLOW_rule__ResourceImport__Alternatives_in_ruleResourceImport154);
            rule__ResourceImport__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getResourceImportAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleResourceImport


    // $ANTLR start entryRuleDomainModelImport
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:117:1: entryRuleDomainModelImport : ruleDomainModelImport EOF ;
    public final void entryRuleDomainModelImport() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:118:1: ( ruleDomainModelImport EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:119:1: ruleDomainModelImport EOF
            {
             before(grammarAccess.getDomainModelImportRule()); 
            pushFollow(FOLLOW_ruleDomainModelImport_in_entryRuleDomainModelImport181);
            ruleDomainModelImport();
            _fsp--;

             after(grammarAccess.getDomainModelImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainModelImport188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDomainModelImport


    // $ANTLR start ruleDomainModelImport
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:126:1: ruleDomainModelImport : ( ( rule__DomainModelImport__Group__0 ) ) ;
    public final void ruleDomainModelImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:130:2: ( ( ( rule__DomainModelImport__Group__0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:131:1: ( ( rule__DomainModelImport__Group__0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:131:1: ( ( rule__DomainModelImport__Group__0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:132:1: ( rule__DomainModelImport__Group__0 )
            {
             before(grammarAccess.getDomainModelImportAccess().getGroup()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:133:1: ( rule__DomainModelImport__Group__0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:133:2: rule__DomainModelImport__Group__0
            {
            pushFollow(FOLLOW_rule__DomainModelImport__Group__0_in_ruleDomainModelImport214);
            rule__DomainModelImport__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDomainModelImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDomainModelImport


    // $ANTLR start entryRuleDomainDataImport
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:145:1: entryRuleDomainDataImport : ruleDomainDataImport EOF ;
    public final void entryRuleDomainDataImport() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:146:1: ( ruleDomainDataImport EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:147:1: ruleDomainDataImport EOF
            {
             before(grammarAccess.getDomainDataImportRule()); 
            pushFollow(FOLLOW_ruleDomainDataImport_in_entryRuleDomainDataImport241);
            ruleDomainDataImport();
            _fsp--;

             after(grammarAccess.getDomainDataImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainDataImport248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDomainDataImport


    // $ANTLR start ruleDomainDataImport
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:154:1: ruleDomainDataImport : ( ( rule__DomainDataImport__Group__0 ) ) ;
    public final void ruleDomainDataImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:158:2: ( ( ( rule__DomainDataImport__Group__0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:159:1: ( ( rule__DomainDataImport__Group__0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:159:1: ( ( rule__DomainDataImport__Group__0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:160:1: ( rule__DomainDataImport__Group__0 )
            {
             before(grammarAccess.getDomainDataImportAccess().getGroup()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:161:1: ( rule__DomainDataImport__Group__0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:161:2: rule__DomainDataImport__Group__0
            {
            pushFollow(FOLLOW_rule__DomainDataImport__Group__0_in_ruleDomainDataImport274);
            rule__DomainDataImport__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDomainDataImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDomainDataImport


    // $ANTLR start entryRuleState
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:173:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:174:1: ( ruleState EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:175:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState301);
            ruleState();
            _fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleState


    // $ANTLR start ruleState
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:182:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:186:2: ( ( ( rule__State__Group__0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:187:1: ( ( rule__State__Group__0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:187:1: ( ( rule__State__Group__0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:188:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:189:1: ( rule__State__Group__0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:189:2: rule__State__Group__0
            {
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState334);
            rule__State__Group__0();
            _fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleState


    // $ANTLR start entryRuleInitialTransition
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:201:1: entryRuleInitialTransition : ruleInitialTransition EOF ;
    public final void entryRuleInitialTransition() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:202:1: ( ruleInitialTransition EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:203:1: ruleInitialTransition EOF
            {
             before(grammarAccess.getInitialTransitionRule()); 
            pushFollow(FOLLOW_ruleInitialTransition_in_entryRuleInitialTransition361);
            ruleInitialTransition();
            _fsp--;

             after(grammarAccess.getInitialTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitialTransition368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleInitialTransition


    // $ANTLR start ruleInitialTransition
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:210:1: ruleInitialTransition : ( ( rule__InitialTransition__Group__0 ) ) ;
    public final void ruleInitialTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:214:2: ( ( ( rule__InitialTransition__Group__0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:215:1: ( ( rule__InitialTransition__Group__0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:215:1: ( ( rule__InitialTransition__Group__0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:216:1: ( rule__InitialTransition__Group__0 )
            {
             before(grammarAccess.getInitialTransitionAccess().getGroup()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:217:1: ( rule__InitialTransition__Group__0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:217:2: rule__InitialTransition__Group__0
            {
            pushFollow(FOLLOW_rule__InitialTransition__Group__0_in_ruleInitialTransition394);
            rule__InitialTransition__Group__0();
            _fsp--;


            }

             after(grammarAccess.getInitialTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleInitialTransition


    // $ANTLR start entryRuleAbstractTransition
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:231:1: entryRuleAbstractTransition : ruleAbstractTransition EOF ;
    public final void entryRuleAbstractTransition() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:232:1: ( ruleAbstractTransition EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:233:1: ruleAbstractTransition EOF
            {
             before(grammarAccess.getAbstractTransitionRule()); 
            pushFollow(FOLLOW_ruleAbstractTransition_in_entryRuleAbstractTransition423);
            ruleAbstractTransition();
            _fsp--;

             after(grammarAccess.getAbstractTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractTransition430); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAbstractTransition


    // $ANTLR start ruleAbstractTransition
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:240:1: ruleAbstractTransition : ( ( rule__AbstractTransition__Alternatives ) ) ;
    public final void ruleAbstractTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:244:2: ( ( ( rule__AbstractTransition__Alternatives ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:245:1: ( ( rule__AbstractTransition__Alternatives ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:245:1: ( ( rule__AbstractTransition__Alternatives ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:246:1: ( rule__AbstractTransition__Alternatives )
            {
             before(grammarAccess.getAbstractTransitionAccess().getAlternatives()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:247:1: ( rule__AbstractTransition__Alternatives )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:247:2: rule__AbstractTransition__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractTransition__Alternatives_in_ruleAbstractTransition456);
            rule__AbstractTransition__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getAbstractTransitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAbstractTransition


    // $ANTLR start entryRuleTransition
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:259:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:260:1: ( ruleTransition EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:261:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition483);
            ruleTransition();
            _fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition490); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTransition


    // $ANTLR start ruleTransition
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:268:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:272:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:273:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:273:1: ( ( rule__Transition__Group__0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:274:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:275:1: ( rule__Transition__Group__0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:275:2: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_rule__Transition__Group__0_in_ruleTransition516);
            rule__Transition__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTransition


    // $ANTLR start entryRuleInternalTransition
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:287:1: entryRuleInternalTransition : ruleInternalTransition EOF ;
    public final void entryRuleInternalTransition() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:288:1: ( ruleInternalTransition EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:289:1: ruleInternalTransition EOF
            {
             before(grammarAccess.getInternalTransitionRule()); 
            pushFollow(FOLLOW_ruleInternalTransition_in_entryRuleInternalTransition543);
            ruleInternalTransition();
            _fsp--;

             after(grammarAccess.getInternalTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalTransition550); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleInternalTransition


    // $ANTLR start ruleInternalTransition
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:296:1: ruleInternalTransition : ( ( rule__InternalTransition__Group__0 ) ) ;
    public final void ruleInternalTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:300:2: ( ( ( rule__InternalTransition__Group__0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:301:1: ( ( rule__InternalTransition__Group__0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:301:1: ( ( rule__InternalTransition__Group__0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:302:1: ( rule__InternalTransition__Group__0 )
            {
             before(grammarAccess.getInternalTransitionAccess().getGroup()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:303:1: ( rule__InternalTransition__Group__0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:303:2: rule__InternalTransition__Group__0
            {
            pushFollow(FOLLOW_rule__InternalTransition__Group__0_in_ruleInternalTransition576);
            rule__InternalTransition__Group__0();
            _fsp--;


            }

             after(grammarAccess.getInternalTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleInternalTransition


    // $ANTLR start entryRuleEvent
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:315:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:316:1: ( ruleEvent EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:317:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent603);
            ruleEvent();
            _fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent610); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEvent


    // $ANTLR start ruleEvent
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:324:1: ruleEvent : ( ( rule__Event__Alternatives ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:328:2: ( ( ( rule__Event__Alternatives ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:329:1: ( ( rule__Event__Alternatives ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:329:1: ( ( rule__Event__Alternatives ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:330:1: ( rule__Event__Alternatives )
            {
             before(grammarAccess.getEventAccess().getAlternatives()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:331:1: ( rule__Event__Alternatives )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:331:2: rule__Event__Alternatives
            {
            pushFollow(FOLLOW_rule__Event__Alternatives_in_ruleEvent636);
            rule__Event__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getEventAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEvent


    // $ANTLR start entryRuleSymbolicEvent
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:343:1: entryRuleSymbolicEvent : ruleSymbolicEvent EOF ;
    public final void entryRuleSymbolicEvent() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:344:1: ( ruleSymbolicEvent EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:345:1: ruleSymbolicEvent EOF
            {
             before(grammarAccess.getSymbolicEventRule()); 
            pushFollow(FOLLOW_ruleSymbolicEvent_in_entryRuleSymbolicEvent663);
            ruleSymbolicEvent();
            _fsp--;

             after(grammarAccess.getSymbolicEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbolicEvent670); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSymbolicEvent


    // $ANTLR start ruleSymbolicEvent
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:352:1: ruleSymbolicEvent : ( ( rule__SymbolicEvent__Group__0 ) ) ;
    public final void ruleSymbolicEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:356:2: ( ( ( rule__SymbolicEvent__Group__0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:357:1: ( ( rule__SymbolicEvent__Group__0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:357:1: ( ( rule__SymbolicEvent__Group__0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:358:1: ( rule__SymbolicEvent__Group__0 )
            {
             before(grammarAccess.getSymbolicEventAccess().getGroup()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:359:1: ( rule__SymbolicEvent__Group__0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:359:2: rule__SymbolicEvent__Group__0
            {
            pushFollow(FOLLOW_rule__SymbolicEvent__Group__0_in_ruleSymbolicEvent696);
            rule__SymbolicEvent__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSymbolicEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSymbolicEvent


    // $ANTLR start entryRuleTransitionEvent
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:371:1: entryRuleTransitionEvent : ruleTransitionEvent EOF ;
    public final void entryRuleTransitionEvent() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:372:1: ( ruleTransitionEvent EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:373:1: ruleTransitionEvent EOF
            {
             before(grammarAccess.getTransitionEventRule()); 
            pushFollow(FOLLOW_ruleTransitionEvent_in_entryRuleTransitionEvent723);
            ruleTransitionEvent();
            _fsp--;

             after(grammarAccess.getTransitionEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionEvent730); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTransitionEvent


    // $ANTLR start ruleTransitionEvent
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:380:1: ruleTransitionEvent : ( ( rule__TransitionEvent__Alternatives ) ) ;
    public final void ruleTransitionEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:384:2: ( ( ( rule__TransitionEvent__Alternatives ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:385:1: ( ( rule__TransitionEvent__Alternatives ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:385:1: ( ( rule__TransitionEvent__Alternatives ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:386:1: ( rule__TransitionEvent__Alternatives )
            {
             before(grammarAccess.getTransitionEventAccess().getAlternatives()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:387:1: ( rule__TransitionEvent__Alternatives )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:387:2: rule__TransitionEvent__Alternatives
            {
            pushFollow(FOLLOW_rule__TransitionEvent__Alternatives_in_ruleTransitionEvent756);
            rule__TransitionEvent__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTransitionEventAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTransitionEvent


    // $ANTLR start entryRuleEnterEvent
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:399:1: entryRuleEnterEvent : ruleEnterEvent EOF ;
    public final void entryRuleEnterEvent() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:400:1: ( ruleEnterEvent EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:401:1: ruleEnterEvent EOF
            {
             before(grammarAccess.getEnterEventRule()); 
            pushFollow(FOLLOW_ruleEnterEvent_in_entryRuleEnterEvent783);
            ruleEnterEvent();
            _fsp--;

             after(grammarAccess.getEnterEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnterEvent790); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEnterEvent


    // $ANTLR start ruleEnterEvent
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:408:1: ruleEnterEvent : ( ( rule__EnterEvent__Group__0 ) ) ;
    public final void ruleEnterEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:412:2: ( ( ( rule__EnterEvent__Group__0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:413:1: ( ( rule__EnterEvent__Group__0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:413:1: ( ( rule__EnterEvent__Group__0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:414:1: ( rule__EnterEvent__Group__0 )
            {
             before(grammarAccess.getEnterEventAccess().getGroup()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:415:1: ( rule__EnterEvent__Group__0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:415:2: rule__EnterEvent__Group__0
            {
            pushFollow(FOLLOW_rule__EnterEvent__Group__0_in_ruleEnterEvent816);
            rule__EnterEvent__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEnterEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEnterEvent


    // $ANTLR start entryRuleExitEvent
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:427:1: entryRuleExitEvent : ruleExitEvent EOF ;
    public final void entryRuleExitEvent() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:428:1: ( ruleExitEvent EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:429:1: ruleExitEvent EOF
            {
             before(grammarAccess.getExitEventRule()); 
            pushFollow(FOLLOW_ruleExitEvent_in_entryRuleExitEvent843);
            ruleExitEvent();
            _fsp--;

             after(grammarAccess.getExitEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitEvent850); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleExitEvent


    // $ANTLR start ruleExitEvent
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:436:1: ruleExitEvent : ( ( rule__ExitEvent__Group__0 ) ) ;
    public final void ruleExitEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:440:2: ( ( ( rule__ExitEvent__Group__0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:441:1: ( ( rule__ExitEvent__Group__0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:441:1: ( ( rule__ExitEvent__Group__0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:442:1: ( rule__ExitEvent__Group__0 )
            {
             before(grammarAccess.getExitEventAccess().getGroup()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:443:1: ( rule__ExitEvent__Group__0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:443:2: rule__ExitEvent__Group__0
            {
            pushFollow(FOLLOW_rule__ExitEvent__Group__0_in_ruleExitEvent876);
            rule__ExitEvent__Group__0();
            _fsp--;


            }

             after(grammarAccess.getExitEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleExitEvent


    // $ANTLR start entryRuleScriptEvent
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:455:1: entryRuleScriptEvent : ruleScriptEvent EOF ;
    public final void entryRuleScriptEvent() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:456:1: ( ruleScriptEvent EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:457:1: ruleScriptEvent EOF
            {
             before(grammarAccess.getScriptEventRule()); 
            pushFollow(FOLLOW_ruleScriptEvent_in_entryRuleScriptEvent903);
            ruleScriptEvent();
            _fsp--;

             after(grammarAccess.getScriptEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScriptEvent910); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleScriptEvent


    // $ANTLR start ruleScriptEvent
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:464:1: ruleScriptEvent : ( ( rule__ScriptEvent__ScriptAssignment ) ) ;
    public final void ruleScriptEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:468:2: ( ( ( rule__ScriptEvent__ScriptAssignment ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:469:1: ( ( rule__ScriptEvent__ScriptAssignment ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:469:1: ( ( rule__ScriptEvent__ScriptAssignment ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:470:1: ( rule__ScriptEvent__ScriptAssignment )
            {
             before(grammarAccess.getScriptEventAccess().getScriptAssignment()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:471:1: ( rule__ScriptEvent__ScriptAssignment )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:471:2: rule__ScriptEvent__ScriptAssignment
            {
            pushFollow(FOLLOW_rule__ScriptEvent__ScriptAssignment_in_ruleScriptEvent936);
            rule__ScriptEvent__ScriptAssignment();
            _fsp--;


            }

             after(grammarAccess.getScriptEventAccess().getScriptAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleScriptEvent


    // $ANTLR start entryRuleTimerEvent
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:483:1: entryRuleTimerEvent : ruleTimerEvent EOF ;
    public final void entryRuleTimerEvent() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:484:1: ( ruleTimerEvent EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:485:1: ruleTimerEvent EOF
            {
             before(grammarAccess.getTimerEventRule()); 
            pushFollow(FOLLOW_ruleTimerEvent_in_entryRuleTimerEvent963);
            ruleTimerEvent();
            _fsp--;

             after(grammarAccess.getTimerEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimerEvent970); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTimerEvent


    // $ANTLR start ruleTimerEvent
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:492:1: ruleTimerEvent : ( ( rule__TimerEvent__Group__0 ) ) ;
    public final void ruleTimerEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:496:2: ( ( ( rule__TimerEvent__Group__0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:497:1: ( ( rule__TimerEvent__Group__0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:497:1: ( ( rule__TimerEvent__Group__0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:498:1: ( rule__TimerEvent__Group__0 )
            {
             before(grammarAccess.getTimerEventAccess().getGroup()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:499:1: ( rule__TimerEvent__Group__0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:499:2: rule__TimerEvent__Group__0
            {
            pushFollow(FOLLOW_rule__TimerEvent__Group__0_in_ruleTimerEvent996);
            rule__TimerEvent__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTimerEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTimerEvent


    // $ANTLR start entryRuleCondition
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:511:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:512:1: ( ruleCondition EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:513:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition1023);
            ruleCondition();
            _fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition1030); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCondition


    // $ANTLR start ruleCondition
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:520:1: ruleCondition : ( ( rule__Condition__ScriptAssignment ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:524:2: ( ( ( rule__Condition__ScriptAssignment ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:525:1: ( ( rule__Condition__ScriptAssignment ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:525:1: ( ( rule__Condition__ScriptAssignment ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:526:1: ( rule__Condition__ScriptAssignment )
            {
             before(grammarAccess.getConditionAccess().getScriptAssignment()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:527:1: ( rule__Condition__ScriptAssignment )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:527:2: rule__Condition__ScriptAssignment
            {
            pushFollow(FOLLOW_rule__Condition__ScriptAssignment_in_ruleCondition1056);
            rule__Condition__ScriptAssignment();
            _fsp--;


            }

             after(grammarAccess.getConditionAccess().getScriptAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCondition


    // $ANTLR start entryRuleAction
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:539:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:540:1: ( ruleAction EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:541:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction1083);
            ruleAction();
            _fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction1090); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAction


    // $ANTLR start ruleAction
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:548:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:552:2: ( ( ( rule__Action__Alternatives ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:553:1: ( ( rule__Action__Alternatives ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:553:1: ( ( rule__Action__Alternatives ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:554:1: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:555:1: ( rule__Action__Alternatives )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:555:2: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_rule__Action__Alternatives_in_ruleAction1116);
            rule__Action__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAction


    // $ANTLR start entryRuleSymbolicAction
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:567:1: entryRuleSymbolicAction : ruleSymbolicAction EOF ;
    public final void entryRuleSymbolicAction() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:568:1: ( ruleSymbolicAction EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:569:1: ruleSymbolicAction EOF
            {
             before(grammarAccess.getSymbolicActionRule()); 
            pushFollow(FOLLOW_ruleSymbolicAction_in_entryRuleSymbolicAction1143);
            ruleSymbolicAction();
            _fsp--;

             after(grammarAccess.getSymbolicActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbolicAction1150); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSymbolicAction


    // $ANTLR start ruleSymbolicAction
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:576:1: ruleSymbolicAction : ( ( rule__SymbolicAction__Group__0 ) ) ;
    public final void ruleSymbolicAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:580:2: ( ( ( rule__SymbolicAction__Group__0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:581:1: ( ( rule__SymbolicAction__Group__0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:581:1: ( ( rule__SymbolicAction__Group__0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:582:1: ( rule__SymbolicAction__Group__0 )
            {
             before(grammarAccess.getSymbolicActionAccess().getGroup()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:583:1: ( rule__SymbolicAction__Group__0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:583:2: rule__SymbolicAction__Group__0
            {
            pushFollow(FOLLOW_rule__SymbolicAction__Group__0_in_ruleSymbolicAction1176);
            rule__SymbolicAction__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSymbolicActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSymbolicAction


    // $ANTLR start entryRuleScriptAction
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:595:1: entryRuleScriptAction : ruleScriptAction EOF ;
    public final void entryRuleScriptAction() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:596:1: ( ruleScriptAction EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:597:1: ruleScriptAction EOF
            {
             before(grammarAccess.getScriptActionRule()); 
            pushFollow(FOLLOW_ruleScriptAction_in_entryRuleScriptAction1203);
            ruleScriptAction();
            _fsp--;

             after(grammarAccess.getScriptActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScriptAction1210); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleScriptAction


    // $ANTLR start ruleScriptAction
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:604:1: ruleScriptAction : ( ( rule__ScriptAction__ScriptAssignment ) ) ;
    public final void ruleScriptAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:608:2: ( ( ( rule__ScriptAction__ScriptAssignment ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:609:1: ( ( rule__ScriptAction__ScriptAssignment ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:609:1: ( ( rule__ScriptAction__ScriptAssignment ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:610:1: ( rule__ScriptAction__ScriptAssignment )
            {
             before(grammarAccess.getScriptActionAccess().getScriptAssignment()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:611:1: ( rule__ScriptAction__ScriptAssignment )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:611:2: rule__ScriptAction__ScriptAssignment
            {
            pushFollow(FOLLOW_rule__ScriptAction__ScriptAssignment_in_ruleScriptAction1236);
            rule__ScriptAction__ScriptAssignment();
            _fsp--;


            }

             after(grammarAccess.getScriptActionAccess().getScriptAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleScriptAction


    // $ANTLR start entryRuleVarDef
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:623:1: entryRuleVarDef : ruleVarDef EOF ;
    public final void entryRuleVarDef() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:624:1: ( ruleVarDef EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:625:1: ruleVarDef EOF
            {
             before(grammarAccess.getVarDefRule()); 
            pushFollow(FOLLOW_ruleVarDef_in_entryRuleVarDef1263);
            ruleVarDef();
            _fsp--;

             after(grammarAccess.getVarDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDef1270); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleVarDef


    // $ANTLR start ruleVarDef
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:632:1: ruleVarDef : ( ( rule__VarDef__Group__0 ) ) ;
    public final void ruleVarDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:636:2: ( ( ( rule__VarDef__Group__0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:637:1: ( ( rule__VarDef__Group__0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:637:1: ( ( rule__VarDef__Group__0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:638:1: ( rule__VarDef__Group__0 )
            {
             before(grammarAccess.getVarDefAccess().getGroup()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:639:1: ( rule__VarDef__Group__0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:639:2: rule__VarDef__Group__0
            {
            pushFollow(FOLLOW_rule__VarDef__Group__0_in_ruleVarDef1296);
            rule__VarDef__Group__0();
            _fsp--;


            }

             after(grammarAccess.getVarDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleVarDef


    // $ANTLR start entryRuleAssignmentAction
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:651:1: entryRuleAssignmentAction : ruleAssignmentAction EOF ;
    public final void entryRuleAssignmentAction() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:652:1: ( ruleAssignmentAction EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:653:1: ruleAssignmentAction EOF
            {
             before(grammarAccess.getAssignmentActionRule()); 
            pushFollow(FOLLOW_ruleAssignmentAction_in_entryRuleAssignmentAction1323);
            ruleAssignmentAction();
            _fsp--;

             after(grammarAccess.getAssignmentActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentAction1330); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAssignmentAction


    // $ANTLR start ruleAssignmentAction
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:660:1: ruleAssignmentAction : ( ( rule__AssignmentAction__Group__0 ) ) ;
    public final void ruleAssignmentAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:664:2: ( ( ( rule__AssignmentAction__Group__0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:665:1: ( ( rule__AssignmentAction__Group__0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:665:1: ( ( rule__AssignmentAction__Group__0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:666:1: ( rule__AssignmentAction__Group__0 )
            {
             before(grammarAccess.getAssignmentActionAccess().getGroup()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:667:1: ( rule__AssignmentAction__Group__0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:667:2: rule__AssignmentAction__Group__0
            {
            pushFollow(FOLLOW_rule__AssignmentAction__Group__0_in_ruleAssignmentAction1356);
            rule__AssignmentAction__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAssignmentActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAssignmentAction


    // $ANTLR start entryRuleBOOLEAN_LITERAL
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:679:1: entryRuleBOOLEAN_LITERAL : ruleBOOLEAN_LITERAL EOF ;
    public final void entryRuleBOOLEAN_LITERAL() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:680:1: ( ruleBOOLEAN_LITERAL EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:681:1: ruleBOOLEAN_LITERAL EOF
            {
             before(grammarAccess.getBOOLEAN_LITERALRule()); 
            pushFollow(FOLLOW_ruleBOOLEAN_LITERAL_in_entryRuleBOOLEAN_LITERAL1383);
            ruleBOOLEAN_LITERAL();
            _fsp--;

             after(grammarAccess.getBOOLEAN_LITERALRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOLEAN_LITERAL1390); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBOOLEAN_LITERAL


    // $ANTLR start ruleBOOLEAN_LITERAL
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:688:1: ruleBOOLEAN_LITERAL : ( ( rule__BOOLEAN_LITERAL__Alternatives ) ) ;
    public final void ruleBOOLEAN_LITERAL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:692:2: ( ( ( rule__BOOLEAN_LITERAL__Alternatives ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:693:1: ( ( rule__BOOLEAN_LITERAL__Alternatives ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:693:1: ( ( rule__BOOLEAN_LITERAL__Alternatives ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:694:1: ( rule__BOOLEAN_LITERAL__Alternatives )
            {
             before(grammarAccess.getBOOLEAN_LITERALAccess().getAlternatives()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:695:1: ( rule__BOOLEAN_LITERAL__Alternatives )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:695:2: rule__BOOLEAN_LITERAL__Alternatives
            {
            pushFollow(FOLLOW_rule__BOOLEAN_LITERAL__Alternatives_in_ruleBOOLEAN_LITERAL1416);
            rule__BOOLEAN_LITERAL__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getBOOLEAN_LITERALAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBOOLEAN_LITERAL


    // $ANTLR start entryRuleFLOAT_LITERAL
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:707:1: entryRuleFLOAT_LITERAL : ruleFLOAT_LITERAL EOF ;
    public final void entryRuleFLOAT_LITERAL() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:708:1: ( ruleFLOAT_LITERAL EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:709:1: ruleFLOAT_LITERAL EOF
            {
             before(grammarAccess.getFLOAT_LITERALRule()); 
            pushFollow(FOLLOW_ruleFLOAT_LITERAL_in_entryRuleFLOAT_LITERAL1443);
            ruleFLOAT_LITERAL();
            _fsp--;

             after(grammarAccess.getFLOAT_LITERALRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFLOAT_LITERAL1450); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleFLOAT_LITERAL


    // $ANTLR start ruleFLOAT_LITERAL
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:716:1: ruleFLOAT_LITERAL : ( ( rule__FLOAT_LITERAL__Group__0 ) ) ;
    public final void ruleFLOAT_LITERAL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:720:2: ( ( ( rule__FLOAT_LITERAL__Group__0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:721:1: ( ( rule__FLOAT_LITERAL__Group__0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:721:1: ( ( rule__FLOAT_LITERAL__Group__0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:722:1: ( rule__FLOAT_LITERAL__Group__0 )
            {
             before(grammarAccess.getFLOAT_LITERALAccess().getGroup()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:723:1: ( rule__FLOAT_LITERAL__Group__0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:723:2: rule__FLOAT_LITERAL__Group__0
            {
            pushFollow(FOLLOW_rule__FLOAT_LITERAL__Group__0_in_ruleFLOAT_LITERAL1476);
            rule__FLOAT_LITERAL__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFLOAT_LITERALAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFLOAT_LITERAL


    // $ANTLR start entryRulePOS_INT
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:735:1: entryRulePOS_INT : rulePOS_INT EOF ;
    public final void entryRulePOS_INT() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:736:1: ( rulePOS_INT EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:737:1: rulePOS_INT EOF
            {
             before(grammarAccess.getPOS_INTRule()); 
            pushFollow(FOLLOW_rulePOS_INT_in_entryRulePOS_INT1503);
            rulePOS_INT();
            _fsp--;

             after(grammarAccess.getPOS_INTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePOS_INT1510); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePOS_INT


    // $ANTLR start rulePOS_INT
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:744:1: rulePOS_INT : ( ( rule__POS_INT__Group__0 ) ) ;
    public final void rulePOS_INT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:748:2: ( ( ( rule__POS_INT__Group__0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:749:1: ( ( rule__POS_INT__Group__0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:749:1: ( ( rule__POS_INT__Group__0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:750:1: ( rule__POS_INT__Group__0 )
            {
             before(grammarAccess.getPOS_INTAccess().getGroup()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:751:1: ( rule__POS_INT__Group__0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:751:2: rule__POS_INT__Group__0
            {
            pushFollow(FOLLOW_rule__POS_INT__Group__0_in_rulePOS_INT1536);
            rule__POS_INT__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPOS_INTAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePOS_INT


    // $ANTLR start entryRuleNEG_INT
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:763:1: entryRuleNEG_INT : ruleNEG_INT EOF ;
    public final void entryRuleNEG_INT() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:764:1: ( ruleNEG_INT EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:765:1: ruleNEG_INT EOF
            {
             before(grammarAccess.getNEG_INTRule()); 
            pushFollow(FOLLOW_ruleNEG_INT_in_entryRuleNEG_INT1563);
            ruleNEG_INT();
            _fsp--;

             after(grammarAccess.getNEG_INTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNEG_INT1570); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleNEG_INT


    // $ANTLR start ruleNEG_INT
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:772:1: ruleNEG_INT : ( ( rule__NEG_INT__Group__0 ) ) ;
    public final void ruleNEG_INT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:776:2: ( ( ( rule__NEG_INT__Group__0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:777:1: ( ( rule__NEG_INT__Group__0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:777:1: ( ( rule__NEG_INT__Group__0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:778:1: ( rule__NEG_INT__Group__0 )
            {
             before(grammarAccess.getNEG_INTAccess().getGroup()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:779:1: ( rule__NEG_INT__Group__0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:779:2: rule__NEG_INT__Group__0
            {
            pushFollow(FOLLOW_rule__NEG_INT__Group__0_in_ruleNEG_INT1596);
            rule__NEG_INT__Group__0();
            _fsp--;


            }

             after(grammarAccess.getNEG_INTAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleNEG_INT


    // $ANTLR start entryRuleQNAME
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:791:1: entryRuleQNAME : ruleQNAME EOF ;
    public final void entryRuleQNAME() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:792:1: ( ruleQNAME EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:793:1: ruleQNAME EOF
            {
             before(grammarAccess.getQNAMERule()); 
            pushFollow(FOLLOW_ruleQNAME_in_entryRuleQNAME1623);
            ruleQNAME();
            _fsp--;

             after(grammarAccess.getQNAMERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQNAME1630); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleQNAME


    // $ANTLR start ruleQNAME
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:800:1: ruleQNAME : ( ( rule__QNAME__Group__0 ) ) ;
    public final void ruleQNAME() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:804:2: ( ( ( rule__QNAME__Group__0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:805:1: ( ( rule__QNAME__Group__0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:805:1: ( ( rule__QNAME__Group__0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:806:1: ( rule__QNAME__Group__0 )
            {
             before(grammarAccess.getQNAMEAccess().getGroup()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:807:1: ( rule__QNAME__Group__0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:807:2: rule__QNAME__Group__0
            {
            pushFollow(FOLLOW_rule__QNAME__Group__0_in_ruleQNAME1656);
            rule__QNAME__Group__0();
            _fsp--;


            }

             after(grammarAccess.getQNAMEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleQNAME


    // $ANTLR start entryRuleExpression
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:819:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:820:1: ( ruleExpression EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:821:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1683);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1690); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:828:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:832:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:833:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:833:1: ( ( rule__Expression__Alternatives ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:834:1: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:835:1: ( rule__Expression__Alternatives )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:835:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression1716);
            rule__Expression__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleLiteral
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:847:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:848:1: ( ruleLiteral EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:849:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1743);
            ruleLiteral();
            _fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1750); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleLiteral


    // $ANTLR start ruleLiteral
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:856:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:860:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:861:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:861:1: ( ( rule__Literal__Alternatives ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:862:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:863:1: ( rule__Literal__Alternatives )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:863:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1776);
            rule__Literal__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLiteral


    // $ANTLR start entryRuleBooleanLiteral
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:875:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:876:1: ( ruleBooleanLiteral EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:877:1: ruleBooleanLiteral EOF
            {
             before(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1803);
            ruleBooleanLiteral();
            _fsp--;

             after(grammarAccess.getBooleanLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral1810); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBooleanLiteral


    // $ANTLR start ruleBooleanLiteral
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:884:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__BooleanValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:888:2: ( ( ( rule__BooleanLiteral__BooleanValueAssignment ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:889:1: ( ( rule__BooleanLiteral__BooleanValueAssignment ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:889:1: ( ( rule__BooleanLiteral__BooleanValueAssignment ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:890:1: ( rule__BooleanLiteral__BooleanValueAssignment )
            {
             before(grammarAccess.getBooleanLiteralAccess().getBooleanValueAssignment()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:891:1: ( rule__BooleanLiteral__BooleanValueAssignment )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:891:2: rule__BooleanLiteral__BooleanValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__BooleanValueAssignment_in_ruleBooleanLiteral1836);
            rule__BooleanLiteral__BooleanValueAssignment();
            _fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getBooleanValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBooleanLiteral


    // $ANTLR start entryRuleIntLiteral
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:903:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:904:1: ( ruleIntLiteral EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:905:1: ruleIntLiteral EOF
            {
             before(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral1863);
            ruleIntLiteral();
            _fsp--;

             after(grammarAccess.getIntLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral1870); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleIntLiteral


    // $ANTLR start ruleIntLiteral
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:912:1: ruleIntLiteral : ( ( rule__IntLiteral__IntValueAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:916:2: ( ( ( rule__IntLiteral__IntValueAssignment ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:917:1: ( ( rule__IntLiteral__IntValueAssignment ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:917:1: ( ( rule__IntLiteral__IntValueAssignment ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:918:1: ( rule__IntLiteral__IntValueAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getIntValueAssignment()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:919:1: ( rule__IntLiteral__IntValueAssignment )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:919:2: rule__IntLiteral__IntValueAssignment
            {
            pushFollow(FOLLOW_rule__IntLiteral__IntValueAssignment_in_ruleIntLiteral1896);
            rule__IntLiteral__IntValueAssignment();
            _fsp--;


            }

             after(grammarAccess.getIntLiteralAccess().getIntValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleIntLiteral


    // $ANTLR start entryRuleFloatLiteral
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:931:1: entryRuleFloatLiteral : ruleFloatLiteral EOF ;
    public final void entryRuleFloatLiteral() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:932:1: ( ruleFloatLiteral EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:933:1: ruleFloatLiteral EOF
            {
             before(grammarAccess.getFloatLiteralRule()); 
            pushFollow(FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral1923);
            ruleFloatLiteral();
            _fsp--;

             after(grammarAccess.getFloatLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatLiteral1930); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleFloatLiteral


    // $ANTLR start ruleFloatLiteral
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:940:1: ruleFloatLiteral : ( ( rule__FloatLiteral__FloatValueAssignment ) ) ;
    public final void ruleFloatLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:944:2: ( ( ( rule__FloatLiteral__FloatValueAssignment ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:945:1: ( ( rule__FloatLiteral__FloatValueAssignment ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:945:1: ( ( rule__FloatLiteral__FloatValueAssignment ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:946:1: ( rule__FloatLiteral__FloatValueAssignment )
            {
             before(grammarAccess.getFloatLiteralAccess().getFloatValueAssignment()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:947:1: ( rule__FloatLiteral__FloatValueAssignment )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:947:2: rule__FloatLiteral__FloatValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatLiteral__FloatValueAssignment_in_ruleFloatLiteral1956);
            rule__FloatLiteral__FloatValueAssignment();
            _fsp--;


            }

             after(grammarAccess.getFloatLiteralAccess().getFloatValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFloatLiteral


    // $ANTLR start entryRuleStringLiteral
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:959:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:960:1: ( ruleStringLiteral EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:961:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1983);
            ruleStringLiteral();
            _fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1990); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleStringLiteral


    // $ANTLR start ruleStringLiteral
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:968:1: ruleStringLiteral : ( ( rule__StringLiteral__StringValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:972:2: ( ( ( rule__StringLiteral__StringValueAssignment ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:973:1: ( ( rule__StringLiteral__StringValueAssignment ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:973:1: ( ( rule__StringLiteral__StringValueAssignment ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:974:1: ( rule__StringLiteral__StringValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getStringValueAssignment()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:975:1: ( rule__StringLiteral__StringValueAssignment )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:975:2: rule__StringLiteral__StringValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__StringValueAssignment_in_ruleStringLiteral2016);
            rule__StringLiteral__StringValueAssignment();
            _fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getStringValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStringLiteral


    // $ANTLR start entryRuleUriLiteral
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:987:1: entryRuleUriLiteral : ruleUriLiteral EOF ;
    public final void entryRuleUriLiteral() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:988:1: ( ruleUriLiteral EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:989:1: ruleUriLiteral EOF
            {
             before(grammarAccess.getUriLiteralRule()); 
            pushFollow(FOLLOW_ruleUriLiteral_in_entryRuleUriLiteral2043);
            ruleUriLiteral();
            _fsp--;

             after(grammarAccess.getUriLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUriLiteral2050); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleUriLiteral


    // $ANTLR start ruleUriLiteral
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:996:1: ruleUriLiteral : ( ( rule__UriLiteral__UriAssignment ) ) ;
    public final void ruleUriLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1000:2: ( ( ( rule__UriLiteral__UriAssignment ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1001:1: ( ( rule__UriLiteral__UriAssignment ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1001:1: ( ( rule__UriLiteral__UriAssignment ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1002:1: ( rule__UriLiteral__UriAssignment )
            {
             before(grammarAccess.getUriLiteralAccess().getUriAssignment()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1003:1: ( rule__UriLiteral__UriAssignment )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1003:2: rule__UriLiteral__UriAssignment
            {
            pushFollow(FOLLOW_rule__UriLiteral__UriAssignment_in_ruleUriLiteral2076);
            rule__UriLiteral__UriAssignment();
            _fsp--;


            }

             after(grammarAccess.getUriLiteralAccess().getUriAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUriLiteral


    // $ANTLR start entryRuleEObjectUriLiteral
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1015:1: entryRuleEObjectUriLiteral : ruleEObjectUriLiteral EOF ;
    public final void entryRuleEObjectUriLiteral() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1016:1: ( ruleEObjectUriLiteral EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1017:1: ruleEObjectUriLiteral EOF
            {
             before(grammarAccess.getEObjectUriLiteralRule()); 
            pushFollow(FOLLOW_ruleEObjectUriLiteral_in_entryRuleEObjectUriLiteral2103);
            ruleEObjectUriLiteral();
            _fsp--;

             after(grammarAccess.getEObjectUriLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEObjectUriLiteral2110); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEObjectUriLiteral


    // $ANTLR start ruleEObjectUriLiteral
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1024:1: ruleEObjectUriLiteral : ( ( rule__EObjectUriLiteral__UriAssignment ) ) ;
    public final void ruleEObjectUriLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1028:2: ( ( ( rule__EObjectUriLiteral__UriAssignment ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1029:1: ( ( rule__EObjectUriLiteral__UriAssignment ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1029:1: ( ( rule__EObjectUriLiteral__UriAssignment ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1030:1: ( rule__EObjectUriLiteral__UriAssignment )
            {
             before(grammarAccess.getEObjectUriLiteralAccess().getUriAssignment()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1031:1: ( rule__EObjectUriLiteral__UriAssignment )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1031:2: rule__EObjectUriLiteral__UriAssignment
            {
            pushFollow(FOLLOW_rule__EObjectUriLiteral__UriAssignment_in_ruleEObjectUriLiteral2136);
            rule__EObjectUriLiteral__UriAssignment();
            _fsp--;


            }

             after(grammarAccess.getEObjectUriLiteralAccess().getUriAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEObjectUriLiteral


    // $ANTLR start entryRuleDelayLiteral
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1043:1: entryRuleDelayLiteral : ruleDelayLiteral EOF ;
    public final void entryRuleDelayLiteral() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1044:1: ( ruleDelayLiteral EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1045:1: ruleDelayLiteral EOF
            {
             before(grammarAccess.getDelayLiteralRule()); 
            pushFollow(FOLLOW_ruleDelayLiteral_in_entryRuleDelayLiteral2163);
            ruleDelayLiteral();
            _fsp--;

             after(grammarAccess.getDelayLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelayLiteral2170); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDelayLiteral


    // $ANTLR start ruleDelayLiteral
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1052:1: ruleDelayLiteral : ( ( rule__DelayLiteral__Group__0 ) ) ;
    public final void ruleDelayLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1056:2: ( ( ( rule__DelayLiteral__Group__0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1057:1: ( ( rule__DelayLiteral__Group__0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1057:1: ( ( rule__DelayLiteral__Group__0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1058:1: ( rule__DelayLiteral__Group__0 )
            {
             before(grammarAccess.getDelayLiteralAccess().getGroup()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1059:1: ( rule__DelayLiteral__Group__0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1059:2: rule__DelayLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__DelayLiteral__Group__0_in_ruleDelayLiteral2196);
            rule__DelayLiteral__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDelayLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDelayLiteral


    // $ANTLR start entryRuleVarRef
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1071:1: entryRuleVarRef : ruleVarRef EOF ;
    public final void entryRuleVarRef() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1072:1: ( ruleVarRef EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1073:1: ruleVarRef EOF
            {
             before(grammarAccess.getVarRefRule()); 
            pushFollow(FOLLOW_ruleVarRef_in_entryRuleVarRef2223);
            ruleVarRef();
            _fsp--;

             after(grammarAccess.getVarRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarRef2230); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleVarRef


    // $ANTLR start ruleVarRef
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1080:1: ruleVarRef : ( ( rule__VarRef__VarAssignment ) ) ;
    public final void ruleVarRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1084:2: ( ( ( rule__VarRef__VarAssignment ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1085:1: ( ( rule__VarRef__VarAssignment ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1085:1: ( ( rule__VarRef__VarAssignment ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1086:1: ( rule__VarRef__VarAssignment )
            {
             before(grammarAccess.getVarRefAccess().getVarAssignment()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1087:1: ( rule__VarRef__VarAssignment )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1087:2: rule__VarRef__VarAssignment
            {
            pushFollow(FOLLOW_rule__VarRef__VarAssignment_in_ruleVarRef2256);
            rule__VarRef__VarAssignment();
            _fsp--;


            }

             after(grammarAccess.getVarRefAccess().getVarAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleVarRef


    // $ANTLR start entryRuleEPath
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1099:1: entryRuleEPath : ruleEPath EOF ;
    public final void entryRuleEPath() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1100:1: ( ruleEPath EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1101:1: ruleEPath EOF
            {
             before(grammarAccess.getEPathRule()); 
            pushFollow(FOLLOW_ruleEPath_in_entryRuleEPath2283);
            ruleEPath();
            _fsp--;

             after(grammarAccess.getEPathRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEPath2290); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEPath


    // $ANTLR start ruleEPath
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1108:1: ruleEPath : ( ( rule__EPath__Group__0 ) ) ;
    public final void ruleEPath() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1112:2: ( ( ( rule__EPath__Group__0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1113:1: ( ( rule__EPath__Group__0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1113:1: ( ( rule__EPath__Group__0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1114:1: ( rule__EPath__Group__0 )
            {
             before(grammarAccess.getEPathAccess().getGroup()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1115:1: ( rule__EPath__Group__0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1115:2: rule__EPath__Group__0
            {
            pushFollow(FOLLOW_rule__EPath__Group__0_in_ruleEPath2316);
            rule__EPath__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEPathAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEPath


    // $ANTLR start entryRuleEStep
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1127:1: entryRuleEStep : ruleEStep EOF ;
    public final void entryRuleEStep() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1128:1: ( ruleEStep EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1129:1: ruleEStep EOF
            {
             before(grammarAccess.getEStepRule()); 
            pushFollow(FOLLOW_ruleEStep_in_entryRuleEStep2343);
            ruleEStep();
            _fsp--;

             after(grammarAccess.getEStepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStep2350); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEStep


    // $ANTLR start ruleEStep
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1136:1: ruleEStep : ( ( rule__EStep__Group__0 ) ) ;
    public final void ruleEStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1140:2: ( ( ( rule__EStep__Group__0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1141:1: ( ( rule__EStep__Group__0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1141:1: ( ( rule__EStep__Group__0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1142:1: ( rule__EStep__Group__0 )
            {
             before(grammarAccess.getEStepAccess().getGroup()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1143:1: ( rule__EStep__Group__0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1143:2: rule__EStep__Group__0
            {
            pushFollow(FOLLOW_rule__EStep__Group__0_in_ruleEStep2376);
            rule__EStep__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEStep


    // $ANTLR start entryRuleEStepFilter
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1155:1: entryRuleEStepFilter : ruleEStepFilter EOF ;
    public final void entryRuleEStepFilter() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1156:1: ( ruleEStepFilter EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1157:1: ruleEStepFilter EOF
            {
             before(grammarAccess.getEStepFilterRule()); 
            pushFollow(FOLLOW_ruleEStepFilter_in_entryRuleEStepFilter2403);
            ruleEStepFilter();
            _fsp--;

             after(grammarAccess.getEStepFilterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEStepFilter2410); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEStepFilter


    // $ANTLR start ruleEStepFilter
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1164:1: ruleEStepFilter : ( ( rule__EStepFilter__ScriptAssignment ) ) ;
    public final void ruleEStepFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1168:2: ( ( ( rule__EStepFilter__ScriptAssignment ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1169:1: ( ( rule__EStepFilter__ScriptAssignment ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1169:1: ( ( rule__EStepFilter__ScriptAssignment ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1170:1: ( rule__EStepFilter__ScriptAssignment )
            {
             before(grammarAccess.getEStepFilterAccess().getScriptAssignment()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1171:1: ( rule__EStepFilter__ScriptAssignment )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1171:2: rule__EStepFilter__ScriptAssignment
            {
            pushFollow(FOLLOW_rule__EStepFilter__ScriptAssignment_in_ruleEStepFilter2436);
            rule__EStepFilter__ScriptAssignment();
            _fsp--;


            }

             after(grammarAccess.getEStepFilterAccess().getScriptAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEStepFilter


    // $ANTLR start entryRuleScriptExpression
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1183:1: entryRuleScriptExpression : ruleScriptExpression EOF ;
    public final void entryRuleScriptExpression() throws RecognitionException {
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1184:1: ( ruleScriptExpression EOF )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1185:1: ruleScriptExpression EOF
            {
             before(grammarAccess.getScriptExpressionRule()); 
            pushFollow(FOLLOW_ruleScriptExpression_in_entryRuleScriptExpression2463);
            ruleScriptExpression();
            _fsp--;

             after(grammarAccess.getScriptExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScriptExpression2470); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleScriptExpression


    // $ANTLR start ruleScriptExpression
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1192:1: ruleScriptExpression : ( ( rule__ScriptExpression__ScriptAssignment ) ) ;
    public final void ruleScriptExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1196:2: ( ( ( rule__ScriptExpression__ScriptAssignment ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1197:1: ( ( rule__ScriptExpression__ScriptAssignment ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1197:1: ( ( rule__ScriptExpression__ScriptAssignment ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1198:1: ( rule__ScriptExpression__ScriptAssignment )
            {
             before(grammarAccess.getScriptExpressionAccess().getScriptAssignment()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1199:1: ( rule__ScriptExpression__ScriptAssignment )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1199:2: rule__ScriptExpression__ScriptAssignment
            {
            pushFollow(FOLLOW_rule__ScriptExpression__ScriptAssignment_in_ruleScriptExpression2496);
            rule__ScriptExpression__ScriptAssignment();
            _fsp--;


            }

             after(grammarAccess.getScriptExpressionAccess().getScriptAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleScriptExpression


    // $ANTLR start ruleTimeUnit
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1212:1: ruleTimeUnit : ( ( rule__TimeUnit__Alternatives ) ) ;
    public final void ruleTimeUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1216:1: ( ( ( rule__TimeUnit__Alternatives ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1217:1: ( ( rule__TimeUnit__Alternatives ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1217:1: ( ( rule__TimeUnit__Alternatives ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1218:1: ( rule__TimeUnit__Alternatives )
            {
             before(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1219:1: ( rule__TimeUnit__Alternatives )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1219:2: rule__TimeUnit__Alternatives
            {
            pushFollow(FOLLOW_rule__TimeUnit__Alternatives_in_ruleTimeUnit2533);
            rule__TimeUnit__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTimeUnitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTimeUnit


    // $ANTLR start rule__StateMachine__Alternatives_1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1230:1: rule__StateMachine__Alternatives_1 : ( ( ( rule__StateMachine__StatesAssignment_1_0 ) ) | ( ( rule__StateMachine__TransitionsAssignment_1_1 ) ) | ( ( rule__StateMachine__VariablesAssignment_1_2 ) ) );
    public final void rule__StateMachine__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1234:1: ( ( ( rule__StateMachine__StatesAssignment_1_0 ) ) | ( ( rule__StateMachine__TransitionsAssignment_1_1 ) ) | ( ( rule__StateMachine__VariablesAssignment_1_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_ID) ) {
                    int LA1_5 = input.LA(3);

                    if ( (LA1_5==30||(LA1_5>=32 && LA1_5<=33)||LA1_5==43) ) {
                        alt1=2;
                    }
                    else if ( (LA1_5==15||LA1_5==27) ) {
                        alt1=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1230:1: rule__StateMachine__Alternatives_1 : ( ( ( rule__StateMachine__StatesAssignment_1_0 ) ) | ( ( rule__StateMachine__TransitionsAssignment_1_1 ) ) | ( ( rule__StateMachine__VariablesAssignment_1_2 ) ) );", 1, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA1_1==30) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1230:1: rule__StateMachine__Alternatives_1 : ( ( ( rule__StateMachine__StatesAssignment_1_0 ) ) | ( ( rule__StateMachine__TransitionsAssignment_1_1 ) ) | ( ( rule__StateMachine__VariablesAssignment_1_2 ) ) );", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==15||LA1_2==27) ) {
                    alt1=1;
                }
                else if ( (LA1_2==31||LA1_2==43) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1230:1: rule__StateMachine__Alternatives_1 : ( ( ( rule__StateMachine__StatesAssignment_1_0 ) ) | ( ( rule__StateMachine__TransitionsAssignment_1_1 ) ) | ( ( rule__StateMachine__VariablesAssignment_1_2 ) ) );", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 30:
            case 32:
            case 33:
                {
                alt1=2;
                }
                break;
            case 40:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1230:1: rule__StateMachine__Alternatives_1 : ( ( ( rule__StateMachine__StatesAssignment_1_0 ) ) | ( ( rule__StateMachine__TransitionsAssignment_1_1 ) ) | ( ( rule__StateMachine__VariablesAssignment_1_2 ) ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1235:1: ( ( rule__StateMachine__StatesAssignment_1_0 ) )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1235:1: ( ( rule__StateMachine__StatesAssignment_1_0 ) )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1236:1: ( rule__StateMachine__StatesAssignment_1_0 )
                    {
                     before(grammarAccess.getStateMachineAccess().getStatesAssignment_1_0()); 
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1237:1: ( rule__StateMachine__StatesAssignment_1_0 )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1237:2: rule__StateMachine__StatesAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__StateMachine__StatesAssignment_1_0_in_rule__StateMachine__Alternatives_12568);
                    rule__StateMachine__StatesAssignment_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getStateMachineAccess().getStatesAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1241:6: ( ( rule__StateMachine__TransitionsAssignment_1_1 ) )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1241:6: ( ( rule__StateMachine__TransitionsAssignment_1_1 ) )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1242:1: ( rule__StateMachine__TransitionsAssignment_1_1 )
                    {
                     before(grammarAccess.getStateMachineAccess().getTransitionsAssignment_1_1()); 
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1243:1: ( rule__StateMachine__TransitionsAssignment_1_1 )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1243:2: rule__StateMachine__TransitionsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__StateMachine__TransitionsAssignment_1_1_in_rule__StateMachine__Alternatives_12586);
                    rule__StateMachine__TransitionsAssignment_1_1();
                    _fsp--;


                    }

                     after(grammarAccess.getStateMachineAccess().getTransitionsAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1247:6: ( ( rule__StateMachine__VariablesAssignment_1_2 ) )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1247:6: ( ( rule__StateMachine__VariablesAssignment_1_2 ) )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1248:1: ( rule__StateMachine__VariablesAssignment_1_2 )
                    {
                     before(grammarAccess.getStateMachineAccess().getVariablesAssignment_1_2()); 
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1249:1: ( rule__StateMachine__VariablesAssignment_1_2 )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1249:2: rule__StateMachine__VariablesAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__StateMachine__VariablesAssignment_1_2_in_rule__StateMachine__Alternatives_12604);
                    rule__StateMachine__VariablesAssignment_1_2();
                    _fsp--;


                    }

                     after(grammarAccess.getStateMachineAccess().getVariablesAssignment_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateMachine__Alternatives_1


    // $ANTLR start rule__ResourceImport__Alternatives
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1258:1: rule__ResourceImport__Alternatives : ( ( ruleDomainModelImport ) | ( ruleDomainDataImport ) );
    public final void rule__ResourceImport__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1262:1: ( ( ruleDomainModelImport ) | ( ruleDomainDataImport ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case 24:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==26) ) {
                    alt2=2;
                }
                else if ( (LA2_1==25) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1258:1: rule__ResourceImport__Alternatives : ( ( ruleDomainModelImport ) | ( ruleDomainDataImport ) );", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 25:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1258:1: rule__ResourceImport__Alternatives : ( ( ruleDomainModelImport ) | ( ruleDomainDataImport ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1263:1: ( ruleDomainModelImport )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1263:1: ( ruleDomainModelImport )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1264:1: ruleDomainModelImport
                    {
                     before(grammarAccess.getResourceImportAccess().getDomainModelImportParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDomainModelImport_in_rule__ResourceImport__Alternatives2637);
                    ruleDomainModelImport();
                    _fsp--;

                     after(grammarAccess.getResourceImportAccess().getDomainModelImportParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1269:6: ( ruleDomainDataImport )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1269:6: ( ruleDomainDataImport )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1270:1: ruleDomainDataImport
                    {
                     before(grammarAccess.getResourceImportAccess().getDomainDataImportParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDomainDataImport_in_rule__ResourceImport__Alternatives2654);
                    ruleDomainDataImport();
                    _fsp--;

                     after(grammarAccess.getResourceImportAccess().getDomainDataImportParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ResourceImport__Alternatives


    // $ANTLR start rule__State__Alternatives_2
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1280:1: rule__State__Alternatives_2 : ( ( ';' ) | ( ( rule__State__Group_2_1__0 ) ) );
    public final void rule__State__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1284:1: ( ( ';' ) | ( ( rule__State__Group_2_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==27) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1280:1: rule__State__Alternatives_2 : ( ( ';' ) | ( ( rule__State__Group_2_1__0 ) ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1285:1: ( ';' )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1285:1: ( ';' )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1286:1: ';'
                    {
                     before(grammarAccess.getStateAccess().getSemicolonKeyword_2_0()); 
                    match(input,15,FOLLOW_15_in_rule__State__Alternatives_22687); 
                     after(grammarAccess.getStateAccess().getSemicolonKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1293:6: ( ( rule__State__Group_2_1__0 ) )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1293:6: ( ( rule__State__Group_2_1__0 ) )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1294:1: ( rule__State__Group_2_1__0 )
                    {
                     before(grammarAccess.getStateAccess().getGroup_2_1()); 
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1295:1: ( rule__State__Group_2_1__0 )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1295:2: rule__State__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_2_1__0_in_rule__State__Alternatives_22706);
                    rule__State__Group_2_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getStateAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Alternatives_2


    // $ANTLR start rule__State__Alternatives_2_1_1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1304:1: rule__State__Alternatives_2_1_1 : ( ( ( rule__State__StatesAssignment_2_1_1_0 ) ) | ( ( rule__State__TransitionsAssignment_2_1_1_1 ) ) | ( ( rule__State__VariablesAssignment_2_1_1_2 ) ) );
    public final void rule__State__Alternatives_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1308:1: ( ( ( rule__State__StatesAssignment_2_1_1_0 ) ) | ( ( rule__State__TransitionsAssignment_2_1_1_1 ) ) | ( ( rule__State__VariablesAssignment_2_1_1_2 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    int LA4_5 = input.LA(3);

                    if ( (LA4_5==30||(LA4_5>=32 && LA4_5<=33)||LA4_5==43) ) {
                        alt4=2;
                    }
                    else if ( (LA4_5==15||LA4_5==27) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1304:1: rule__State__Alternatives_2_1_1 : ( ( ( rule__State__StatesAssignment_2_1_1_0 ) ) | ( ( rule__State__TransitionsAssignment_2_1_1_1 ) ) | ( ( rule__State__VariablesAssignment_2_1_1_2 ) ) );", 4, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_1==30) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1304:1: rule__State__Alternatives_2_1_1 : ( ( ( rule__State__StatesAssignment_2_1_1_0 ) ) | ( ( rule__State__TransitionsAssignment_2_1_1_1 ) ) | ( ( rule__State__VariablesAssignment_2_1_1_2 ) ) );", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==15||LA4_2==27) ) {
                    alt4=1;
                }
                else if ( (LA4_2==31||LA4_2==43) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1304:1: rule__State__Alternatives_2_1_1 : ( ( ( rule__State__StatesAssignment_2_1_1_0 ) ) | ( ( rule__State__TransitionsAssignment_2_1_1_1 ) ) | ( ( rule__State__VariablesAssignment_2_1_1_2 ) ) );", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 30:
            case 32:
            case 33:
                {
                alt4=2;
                }
                break;
            case 40:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1304:1: rule__State__Alternatives_2_1_1 : ( ( ( rule__State__StatesAssignment_2_1_1_0 ) ) | ( ( rule__State__TransitionsAssignment_2_1_1_1 ) ) | ( ( rule__State__VariablesAssignment_2_1_1_2 ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1309:1: ( ( rule__State__StatesAssignment_2_1_1_0 ) )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1309:1: ( ( rule__State__StatesAssignment_2_1_1_0 ) )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1310:1: ( rule__State__StatesAssignment_2_1_1_0 )
                    {
                     before(grammarAccess.getStateAccess().getStatesAssignment_2_1_1_0()); 
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1311:1: ( rule__State__StatesAssignment_2_1_1_0 )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1311:2: rule__State__StatesAssignment_2_1_1_0
                    {
                    pushFollow(FOLLOW_rule__State__StatesAssignment_2_1_1_0_in_rule__State__Alternatives_2_1_12739);
                    rule__State__StatesAssignment_2_1_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getStateAccess().getStatesAssignment_2_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1315:6: ( ( rule__State__TransitionsAssignment_2_1_1_1 ) )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1315:6: ( ( rule__State__TransitionsAssignment_2_1_1_1 ) )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1316:1: ( rule__State__TransitionsAssignment_2_1_1_1 )
                    {
                     before(grammarAccess.getStateAccess().getTransitionsAssignment_2_1_1_1()); 
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1317:1: ( rule__State__TransitionsAssignment_2_1_1_1 )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1317:2: rule__State__TransitionsAssignment_2_1_1_1
                    {
                    pushFollow(FOLLOW_rule__State__TransitionsAssignment_2_1_1_1_in_rule__State__Alternatives_2_1_12757);
                    rule__State__TransitionsAssignment_2_1_1_1();
                    _fsp--;


                    }

                     after(grammarAccess.getStateAccess().getTransitionsAssignment_2_1_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1321:6: ( ( rule__State__VariablesAssignment_2_1_1_2 ) )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1321:6: ( ( rule__State__VariablesAssignment_2_1_1_2 ) )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1322:1: ( rule__State__VariablesAssignment_2_1_1_2 )
                    {
                     before(grammarAccess.getStateAccess().getVariablesAssignment_2_1_1_2()); 
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1323:1: ( rule__State__VariablesAssignment_2_1_1_2 )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1323:2: rule__State__VariablesAssignment_2_1_1_2
                    {
                    pushFollow(FOLLOW_rule__State__VariablesAssignment_2_1_1_2_in_rule__State__Alternatives_2_1_12775);
                    rule__State__VariablesAssignment_2_1_1_2();
                    _fsp--;


                    }

                     after(grammarAccess.getStateAccess().getVariablesAssignment_2_1_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Alternatives_2_1_1


    // $ANTLR start rule__AbstractTransition__Alternatives
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1333:1: rule__AbstractTransition__Alternatives : ( ( ruleTransition ) | ( ruleInternalTransition ) );
    public final void rule__AbstractTransition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1337:1: ( ( ruleTransition ) | ( ruleInternalTransition ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||LA5_0==29) ) {
                alt5=1;
            }
            else if ( (LA5_0==30||(LA5_0>=32 && LA5_0<=33)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1333:1: rule__AbstractTransition__Alternatives : ( ( ruleTransition ) | ( ruleInternalTransition ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1338:1: ( ruleTransition )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1338:1: ( ruleTransition )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1339:1: ruleTransition
                    {
                     before(grammarAccess.getAbstractTransitionAccess().getTransitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTransition_in_rule__AbstractTransition__Alternatives2809);
                    ruleTransition();
                    _fsp--;

                     after(grammarAccess.getAbstractTransitionAccess().getTransitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1344:6: ( ruleInternalTransition )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1344:6: ( ruleInternalTransition )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1345:1: ruleInternalTransition
                    {
                     before(grammarAccess.getAbstractTransitionAccess().getInternalTransitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleInternalTransition_in_rule__AbstractTransition__Alternatives2826);
                    ruleInternalTransition();
                    _fsp--;

                     after(grammarAccess.getAbstractTransitionAccess().getInternalTransitionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AbstractTransition__Alternatives


    // $ANTLR start rule__Transition__Alternatives_0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1355:1: rule__Transition__Alternatives_0 : ( ( ( rule__Transition__Group_0_0__0 ) ) | ( ( rule__Transition__Group_0_1__0 ) ) );
    public final void rule__Transition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1359:1: ( ( ( rule__Transition__Group_0_0__0 ) ) | ( ( rule__Transition__Group_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1355:1: rule__Transition__Alternatives_0 : ( ( ( rule__Transition__Group_0_0__0 ) ) | ( ( rule__Transition__Group_0_1__0 ) ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1360:1: ( ( rule__Transition__Group_0_0__0 ) )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1360:1: ( ( rule__Transition__Group_0_0__0 ) )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1361:1: ( rule__Transition__Group_0_0__0 )
                    {
                     before(grammarAccess.getTransitionAccess().getGroup_0_0()); 
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1362:1: ( rule__Transition__Group_0_0__0 )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1362:2: rule__Transition__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Transition__Group_0_0__0_in_rule__Transition__Alternatives_02858);
                    rule__Transition__Group_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTransitionAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1366:6: ( ( rule__Transition__Group_0_1__0 ) )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1366:6: ( ( rule__Transition__Group_0_1__0 ) )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1367:1: ( rule__Transition__Group_0_1__0 )
                    {
                     before(grammarAccess.getTransitionAccess().getGroup_0_1()); 
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1368:1: ( rule__Transition__Group_0_1__0 )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1368:2: rule__Transition__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Transition__Group_0_1__0_in_rule__Transition__Alternatives_02876);
                    rule__Transition__Group_0_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTransitionAccess().getGroup_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Alternatives_0


    // $ANTLR start rule__Event__Alternatives
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1377:1: rule__Event__Alternatives : ( ( ruleSymbolicEvent ) | ( ruleTransitionEvent ) | ( ruleEnterEvent ) | ( ruleExitEvent ) | ( ruleScriptEvent ) | ( ruleTimerEvent ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1381:1: ( ( ruleSymbolicEvent ) | ( ruleTransitionEvent ) | ( ruleEnterEvent ) | ( ruleExitEvent ) | ( ruleScriptEvent ) | ( ruleTimerEvent ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==34) ) {
                    alt7=1;
                }
                else if ( (LA7_1==29||LA7_1==31||LA7_1==43) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1377:1: rule__Event__Alternatives : ( ( ruleSymbolicEvent ) | ( ruleTransitionEvent ) | ( ruleEnterEvent ) | ( ruleExitEvent ) | ( ruleScriptEvent ) | ( ruleTimerEvent ) );", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case 29:
            case 31:
                {
                alt7=2;
                }
                break;
            case 35:
                {
                alt7=3;
                }
                break;
            case 36:
                {
                alt7=4;
                }
                break;
            case RULE_SCRIPT_EXPRESSION:
                {
                alt7=5;
                }
                break;
            case 37:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1377:1: rule__Event__Alternatives : ( ( ruleSymbolicEvent ) | ( ruleTransitionEvent ) | ( ruleEnterEvent ) | ( ruleExitEvent ) | ( ruleScriptEvent ) | ( ruleTimerEvent ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1382:1: ( ruleSymbolicEvent )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1382:1: ( ruleSymbolicEvent )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1383:1: ruleSymbolicEvent
                    {
                     before(grammarAccess.getEventAccess().getSymbolicEventParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSymbolicEvent_in_rule__Event__Alternatives2909);
                    ruleSymbolicEvent();
                    _fsp--;

                     after(grammarAccess.getEventAccess().getSymbolicEventParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1388:6: ( ruleTransitionEvent )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1388:6: ( ruleTransitionEvent )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1389:1: ruleTransitionEvent
                    {
                     before(grammarAccess.getEventAccess().getTransitionEventParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTransitionEvent_in_rule__Event__Alternatives2926);
                    ruleTransitionEvent();
                    _fsp--;

                     after(grammarAccess.getEventAccess().getTransitionEventParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1394:6: ( ruleEnterEvent )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1394:6: ( ruleEnterEvent )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1395:1: ruleEnterEvent
                    {
                     before(grammarAccess.getEventAccess().getEnterEventParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEnterEvent_in_rule__Event__Alternatives2943);
                    ruleEnterEvent();
                    _fsp--;

                     after(grammarAccess.getEventAccess().getEnterEventParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1400:6: ( ruleExitEvent )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1400:6: ( ruleExitEvent )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1401:1: ruleExitEvent
                    {
                     before(grammarAccess.getEventAccess().getExitEventParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleExitEvent_in_rule__Event__Alternatives2960);
                    ruleExitEvent();
                    _fsp--;

                     after(grammarAccess.getEventAccess().getExitEventParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1406:6: ( ruleScriptEvent )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1406:6: ( ruleScriptEvent )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1407:1: ruleScriptEvent
                    {
                     before(grammarAccess.getEventAccess().getScriptEventParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleScriptEvent_in_rule__Event__Alternatives2977);
                    ruleScriptEvent();
                    _fsp--;

                     after(grammarAccess.getEventAccess().getScriptEventParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1412:6: ( ruleTimerEvent )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1412:6: ( ruleTimerEvent )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1413:1: ruleTimerEvent
                    {
                     before(grammarAccess.getEventAccess().getTimerEventParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleTimerEvent_in_rule__Event__Alternatives2994);
                    ruleTimerEvent();
                    _fsp--;

                     after(grammarAccess.getEventAccess().getTimerEventParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Event__Alternatives


    // $ANTLR start rule__TransitionEvent__Alternatives
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1423:1: rule__TransitionEvent__Alternatives : ( ( ( rule__TransitionEvent__Alternatives_0 ) ) | ( ( rule__TransitionEvent__Alternatives_1 ) ) | ( ( rule__TransitionEvent__Alternatives_2 ) ) );
    public final void rule__TransitionEvent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1427:1: ( ( ( rule__TransitionEvent__Alternatives_0 ) ) | ( ( rule__TransitionEvent__Alternatives_1 ) ) | ( ( rule__TransitionEvent__Alternatives_2 ) ) )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1428:1: ( ( rule__TransitionEvent__Alternatives_0 ) )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1428:1: ( ( rule__TransitionEvent__Alternatives_0 ) )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1429:1: ( rule__TransitionEvent__Alternatives_0 )
                    {
                     before(grammarAccess.getTransitionEventAccess().getAlternatives_0()); 
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1430:1: ( rule__TransitionEvent__Alternatives_0 )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1430:2: rule__TransitionEvent__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__TransitionEvent__Alternatives_0_in_rule__TransitionEvent__Alternatives3026);
                    rule__TransitionEvent__Alternatives_0();
                    _fsp--;


                    }

                     after(grammarAccess.getTransitionEventAccess().getAlternatives_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1434:6: ( ( rule__TransitionEvent__Alternatives_1 ) )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1434:6: ( ( rule__TransitionEvent__Alternatives_1 ) )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1435:1: ( rule__TransitionEvent__Alternatives_1 )
                    {
                     before(grammarAccess.getTransitionEventAccess().getAlternatives_1()); 
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1436:1: ( rule__TransitionEvent__Alternatives_1 )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1436:2: rule__TransitionEvent__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__TransitionEvent__Alternatives_1_in_rule__TransitionEvent__Alternatives3044);
                    rule__TransitionEvent__Alternatives_1();
                    _fsp--;


                    }

                     after(grammarAccess.getTransitionEventAccess().getAlternatives_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1440:6: ( ( rule__TransitionEvent__Alternatives_2 ) )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1440:6: ( ( rule__TransitionEvent__Alternatives_2 ) )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1441:1: ( rule__TransitionEvent__Alternatives_2 )
                    {
                     before(grammarAccess.getTransitionEventAccess().getAlternatives_2()); 
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1442:1: ( rule__TransitionEvent__Alternatives_2 )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1442:2: rule__TransitionEvent__Alternatives_2
                    {
                    pushFollow(FOLLOW_rule__TransitionEvent__Alternatives_2_in_rule__TransitionEvent__Alternatives3062);
                    rule__TransitionEvent__Alternatives_2();
                    _fsp--;


                    }

                     after(grammarAccess.getTransitionEventAccess().getAlternatives_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Alternatives


    // $ANTLR start rule__TransitionEvent__Alternatives_0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1451:1: rule__TransitionEvent__Alternatives_0 : ( ( ( rule__TransitionEvent__Group_0_0__0 ) ) | ( ( rule__TransitionEvent__Group_0_1__0 ) ) );
    public final void rule__TransitionEvent__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1455:1: ( ( ( rule__TransitionEvent__Group_0_0__0 ) ) | ( ( rule__TransitionEvent__Group_0_1__0 ) ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1456:1: ( ( rule__TransitionEvent__Group_0_0__0 ) )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1456:1: ( ( rule__TransitionEvent__Group_0_0__0 ) )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1457:1: ( rule__TransitionEvent__Group_0_0__0 )
                    {
                     before(grammarAccess.getTransitionEventAccess().getGroup_0_0()); 
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1458:1: ( rule__TransitionEvent__Group_0_0__0 )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1458:2: rule__TransitionEvent__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__TransitionEvent__Group_0_0__0_in_rule__TransitionEvent__Alternatives_03095);
                    rule__TransitionEvent__Group_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTransitionEventAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1462:6: ( ( rule__TransitionEvent__Group_0_1__0 ) )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1462:6: ( ( rule__TransitionEvent__Group_0_1__0 ) )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1463:1: ( rule__TransitionEvent__Group_0_1__0 )
                    {
                     before(grammarAccess.getTransitionEventAccess().getGroup_0_1()); 
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1464:1: ( rule__TransitionEvent__Group_0_1__0 )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1464:2: rule__TransitionEvent__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__TransitionEvent__Group_0_1__0_in_rule__TransitionEvent__Alternatives_03113);
                    rule__TransitionEvent__Group_0_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTransitionEventAccess().getGroup_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Alternatives_0


    // $ANTLR start rule__TransitionEvent__Alternatives_1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1473:1: rule__TransitionEvent__Alternatives_1 : ( ( ( rule__TransitionEvent__Group_1_0__0 ) ) | ( ( rule__TransitionEvent__Group_1_1__0 ) ) );
    public final void rule__TransitionEvent__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1477:1: ( ( ( rule__TransitionEvent__Group_1_0__0 ) ) | ( ( rule__TransitionEvent__Group_1_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1473:1: rule__TransitionEvent__Alternatives_1 : ( ( ( rule__TransitionEvent__Group_1_0__0 ) ) | ( ( rule__TransitionEvent__Group_1_1__0 ) ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1478:1: ( ( rule__TransitionEvent__Group_1_0__0 ) )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1478:1: ( ( rule__TransitionEvent__Group_1_0__0 ) )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1479:1: ( rule__TransitionEvent__Group_1_0__0 )
                    {
                     before(grammarAccess.getTransitionEventAccess().getGroup_1_0()); 
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1480:1: ( rule__TransitionEvent__Group_1_0__0 )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1480:2: rule__TransitionEvent__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__TransitionEvent__Group_1_0__0_in_rule__TransitionEvent__Alternatives_13146);
                    rule__TransitionEvent__Group_1_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTransitionEventAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1484:6: ( ( rule__TransitionEvent__Group_1_1__0 ) )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1484:6: ( ( rule__TransitionEvent__Group_1_1__0 ) )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1485:1: ( rule__TransitionEvent__Group_1_1__0 )
                    {
                     before(grammarAccess.getTransitionEventAccess().getGroup_1_1()); 
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1486:1: ( rule__TransitionEvent__Group_1_1__0 )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1486:2: rule__TransitionEvent__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__TransitionEvent__Group_1_1__0_in_rule__TransitionEvent__Alternatives_13164);
                    rule__TransitionEvent__Group_1_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTransitionEventAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Alternatives_1


    // $ANTLR start rule__TransitionEvent__Alternatives_2
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1495:1: rule__TransitionEvent__Alternatives_2 : ( ( ( rule__TransitionEvent__Group_2_0__0 ) ) | ( ( rule__TransitionEvent__Group_2_1__0 ) ) );
    public final void rule__TransitionEvent__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1499:1: ( ( ( rule__TransitionEvent__Group_2_0__0 ) ) | ( ( rule__TransitionEvent__Group_2_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==31) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1495:1: rule__TransitionEvent__Alternatives_2 : ( ( ( rule__TransitionEvent__Group_2_0__0 ) ) | ( ( rule__TransitionEvent__Group_2_1__0 ) ) );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1500:1: ( ( rule__TransitionEvent__Group_2_0__0 ) )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1500:1: ( ( rule__TransitionEvent__Group_2_0__0 ) )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1501:1: ( rule__TransitionEvent__Group_2_0__0 )
                    {
                     before(grammarAccess.getTransitionEventAccess().getGroup_2_0()); 
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1502:1: ( rule__TransitionEvent__Group_2_0__0 )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1502:2: rule__TransitionEvent__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__TransitionEvent__Group_2_0__0_in_rule__TransitionEvent__Alternatives_23197);
                    rule__TransitionEvent__Group_2_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTransitionEventAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1506:6: ( ( rule__TransitionEvent__Group_2_1__0 ) )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1506:6: ( ( rule__TransitionEvent__Group_2_1__0 ) )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1507:1: ( rule__TransitionEvent__Group_2_1__0 )
                    {
                     before(grammarAccess.getTransitionEventAccess().getGroup_2_1()); 
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1508:1: ( rule__TransitionEvent__Group_2_1__0 )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1508:2: rule__TransitionEvent__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__TransitionEvent__Group_2_1__0_in_rule__TransitionEvent__Alternatives_23215);
                    rule__TransitionEvent__Group_2_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTransitionEventAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Alternatives_2


    // $ANTLR start rule__Action__Alternatives
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1517:1: rule__Action__Alternatives : ( ( ruleSymbolicAction ) | ( ruleScriptAction ) | ( ruleAssignmentAction ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1521:1: ( ( ruleSymbolicAction ) | ( ruleScriptAction ) | ( ruleAssignmentAction ) )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==34||LA12_1==39) ) {
                    alt12=1;
                }
                else if ( ((LA12_1>=42 && LA12_1<=43)) ) {
                    alt12=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1517:1: rule__Action__Alternatives : ( ( ruleSymbolicAction ) | ( ruleScriptAction ) | ( ruleAssignmentAction ) );", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA12_0==RULE_SCRIPT_STATEMENTS) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1517:1: rule__Action__Alternatives : ( ( ruleSymbolicAction ) | ( ruleScriptAction ) | ( ruleAssignmentAction ) );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1522:1: ( ruleSymbolicAction )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1522:1: ( ruleSymbolicAction )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1523:1: ruleSymbolicAction
                    {
                     before(grammarAccess.getActionAccess().getSymbolicActionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSymbolicAction_in_rule__Action__Alternatives3248);
                    ruleSymbolicAction();
                    _fsp--;

                     after(grammarAccess.getActionAccess().getSymbolicActionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1528:6: ( ruleScriptAction )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1528:6: ( ruleScriptAction )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1529:1: ruleScriptAction
                    {
                     before(grammarAccess.getActionAccess().getScriptActionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleScriptAction_in_rule__Action__Alternatives3265);
                    ruleScriptAction();
                    _fsp--;

                     after(grammarAccess.getActionAccess().getScriptActionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1534:6: ( ruleAssignmentAction )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1534:6: ( ruleAssignmentAction )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1535:1: ruleAssignmentAction
                    {
                     before(grammarAccess.getActionAccess().getAssignmentActionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAssignmentAction_in_rule__Action__Alternatives3282);
                    ruleAssignmentAction();
                    _fsp--;

                     after(grammarAccess.getActionAccess().getAssignmentActionParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Alternatives


    // $ANTLR start rule__VarDef__ManyAlternatives_2_2_0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1545:1: rule__VarDef__ManyAlternatives_2_2_0 : ( ( '*' ) | ( '[]' ) );
    public final void rule__VarDef__ManyAlternatives_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1549:1: ( ( '*' ) | ( '[]' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            else if ( (LA13_0==17) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1545:1: rule__VarDef__ManyAlternatives_2_2_0 : ( ( '*' ) | ( '[]' ) );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1550:1: ( '*' )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1550:1: ( '*' )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1551:1: '*'
                    {
                     before(grammarAccess.getVarDefAccess().getManyAsteriskKeyword_2_2_0_0()); 
                    match(input,16,FOLLOW_16_in_rule__VarDef__ManyAlternatives_2_2_03315); 
                     after(grammarAccess.getVarDefAccess().getManyAsteriskKeyword_2_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1558:6: ( '[]' )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1558:6: ( '[]' )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1559:1: '[]'
                    {
                     before(grammarAccess.getVarDefAccess().getManyLeftSquareBracketRightSquareBracketKeyword_2_2_0_1()); 
                    match(input,17,FOLLOW_17_in_rule__VarDef__ManyAlternatives_2_2_03335); 
                     after(grammarAccess.getVarDefAccess().getManyLeftSquareBracketRightSquareBracketKeyword_2_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDef__ManyAlternatives_2_2_0


    // $ANTLR start rule__BOOLEAN_LITERAL__Alternatives
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1571:1: rule__BOOLEAN_LITERAL__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BOOLEAN_LITERAL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1575:1: ( ( 'true' ) | ( 'false' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            else if ( (LA14_0==19) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1571:1: rule__BOOLEAN_LITERAL__Alternatives : ( ( 'true' ) | ( 'false' ) );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1576:1: ( 'true' )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1576:1: ( 'true' )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1577:1: 'true'
                    {
                     before(grammarAccess.getBOOLEAN_LITERALAccess().getTrueKeyword_0()); 
                    match(input,18,FOLLOW_18_in_rule__BOOLEAN_LITERAL__Alternatives3370); 
                     after(grammarAccess.getBOOLEAN_LITERALAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1584:6: ( 'false' )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1584:6: ( 'false' )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1585:1: 'false'
                    {
                     before(grammarAccess.getBOOLEAN_LITERALAccess().getFalseKeyword_1()); 
                    match(input,19,FOLLOW_19_in_rule__BOOLEAN_LITERAL__Alternatives3390); 
                     after(grammarAccess.getBOOLEAN_LITERALAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BOOLEAN_LITERAL__Alternatives


    // $ANTLR start rule__FLOAT_LITERAL__Alternatives_0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1597:1: rule__FLOAT_LITERAL__Alternatives_0 : ( ( RULE_INT ) | ( rulePOS_INT ) | ( ruleNEG_INT ) );
    public final void rule__FLOAT_LITERAL__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1601:1: ( ( RULE_INT ) | ( rulePOS_INT ) | ( ruleNEG_INT ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt15=1;
                }
                break;
            case 44:
                {
                alt15=2;
                }
                break;
            case 45:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1597:1: rule__FLOAT_LITERAL__Alternatives_0 : ( ( RULE_INT ) | ( rulePOS_INT ) | ( ruleNEG_INT ) );", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1602:1: ( RULE_INT )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1602:1: ( RULE_INT )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1603:1: RULE_INT
                    {
                     before(grammarAccess.getFLOAT_LITERALAccess().getINTTerminalRuleCall_0_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FLOAT_LITERAL__Alternatives_03424); 
                     after(grammarAccess.getFLOAT_LITERALAccess().getINTTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1608:6: ( rulePOS_INT )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1608:6: ( rulePOS_INT )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1609:1: rulePOS_INT
                    {
                     before(grammarAccess.getFLOAT_LITERALAccess().getPOS_INTParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_rulePOS_INT_in_rule__FLOAT_LITERAL__Alternatives_03441);
                    rulePOS_INT();
                    _fsp--;

                     after(grammarAccess.getFLOAT_LITERALAccess().getPOS_INTParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1614:6: ( ruleNEG_INT )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1614:6: ( ruleNEG_INT )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1615:1: ruleNEG_INT
                    {
                     before(grammarAccess.getFLOAT_LITERALAccess().getNEG_INTParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleNEG_INT_in_rule__FLOAT_LITERAL__Alternatives_03458);
                    ruleNEG_INT();
                    _fsp--;

                     after(grammarAccess.getFLOAT_LITERALAccess().getNEG_INTParserRuleCall_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FLOAT_LITERAL__Alternatives_0


    // $ANTLR start rule__Expression__Alternatives
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1625:1: rule__Expression__Alternatives : ( ( ruleLiteral ) | ( ruleScriptExpression ) | ( ruleEPath ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1629:1: ( ( ruleLiteral ) | ( ruleScriptExpression ) | ( ruleEPath ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case RULE_URI_LITERAL:
            case RULE_EOBJECT_URI_LITERAL:
            case 18:
            case 19:
            case 44:
            case 45:
                {
                alt16=1;
                }
                break;
            case RULE_SCRIPT_EXPRESSION:
                {
                alt16=2;
                }
                break;
            case RULE_ID:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1625:1: rule__Expression__Alternatives : ( ( ruleLiteral ) | ( ruleScriptExpression ) | ( ruleEPath ) );", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1630:1: ( ruleLiteral )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1630:1: ( ruleLiteral )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1631:1: ruleLiteral
                    {
                     before(grammarAccess.getExpressionAccess().getLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLiteral_in_rule__Expression__Alternatives3490);
                    ruleLiteral();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1636:6: ( ruleScriptExpression )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1636:6: ( ruleScriptExpression )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1637:1: ruleScriptExpression
                    {
                     before(grammarAccess.getExpressionAccess().getScriptExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleScriptExpression_in_rule__Expression__Alternatives3507);
                    ruleScriptExpression();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getScriptExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1642:6: ( ruleEPath )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1642:6: ( ruleEPath )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1643:1: ruleEPath
                    {
                     before(grammarAccess.getExpressionAccess().getEPathParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEPath_in_rule__Expression__Alternatives3524);
                    ruleEPath();
                    _fsp--;

                     after(grammarAccess.getExpressionAccess().getEPathParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Alternatives


    // $ANTLR start rule__Literal__Alternatives
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1653:1: rule__Literal__Alternatives : ( ( ruleBooleanLiteral ) | ( ruleFloatLiteral ) | ( ruleIntLiteral ) | ( ruleStringLiteral ) | ( ruleUriLiteral ) | ( ruleEObjectUriLiteral ) | ( ruleDelayLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1657:1: ( ( ruleBooleanLiteral ) | ( ruleFloatLiteral ) | ( ruleIntLiteral ) | ( ruleStringLiteral ) | ( ruleUriLiteral ) | ( ruleEObjectUriLiteral ) | ( ruleDelayLiteral ) )
            int alt17=7;
            switch ( input.LA(1) ) {
            case 18:
            case 19:
                {
                alt17=1;
                }
                break;
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case 43:
                    {
                    alt17=2;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case 15:
                case 34:
                case 39:
                    {
                    alt17=3;
                    }
                    break;
                case 20:
                case 21:
                case 22:
                case 23:
                    {
                    alt17=7;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1653:1: rule__Literal__Alternatives : ( ( ruleBooleanLiteral ) | ( ruleFloatLiteral ) | ( ruleIntLiteral ) | ( ruleStringLiteral ) | ( ruleUriLiteral ) | ( ruleEObjectUriLiteral ) | ( ruleDelayLiteral ) );", 17, 2, input);

                    throw nvae;
                }

                }
                break;
            case 44:
                {
                int LA17_3 = input.LA(2);

                if ( (LA17_3==RULE_INT) ) {
                    int LA17_11 = input.LA(3);

                    if ( (LA17_11==EOF||LA17_11==RULE_ID||LA17_11==15||LA17_11==34||LA17_11==39) ) {
                        alt17=3;
                    }
                    else if ( (LA17_11==43) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1653:1: rule__Literal__Alternatives : ( ( ruleBooleanLiteral ) | ( ruleFloatLiteral ) | ( ruleIntLiteral ) | ( ruleStringLiteral ) | ( ruleUriLiteral ) | ( ruleEObjectUriLiteral ) | ( ruleDelayLiteral ) );", 17, 11, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1653:1: rule__Literal__Alternatives : ( ( ruleBooleanLiteral ) | ( ruleFloatLiteral ) | ( ruleIntLiteral ) | ( ruleStringLiteral ) | ( ruleUriLiteral ) | ( ruleEObjectUriLiteral ) | ( ruleDelayLiteral ) );", 17, 3, input);

                    throw nvae;
                }
                }
                break;
            case 45:
                {
                int LA17_4 = input.LA(2);

                if ( (LA17_4==RULE_INT) ) {
                    int LA17_12 = input.LA(3);

                    if ( (LA17_12==43) ) {
                        alt17=2;
                    }
                    else if ( (LA17_12==EOF||LA17_12==RULE_ID||LA17_12==15||LA17_12==34||LA17_12==39) ) {
                        alt17=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1653:1: rule__Literal__Alternatives : ( ( ruleBooleanLiteral ) | ( ruleFloatLiteral ) | ( ruleIntLiteral ) | ( ruleStringLiteral ) | ( ruleUriLiteral ) | ( ruleEObjectUriLiteral ) | ( ruleDelayLiteral ) );", 17, 12, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1653:1: rule__Literal__Alternatives : ( ( ruleBooleanLiteral ) | ( ruleFloatLiteral ) | ( ruleIntLiteral ) | ( ruleStringLiteral ) | ( ruleUriLiteral ) | ( ruleEObjectUriLiteral ) | ( ruleDelayLiteral ) );", 17, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt17=4;
                }
                break;
            case RULE_URI_LITERAL:
                {
                alt17=5;
                }
                break;
            case RULE_EOBJECT_URI_LITERAL:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1653:1: rule__Literal__Alternatives : ( ( ruleBooleanLiteral ) | ( ruleFloatLiteral ) | ( ruleIntLiteral ) | ( ruleStringLiteral ) | ( ruleUriLiteral ) | ( ruleEObjectUriLiteral ) | ( ruleDelayLiteral ) );", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1658:1: ( ruleBooleanLiteral )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1658:1: ( ruleBooleanLiteral )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1659:1: ruleBooleanLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives3556);
                    ruleBooleanLiteral();
                    _fsp--;

                     after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1664:6: ( ruleFloatLiteral )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1664:6: ( ruleFloatLiteral )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1665:1: ruleFloatLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFloatLiteral_in_rule__Literal__Alternatives3573);
                    ruleFloatLiteral();
                    _fsp--;

                     after(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1670:6: ( ruleIntLiteral )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1670:6: ( ruleIntLiteral )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1671:1: ruleIntLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleIntLiteral_in_rule__Literal__Alternatives3590);
                    ruleIntLiteral();
                    _fsp--;

                     after(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1676:6: ( ruleStringLiteral )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1676:6: ( ruleStringLiteral )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1677:1: ruleStringLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives3607);
                    ruleStringLiteral();
                    _fsp--;

                     after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1682:6: ( ruleUriLiteral )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1682:6: ( ruleUriLiteral )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1683:1: ruleUriLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getUriLiteralParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleUriLiteral_in_rule__Literal__Alternatives3624);
                    ruleUriLiteral();
                    _fsp--;

                     after(grammarAccess.getLiteralAccess().getUriLiteralParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1688:6: ( ruleEObjectUriLiteral )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1688:6: ( ruleEObjectUriLiteral )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1689:1: ruleEObjectUriLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getEObjectUriLiteralParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleEObjectUriLiteral_in_rule__Literal__Alternatives3641);
                    ruleEObjectUriLiteral();
                    _fsp--;

                     after(grammarAccess.getLiteralAccess().getEObjectUriLiteralParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1694:6: ( ruleDelayLiteral )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1694:6: ( ruleDelayLiteral )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1695:1: ruleDelayLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getDelayLiteralParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleDelayLiteral_in_rule__Literal__Alternatives3658);
                    ruleDelayLiteral();
                    _fsp--;

                     after(grammarAccess.getLiteralAccess().getDelayLiteralParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Literal__Alternatives


    // $ANTLR start rule__IntLiteral__IntValueAlternatives_0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1705:1: rule__IntLiteral__IntValueAlternatives_0 : ( ( RULE_INT ) | ( rulePOS_INT ) | ( ruleNEG_INT ) );
    public final void rule__IntLiteral__IntValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1709:1: ( ( RULE_INT ) | ( rulePOS_INT ) | ( ruleNEG_INT ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt18=1;
                }
                break;
            case 44:
                {
                alt18=2;
                }
                break;
            case 45:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1705:1: rule__IntLiteral__IntValueAlternatives_0 : ( ( RULE_INT ) | ( rulePOS_INT ) | ( ruleNEG_INT ) );", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1710:1: ( RULE_INT )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1710:1: ( RULE_INT )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1711:1: RULE_INT
                    {
                     before(grammarAccess.getIntLiteralAccess().getIntValueINTTerminalRuleCall_0_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntLiteral__IntValueAlternatives_03690); 
                     after(grammarAccess.getIntLiteralAccess().getIntValueINTTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1716:6: ( rulePOS_INT )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1716:6: ( rulePOS_INT )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1717:1: rulePOS_INT
                    {
                     before(grammarAccess.getIntLiteralAccess().getIntValuePOS_INTParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_rulePOS_INT_in_rule__IntLiteral__IntValueAlternatives_03707);
                    rulePOS_INT();
                    _fsp--;

                     after(grammarAccess.getIntLiteralAccess().getIntValuePOS_INTParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1722:6: ( ruleNEG_INT )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1722:6: ( ruleNEG_INT )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1723:1: ruleNEG_INT
                    {
                     before(grammarAccess.getIntLiteralAccess().getIntValueNEG_INTParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleNEG_INT_in_rule__IntLiteral__IntValueAlternatives_03724);
                    ruleNEG_INT();
                    _fsp--;

                     after(grammarAccess.getIntLiteralAccess().getIntValueNEG_INTParserRuleCall_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntLiteral__IntValueAlternatives_0


    // $ANTLR start rule__TimeUnit__Alternatives
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1733:1: rule__TimeUnit__Alternatives : ( ( ( 'ms' ) ) | ( ( 's' ) ) | ( ( 'm' ) ) | ( ( 'h' ) ) );
    public final void rule__TimeUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1737:1: ( ( ( 'ms' ) ) | ( ( 's' ) ) | ( ( 'm' ) ) | ( ( 'h' ) ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt19=1;
                }
                break;
            case 21:
                {
                alt19=2;
                }
                break;
            case 22:
                {
                alt19=3;
                }
                break;
            case 23:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1733:1: rule__TimeUnit__Alternatives : ( ( ( 'ms' ) ) | ( ( 's' ) ) | ( ( 'm' ) ) | ( ( 'h' ) ) );", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1738:1: ( ( 'ms' ) )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1738:1: ( ( 'ms' ) )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1739:1: ( 'ms' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMsEnumLiteralDeclaration_0()); 
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1740:1: ( 'ms' )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1740:3: 'ms'
                    {
                    match(input,20,FOLLOW_20_in_rule__TimeUnit__Alternatives3757); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getMsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1745:6: ( ( 's' ) )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1745:6: ( ( 's' ) )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1746:1: ( 's' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getSEnumLiteralDeclaration_1()); 
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1747:1: ( 's' )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1747:3: 's'
                    {
                    match(input,21,FOLLOW_21_in_rule__TimeUnit__Alternatives3778); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1752:6: ( ( 'm' ) )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1752:6: ( ( 'm' ) )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1753:1: ( 'm' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMEnumLiteralDeclaration_2()); 
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1754:1: ( 'm' )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1754:3: 'm'
                    {
                    match(input,22,FOLLOW_22_in_rule__TimeUnit__Alternatives3799); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getMEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1759:6: ( ( 'h' ) )
                    {
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1759:6: ( ( 'h' ) )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1760:1: ( 'h' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getHEnumLiteralDeclaration_3()); 
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1761:1: ( 'h' )
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1761:3: 'h'
                    {
                    match(input,23,FOLLOW_23_in_rule__TimeUnit__Alternatives3820); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getHEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TimeUnit__Alternatives


    // $ANTLR start rule__StateMachine__Group__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1773:1: rule__StateMachine__Group__0 : rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 ;
    public final void rule__StateMachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1777:1: ( rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1778:2: rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__0__Impl_in_rule__StateMachine__Group__03853);
            rule__StateMachine__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group__1_in_rule__StateMachine__Group__03856);
            rule__StateMachine__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateMachine__Group__0


    // $ANTLR start rule__StateMachine__Group__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1785:1: rule__StateMachine__Group__0__Impl : ( ( rule__StateMachine__ImportsAssignment_0 )* ) ;
    public final void rule__StateMachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1789:1: ( ( ( rule__StateMachine__ImportsAssignment_0 )* ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1790:1: ( ( rule__StateMachine__ImportsAssignment_0 )* )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1790:1: ( ( rule__StateMachine__ImportsAssignment_0 )* )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1791:1: ( rule__StateMachine__ImportsAssignment_0 )*
            {
             before(grammarAccess.getStateMachineAccess().getImportsAssignment_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1792:1: ( rule__StateMachine__ImportsAssignment_0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=24 && LA20_0<=26)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1792:2: rule__StateMachine__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__StateMachine__ImportsAssignment_0_in_rule__StateMachine__Group__0__Impl3883);
            	    rule__StateMachine__ImportsAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateMachine__Group__0__Impl


    // $ANTLR start rule__StateMachine__Group__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1802:1: rule__StateMachine__Group__1 : rule__StateMachine__Group__1__Impl ;
    public final void rule__StateMachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1806:1: ( rule__StateMachine__Group__1__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1807:2: rule__StateMachine__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__1__Impl_in_rule__StateMachine__Group__13914);
            rule__StateMachine__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateMachine__Group__1


    // $ANTLR start rule__StateMachine__Group__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1813:1: rule__StateMachine__Group__1__Impl : ( ( rule__StateMachine__Alternatives_1 )* ) ;
    public final void rule__StateMachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1817:1: ( ( ( rule__StateMachine__Alternatives_1 )* ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1818:1: ( ( rule__StateMachine__Alternatives_1 )* )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1818:1: ( ( rule__StateMachine__Alternatives_1 )* )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1819:1: ( rule__StateMachine__Alternatives_1 )*
            {
             before(grammarAccess.getStateMachineAccess().getAlternatives_1()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1820:1: ( rule__StateMachine__Alternatives_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||(LA21_0>=29 && LA21_0<=30)||(LA21_0>=32 && LA21_0<=33)||LA21_0==40) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1820:2: rule__StateMachine__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__StateMachine__Alternatives_1_in_rule__StateMachine__Group__1__Impl3941);
            	    rule__StateMachine__Alternatives_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateMachine__Group__1__Impl


    // $ANTLR start rule__DomainModelImport__Group__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1834:1: rule__DomainModelImport__Group__0 : rule__DomainModelImport__Group__0__Impl rule__DomainModelImport__Group__1 ;
    public final void rule__DomainModelImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1838:1: ( rule__DomainModelImport__Group__0__Impl rule__DomainModelImport__Group__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1839:2: rule__DomainModelImport__Group__0__Impl rule__DomainModelImport__Group__1
            {
            pushFollow(FOLLOW_rule__DomainModelImport__Group__0__Impl_in_rule__DomainModelImport__Group__03976);
            rule__DomainModelImport__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DomainModelImport__Group__1_in_rule__DomainModelImport__Group__03979);
            rule__DomainModelImport__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainModelImport__Group__0


    // $ANTLR start rule__DomainModelImport__Group__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1846:1: rule__DomainModelImport__Group__0__Impl : ( ( 'domain' )? ) ;
    public final void rule__DomainModelImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1850:1: ( ( ( 'domain' )? ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1851:1: ( ( 'domain' )? )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1851:1: ( ( 'domain' )? )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1852:1: ( 'domain' )?
            {
             before(grammarAccess.getDomainModelImportAccess().getDomainKeyword_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1853:1: ( 'domain' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1854:2: 'domain'
                    {
                    match(input,24,FOLLOW_24_in_rule__DomainModelImport__Group__0__Impl4008); 

                    }
                    break;

            }

             after(grammarAccess.getDomainModelImportAccess().getDomainKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainModelImport__Group__0__Impl


    // $ANTLR start rule__DomainModelImport__Group__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1865:1: rule__DomainModelImport__Group__1 : rule__DomainModelImport__Group__1__Impl rule__DomainModelImport__Group__2 ;
    public final void rule__DomainModelImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1869:1: ( rule__DomainModelImport__Group__1__Impl rule__DomainModelImport__Group__2 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1870:2: rule__DomainModelImport__Group__1__Impl rule__DomainModelImport__Group__2
            {
            pushFollow(FOLLOW_rule__DomainModelImport__Group__1__Impl_in_rule__DomainModelImport__Group__14041);
            rule__DomainModelImport__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DomainModelImport__Group__2_in_rule__DomainModelImport__Group__14044);
            rule__DomainModelImport__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainModelImport__Group__1


    // $ANTLR start rule__DomainModelImport__Group__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1877:1: rule__DomainModelImport__Group__1__Impl : ( 'model' ) ;
    public final void rule__DomainModelImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1881:1: ( ( 'model' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1882:1: ( 'model' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1882:1: ( 'model' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1883:1: 'model'
            {
             before(grammarAccess.getDomainModelImportAccess().getModelKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__DomainModelImport__Group__1__Impl4072); 
             after(grammarAccess.getDomainModelImportAccess().getModelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainModelImport__Group__1__Impl


    // $ANTLR start rule__DomainModelImport__Group__2
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1896:1: rule__DomainModelImport__Group__2 : rule__DomainModelImport__Group__2__Impl rule__DomainModelImport__Group__3 ;
    public final void rule__DomainModelImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1900:1: ( rule__DomainModelImport__Group__2__Impl rule__DomainModelImport__Group__3 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1901:2: rule__DomainModelImport__Group__2__Impl rule__DomainModelImport__Group__3
            {
            pushFollow(FOLLOW_rule__DomainModelImport__Group__2__Impl_in_rule__DomainModelImport__Group__24103);
            rule__DomainModelImport__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DomainModelImport__Group__3_in_rule__DomainModelImport__Group__24106);
            rule__DomainModelImport__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainModelImport__Group__2


    // $ANTLR start rule__DomainModelImport__Group__2__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1908:1: rule__DomainModelImport__Group__2__Impl : ( ( rule__DomainModelImport__ImportURIAssignment_2 ) ) ;
    public final void rule__DomainModelImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1912:1: ( ( ( rule__DomainModelImport__ImportURIAssignment_2 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1913:1: ( ( rule__DomainModelImport__ImportURIAssignment_2 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1913:1: ( ( rule__DomainModelImport__ImportURIAssignment_2 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1914:1: ( rule__DomainModelImport__ImportURIAssignment_2 )
            {
             before(grammarAccess.getDomainModelImportAccess().getImportURIAssignment_2()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1915:1: ( rule__DomainModelImport__ImportURIAssignment_2 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1915:2: rule__DomainModelImport__ImportURIAssignment_2
            {
            pushFollow(FOLLOW_rule__DomainModelImport__ImportURIAssignment_2_in_rule__DomainModelImport__Group__2__Impl4133);
            rule__DomainModelImport__ImportURIAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDomainModelImportAccess().getImportURIAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainModelImport__Group__2__Impl


    // $ANTLR start rule__DomainModelImport__Group__3
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1925:1: rule__DomainModelImport__Group__3 : rule__DomainModelImport__Group__3__Impl ;
    public final void rule__DomainModelImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1929:1: ( rule__DomainModelImport__Group__3__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1930:2: rule__DomainModelImport__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DomainModelImport__Group__3__Impl_in_rule__DomainModelImport__Group__34163);
            rule__DomainModelImport__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainModelImport__Group__3


    // $ANTLR start rule__DomainModelImport__Group__3__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1936:1: rule__DomainModelImport__Group__3__Impl : ( ';' ) ;
    public final void rule__DomainModelImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1940:1: ( ( ';' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1941:1: ( ';' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1941:1: ( ';' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1942:1: ';'
            {
             before(grammarAccess.getDomainModelImportAccess().getSemicolonKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__DomainModelImport__Group__3__Impl4191); 
             after(grammarAccess.getDomainModelImportAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainModelImport__Group__3__Impl


    // $ANTLR start rule__DomainDataImport__Group__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1963:1: rule__DomainDataImport__Group__0 : rule__DomainDataImport__Group__0__Impl rule__DomainDataImport__Group__1 ;
    public final void rule__DomainDataImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1967:1: ( rule__DomainDataImport__Group__0__Impl rule__DomainDataImport__Group__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1968:2: rule__DomainDataImport__Group__0__Impl rule__DomainDataImport__Group__1
            {
            pushFollow(FOLLOW_rule__DomainDataImport__Group__0__Impl_in_rule__DomainDataImport__Group__04230);
            rule__DomainDataImport__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DomainDataImport__Group__1_in_rule__DomainDataImport__Group__04233);
            rule__DomainDataImport__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainDataImport__Group__0


    // $ANTLR start rule__DomainDataImport__Group__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1975:1: rule__DomainDataImport__Group__0__Impl : ( ( 'domain' )? ) ;
    public final void rule__DomainDataImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1979:1: ( ( ( 'domain' )? ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1980:1: ( ( 'domain' )? )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1980:1: ( ( 'domain' )? )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1981:1: ( 'domain' )?
            {
             before(grammarAccess.getDomainDataImportAccess().getDomainKeyword_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1982:1: ( 'domain' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1983:2: 'domain'
                    {
                    match(input,24,FOLLOW_24_in_rule__DomainDataImport__Group__0__Impl4262); 

                    }
                    break;

            }

             after(grammarAccess.getDomainDataImportAccess().getDomainKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainDataImport__Group__0__Impl


    // $ANTLR start rule__DomainDataImport__Group__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1994:1: rule__DomainDataImport__Group__1 : rule__DomainDataImport__Group__1__Impl rule__DomainDataImport__Group__2 ;
    public final void rule__DomainDataImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1998:1: ( rule__DomainDataImport__Group__1__Impl rule__DomainDataImport__Group__2 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:1999:2: rule__DomainDataImport__Group__1__Impl rule__DomainDataImport__Group__2
            {
            pushFollow(FOLLOW_rule__DomainDataImport__Group__1__Impl_in_rule__DomainDataImport__Group__14295);
            rule__DomainDataImport__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DomainDataImport__Group__2_in_rule__DomainDataImport__Group__14298);
            rule__DomainDataImport__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainDataImport__Group__1


    // $ANTLR start rule__DomainDataImport__Group__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2006:1: rule__DomainDataImport__Group__1__Impl : ( 'data' ) ;
    public final void rule__DomainDataImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2010:1: ( ( 'data' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2011:1: ( 'data' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2011:1: ( 'data' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2012:1: 'data'
            {
             before(grammarAccess.getDomainDataImportAccess().getDataKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__DomainDataImport__Group__1__Impl4326); 
             after(grammarAccess.getDomainDataImportAccess().getDataKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainDataImport__Group__1__Impl


    // $ANTLR start rule__DomainDataImport__Group__2
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2025:1: rule__DomainDataImport__Group__2 : rule__DomainDataImport__Group__2__Impl rule__DomainDataImport__Group__3 ;
    public final void rule__DomainDataImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2029:1: ( rule__DomainDataImport__Group__2__Impl rule__DomainDataImport__Group__3 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2030:2: rule__DomainDataImport__Group__2__Impl rule__DomainDataImport__Group__3
            {
            pushFollow(FOLLOW_rule__DomainDataImport__Group__2__Impl_in_rule__DomainDataImport__Group__24357);
            rule__DomainDataImport__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DomainDataImport__Group__3_in_rule__DomainDataImport__Group__24360);
            rule__DomainDataImport__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainDataImport__Group__2


    // $ANTLR start rule__DomainDataImport__Group__2__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2037:1: rule__DomainDataImport__Group__2__Impl : ( ( rule__DomainDataImport__ImportURIAssignment_2 ) ) ;
    public final void rule__DomainDataImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2041:1: ( ( ( rule__DomainDataImport__ImportURIAssignment_2 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2042:1: ( ( rule__DomainDataImport__ImportURIAssignment_2 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2042:1: ( ( rule__DomainDataImport__ImportURIAssignment_2 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2043:1: ( rule__DomainDataImport__ImportURIAssignment_2 )
            {
             before(grammarAccess.getDomainDataImportAccess().getImportURIAssignment_2()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2044:1: ( rule__DomainDataImport__ImportURIAssignment_2 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2044:2: rule__DomainDataImport__ImportURIAssignment_2
            {
            pushFollow(FOLLOW_rule__DomainDataImport__ImportURIAssignment_2_in_rule__DomainDataImport__Group__2__Impl4387);
            rule__DomainDataImport__ImportURIAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDomainDataImportAccess().getImportURIAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainDataImport__Group__2__Impl


    // $ANTLR start rule__DomainDataImport__Group__3
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2054:1: rule__DomainDataImport__Group__3 : rule__DomainDataImport__Group__3__Impl ;
    public final void rule__DomainDataImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2058:1: ( rule__DomainDataImport__Group__3__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2059:2: rule__DomainDataImport__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DomainDataImport__Group__3__Impl_in_rule__DomainDataImport__Group__34417);
            rule__DomainDataImport__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainDataImport__Group__3


    // $ANTLR start rule__DomainDataImport__Group__3__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2065:1: rule__DomainDataImport__Group__3__Impl : ( ';' ) ;
    public final void rule__DomainDataImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2069:1: ( ( ';' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2070:1: ( ';' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2070:1: ( ';' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2071:1: ';'
            {
             before(grammarAccess.getDomainDataImportAccess().getSemicolonKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__DomainDataImport__Group__3__Impl4445); 
             after(grammarAccess.getDomainDataImportAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainDataImport__Group__3__Impl


    // $ANTLR start rule__State__Group__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2092:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2096:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2097:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__04484);
            rule__State__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__04487);
            rule__State__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__0


    // $ANTLR start rule__State__Group__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2104:1: rule__State__Group__0__Impl : ( ( rule__State__InitialTransitionAssignment_0 )? ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2108:1: ( ( ( rule__State__InitialTransitionAssignment_0 )? ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2109:1: ( ( rule__State__InitialTransitionAssignment_0 )? )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2109:1: ( ( rule__State__InitialTransitionAssignment_0 )? )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2110:1: ( rule__State__InitialTransitionAssignment_0 )?
            {
             before(grammarAccess.getStateAccess().getInitialTransitionAssignment_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2111:1: ( rule__State__InitialTransitionAssignment_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2111:2: rule__State__InitialTransitionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__State__InitialTransitionAssignment_0_in_rule__State__Group__0__Impl4514);
                    rule__State__InitialTransitionAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getInitialTransitionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__0__Impl


    // $ANTLR start rule__State__Group__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2121:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2125:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2126:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__14545);
            rule__State__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__14548);
            rule__State__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__1


    // $ANTLR start rule__State__Group__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2133:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2137:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2138:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2138:1: ( ( rule__State__NameAssignment_1 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2139:1: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2140:1: ( rule__State__NameAssignment_1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2140:2: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl4575);
            rule__State__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__1__Impl


    // $ANTLR start rule__State__Group__2
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2150:1: rule__State__Group__2 : rule__State__Group__2__Impl ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2154:1: ( rule__State__Group__2__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2155:2: rule__State__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__24605);
            rule__State__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__2


    // $ANTLR start rule__State__Group__2__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2161:1: rule__State__Group__2__Impl : ( ( rule__State__Alternatives_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2165:1: ( ( ( rule__State__Alternatives_2 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2166:1: ( ( rule__State__Alternatives_2 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2166:1: ( ( rule__State__Alternatives_2 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2167:1: ( rule__State__Alternatives_2 )
            {
             before(grammarAccess.getStateAccess().getAlternatives_2()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2168:1: ( rule__State__Alternatives_2 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2168:2: rule__State__Alternatives_2
            {
            pushFollow(FOLLOW_rule__State__Alternatives_2_in_rule__State__Group__2__Impl4632);
            rule__State__Alternatives_2();
            _fsp--;


            }

             after(grammarAccess.getStateAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__2__Impl


    // $ANTLR start rule__State__Group_2_1__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2184:1: rule__State__Group_2_1__0 : rule__State__Group_2_1__0__Impl rule__State__Group_2_1__1 ;
    public final void rule__State__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2188:1: ( rule__State__Group_2_1__0__Impl rule__State__Group_2_1__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2189:2: rule__State__Group_2_1__0__Impl rule__State__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__State__Group_2_1__0__Impl_in_rule__State__Group_2_1__04668);
            rule__State__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group_2_1__1_in_rule__State__Group_2_1__04671);
            rule__State__Group_2_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_2_1__0


    // $ANTLR start rule__State__Group_2_1__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2196:1: rule__State__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__State__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2200:1: ( ( '{' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2201:1: ( '{' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2201:1: ( '{' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2202:1: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            match(input,27,FOLLOW_27_in_rule__State__Group_2_1__0__Impl4699); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_2_1__0__Impl


    // $ANTLR start rule__State__Group_2_1__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2215:1: rule__State__Group_2_1__1 : rule__State__Group_2_1__1__Impl rule__State__Group_2_1__2 ;
    public final void rule__State__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2219:1: ( rule__State__Group_2_1__1__Impl rule__State__Group_2_1__2 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2220:2: rule__State__Group_2_1__1__Impl rule__State__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__State__Group_2_1__1__Impl_in_rule__State__Group_2_1__14730);
            rule__State__Group_2_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group_2_1__2_in_rule__State__Group_2_1__14733);
            rule__State__Group_2_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_2_1__1


    // $ANTLR start rule__State__Group_2_1__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2227:1: rule__State__Group_2_1__1__Impl : ( ( rule__State__Alternatives_2_1_1 )* ) ;
    public final void rule__State__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2231:1: ( ( ( rule__State__Alternatives_2_1_1 )* ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2232:1: ( ( rule__State__Alternatives_2_1_1 )* )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2232:1: ( ( rule__State__Alternatives_2_1_1 )* )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2233:1: ( rule__State__Alternatives_2_1_1 )*
            {
             before(grammarAccess.getStateAccess().getAlternatives_2_1_1()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2234:1: ( rule__State__Alternatives_2_1_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||(LA25_0>=29 && LA25_0<=30)||(LA25_0>=32 && LA25_0<=33)||LA25_0==40) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2234:2: rule__State__Alternatives_2_1_1
            	    {
            	    pushFollow(FOLLOW_rule__State__Alternatives_2_1_1_in_rule__State__Group_2_1__1__Impl4760);
            	    rule__State__Alternatives_2_1_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getAlternatives_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_2_1__1__Impl


    // $ANTLR start rule__State__Group_2_1__2
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2244:1: rule__State__Group_2_1__2 : rule__State__Group_2_1__2__Impl ;
    public final void rule__State__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2248:1: ( rule__State__Group_2_1__2__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2249:2: rule__State__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_2_1__2__Impl_in_rule__State__Group_2_1__24791);
            rule__State__Group_2_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_2_1__2


    // $ANTLR start rule__State__Group_2_1__2__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2255:1: rule__State__Group_2_1__2__Impl : ( '}' ) ;
    public final void rule__State__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2259:1: ( ( '}' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2260:1: ( '}' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2260:1: ( '}' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2261:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_1_2()); 
            match(input,28,FOLLOW_28_in_rule__State__Group_2_1__2__Impl4819); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_2_1__2__Impl


    // $ANTLR start rule__InitialTransition__Group__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2280:1: rule__InitialTransition__Group__0 : rule__InitialTransition__Group__0__Impl rule__InitialTransition__Group__1 ;
    public final void rule__InitialTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2284:1: ( rule__InitialTransition__Group__0__Impl rule__InitialTransition__Group__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2285:2: rule__InitialTransition__Group__0__Impl rule__InitialTransition__Group__1
            {
            pushFollow(FOLLOW_rule__InitialTransition__Group__0__Impl_in_rule__InitialTransition__Group__04856);
            rule__InitialTransition__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InitialTransition__Group__1_in_rule__InitialTransition__Group__04859);
            rule__InitialTransition__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InitialTransition__Group__0


    // $ANTLR start rule__InitialTransition__Group__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2292:1: rule__InitialTransition__Group__0__Impl : ( () ) ;
    public final void rule__InitialTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2296:1: ( ( () ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2297:1: ( () )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2297:1: ( () )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2298:1: ()
            {
             before(grammarAccess.getInitialTransitionAccess().getInitialTransitionAction_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2299:1: ()
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2301:1: 
            {
            }

             after(grammarAccess.getInitialTransitionAccess().getInitialTransitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InitialTransition__Group__0__Impl


    // $ANTLR start rule__InitialTransition__Group__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2311:1: rule__InitialTransition__Group__1 : rule__InitialTransition__Group__1__Impl rule__InitialTransition__Group__2 ;
    public final void rule__InitialTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2315:1: ( rule__InitialTransition__Group__1__Impl rule__InitialTransition__Group__2 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2316:2: rule__InitialTransition__Group__1__Impl rule__InitialTransition__Group__2
            {
            pushFollow(FOLLOW_rule__InitialTransition__Group__1__Impl_in_rule__InitialTransition__Group__14917);
            rule__InitialTransition__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InitialTransition__Group__2_in_rule__InitialTransition__Group__14920);
            rule__InitialTransition__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InitialTransition__Group__1


    // $ANTLR start rule__InitialTransition__Group__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2323:1: rule__InitialTransition__Group__1__Impl : ( '->' ) ;
    public final void rule__InitialTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2327:1: ( ( '->' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2328:1: ( '->' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2328:1: ( '->' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2329:1: '->'
            {
             before(grammarAccess.getInitialTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__InitialTransition__Group__1__Impl4948); 
             after(grammarAccess.getInitialTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InitialTransition__Group__1__Impl


    // $ANTLR start rule__InitialTransition__Group__2
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2342:1: rule__InitialTransition__Group__2 : rule__InitialTransition__Group__2__Impl ;
    public final void rule__InitialTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2346:1: ( rule__InitialTransition__Group__2__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2347:2: rule__InitialTransition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__InitialTransition__Group__2__Impl_in_rule__InitialTransition__Group__24979);
            rule__InitialTransition__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InitialTransition__Group__2


    // $ANTLR start rule__InitialTransition__Group__2__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2353:1: rule__InitialTransition__Group__2__Impl : ( ( rule__InitialTransition__Group_2__0 )? ) ;
    public final void rule__InitialTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2357:1: ( ( ( rule__InitialTransition__Group_2__0 )? ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2358:1: ( ( rule__InitialTransition__Group_2__0 )? )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2358:1: ( ( rule__InitialTransition__Group_2__0 )? )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2359:1: ( rule__InitialTransition__Group_2__0 )?
            {
             before(grammarAccess.getInitialTransitionAccess().getGroup_2()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2360:1: ( rule__InitialTransition__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2360:2: rule__InitialTransition__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__InitialTransition__Group_2__0_in_rule__InitialTransition__Group__2__Impl5006);
                    rule__InitialTransition__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInitialTransitionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InitialTransition__Group__2__Impl


    // $ANTLR start rule__InitialTransition__Group_2__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2376:1: rule__InitialTransition__Group_2__0 : rule__InitialTransition__Group_2__0__Impl rule__InitialTransition__Group_2__1 ;
    public final void rule__InitialTransition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2380:1: ( rule__InitialTransition__Group_2__0__Impl rule__InitialTransition__Group_2__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2381:2: rule__InitialTransition__Group_2__0__Impl rule__InitialTransition__Group_2__1
            {
            pushFollow(FOLLOW_rule__InitialTransition__Group_2__0__Impl_in_rule__InitialTransition__Group_2__05043);
            rule__InitialTransition__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InitialTransition__Group_2__1_in_rule__InitialTransition__Group_2__05046);
            rule__InitialTransition__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InitialTransition__Group_2__0


    // $ANTLR start rule__InitialTransition__Group_2__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2388:1: rule__InitialTransition__Group_2__0__Impl : ( 'do' ) ;
    public final void rule__InitialTransition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2392:1: ( ( 'do' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2393:1: ( 'do' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2393:1: ( 'do' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2394:1: 'do'
            {
             before(grammarAccess.getInitialTransitionAccess().getDoKeyword_2_0()); 
            match(input,30,FOLLOW_30_in_rule__InitialTransition__Group_2__0__Impl5074); 
             after(grammarAccess.getInitialTransitionAccess().getDoKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InitialTransition__Group_2__0__Impl


    // $ANTLR start rule__InitialTransition__Group_2__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2407:1: rule__InitialTransition__Group_2__1 : rule__InitialTransition__Group_2__1__Impl ;
    public final void rule__InitialTransition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2411:1: ( rule__InitialTransition__Group_2__1__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2412:2: rule__InitialTransition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__InitialTransition__Group_2__1__Impl_in_rule__InitialTransition__Group_2__15105);
            rule__InitialTransition__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InitialTransition__Group_2__1


    // $ANTLR start rule__InitialTransition__Group_2__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2418:1: rule__InitialTransition__Group_2__1__Impl : ( ( rule__InitialTransition__ActionAssignment_2_1 ) ) ;
    public final void rule__InitialTransition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2422:1: ( ( ( rule__InitialTransition__ActionAssignment_2_1 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2423:1: ( ( rule__InitialTransition__ActionAssignment_2_1 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2423:1: ( ( rule__InitialTransition__ActionAssignment_2_1 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2424:1: ( rule__InitialTransition__ActionAssignment_2_1 )
            {
             before(grammarAccess.getInitialTransitionAccess().getActionAssignment_2_1()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2425:1: ( rule__InitialTransition__ActionAssignment_2_1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2425:2: rule__InitialTransition__ActionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__InitialTransition__ActionAssignment_2_1_in_rule__InitialTransition__Group_2__1__Impl5132);
            rule__InitialTransition__ActionAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getInitialTransitionAccess().getActionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InitialTransition__Group_2__1__Impl


    // $ANTLR start rule__Transition__Group__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2439:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2443:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2444:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__05166);
            rule__Transition__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__05169);
            rule__Transition__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group__0


    // $ANTLR start rule__Transition__Group__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2451:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__Alternatives_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2455:1: ( ( ( rule__Transition__Alternatives_0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2456:1: ( ( rule__Transition__Alternatives_0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2456:1: ( ( rule__Transition__Alternatives_0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2457:1: ( rule__Transition__Alternatives_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2458:1: ( rule__Transition__Alternatives_0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2458:2: rule__Transition__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Transition__Alternatives_0_in_rule__Transition__Group__0__Impl5196);
            rule__Transition__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group__0__Impl


    // $ANTLR start rule__Transition__Group__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2468:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2472:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2473:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__15226);
            rule__Transition__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__15229);
            rule__Transition__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group__1


    // $ANTLR start rule__Transition__Group__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2480:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__Group_1__0 )? ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2484:1: ( ( ( rule__Transition__Group_1__0 )? ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2485:1: ( ( rule__Transition__Group_1__0 )? )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2485:1: ( ( rule__Transition__Group_1__0 )? )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2486:1: ( rule__Transition__Group_1__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_1()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2487:1: ( rule__Transition__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2487:2: rule__Transition__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Transition__Group_1__0_in_rule__Transition__Group__1__Impl5256);
                    rule__Transition__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group__1__Impl


    // $ANTLR start rule__Transition__Group__2
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2497:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2501:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2502:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__25287);
            rule__Transition__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__25290);
            rule__Transition__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group__2


    // $ANTLR start rule__Transition__Group__2__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2509:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__Group_2__0 )? ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2513:1: ( ( ( rule__Transition__Group_2__0 )? ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2514:1: ( ( rule__Transition__Group_2__0 )? )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2514:1: ( ( rule__Transition__Group_2__0 )? )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2515:1: ( rule__Transition__Group_2__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_2()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2516:1: ( rule__Transition__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2516:2: rule__Transition__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Transition__Group_2__0_in_rule__Transition__Group__2__Impl5317);
                    rule__Transition__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group__2__Impl


    // $ANTLR start rule__Transition__Group__3
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2526:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2530:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2531:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__35348);
            rule__Transition__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__35351);
            rule__Transition__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group__3


    // $ANTLR start rule__Transition__Group__3__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2538:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__Group_3__0 )? ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2542:1: ( ( ( rule__Transition__Group_3__0 )? ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2543:1: ( ( rule__Transition__Group_3__0 )? )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2543:1: ( ( rule__Transition__Group_3__0 )? )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2544:1: ( rule__Transition__Group_3__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_3()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2545:1: ( rule__Transition__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==30) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2545:2: rule__Transition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Transition__Group_3__0_in_rule__Transition__Group__3__Impl5378);
                    rule__Transition__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group__3__Impl


    // $ANTLR start rule__Transition__Group__4
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2555:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2559:1: ( rule__Transition__Group__4__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2560:2: rule__Transition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__45409);
            rule__Transition__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group__4


    // $ANTLR start rule__Transition__Group__4__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2566:1: rule__Transition__Group__4__Impl : ( ';' ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2570:1: ( ( ';' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2571:1: ( ';' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2571:1: ( ';' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2572:1: ';'
            {
             before(grammarAccess.getTransitionAccess().getSemicolonKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Transition__Group__4__Impl5437); 
             after(grammarAccess.getTransitionAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group__4__Impl


    // $ANTLR start rule__Transition__Group_0_0__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2595:1: rule__Transition__Group_0_0__0 : rule__Transition__Group_0_0__0__Impl rule__Transition__Group_0_0__1 ;
    public final void rule__Transition__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2599:1: ( rule__Transition__Group_0_0__0__Impl rule__Transition__Group_0_0__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2600:2: rule__Transition__Group_0_0__0__Impl rule__Transition__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__Transition__Group_0_0__0__Impl_in_rule__Transition__Group_0_0__05478);
            rule__Transition__Group_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_0_0__1_in_rule__Transition__Group_0_0__05481);
            rule__Transition__Group_0_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_0_0__0


    // $ANTLR start rule__Transition__Group_0_0__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2607:1: rule__Transition__Group_0_0__0__Impl : ( '->' ) ;
    public final void rule__Transition__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2611:1: ( ( '->' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2612:1: ( '->' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2612:1: ( '->' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2613:1: '->'
            {
             before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_0_0_0()); 
            match(input,29,FOLLOW_29_in_rule__Transition__Group_0_0__0__Impl5509); 
             after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_0_0__0__Impl


    // $ANTLR start rule__Transition__Group_0_0__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2626:1: rule__Transition__Group_0_0__1 : rule__Transition__Group_0_0__1__Impl ;
    public final void rule__Transition__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2630:1: ( rule__Transition__Group_0_0__1__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2631:2: rule__Transition__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group_0_0__1__Impl_in_rule__Transition__Group_0_0__15540);
            rule__Transition__Group_0_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_0_0__1


    // $ANTLR start rule__Transition__Group_0_0__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2637:1: rule__Transition__Group_0_0__1__Impl : ( ( rule__Transition__TargetAssignment_0_0_1 ) ) ;
    public final void rule__Transition__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2641:1: ( ( ( rule__Transition__TargetAssignment_0_0_1 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2642:1: ( ( rule__Transition__TargetAssignment_0_0_1 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2642:1: ( ( rule__Transition__TargetAssignment_0_0_1 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2643:1: ( rule__Transition__TargetAssignment_0_0_1 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_0_0_1()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2644:1: ( rule__Transition__TargetAssignment_0_0_1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2644:2: rule__Transition__TargetAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__Transition__TargetAssignment_0_0_1_in_rule__Transition__Group_0_0__1__Impl5567);
            rule__Transition__TargetAssignment_0_0_1();
            _fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTargetAssignment_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_0_0__1__Impl


    // $ANTLR start rule__Transition__Group_0_1__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2658:1: rule__Transition__Group_0_1__0 : rule__Transition__Group_0_1__0__Impl rule__Transition__Group_0_1__1 ;
    public final void rule__Transition__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2662:1: ( rule__Transition__Group_0_1__0__Impl rule__Transition__Group_0_1__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2663:2: rule__Transition__Group_0_1__0__Impl rule__Transition__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__Transition__Group_0_1__0__Impl_in_rule__Transition__Group_0_1__05601);
            rule__Transition__Group_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_0_1__1_in_rule__Transition__Group_0_1__05604);
            rule__Transition__Group_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_0_1__0


    // $ANTLR start rule__Transition__Group_0_1__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2670:1: rule__Transition__Group_0_1__0__Impl : ( ( rule__Transition__TargetAssignment_0_1_0 ) ) ;
    public final void rule__Transition__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2674:1: ( ( ( rule__Transition__TargetAssignment_0_1_0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2675:1: ( ( rule__Transition__TargetAssignment_0_1_0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2675:1: ( ( rule__Transition__TargetAssignment_0_1_0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2676:1: ( rule__Transition__TargetAssignment_0_1_0 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_0_1_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2677:1: ( rule__Transition__TargetAssignment_0_1_0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2677:2: rule__Transition__TargetAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__Transition__TargetAssignment_0_1_0_in_rule__Transition__Group_0_1__0__Impl5631);
            rule__Transition__TargetAssignment_0_1_0();
            _fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTargetAssignment_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_0_1__0__Impl


    // $ANTLR start rule__Transition__Group_0_1__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2687:1: rule__Transition__Group_0_1__1 : rule__Transition__Group_0_1__1__Impl ;
    public final void rule__Transition__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2691:1: ( rule__Transition__Group_0_1__1__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2692:2: rule__Transition__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group_0_1__1__Impl_in_rule__Transition__Group_0_1__15661);
            rule__Transition__Group_0_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_0_1__1


    // $ANTLR start rule__Transition__Group_0_1__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2698:1: rule__Transition__Group_0_1__1__Impl : ( '<-' ) ;
    public final void rule__Transition__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2702:1: ( ( '<-' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2703:1: ( '<-' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2703:1: ( '<-' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2704:1: '<-'
            {
             before(grammarAccess.getTransitionAccess().getLessThanSignHyphenMinusKeyword_0_1_1()); 
            match(input,31,FOLLOW_31_in_rule__Transition__Group_0_1__1__Impl5689); 
             after(grammarAccess.getTransitionAccess().getLessThanSignHyphenMinusKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_0_1__1__Impl


    // $ANTLR start rule__Transition__Group_1__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2721:1: rule__Transition__Group_1__0 : rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 ;
    public final void rule__Transition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2725:1: ( rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2726:2: rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Transition__Group_1__0__Impl_in_rule__Transition__Group_1__05724);
            rule__Transition__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_1__1_in_rule__Transition__Group_1__05727);
            rule__Transition__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_1__0


    // $ANTLR start rule__Transition__Group_1__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2733:1: rule__Transition__Group_1__0__Impl : ( 'on' ) ;
    public final void rule__Transition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2737:1: ( ( 'on' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2738:1: ( 'on' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2738:1: ( 'on' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2739:1: 'on'
            {
             before(grammarAccess.getTransitionAccess().getOnKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__Transition__Group_1__0__Impl5755); 
             after(grammarAccess.getTransitionAccess().getOnKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_1__0__Impl


    // $ANTLR start rule__Transition__Group_1__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2752:1: rule__Transition__Group_1__1 : rule__Transition__Group_1__1__Impl ;
    public final void rule__Transition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2756:1: ( rule__Transition__Group_1__1__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2757:2: rule__Transition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group_1__1__Impl_in_rule__Transition__Group_1__15786);
            rule__Transition__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_1__1


    // $ANTLR start rule__Transition__Group_1__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2763:1: rule__Transition__Group_1__1__Impl : ( ( rule__Transition__EventAssignment_1_1 ) ) ;
    public final void rule__Transition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2767:1: ( ( ( rule__Transition__EventAssignment_1_1 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2768:1: ( ( rule__Transition__EventAssignment_1_1 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2768:1: ( ( rule__Transition__EventAssignment_1_1 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2769:1: ( rule__Transition__EventAssignment_1_1 )
            {
             before(grammarAccess.getTransitionAccess().getEventAssignment_1_1()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2770:1: ( rule__Transition__EventAssignment_1_1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2770:2: rule__Transition__EventAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Transition__EventAssignment_1_1_in_rule__Transition__Group_1__1__Impl5813);
            rule__Transition__EventAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getTransitionAccess().getEventAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_1__1__Impl


    // $ANTLR start rule__Transition__Group_2__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2784:1: rule__Transition__Group_2__0 : rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 ;
    public final void rule__Transition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2788:1: ( rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2789:2: rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1
            {
            pushFollow(FOLLOW_rule__Transition__Group_2__0__Impl_in_rule__Transition__Group_2__05847);
            rule__Transition__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_2__1_in_rule__Transition__Group_2__05850);
            rule__Transition__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_2__0


    // $ANTLR start rule__Transition__Group_2__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2796:1: rule__Transition__Group_2__0__Impl : ( 'if' ) ;
    public final void rule__Transition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2800:1: ( ( 'if' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2801:1: ( 'if' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2801:1: ( 'if' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2802:1: 'if'
            {
             before(grammarAccess.getTransitionAccess().getIfKeyword_2_0()); 
            match(input,33,FOLLOW_33_in_rule__Transition__Group_2__0__Impl5878); 
             after(grammarAccess.getTransitionAccess().getIfKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_2__0__Impl


    // $ANTLR start rule__Transition__Group_2__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2815:1: rule__Transition__Group_2__1 : rule__Transition__Group_2__1__Impl ;
    public final void rule__Transition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2819:1: ( rule__Transition__Group_2__1__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2820:2: rule__Transition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group_2__1__Impl_in_rule__Transition__Group_2__15909);
            rule__Transition__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_2__1


    // $ANTLR start rule__Transition__Group_2__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2826:1: rule__Transition__Group_2__1__Impl : ( ( rule__Transition__ConditionAssignment_2_1 ) ) ;
    public final void rule__Transition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2830:1: ( ( ( rule__Transition__ConditionAssignment_2_1 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2831:1: ( ( rule__Transition__ConditionAssignment_2_1 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2831:1: ( ( rule__Transition__ConditionAssignment_2_1 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2832:1: ( rule__Transition__ConditionAssignment_2_1 )
            {
             before(grammarAccess.getTransitionAccess().getConditionAssignment_2_1()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2833:1: ( rule__Transition__ConditionAssignment_2_1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2833:2: rule__Transition__ConditionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Transition__ConditionAssignment_2_1_in_rule__Transition__Group_2__1__Impl5936);
            rule__Transition__ConditionAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getTransitionAccess().getConditionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_2__1__Impl


    // $ANTLR start rule__Transition__Group_3__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2847:1: rule__Transition__Group_3__0 : rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 ;
    public final void rule__Transition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2851:1: ( rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2852:2: rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1
            {
            pushFollow(FOLLOW_rule__Transition__Group_3__0__Impl_in_rule__Transition__Group_3__05970);
            rule__Transition__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_3__1_in_rule__Transition__Group_3__05973);
            rule__Transition__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_3__0


    // $ANTLR start rule__Transition__Group_3__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2859:1: rule__Transition__Group_3__0__Impl : ( 'do' ) ;
    public final void rule__Transition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2863:1: ( ( 'do' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2864:1: ( 'do' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2864:1: ( 'do' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2865:1: 'do'
            {
             before(grammarAccess.getTransitionAccess().getDoKeyword_3_0()); 
            match(input,30,FOLLOW_30_in_rule__Transition__Group_3__0__Impl6001); 
             after(grammarAccess.getTransitionAccess().getDoKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_3__0__Impl


    // $ANTLR start rule__Transition__Group_3__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2878:1: rule__Transition__Group_3__1 : rule__Transition__Group_3__1__Impl ;
    public final void rule__Transition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2882:1: ( rule__Transition__Group_3__1__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2883:2: rule__Transition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group_3__1__Impl_in_rule__Transition__Group_3__16032);
            rule__Transition__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_3__1


    // $ANTLR start rule__Transition__Group_3__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2889:1: rule__Transition__Group_3__1__Impl : ( ( rule__Transition__ActionAssignment_3_1 ) ) ;
    public final void rule__Transition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2893:1: ( ( ( rule__Transition__ActionAssignment_3_1 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2894:1: ( ( rule__Transition__ActionAssignment_3_1 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2894:1: ( ( rule__Transition__ActionAssignment_3_1 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2895:1: ( rule__Transition__ActionAssignment_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getActionAssignment_3_1()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2896:1: ( rule__Transition__ActionAssignment_3_1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2896:2: rule__Transition__ActionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Transition__ActionAssignment_3_1_in_rule__Transition__Group_3__1__Impl6059);
            rule__Transition__ActionAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getTransitionAccess().getActionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_3__1__Impl


    // $ANTLR start rule__InternalTransition__Group__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2910:1: rule__InternalTransition__Group__0 : rule__InternalTransition__Group__0__Impl rule__InternalTransition__Group__1 ;
    public final void rule__InternalTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2914:1: ( rule__InternalTransition__Group__0__Impl rule__InternalTransition__Group__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2915:2: rule__InternalTransition__Group__0__Impl rule__InternalTransition__Group__1
            {
            pushFollow(FOLLOW_rule__InternalTransition__Group__0__Impl_in_rule__InternalTransition__Group__06093);
            rule__InternalTransition__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InternalTransition__Group__1_in_rule__InternalTransition__Group__06096);
            rule__InternalTransition__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InternalTransition__Group__0


    // $ANTLR start rule__InternalTransition__Group__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2922:1: rule__InternalTransition__Group__0__Impl : ( ( rule__InternalTransition__Group_0__0 )? ) ;
    public final void rule__InternalTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2926:1: ( ( ( rule__InternalTransition__Group_0__0 )? ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2927:1: ( ( rule__InternalTransition__Group_0__0 )? )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2927:1: ( ( rule__InternalTransition__Group_0__0 )? )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2928:1: ( rule__InternalTransition__Group_0__0 )?
            {
             before(grammarAccess.getInternalTransitionAccess().getGroup_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2929:1: ( rule__InternalTransition__Group_0__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2929:2: rule__InternalTransition__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__InternalTransition__Group_0__0_in_rule__InternalTransition__Group__0__Impl6123);
                    rule__InternalTransition__Group_0__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInternalTransitionAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InternalTransition__Group__0__Impl


    // $ANTLR start rule__InternalTransition__Group__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2939:1: rule__InternalTransition__Group__1 : rule__InternalTransition__Group__1__Impl rule__InternalTransition__Group__2 ;
    public final void rule__InternalTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2943:1: ( rule__InternalTransition__Group__1__Impl rule__InternalTransition__Group__2 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2944:2: rule__InternalTransition__Group__1__Impl rule__InternalTransition__Group__2
            {
            pushFollow(FOLLOW_rule__InternalTransition__Group__1__Impl_in_rule__InternalTransition__Group__16154);
            rule__InternalTransition__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InternalTransition__Group__2_in_rule__InternalTransition__Group__16157);
            rule__InternalTransition__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InternalTransition__Group__1


    // $ANTLR start rule__InternalTransition__Group__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2951:1: rule__InternalTransition__Group__1__Impl : ( ( rule__InternalTransition__Group_1__0 )? ) ;
    public final void rule__InternalTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2955:1: ( ( ( rule__InternalTransition__Group_1__0 )? ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2956:1: ( ( rule__InternalTransition__Group_1__0 )? )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2956:1: ( ( rule__InternalTransition__Group_1__0 )? )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2957:1: ( rule__InternalTransition__Group_1__0 )?
            {
             before(grammarAccess.getInternalTransitionAccess().getGroup_1()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2958:1: ( rule__InternalTransition__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==33) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2958:2: rule__InternalTransition__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__InternalTransition__Group_1__0_in_rule__InternalTransition__Group__1__Impl6184);
                    rule__InternalTransition__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInternalTransitionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InternalTransition__Group__1__Impl


    // $ANTLR start rule__InternalTransition__Group__2
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2968:1: rule__InternalTransition__Group__2 : rule__InternalTransition__Group__2__Impl rule__InternalTransition__Group__3 ;
    public final void rule__InternalTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2972:1: ( rule__InternalTransition__Group__2__Impl rule__InternalTransition__Group__3 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2973:2: rule__InternalTransition__Group__2__Impl rule__InternalTransition__Group__3
            {
            pushFollow(FOLLOW_rule__InternalTransition__Group__2__Impl_in_rule__InternalTransition__Group__26215);
            rule__InternalTransition__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InternalTransition__Group__3_in_rule__InternalTransition__Group__26218);
            rule__InternalTransition__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InternalTransition__Group__2


    // $ANTLR start rule__InternalTransition__Group__2__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2980:1: rule__InternalTransition__Group__2__Impl : ( 'do' ) ;
    public final void rule__InternalTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2984:1: ( ( 'do' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2985:1: ( 'do' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2985:1: ( 'do' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2986:1: 'do'
            {
             before(grammarAccess.getInternalTransitionAccess().getDoKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__InternalTransition__Group__2__Impl6246); 
             after(grammarAccess.getInternalTransitionAccess().getDoKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InternalTransition__Group__2__Impl


    // $ANTLR start rule__InternalTransition__Group__3
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:2999:1: rule__InternalTransition__Group__3 : rule__InternalTransition__Group__3__Impl rule__InternalTransition__Group__4 ;
    public final void rule__InternalTransition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3003:1: ( rule__InternalTransition__Group__3__Impl rule__InternalTransition__Group__4 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3004:2: rule__InternalTransition__Group__3__Impl rule__InternalTransition__Group__4
            {
            pushFollow(FOLLOW_rule__InternalTransition__Group__3__Impl_in_rule__InternalTransition__Group__36277);
            rule__InternalTransition__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InternalTransition__Group__4_in_rule__InternalTransition__Group__36280);
            rule__InternalTransition__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InternalTransition__Group__3


    // $ANTLR start rule__InternalTransition__Group__3__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3011:1: rule__InternalTransition__Group__3__Impl : ( ( rule__InternalTransition__ActionAssignment_3 ) ) ;
    public final void rule__InternalTransition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3015:1: ( ( ( rule__InternalTransition__ActionAssignment_3 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3016:1: ( ( rule__InternalTransition__ActionAssignment_3 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3016:1: ( ( rule__InternalTransition__ActionAssignment_3 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3017:1: ( rule__InternalTransition__ActionAssignment_3 )
            {
             before(grammarAccess.getInternalTransitionAccess().getActionAssignment_3()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3018:1: ( rule__InternalTransition__ActionAssignment_3 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3018:2: rule__InternalTransition__ActionAssignment_3
            {
            pushFollow(FOLLOW_rule__InternalTransition__ActionAssignment_3_in_rule__InternalTransition__Group__3__Impl6307);
            rule__InternalTransition__ActionAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getInternalTransitionAccess().getActionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InternalTransition__Group__3__Impl


    // $ANTLR start rule__InternalTransition__Group__4
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3028:1: rule__InternalTransition__Group__4 : rule__InternalTransition__Group__4__Impl ;
    public final void rule__InternalTransition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3032:1: ( rule__InternalTransition__Group__4__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3033:2: rule__InternalTransition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__InternalTransition__Group__4__Impl_in_rule__InternalTransition__Group__46337);
            rule__InternalTransition__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InternalTransition__Group__4


    // $ANTLR start rule__InternalTransition__Group__4__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3039:1: rule__InternalTransition__Group__4__Impl : ( ';' ) ;
    public final void rule__InternalTransition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3043:1: ( ( ';' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3044:1: ( ';' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3044:1: ( ';' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3045:1: ';'
            {
             before(grammarAccess.getInternalTransitionAccess().getSemicolonKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__InternalTransition__Group__4__Impl6365); 
             after(grammarAccess.getInternalTransitionAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InternalTransition__Group__4__Impl


    // $ANTLR start rule__InternalTransition__Group_0__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3068:1: rule__InternalTransition__Group_0__0 : rule__InternalTransition__Group_0__0__Impl rule__InternalTransition__Group_0__1 ;
    public final void rule__InternalTransition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3072:1: ( rule__InternalTransition__Group_0__0__Impl rule__InternalTransition__Group_0__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3073:2: rule__InternalTransition__Group_0__0__Impl rule__InternalTransition__Group_0__1
            {
            pushFollow(FOLLOW_rule__InternalTransition__Group_0__0__Impl_in_rule__InternalTransition__Group_0__06406);
            rule__InternalTransition__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InternalTransition__Group_0__1_in_rule__InternalTransition__Group_0__06409);
            rule__InternalTransition__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InternalTransition__Group_0__0


    // $ANTLR start rule__InternalTransition__Group_0__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3080:1: rule__InternalTransition__Group_0__0__Impl : ( 'on' ) ;
    public final void rule__InternalTransition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3084:1: ( ( 'on' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3085:1: ( 'on' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3085:1: ( 'on' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3086:1: 'on'
            {
             before(grammarAccess.getInternalTransitionAccess().getOnKeyword_0_0()); 
            match(input,32,FOLLOW_32_in_rule__InternalTransition__Group_0__0__Impl6437); 
             after(grammarAccess.getInternalTransitionAccess().getOnKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InternalTransition__Group_0__0__Impl


    // $ANTLR start rule__InternalTransition__Group_0__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3099:1: rule__InternalTransition__Group_0__1 : rule__InternalTransition__Group_0__1__Impl ;
    public final void rule__InternalTransition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3103:1: ( rule__InternalTransition__Group_0__1__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3104:2: rule__InternalTransition__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__InternalTransition__Group_0__1__Impl_in_rule__InternalTransition__Group_0__16468);
            rule__InternalTransition__Group_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InternalTransition__Group_0__1


    // $ANTLR start rule__InternalTransition__Group_0__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3110:1: rule__InternalTransition__Group_0__1__Impl : ( ( rule__InternalTransition__EventAssignment_0_1 ) ) ;
    public final void rule__InternalTransition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3114:1: ( ( ( rule__InternalTransition__EventAssignment_0_1 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3115:1: ( ( rule__InternalTransition__EventAssignment_0_1 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3115:1: ( ( rule__InternalTransition__EventAssignment_0_1 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3116:1: ( rule__InternalTransition__EventAssignment_0_1 )
            {
             before(grammarAccess.getInternalTransitionAccess().getEventAssignment_0_1()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3117:1: ( rule__InternalTransition__EventAssignment_0_1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3117:2: rule__InternalTransition__EventAssignment_0_1
            {
            pushFollow(FOLLOW_rule__InternalTransition__EventAssignment_0_1_in_rule__InternalTransition__Group_0__1__Impl6495);
            rule__InternalTransition__EventAssignment_0_1();
            _fsp--;


            }

             after(grammarAccess.getInternalTransitionAccess().getEventAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InternalTransition__Group_0__1__Impl


    // $ANTLR start rule__InternalTransition__Group_1__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3131:1: rule__InternalTransition__Group_1__0 : rule__InternalTransition__Group_1__0__Impl rule__InternalTransition__Group_1__1 ;
    public final void rule__InternalTransition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3135:1: ( rule__InternalTransition__Group_1__0__Impl rule__InternalTransition__Group_1__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3136:2: rule__InternalTransition__Group_1__0__Impl rule__InternalTransition__Group_1__1
            {
            pushFollow(FOLLOW_rule__InternalTransition__Group_1__0__Impl_in_rule__InternalTransition__Group_1__06529);
            rule__InternalTransition__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InternalTransition__Group_1__1_in_rule__InternalTransition__Group_1__06532);
            rule__InternalTransition__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InternalTransition__Group_1__0


    // $ANTLR start rule__InternalTransition__Group_1__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3143:1: rule__InternalTransition__Group_1__0__Impl : ( 'if' ) ;
    public final void rule__InternalTransition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3147:1: ( ( 'if' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3148:1: ( 'if' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3148:1: ( 'if' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3149:1: 'if'
            {
             before(grammarAccess.getInternalTransitionAccess().getIfKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__InternalTransition__Group_1__0__Impl6560); 
             after(grammarAccess.getInternalTransitionAccess().getIfKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InternalTransition__Group_1__0__Impl


    // $ANTLR start rule__InternalTransition__Group_1__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3162:1: rule__InternalTransition__Group_1__1 : rule__InternalTransition__Group_1__1__Impl ;
    public final void rule__InternalTransition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3166:1: ( rule__InternalTransition__Group_1__1__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3167:2: rule__InternalTransition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__InternalTransition__Group_1__1__Impl_in_rule__InternalTransition__Group_1__16591);
            rule__InternalTransition__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InternalTransition__Group_1__1


    // $ANTLR start rule__InternalTransition__Group_1__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3173:1: rule__InternalTransition__Group_1__1__Impl : ( ( rule__InternalTransition__ConditionAssignment_1_1 ) ) ;
    public final void rule__InternalTransition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3177:1: ( ( ( rule__InternalTransition__ConditionAssignment_1_1 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3178:1: ( ( rule__InternalTransition__ConditionAssignment_1_1 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3178:1: ( ( rule__InternalTransition__ConditionAssignment_1_1 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3179:1: ( rule__InternalTransition__ConditionAssignment_1_1 )
            {
             before(grammarAccess.getInternalTransitionAccess().getConditionAssignment_1_1()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3180:1: ( rule__InternalTransition__ConditionAssignment_1_1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3180:2: rule__InternalTransition__ConditionAssignment_1_1
            {
            pushFollow(FOLLOW_rule__InternalTransition__ConditionAssignment_1_1_in_rule__InternalTransition__Group_1__1__Impl6618);
            rule__InternalTransition__ConditionAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getInternalTransitionAccess().getConditionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InternalTransition__Group_1__1__Impl


    // $ANTLR start rule__SymbolicEvent__Group__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3194:1: rule__SymbolicEvent__Group__0 : rule__SymbolicEvent__Group__0__Impl rule__SymbolicEvent__Group__1 ;
    public final void rule__SymbolicEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3198:1: ( rule__SymbolicEvent__Group__0__Impl rule__SymbolicEvent__Group__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3199:2: rule__SymbolicEvent__Group__0__Impl rule__SymbolicEvent__Group__1
            {
            pushFollow(FOLLOW_rule__SymbolicEvent__Group__0__Impl_in_rule__SymbolicEvent__Group__06652);
            rule__SymbolicEvent__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SymbolicEvent__Group__1_in_rule__SymbolicEvent__Group__06655);
            rule__SymbolicEvent__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SymbolicEvent__Group__0


    // $ANTLR start rule__SymbolicEvent__Group__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3206:1: rule__SymbolicEvent__Group__0__Impl : ( ( rule__SymbolicEvent__NameAssignment_0 ) ) ;
    public final void rule__SymbolicEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3210:1: ( ( ( rule__SymbolicEvent__NameAssignment_0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3211:1: ( ( rule__SymbolicEvent__NameAssignment_0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3211:1: ( ( rule__SymbolicEvent__NameAssignment_0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3212:1: ( rule__SymbolicEvent__NameAssignment_0 )
            {
             before(grammarAccess.getSymbolicEventAccess().getNameAssignment_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3213:1: ( rule__SymbolicEvent__NameAssignment_0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3213:2: rule__SymbolicEvent__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SymbolicEvent__NameAssignment_0_in_rule__SymbolicEvent__Group__0__Impl6682);
            rule__SymbolicEvent__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getSymbolicEventAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SymbolicEvent__Group__0__Impl


    // $ANTLR start rule__SymbolicEvent__Group__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3223:1: rule__SymbolicEvent__Group__1 : rule__SymbolicEvent__Group__1__Impl ;
    public final void rule__SymbolicEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3227:1: ( rule__SymbolicEvent__Group__1__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3228:2: rule__SymbolicEvent__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SymbolicEvent__Group__1__Impl_in_rule__SymbolicEvent__Group__16712);
            rule__SymbolicEvent__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SymbolicEvent__Group__1


    // $ANTLR start rule__SymbolicEvent__Group__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3234:1: rule__SymbolicEvent__Group__1__Impl : ( '!' ) ;
    public final void rule__SymbolicEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3238:1: ( ( '!' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3239:1: ( '!' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3239:1: ( '!' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3240:1: '!'
            {
             before(grammarAccess.getSymbolicEventAccess().getExclamationMarkKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__SymbolicEvent__Group__1__Impl6740); 
             after(grammarAccess.getSymbolicEventAccess().getExclamationMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SymbolicEvent__Group__1__Impl


    // $ANTLR start rule__TransitionEvent__Group_0_0__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3257:1: rule__TransitionEvent__Group_0_0__0 : rule__TransitionEvent__Group_0_0__0__Impl rule__TransitionEvent__Group_0_0__1 ;
    public final void rule__TransitionEvent__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3261:1: ( rule__TransitionEvent__Group_0_0__0__Impl rule__TransitionEvent__Group_0_0__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3262:2: rule__TransitionEvent__Group_0_0__0__Impl rule__TransitionEvent__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__TransitionEvent__Group_0_0__0__Impl_in_rule__TransitionEvent__Group_0_0__06775);
            rule__TransitionEvent__Group_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TransitionEvent__Group_0_0__1_in_rule__TransitionEvent__Group_0_0__06778);
            rule__TransitionEvent__Group_0_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Group_0_0__0


    // $ANTLR start rule__TransitionEvent__Group_0_0__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3269:1: rule__TransitionEvent__Group_0_0__0__Impl : ( ( rule__TransitionEvent__SourceAssignment_0_0_0 ) ) ;
    public final void rule__TransitionEvent__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3273:1: ( ( ( rule__TransitionEvent__SourceAssignment_0_0_0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3274:1: ( ( rule__TransitionEvent__SourceAssignment_0_0_0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3274:1: ( ( rule__TransitionEvent__SourceAssignment_0_0_0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3275:1: ( rule__TransitionEvent__SourceAssignment_0_0_0 )
            {
             before(grammarAccess.getTransitionEventAccess().getSourceAssignment_0_0_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3276:1: ( rule__TransitionEvent__SourceAssignment_0_0_0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3276:2: rule__TransitionEvent__SourceAssignment_0_0_0
            {
            pushFollow(FOLLOW_rule__TransitionEvent__SourceAssignment_0_0_0_in_rule__TransitionEvent__Group_0_0__0__Impl6805);
            rule__TransitionEvent__SourceAssignment_0_0_0();
            _fsp--;


            }

             after(grammarAccess.getTransitionEventAccess().getSourceAssignment_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Group_0_0__0__Impl


    // $ANTLR start rule__TransitionEvent__Group_0_0__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3286:1: rule__TransitionEvent__Group_0_0__1 : rule__TransitionEvent__Group_0_0__1__Impl rule__TransitionEvent__Group_0_0__2 ;
    public final void rule__TransitionEvent__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3290:1: ( rule__TransitionEvent__Group_0_0__1__Impl rule__TransitionEvent__Group_0_0__2 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3291:2: rule__TransitionEvent__Group_0_0__1__Impl rule__TransitionEvent__Group_0_0__2
            {
            pushFollow(FOLLOW_rule__TransitionEvent__Group_0_0__1__Impl_in_rule__TransitionEvent__Group_0_0__16835);
            rule__TransitionEvent__Group_0_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TransitionEvent__Group_0_0__2_in_rule__TransitionEvent__Group_0_0__16838);
            rule__TransitionEvent__Group_0_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Group_0_0__1


    // $ANTLR start rule__TransitionEvent__Group_0_0__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3298:1: rule__TransitionEvent__Group_0_0__1__Impl : ( '->' ) ;
    public final void rule__TransitionEvent__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3302:1: ( ( '->' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3303:1: ( '->' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3303:1: ( '->' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3304:1: '->'
            {
             before(grammarAccess.getTransitionEventAccess().getHyphenMinusGreaterThanSignKeyword_0_0_1()); 
            match(input,29,FOLLOW_29_in_rule__TransitionEvent__Group_0_0__1__Impl6866); 
             after(grammarAccess.getTransitionEventAccess().getHyphenMinusGreaterThanSignKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Group_0_0__1__Impl


    // $ANTLR start rule__TransitionEvent__Group_0_0__2
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3317:1: rule__TransitionEvent__Group_0_0__2 : rule__TransitionEvent__Group_0_0__2__Impl ;
    public final void rule__TransitionEvent__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3321:1: ( rule__TransitionEvent__Group_0_0__2__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3322:2: rule__TransitionEvent__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__TransitionEvent__Group_0_0__2__Impl_in_rule__TransitionEvent__Group_0_0__26897);
            rule__TransitionEvent__Group_0_0__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Group_0_0__2


    // $ANTLR start rule__TransitionEvent__Group_0_0__2__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3328:1: rule__TransitionEvent__Group_0_0__2__Impl : ( ( rule__TransitionEvent__TargetAssignment_0_0_2 ) ) ;
    public final void rule__TransitionEvent__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3332:1: ( ( ( rule__TransitionEvent__TargetAssignment_0_0_2 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3333:1: ( ( rule__TransitionEvent__TargetAssignment_0_0_2 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3333:1: ( ( rule__TransitionEvent__TargetAssignment_0_0_2 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3334:1: ( rule__TransitionEvent__TargetAssignment_0_0_2 )
            {
             before(grammarAccess.getTransitionEventAccess().getTargetAssignment_0_0_2()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3335:1: ( rule__TransitionEvent__TargetAssignment_0_0_2 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3335:2: rule__TransitionEvent__TargetAssignment_0_0_2
            {
            pushFollow(FOLLOW_rule__TransitionEvent__TargetAssignment_0_0_2_in_rule__TransitionEvent__Group_0_0__2__Impl6924);
            rule__TransitionEvent__TargetAssignment_0_0_2();
            _fsp--;


            }

             after(grammarAccess.getTransitionEventAccess().getTargetAssignment_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Group_0_0__2__Impl


    // $ANTLR start rule__TransitionEvent__Group_0_1__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3351:1: rule__TransitionEvent__Group_0_1__0 : rule__TransitionEvent__Group_0_1__0__Impl rule__TransitionEvent__Group_0_1__1 ;
    public final void rule__TransitionEvent__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3355:1: ( rule__TransitionEvent__Group_0_1__0__Impl rule__TransitionEvent__Group_0_1__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3356:2: rule__TransitionEvent__Group_0_1__0__Impl rule__TransitionEvent__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__TransitionEvent__Group_0_1__0__Impl_in_rule__TransitionEvent__Group_0_1__06960);
            rule__TransitionEvent__Group_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TransitionEvent__Group_0_1__1_in_rule__TransitionEvent__Group_0_1__06963);
            rule__TransitionEvent__Group_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Group_0_1__0


    // $ANTLR start rule__TransitionEvent__Group_0_1__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3363:1: rule__TransitionEvent__Group_0_1__0__Impl : ( ( rule__TransitionEvent__TargetAssignment_0_1_0 ) ) ;
    public final void rule__TransitionEvent__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3367:1: ( ( ( rule__TransitionEvent__TargetAssignment_0_1_0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3368:1: ( ( rule__TransitionEvent__TargetAssignment_0_1_0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3368:1: ( ( rule__TransitionEvent__TargetAssignment_0_1_0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3369:1: ( rule__TransitionEvent__TargetAssignment_0_1_0 )
            {
             before(grammarAccess.getTransitionEventAccess().getTargetAssignment_0_1_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3370:1: ( rule__TransitionEvent__TargetAssignment_0_1_0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3370:2: rule__TransitionEvent__TargetAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__TransitionEvent__TargetAssignment_0_1_0_in_rule__TransitionEvent__Group_0_1__0__Impl6990);
            rule__TransitionEvent__TargetAssignment_0_1_0();
            _fsp--;


            }

             after(grammarAccess.getTransitionEventAccess().getTargetAssignment_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Group_0_1__0__Impl


    // $ANTLR start rule__TransitionEvent__Group_0_1__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3380:1: rule__TransitionEvent__Group_0_1__1 : rule__TransitionEvent__Group_0_1__1__Impl rule__TransitionEvent__Group_0_1__2 ;
    public final void rule__TransitionEvent__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3384:1: ( rule__TransitionEvent__Group_0_1__1__Impl rule__TransitionEvent__Group_0_1__2 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3385:2: rule__TransitionEvent__Group_0_1__1__Impl rule__TransitionEvent__Group_0_1__2
            {
            pushFollow(FOLLOW_rule__TransitionEvent__Group_0_1__1__Impl_in_rule__TransitionEvent__Group_0_1__17020);
            rule__TransitionEvent__Group_0_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TransitionEvent__Group_0_1__2_in_rule__TransitionEvent__Group_0_1__17023);
            rule__TransitionEvent__Group_0_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Group_0_1__1


    // $ANTLR start rule__TransitionEvent__Group_0_1__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3392:1: rule__TransitionEvent__Group_0_1__1__Impl : ( '<-' ) ;
    public final void rule__TransitionEvent__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3396:1: ( ( '<-' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3397:1: ( '<-' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3397:1: ( '<-' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3398:1: '<-'
            {
             before(grammarAccess.getTransitionEventAccess().getLessThanSignHyphenMinusKeyword_0_1_1()); 
            match(input,31,FOLLOW_31_in_rule__TransitionEvent__Group_0_1__1__Impl7051); 
             after(grammarAccess.getTransitionEventAccess().getLessThanSignHyphenMinusKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Group_0_1__1__Impl


    // $ANTLR start rule__TransitionEvent__Group_0_1__2
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3411:1: rule__TransitionEvent__Group_0_1__2 : rule__TransitionEvent__Group_0_1__2__Impl ;
    public final void rule__TransitionEvent__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3415:1: ( rule__TransitionEvent__Group_0_1__2__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3416:2: rule__TransitionEvent__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TransitionEvent__Group_0_1__2__Impl_in_rule__TransitionEvent__Group_0_1__27082);
            rule__TransitionEvent__Group_0_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Group_0_1__2


    // $ANTLR start rule__TransitionEvent__Group_0_1__2__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3422:1: rule__TransitionEvent__Group_0_1__2__Impl : ( ( rule__TransitionEvent__SourceAssignment_0_1_2 ) ) ;
    public final void rule__TransitionEvent__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3426:1: ( ( ( rule__TransitionEvent__SourceAssignment_0_1_2 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3427:1: ( ( rule__TransitionEvent__SourceAssignment_0_1_2 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3427:1: ( ( rule__TransitionEvent__SourceAssignment_0_1_2 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3428:1: ( rule__TransitionEvent__SourceAssignment_0_1_2 )
            {
             before(grammarAccess.getTransitionEventAccess().getSourceAssignment_0_1_2()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3429:1: ( rule__TransitionEvent__SourceAssignment_0_1_2 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3429:2: rule__TransitionEvent__SourceAssignment_0_1_2
            {
            pushFollow(FOLLOW_rule__TransitionEvent__SourceAssignment_0_1_2_in_rule__TransitionEvent__Group_0_1__2__Impl7109);
            rule__TransitionEvent__SourceAssignment_0_1_2();
            _fsp--;


            }

             after(grammarAccess.getTransitionEventAccess().getSourceAssignment_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Group_0_1__2__Impl


    // $ANTLR start rule__TransitionEvent__Group_1_0__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3445:1: rule__TransitionEvent__Group_1_0__0 : rule__TransitionEvent__Group_1_0__0__Impl rule__TransitionEvent__Group_1_0__1 ;
    public final void rule__TransitionEvent__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3449:1: ( rule__TransitionEvent__Group_1_0__0__Impl rule__TransitionEvent__Group_1_0__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3450:2: rule__TransitionEvent__Group_1_0__0__Impl rule__TransitionEvent__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__TransitionEvent__Group_1_0__0__Impl_in_rule__TransitionEvent__Group_1_0__07145);
            rule__TransitionEvent__Group_1_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TransitionEvent__Group_1_0__1_in_rule__TransitionEvent__Group_1_0__07148);
            rule__TransitionEvent__Group_1_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Group_1_0__0


    // $ANTLR start rule__TransitionEvent__Group_1_0__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3457:1: rule__TransitionEvent__Group_1_0__0__Impl : ( '->' ) ;
    public final void rule__TransitionEvent__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3461:1: ( ( '->' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3462:1: ( '->' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3462:1: ( '->' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3463:1: '->'
            {
             before(grammarAccess.getTransitionEventAccess().getHyphenMinusGreaterThanSignKeyword_1_0_0()); 
            match(input,29,FOLLOW_29_in_rule__TransitionEvent__Group_1_0__0__Impl7176); 
             after(grammarAccess.getTransitionEventAccess().getHyphenMinusGreaterThanSignKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Group_1_0__0__Impl


    // $ANTLR start rule__TransitionEvent__Group_1_0__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3476:1: rule__TransitionEvent__Group_1_0__1 : rule__TransitionEvent__Group_1_0__1__Impl ;
    public final void rule__TransitionEvent__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3480:1: ( rule__TransitionEvent__Group_1_0__1__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3481:2: rule__TransitionEvent__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TransitionEvent__Group_1_0__1__Impl_in_rule__TransitionEvent__Group_1_0__17207);
            rule__TransitionEvent__Group_1_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Group_1_0__1


    // $ANTLR start rule__TransitionEvent__Group_1_0__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3487:1: rule__TransitionEvent__Group_1_0__1__Impl : ( ( rule__TransitionEvent__TargetAssignment_1_0_1 ) ) ;
    public final void rule__TransitionEvent__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3491:1: ( ( ( rule__TransitionEvent__TargetAssignment_1_0_1 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3492:1: ( ( rule__TransitionEvent__TargetAssignment_1_0_1 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3492:1: ( ( rule__TransitionEvent__TargetAssignment_1_0_1 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3493:1: ( rule__TransitionEvent__TargetAssignment_1_0_1 )
            {
             before(grammarAccess.getTransitionEventAccess().getTargetAssignment_1_0_1()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3494:1: ( rule__TransitionEvent__TargetAssignment_1_0_1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3494:2: rule__TransitionEvent__TargetAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__TransitionEvent__TargetAssignment_1_0_1_in_rule__TransitionEvent__Group_1_0__1__Impl7234);
            rule__TransitionEvent__TargetAssignment_1_0_1();
            _fsp--;


            }

             after(grammarAccess.getTransitionEventAccess().getTargetAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Group_1_0__1__Impl


    // $ANTLR start rule__TransitionEvent__Group_1_1__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3508:1: rule__TransitionEvent__Group_1_1__0 : rule__TransitionEvent__Group_1_1__0__Impl rule__TransitionEvent__Group_1_1__1 ;
    public final void rule__TransitionEvent__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3512:1: ( rule__TransitionEvent__Group_1_1__0__Impl rule__TransitionEvent__Group_1_1__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3513:2: rule__TransitionEvent__Group_1_1__0__Impl rule__TransitionEvent__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__TransitionEvent__Group_1_1__0__Impl_in_rule__TransitionEvent__Group_1_1__07268);
            rule__TransitionEvent__Group_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TransitionEvent__Group_1_1__1_in_rule__TransitionEvent__Group_1_1__07271);
            rule__TransitionEvent__Group_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Group_1_1__0


    // $ANTLR start rule__TransitionEvent__Group_1_1__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3520:1: rule__TransitionEvent__Group_1_1__0__Impl : ( ( rule__TransitionEvent__TargetAssignment_1_1_0 ) ) ;
    public final void rule__TransitionEvent__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3524:1: ( ( ( rule__TransitionEvent__TargetAssignment_1_1_0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3525:1: ( ( rule__TransitionEvent__TargetAssignment_1_1_0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3525:1: ( ( rule__TransitionEvent__TargetAssignment_1_1_0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3526:1: ( rule__TransitionEvent__TargetAssignment_1_1_0 )
            {
             before(grammarAccess.getTransitionEventAccess().getTargetAssignment_1_1_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3527:1: ( rule__TransitionEvent__TargetAssignment_1_1_0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3527:2: rule__TransitionEvent__TargetAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__TransitionEvent__TargetAssignment_1_1_0_in_rule__TransitionEvent__Group_1_1__0__Impl7298);
            rule__TransitionEvent__TargetAssignment_1_1_0();
            _fsp--;


            }

             after(grammarAccess.getTransitionEventAccess().getTargetAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Group_1_1__0__Impl


    // $ANTLR start rule__TransitionEvent__Group_1_1__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3537:1: rule__TransitionEvent__Group_1_1__1 : rule__TransitionEvent__Group_1_1__1__Impl ;
    public final void rule__TransitionEvent__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3541:1: ( rule__TransitionEvent__Group_1_1__1__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3542:2: rule__TransitionEvent__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TransitionEvent__Group_1_1__1__Impl_in_rule__TransitionEvent__Group_1_1__17328);
            rule__TransitionEvent__Group_1_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Group_1_1__1


    // $ANTLR start rule__TransitionEvent__Group_1_1__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3548:1: rule__TransitionEvent__Group_1_1__1__Impl : ( '<-' ) ;
    public final void rule__TransitionEvent__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3552:1: ( ( '<-' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3553:1: ( '<-' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3553:1: ( '<-' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3554:1: '<-'
            {
             before(grammarAccess.getTransitionEventAccess().getLessThanSignHyphenMinusKeyword_1_1_1()); 
            match(input,31,FOLLOW_31_in_rule__TransitionEvent__Group_1_1__1__Impl7356); 
             after(grammarAccess.getTransitionEventAccess().getLessThanSignHyphenMinusKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Group_1_1__1__Impl


    // $ANTLR start rule__TransitionEvent__Group_2_0__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3571:1: rule__TransitionEvent__Group_2_0__0 : rule__TransitionEvent__Group_2_0__0__Impl rule__TransitionEvent__Group_2_0__1 ;
    public final void rule__TransitionEvent__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3575:1: ( rule__TransitionEvent__Group_2_0__0__Impl rule__TransitionEvent__Group_2_0__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3576:2: rule__TransitionEvent__Group_2_0__0__Impl rule__TransitionEvent__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__TransitionEvent__Group_2_0__0__Impl_in_rule__TransitionEvent__Group_2_0__07391);
            rule__TransitionEvent__Group_2_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TransitionEvent__Group_2_0__1_in_rule__TransitionEvent__Group_2_0__07394);
            rule__TransitionEvent__Group_2_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Group_2_0__0


    // $ANTLR start rule__TransitionEvent__Group_2_0__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3583:1: rule__TransitionEvent__Group_2_0__0__Impl : ( ( rule__TransitionEvent__SourceAssignment_2_0_0 ) ) ;
    public final void rule__TransitionEvent__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3587:1: ( ( ( rule__TransitionEvent__SourceAssignment_2_0_0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3588:1: ( ( rule__TransitionEvent__SourceAssignment_2_0_0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3588:1: ( ( rule__TransitionEvent__SourceAssignment_2_0_0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3589:1: ( rule__TransitionEvent__SourceAssignment_2_0_0 )
            {
             before(grammarAccess.getTransitionEventAccess().getSourceAssignment_2_0_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3590:1: ( rule__TransitionEvent__SourceAssignment_2_0_0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3590:2: rule__TransitionEvent__SourceAssignment_2_0_0
            {
            pushFollow(FOLLOW_rule__TransitionEvent__SourceAssignment_2_0_0_in_rule__TransitionEvent__Group_2_0__0__Impl7421);
            rule__TransitionEvent__SourceAssignment_2_0_0();
            _fsp--;


            }

             after(grammarAccess.getTransitionEventAccess().getSourceAssignment_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Group_2_0__0__Impl


    // $ANTLR start rule__TransitionEvent__Group_2_0__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3600:1: rule__TransitionEvent__Group_2_0__1 : rule__TransitionEvent__Group_2_0__1__Impl ;
    public final void rule__TransitionEvent__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3604:1: ( rule__TransitionEvent__Group_2_0__1__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3605:2: rule__TransitionEvent__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TransitionEvent__Group_2_0__1__Impl_in_rule__TransitionEvent__Group_2_0__17451);
            rule__TransitionEvent__Group_2_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Group_2_0__1


    // $ANTLR start rule__TransitionEvent__Group_2_0__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3611:1: rule__TransitionEvent__Group_2_0__1__Impl : ( '->' ) ;
    public final void rule__TransitionEvent__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3615:1: ( ( '->' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3616:1: ( '->' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3616:1: ( '->' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3617:1: '->'
            {
             before(grammarAccess.getTransitionEventAccess().getHyphenMinusGreaterThanSignKeyword_2_0_1()); 
            match(input,29,FOLLOW_29_in_rule__TransitionEvent__Group_2_0__1__Impl7479); 
             after(grammarAccess.getTransitionEventAccess().getHyphenMinusGreaterThanSignKeyword_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Group_2_0__1__Impl


    // $ANTLR start rule__TransitionEvent__Group_2_1__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3634:1: rule__TransitionEvent__Group_2_1__0 : rule__TransitionEvent__Group_2_1__0__Impl rule__TransitionEvent__Group_2_1__1 ;
    public final void rule__TransitionEvent__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3638:1: ( rule__TransitionEvent__Group_2_1__0__Impl rule__TransitionEvent__Group_2_1__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3639:2: rule__TransitionEvent__Group_2_1__0__Impl rule__TransitionEvent__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__TransitionEvent__Group_2_1__0__Impl_in_rule__TransitionEvent__Group_2_1__07514);
            rule__TransitionEvent__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TransitionEvent__Group_2_1__1_in_rule__TransitionEvent__Group_2_1__07517);
            rule__TransitionEvent__Group_2_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Group_2_1__0


    // $ANTLR start rule__TransitionEvent__Group_2_1__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3646:1: rule__TransitionEvent__Group_2_1__0__Impl : ( '<-' ) ;
    public final void rule__TransitionEvent__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3650:1: ( ( '<-' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3651:1: ( '<-' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3651:1: ( '<-' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3652:1: '<-'
            {
             before(grammarAccess.getTransitionEventAccess().getLessThanSignHyphenMinusKeyword_2_1_0()); 
            match(input,31,FOLLOW_31_in_rule__TransitionEvent__Group_2_1__0__Impl7545); 
             after(grammarAccess.getTransitionEventAccess().getLessThanSignHyphenMinusKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Group_2_1__0__Impl


    // $ANTLR start rule__TransitionEvent__Group_2_1__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3665:1: rule__TransitionEvent__Group_2_1__1 : rule__TransitionEvent__Group_2_1__1__Impl ;
    public final void rule__TransitionEvent__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3669:1: ( rule__TransitionEvent__Group_2_1__1__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3670:2: rule__TransitionEvent__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TransitionEvent__Group_2_1__1__Impl_in_rule__TransitionEvent__Group_2_1__17576);
            rule__TransitionEvent__Group_2_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Group_2_1__1


    // $ANTLR start rule__TransitionEvent__Group_2_1__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3676:1: rule__TransitionEvent__Group_2_1__1__Impl : ( ( rule__TransitionEvent__SourceAssignment_2_1_1 ) ) ;
    public final void rule__TransitionEvent__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3680:1: ( ( ( rule__TransitionEvent__SourceAssignment_2_1_1 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3681:1: ( ( rule__TransitionEvent__SourceAssignment_2_1_1 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3681:1: ( ( rule__TransitionEvent__SourceAssignment_2_1_1 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3682:1: ( rule__TransitionEvent__SourceAssignment_2_1_1 )
            {
             before(grammarAccess.getTransitionEventAccess().getSourceAssignment_2_1_1()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3683:1: ( rule__TransitionEvent__SourceAssignment_2_1_1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3683:2: rule__TransitionEvent__SourceAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__TransitionEvent__SourceAssignment_2_1_1_in_rule__TransitionEvent__Group_2_1__1__Impl7603);
            rule__TransitionEvent__SourceAssignment_2_1_1();
            _fsp--;


            }

             after(grammarAccess.getTransitionEventAccess().getSourceAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__Group_2_1__1__Impl


    // $ANTLR start rule__EnterEvent__Group__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3697:1: rule__EnterEvent__Group__0 : rule__EnterEvent__Group__0__Impl rule__EnterEvent__Group__1 ;
    public final void rule__EnterEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3701:1: ( rule__EnterEvent__Group__0__Impl rule__EnterEvent__Group__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3702:2: rule__EnterEvent__Group__0__Impl rule__EnterEvent__Group__1
            {
            pushFollow(FOLLOW_rule__EnterEvent__Group__0__Impl_in_rule__EnterEvent__Group__07637);
            rule__EnterEvent__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnterEvent__Group__1_in_rule__EnterEvent__Group__07640);
            rule__EnterEvent__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnterEvent__Group__0


    // $ANTLR start rule__EnterEvent__Group__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3709:1: rule__EnterEvent__Group__0__Impl : ( () ) ;
    public final void rule__EnterEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3713:1: ( ( () ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3714:1: ( () )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3714:1: ( () )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3715:1: ()
            {
             before(grammarAccess.getEnterEventAccess().getEnterEventAction_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3716:1: ()
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3718:1: 
            {
            }

             after(grammarAccess.getEnterEventAccess().getEnterEventAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnterEvent__Group__0__Impl


    // $ANTLR start rule__EnterEvent__Group__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3728:1: rule__EnterEvent__Group__1 : rule__EnterEvent__Group__1__Impl ;
    public final void rule__EnterEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3732:1: ( rule__EnterEvent__Group__1__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3733:2: rule__EnterEvent__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EnterEvent__Group__1__Impl_in_rule__EnterEvent__Group__17698);
            rule__EnterEvent__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnterEvent__Group__1


    // $ANTLR start rule__EnterEvent__Group__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3739:1: rule__EnterEvent__Group__1__Impl : ( 'enter' ) ;
    public final void rule__EnterEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3743:1: ( ( 'enter' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3744:1: ( 'enter' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3744:1: ( 'enter' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3745:1: 'enter'
            {
             before(grammarAccess.getEnterEventAccess().getEnterKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__EnterEvent__Group__1__Impl7726); 
             after(grammarAccess.getEnterEventAccess().getEnterKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnterEvent__Group__1__Impl


    // $ANTLR start rule__ExitEvent__Group__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3762:1: rule__ExitEvent__Group__0 : rule__ExitEvent__Group__0__Impl rule__ExitEvent__Group__1 ;
    public final void rule__ExitEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3766:1: ( rule__ExitEvent__Group__0__Impl rule__ExitEvent__Group__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3767:2: rule__ExitEvent__Group__0__Impl rule__ExitEvent__Group__1
            {
            pushFollow(FOLLOW_rule__ExitEvent__Group__0__Impl_in_rule__ExitEvent__Group__07761);
            rule__ExitEvent__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ExitEvent__Group__1_in_rule__ExitEvent__Group__07764);
            rule__ExitEvent__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExitEvent__Group__0


    // $ANTLR start rule__ExitEvent__Group__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3774:1: rule__ExitEvent__Group__0__Impl : ( () ) ;
    public final void rule__ExitEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3778:1: ( ( () ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3779:1: ( () )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3779:1: ( () )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3780:1: ()
            {
             before(grammarAccess.getExitEventAccess().getExitEventAction_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3781:1: ()
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3783:1: 
            {
            }

             after(grammarAccess.getExitEventAccess().getExitEventAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExitEvent__Group__0__Impl


    // $ANTLR start rule__ExitEvent__Group__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3793:1: rule__ExitEvent__Group__1 : rule__ExitEvent__Group__1__Impl ;
    public final void rule__ExitEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3797:1: ( rule__ExitEvent__Group__1__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3798:2: rule__ExitEvent__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExitEvent__Group__1__Impl_in_rule__ExitEvent__Group__17822);
            rule__ExitEvent__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExitEvent__Group__1


    // $ANTLR start rule__ExitEvent__Group__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3804:1: rule__ExitEvent__Group__1__Impl : ( 'exit' ) ;
    public final void rule__ExitEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3808:1: ( ( 'exit' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3809:1: ( 'exit' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3809:1: ( 'exit' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3810:1: 'exit'
            {
             before(grammarAccess.getExitEventAccess().getExitKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__ExitEvent__Group__1__Impl7850); 
             after(grammarAccess.getExitEventAccess().getExitKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExitEvent__Group__1__Impl


    // $ANTLR start rule__TimerEvent__Group__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3827:1: rule__TimerEvent__Group__0 : rule__TimerEvent__Group__0__Impl rule__TimerEvent__Group__1 ;
    public final void rule__TimerEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3831:1: ( rule__TimerEvent__Group__0__Impl rule__TimerEvent__Group__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3832:2: rule__TimerEvent__Group__0__Impl rule__TimerEvent__Group__1
            {
            pushFollow(FOLLOW_rule__TimerEvent__Group__0__Impl_in_rule__TimerEvent__Group__07885);
            rule__TimerEvent__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TimerEvent__Group__1_in_rule__TimerEvent__Group__07888);
            rule__TimerEvent__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TimerEvent__Group__0


    // $ANTLR start rule__TimerEvent__Group__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3839:1: rule__TimerEvent__Group__0__Impl : ( 't' ) ;
    public final void rule__TimerEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3843:1: ( ( 't' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3844:1: ( 't' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3844:1: ( 't' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3845:1: 't'
            {
             before(grammarAccess.getTimerEventAccess().getTKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__TimerEvent__Group__0__Impl7916); 
             after(grammarAccess.getTimerEventAccess().getTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TimerEvent__Group__0__Impl


    // $ANTLR start rule__TimerEvent__Group__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3858:1: rule__TimerEvent__Group__1 : rule__TimerEvent__Group__1__Impl rule__TimerEvent__Group__2 ;
    public final void rule__TimerEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3862:1: ( rule__TimerEvent__Group__1__Impl rule__TimerEvent__Group__2 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3863:2: rule__TimerEvent__Group__1__Impl rule__TimerEvent__Group__2
            {
            pushFollow(FOLLOW_rule__TimerEvent__Group__1__Impl_in_rule__TimerEvent__Group__17947);
            rule__TimerEvent__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TimerEvent__Group__2_in_rule__TimerEvent__Group__17950);
            rule__TimerEvent__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TimerEvent__Group__1


    // $ANTLR start rule__TimerEvent__Group__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3870:1: rule__TimerEvent__Group__1__Impl : ( '>' ) ;
    public final void rule__TimerEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3874:1: ( ( '>' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3875:1: ( '>' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3875:1: ( '>' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3876:1: '>'
            {
             before(grammarAccess.getTimerEventAccess().getGreaterThanSignKeyword_1()); 
            match(input,38,FOLLOW_38_in_rule__TimerEvent__Group__1__Impl7978); 
             after(grammarAccess.getTimerEventAccess().getGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TimerEvent__Group__1__Impl


    // $ANTLR start rule__TimerEvent__Group__2
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3889:1: rule__TimerEvent__Group__2 : rule__TimerEvent__Group__2__Impl rule__TimerEvent__Group__3 ;
    public final void rule__TimerEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3893:1: ( rule__TimerEvent__Group__2__Impl rule__TimerEvent__Group__3 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3894:2: rule__TimerEvent__Group__2__Impl rule__TimerEvent__Group__3
            {
            pushFollow(FOLLOW_rule__TimerEvent__Group__2__Impl_in_rule__TimerEvent__Group__28009);
            rule__TimerEvent__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TimerEvent__Group__3_in_rule__TimerEvent__Group__28012);
            rule__TimerEvent__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TimerEvent__Group__2


    // $ANTLR start rule__TimerEvent__Group__2__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3901:1: rule__TimerEvent__Group__2__Impl : ( ( rule__TimerEvent__DelayAssignment_2 ) ) ;
    public final void rule__TimerEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3905:1: ( ( ( rule__TimerEvent__DelayAssignment_2 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3906:1: ( ( rule__TimerEvent__DelayAssignment_2 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3906:1: ( ( rule__TimerEvent__DelayAssignment_2 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3907:1: ( rule__TimerEvent__DelayAssignment_2 )
            {
             before(grammarAccess.getTimerEventAccess().getDelayAssignment_2()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3908:1: ( rule__TimerEvent__DelayAssignment_2 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3908:2: rule__TimerEvent__DelayAssignment_2
            {
            pushFollow(FOLLOW_rule__TimerEvent__DelayAssignment_2_in_rule__TimerEvent__Group__2__Impl8039);
            rule__TimerEvent__DelayAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getTimerEventAccess().getDelayAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TimerEvent__Group__2__Impl


    // $ANTLR start rule__TimerEvent__Group__3
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3918:1: rule__TimerEvent__Group__3 : rule__TimerEvent__Group__3__Impl rule__TimerEvent__Group__4 ;
    public final void rule__TimerEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3922:1: ( rule__TimerEvent__Group__3__Impl rule__TimerEvent__Group__4 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3923:2: rule__TimerEvent__Group__3__Impl rule__TimerEvent__Group__4
            {
            pushFollow(FOLLOW_rule__TimerEvent__Group__3__Impl_in_rule__TimerEvent__Group__38069);
            rule__TimerEvent__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TimerEvent__Group__4_in_rule__TimerEvent__Group__38072);
            rule__TimerEvent__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TimerEvent__Group__3


    // $ANTLR start rule__TimerEvent__Group__3__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3930:1: rule__TimerEvent__Group__3__Impl : ( 'after' ) ;
    public final void rule__TimerEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3934:1: ( ( 'after' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3935:1: ( 'after' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3935:1: ( 'after' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3936:1: 'after'
            {
             before(grammarAccess.getTimerEventAccess().getAfterKeyword_3()); 
            match(input,39,FOLLOW_39_in_rule__TimerEvent__Group__3__Impl8100); 
             after(grammarAccess.getTimerEventAccess().getAfterKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TimerEvent__Group__3__Impl


    // $ANTLR start rule__TimerEvent__Group__4
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3949:1: rule__TimerEvent__Group__4 : rule__TimerEvent__Group__4__Impl ;
    public final void rule__TimerEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3953:1: ( rule__TimerEvent__Group__4__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3954:2: rule__TimerEvent__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TimerEvent__Group__4__Impl_in_rule__TimerEvent__Group__48131);
            rule__TimerEvent__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TimerEvent__Group__4


    // $ANTLR start rule__TimerEvent__Group__4__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3960:1: rule__TimerEvent__Group__4__Impl : ( ( rule__TimerEvent__EventAssignment_4 ) ) ;
    public final void rule__TimerEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3964:1: ( ( ( rule__TimerEvent__EventAssignment_4 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3965:1: ( ( rule__TimerEvent__EventAssignment_4 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3965:1: ( ( rule__TimerEvent__EventAssignment_4 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3966:1: ( rule__TimerEvent__EventAssignment_4 )
            {
             before(grammarAccess.getTimerEventAccess().getEventAssignment_4()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3967:1: ( rule__TimerEvent__EventAssignment_4 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3967:2: rule__TimerEvent__EventAssignment_4
            {
            pushFollow(FOLLOW_rule__TimerEvent__EventAssignment_4_in_rule__TimerEvent__Group__4__Impl8158);
            rule__TimerEvent__EventAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getTimerEventAccess().getEventAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TimerEvent__Group__4__Impl


    // $ANTLR start rule__SymbolicAction__Group__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3987:1: rule__SymbolicAction__Group__0 : rule__SymbolicAction__Group__0__Impl rule__SymbolicAction__Group__1 ;
    public final void rule__SymbolicAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3991:1: ( rule__SymbolicAction__Group__0__Impl rule__SymbolicAction__Group__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3992:2: rule__SymbolicAction__Group__0__Impl rule__SymbolicAction__Group__1
            {
            pushFollow(FOLLOW_rule__SymbolicAction__Group__0__Impl_in_rule__SymbolicAction__Group__08198);
            rule__SymbolicAction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SymbolicAction__Group__1_in_rule__SymbolicAction__Group__08201);
            rule__SymbolicAction__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SymbolicAction__Group__0


    // $ANTLR start rule__SymbolicAction__Group__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:3999:1: rule__SymbolicAction__Group__0__Impl : ( ( rule__SymbolicAction__NameAssignment_0 ) ) ;
    public final void rule__SymbolicAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4003:1: ( ( ( rule__SymbolicAction__NameAssignment_0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4004:1: ( ( rule__SymbolicAction__NameAssignment_0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4004:1: ( ( rule__SymbolicAction__NameAssignment_0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4005:1: ( rule__SymbolicAction__NameAssignment_0 )
            {
             before(grammarAccess.getSymbolicActionAccess().getNameAssignment_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4006:1: ( rule__SymbolicAction__NameAssignment_0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4006:2: rule__SymbolicAction__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SymbolicAction__NameAssignment_0_in_rule__SymbolicAction__Group__0__Impl8228);
            rule__SymbolicAction__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getSymbolicActionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SymbolicAction__Group__0__Impl


    // $ANTLR start rule__SymbolicAction__Group__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4016:1: rule__SymbolicAction__Group__1 : rule__SymbolicAction__Group__1__Impl rule__SymbolicAction__Group__2 ;
    public final void rule__SymbolicAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4020:1: ( rule__SymbolicAction__Group__1__Impl rule__SymbolicAction__Group__2 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4021:2: rule__SymbolicAction__Group__1__Impl rule__SymbolicAction__Group__2
            {
            pushFollow(FOLLOW_rule__SymbolicAction__Group__1__Impl_in_rule__SymbolicAction__Group__18258);
            rule__SymbolicAction__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SymbolicAction__Group__2_in_rule__SymbolicAction__Group__18261);
            rule__SymbolicAction__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SymbolicAction__Group__1


    // $ANTLR start rule__SymbolicAction__Group__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4028:1: rule__SymbolicAction__Group__1__Impl : ( ( rule__SymbolicAction__Group_1__0 )? ) ;
    public final void rule__SymbolicAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4032:1: ( ( ( rule__SymbolicAction__Group_1__0 )? ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4033:1: ( ( rule__SymbolicAction__Group_1__0 )? )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4033:1: ( ( rule__SymbolicAction__Group_1__0 )? )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4034:1: ( rule__SymbolicAction__Group_1__0 )?
            {
             before(grammarAccess.getSymbolicActionAccess().getGroup_1()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4035:1: ( rule__SymbolicAction__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4035:2: rule__SymbolicAction__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SymbolicAction__Group_1__0_in_rule__SymbolicAction__Group__1__Impl8288);
                    rule__SymbolicAction__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSymbolicActionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SymbolicAction__Group__1__Impl


    // $ANTLR start rule__SymbolicAction__Group__2
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4045:1: rule__SymbolicAction__Group__2 : rule__SymbolicAction__Group__2__Impl ;
    public final void rule__SymbolicAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4049:1: ( rule__SymbolicAction__Group__2__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4050:2: rule__SymbolicAction__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SymbolicAction__Group__2__Impl_in_rule__SymbolicAction__Group__28319);
            rule__SymbolicAction__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SymbolicAction__Group__2


    // $ANTLR start rule__SymbolicAction__Group__2__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4056:1: rule__SymbolicAction__Group__2__Impl : ( '!' ) ;
    public final void rule__SymbolicAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4060:1: ( ( '!' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4061:1: ( '!' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4061:1: ( '!' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4062:1: '!'
            {
             before(grammarAccess.getSymbolicActionAccess().getExclamationMarkKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__SymbolicAction__Group__2__Impl8347); 
             after(grammarAccess.getSymbolicActionAccess().getExclamationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SymbolicAction__Group__2__Impl


    // $ANTLR start rule__SymbolicAction__Group_1__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4081:1: rule__SymbolicAction__Group_1__0 : rule__SymbolicAction__Group_1__0__Impl rule__SymbolicAction__Group_1__1 ;
    public final void rule__SymbolicAction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4085:1: ( rule__SymbolicAction__Group_1__0__Impl rule__SymbolicAction__Group_1__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4086:2: rule__SymbolicAction__Group_1__0__Impl rule__SymbolicAction__Group_1__1
            {
            pushFollow(FOLLOW_rule__SymbolicAction__Group_1__0__Impl_in_rule__SymbolicAction__Group_1__08384);
            rule__SymbolicAction__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SymbolicAction__Group_1__1_in_rule__SymbolicAction__Group_1__08387);
            rule__SymbolicAction__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SymbolicAction__Group_1__0


    // $ANTLR start rule__SymbolicAction__Group_1__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4093:1: rule__SymbolicAction__Group_1__0__Impl : ( 'after' ) ;
    public final void rule__SymbolicAction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4097:1: ( ( 'after' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4098:1: ( 'after' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4098:1: ( 'after' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4099:1: 'after'
            {
             before(grammarAccess.getSymbolicActionAccess().getAfterKeyword_1_0()); 
            match(input,39,FOLLOW_39_in_rule__SymbolicAction__Group_1__0__Impl8415); 
             after(grammarAccess.getSymbolicActionAccess().getAfterKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SymbolicAction__Group_1__0__Impl


    // $ANTLR start rule__SymbolicAction__Group_1__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4112:1: rule__SymbolicAction__Group_1__1 : rule__SymbolicAction__Group_1__1__Impl ;
    public final void rule__SymbolicAction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4116:1: ( rule__SymbolicAction__Group_1__1__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4117:2: rule__SymbolicAction__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SymbolicAction__Group_1__1__Impl_in_rule__SymbolicAction__Group_1__18446);
            rule__SymbolicAction__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SymbolicAction__Group_1__1


    // $ANTLR start rule__SymbolicAction__Group_1__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4123:1: rule__SymbolicAction__Group_1__1__Impl : ( ( rule__SymbolicAction__DelayAssignment_1_1 ) ) ;
    public final void rule__SymbolicAction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4127:1: ( ( ( rule__SymbolicAction__DelayAssignment_1_1 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4128:1: ( ( rule__SymbolicAction__DelayAssignment_1_1 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4128:1: ( ( rule__SymbolicAction__DelayAssignment_1_1 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4129:1: ( rule__SymbolicAction__DelayAssignment_1_1 )
            {
             before(grammarAccess.getSymbolicActionAccess().getDelayAssignment_1_1()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4130:1: ( rule__SymbolicAction__DelayAssignment_1_1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4130:2: rule__SymbolicAction__DelayAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SymbolicAction__DelayAssignment_1_1_in_rule__SymbolicAction__Group_1__1__Impl8473);
            rule__SymbolicAction__DelayAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getSymbolicActionAccess().getDelayAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SymbolicAction__Group_1__1__Impl


    // $ANTLR start rule__VarDef__Group__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4144:1: rule__VarDef__Group__0 : rule__VarDef__Group__0__Impl rule__VarDef__Group__1 ;
    public final void rule__VarDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4148:1: ( rule__VarDef__Group__0__Impl rule__VarDef__Group__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4149:2: rule__VarDef__Group__0__Impl rule__VarDef__Group__1
            {
            pushFollow(FOLLOW_rule__VarDef__Group__0__Impl_in_rule__VarDef__Group__08507);
            rule__VarDef__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDef__Group__1_in_rule__VarDef__Group__08510);
            rule__VarDef__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDef__Group__0


    // $ANTLR start rule__VarDef__Group__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4156:1: rule__VarDef__Group__0__Impl : ( 'var' ) ;
    public final void rule__VarDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4160:1: ( ( 'var' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4161:1: ( 'var' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4161:1: ( 'var' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4162:1: 'var'
            {
             before(grammarAccess.getVarDefAccess().getVarKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__VarDef__Group__0__Impl8538); 
             after(grammarAccess.getVarDefAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDef__Group__0__Impl


    // $ANTLR start rule__VarDef__Group__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4175:1: rule__VarDef__Group__1 : rule__VarDef__Group__1__Impl rule__VarDef__Group__2 ;
    public final void rule__VarDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4179:1: ( rule__VarDef__Group__1__Impl rule__VarDef__Group__2 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4180:2: rule__VarDef__Group__1__Impl rule__VarDef__Group__2
            {
            pushFollow(FOLLOW_rule__VarDef__Group__1__Impl_in_rule__VarDef__Group__18569);
            rule__VarDef__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDef__Group__2_in_rule__VarDef__Group__18572);
            rule__VarDef__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDef__Group__1


    // $ANTLR start rule__VarDef__Group__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4187:1: rule__VarDef__Group__1__Impl : ( ( rule__VarDef__NameAssignment_1 ) ) ;
    public final void rule__VarDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4191:1: ( ( ( rule__VarDef__NameAssignment_1 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4192:1: ( ( rule__VarDef__NameAssignment_1 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4192:1: ( ( rule__VarDef__NameAssignment_1 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4193:1: ( rule__VarDef__NameAssignment_1 )
            {
             before(grammarAccess.getVarDefAccess().getNameAssignment_1()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4194:1: ( rule__VarDef__NameAssignment_1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4194:2: rule__VarDef__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VarDef__NameAssignment_1_in_rule__VarDef__Group__1__Impl8599);
            rule__VarDef__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getVarDefAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDef__Group__1__Impl


    // $ANTLR start rule__VarDef__Group__2
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4204:1: rule__VarDef__Group__2 : rule__VarDef__Group__2__Impl rule__VarDef__Group__3 ;
    public final void rule__VarDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4208:1: ( rule__VarDef__Group__2__Impl rule__VarDef__Group__3 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4209:2: rule__VarDef__Group__2__Impl rule__VarDef__Group__3
            {
            pushFollow(FOLLOW_rule__VarDef__Group__2__Impl_in_rule__VarDef__Group__28629);
            rule__VarDef__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDef__Group__3_in_rule__VarDef__Group__28632);
            rule__VarDef__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDef__Group__2


    // $ANTLR start rule__VarDef__Group__2__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4216:1: rule__VarDef__Group__2__Impl : ( ( rule__VarDef__Group_2__0 )? ) ;
    public final void rule__VarDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4220:1: ( ( ( rule__VarDef__Group_2__0 )? ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4221:1: ( ( rule__VarDef__Group_2__0 )? )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4221:1: ( ( rule__VarDef__Group_2__0 )? )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4222:1: ( rule__VarDef__Group_2__0 )?
            {
             before(grammarAccess.getVarDefAccess().getGroup_2()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4223:1: ( rule__VarDef__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==41) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4223:2: rule__VarDef__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__VarDef__Group_2__0_in_rule__VarDef__Group__2__Impl8659);
                    rule__VarDef__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVarDefAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDef__Group__2__Impl


    // $ANTLR start rule__VarDef__Group__3
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4233:1: rule__VarDef__Group__3 : rule__VarDef__Group__3__Impl rule__VarDef__Group__4 ;
    public final void rule__VarDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4237:1: ( rule__VarDef__Group__3__Impl rule__VarDef__Group__4 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4238:2: rule__VarDef__Group__3__Impl rule__VarDef__Group__4
            {
            pushFollow(FOLLOW_rule__VarDef__Group__3__Impl_in_rule__VarDef__Group__38690);
            rule__VarDef__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDef__Group__4_in_rule__VarDef__Group__38693);
            rule__VarDef__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDef__Group__3


    // $ANTLR start rule__VarDef__Group__3__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4245:1: rule__VarDef__Group__3__Impl : ( ( rule__VarDef__Group_3__0 )? ) ;
    public final void rule__VarDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4249:1: ( ( ( rule__VarDef__Group_3__0 )? ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4250:1: ( ( rule__VarDef__Group_3__0 )? )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4250:1: ( ( rule__VarDef__Group_3__0 )? )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4251:1: ( rule__VarDef__Group_3__0 )?
            {
             before(grammarAccess.getVarDefAccess().getGroup_3()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4252:1: ( rule__VarDef__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==42) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4252:2: rule__VarDef__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__VarDef__Group_3__0_in_rule__VarDef__Group__3__Impl8720);
                    rule__VarDef__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVarDefAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDef__Group__3__Impl


    // $ANTLR start rule__VarDef__Group__4
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4262:1: rule__VarDef__Group__4 : rule__VarDef__Group__4__Impl ;
    public final void rule__VarDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4266:1: ( rule__VarDef__Group__4__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4267:2: rule__VarDef__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__VarDef__Group__4__Impl_in_rule__VarDef__Group__48751);
            rule__VarDef__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDef__Group__4


    // $ANTLR start rule__VarDef__Group__4__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4273:1: rule__VarDef__Group__4__Impl : ( ';' ) ;
    public final void rule__VarDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4277:1: ( ( ';' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4278:1: ( ';' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4278:1: ( ';' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4279:1: ';'
            {
             before(grammarAccess.getVarDefAccess().getSemicolonKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__VarDef__Group__4__Impl8779); 
             after(grammarAccess.getVarDefAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDef__Group__4__Impl


    // $ANTLR start rule__VarDef__Group_2__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4302:1: rule__VarDef__Group_2__0 : rule__VarDef__Group_2__0__Impl rule__VarDef__Group_2__1 ;
    public final void rule__VarDef__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4306:1: ( rule__VarDef__Group_2__0__Impl rule__VarDef__Group_2__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4307:2: rule__VarDef__Group_2__0__Impl rule__VarDef__Group_2__1
            {
            pushFollow(FOLLOW_rule__VarDef__Group_2__0__Impl_in_rule__VarDef__Group_2__08820);
            rule__VarDef__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDef__Group_2__1_in_rule__VarDef__Group_2__08823);
            rule__VarDef__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDef__Group_2__0


    // $ANTLR start rule__VarDef__Group_2__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4314:1: rule__VarDef__Group_2__0__Impl : ( ':' ) ;
    public final void rule__VarDef__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4318:1: ( ( ':' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4319:1: ( ':' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4319:1: ( ':' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4320:1: ':'
            {
             before(grammarAccess.getVarDefAccess().getColonKeyword_2_0()); 
            match(input,41,FOLLOW_41_in_rule__VarDef__Group_2__0__Impl8851); 
             after(grammarAccess.getVarDefAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDef__Group_2__0__Impl


    // $ANTLR start rule__VarDef__Group_2__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4333:1: rule__VarDef__Group_2__1 : rule__VarDef__Group_2__1__Impl rule__VarDef__Group_2__2 ;
    public final void rule__VarDef__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4337:1: ( rule__VarDef__Group_2__1__Impl rule__VarDef__Group_2__2 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4338:2: rule__VarDef__Group_2__1__Impl rule__VarDef__Group_2__2
            {
            pushFollow(FOLLOW_rule__VarDef__Group_2__1__Impl_in_rule__VarDef__Group_2__18882);
            rule__VarDef__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDef__Group_2__2_in_rule__VarDef__Group_2__18885);
            rule__VarDef__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDef__Group_2__1


    // $ANTLR start rule__VarDef__Group_2__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4345:1: rule__VarDef__Group_2__1__Impl : ( ( rule__VarDef__ETypeAssignment_2_1 ) ) ;
    public final void rule__VarDef__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4349:1: ( ( ( rule__VarDef__ETypeAssignment_2_1 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4350:1: ( ( rule__VarDef__ETypeAssignment_2_1 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4350:1: ( ( rule__VarDef__ETypeAssignment_2_1 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4351:1: ( rule__VarDef__ETypeAssignment_2_1 )
            {
             before(grammarAccess.getVarDefAccess().getETypeAssignment_2_1()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4352:1: ( rule__VarDef__ETypeAssignment_2_1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4352:2: rule__VarDef__ETypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__VarDef__ETypeAssignment_2_1_in_rule__VarDef__Group_2__1__Impl8912);
            rule__VarDef__ETypeAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getVarDefAccess().getETypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDef__Group_2__1__Impl


    // $ANTLR start rule__VarDef__Group_2__2
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4362:1: rule__VarDef__Group_2__2 : rule__VarDef__Group_2__2__Impl ;
    public final void rule__VarDef__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4366:1: ( rule__VarDef__Group_2__2__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4367:2: rule__VarDef__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__VarDef__Group_2__2__Impl_in_rule__VarDef__Group_2__28942);
            rule__VarDef__Group_2__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDef__Group_2__2


    // $ANTLR start rule__VarDef__Group_2__2__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4373:1: rule__VarDef__Group_2__2__Impl : ( ( rule__VarDef__ManyAssignment_2_2 )? ) ;
    public final void rule__VarDef__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4377:1: ( ( ( rule__VarDef__ManyAssignment_2_2 )? ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4378:1: ( ( rule__VarDef__ManyAssignment_2_2 )? )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4378:1: ( ( rule__VarDef__ManyAssignment_2_2 )? )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4379:1: ( rule__VarDef__ManyAssignment_2_2 )?
            {
             before(grammarAccess.getVarDefAccess().getManyAssignment_2_2()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4380:1: ( rule__VarDef__ManyAssignment_2_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=16 && LA35_0<=17)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4380:2: rule__VarDef__ManyAssignment_2_2
                    {
                    pushFollow(FOLLOW_rule__VarDef__ManyAssignment_2_2_in_rule__VarDef__Group_2__2__Impl8969);
                    rule__VarDef__ManyAssignment_2_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVarDefAccess().getManyAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDef__Group_2__2__Impl


    // $ANTLR start rule__VarDef__Group_3__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4396:1: rule__VarDef__Group_3__0 : rule__VarDef__Group_3__0__Impl rule__VarDef__Group_3__1 ;
    public final void rule__VarDef__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4400:1: ( rule__VarDef__Group_3__0__Impl rule__VarDef__Group_3__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4401:2: rule__VarDef__Group_3__0__Impl rule__VarDef__Group_3__1
            {
            pushFollow(FOLLOW_rule__VarDef__Group_3__0__Impl_in_rule__VarDef__Group_3__09006);
            rule__VarDef__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDef__Group_3__1_in_rule__VarDef__Group_3__09009);
            rule__VarDef__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDef__Group_3__0


    // $ANTLR start rule__VarDef__Group_3__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4408:1: rule__VarDef__Group_3__0__Impl : ( '=' ) ;
    public final void rule__VarDef__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4412:1: ( ( '=' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4413:1: ( '=' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4413:1: ( '=' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4414:1: '='
            {
             before(grammarAccess.getVarDefAccess().getEqualsSignKeyword_3_0()); 
            match(input,42,FOLLOW_42_in_rule__VarDef__Group_3__0__Impl9037); 
             after(grammarAccess.getVarDefAccess().getEqualsSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDef__Group_3__0__Impl


    // $ANTLR start rule__VarDef__Group_3__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4427:1: rule__VarDef__Group_3__1 : rule__VarDef__Group_3__1__Impl ;
    public final void rule__VarDef__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4431:1: ( rule__VarDef__Group_3__1__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4432:2: rule__VarDef__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__VarDef__Group_3__1__Impl_in_rule__VarDef__Group_3__19068);
            rule__VarDef__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDef__Group_3__1


    // $ANTLR start rule__VarDef__Group_3__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4438:1: rule__VarDef__Group_3__1__Impl : ( ( rule__VarDef__InitAssignment_3_1 ) ) ;
    public final void rule__VarDef__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4442:1: ( ( ( rule__VarDef__InitAssignment_3_1 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4443:1: ( ( rule__VarDef__InitAssignment_3_1 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4443:1: ( ( rule__VarDef__InitAssignment_3_1 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4444:1: ( rule__VarDef__InitAssignment_3_1 )
            {
             before(grammarAccess.getVarDefAccess().getInitAssignment_3_1()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4445:1: ( rule__VarDef__InitAssignment_3_1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4445:2: rule__VarDef__InitAssignment_3_1
            {
            pushFollow(FOLLOW_rule__VarDef__InitAssignment_3_1_in_rule__VarDef__Group_3__1__Impl9095);
            rule__VarDef__InitAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getVarDefAccess().getInitAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDef__Group_3__1__Impl


    // $ANTLR start rule__AssignmentAction__Group__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4459:1: rule__AssignmentAction__Group__0 : rule__AssignmentAction__Group__0__Impl rule__AssignmentAction__Group__1 ;
    public final void rule__AssignmentAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4463:1: ( rule__AssignmentAction__Group__0__Impl rule__AssignmentAction__Group__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4464:2: rule__AssignmentAction__Group__0__Impl rule__AssignmentAction__Group__1
            {
            pushFollow(FOLLOW_rule__AssignmentAction__Group__0__Impl_in_rule__AssignmentAction__Group__09129);
            rule__AssignmentAction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignmentAction__Group__1_in_rule__AssignmentAction__Group__09132);
            rule__AssignmentAction__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentAction__Group__0


    // $ANTLR start rule__AssignmentAction__Group__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4471:1: rule__AssignmentAction__Group__0__Impl : ( ( rule__AssignmentAction__VarAssignment_0 ) ) ;
    public final void rule__AssignmentAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4475:1: ( ( ( rule__AssignmentAction__VarAssignment_0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4476:1: ( ( rule__AssignmentAction__VarAssignment_0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4476:1: ( ( rule__AssignmentAction__VarAssignment_0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4477:1: ( rule__AssignmentAction__VarAssignment_0 )
            {
             before(grammarAccess.getAssignmentActionAccess().getVarAssignment_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4478:1: ( rule__AssignmentAction__VarAssignment_0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4478:2: rule__AssignmentAction__VarAssignment_0
            {
            pushFollow(FOLLOW_rule__AssignmentAction__VarAssignment_0_in_rule__AssignmentAction__Group__0__Impl9159);
            rule__AssignmentAction__VarAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAssignmentActionAccess().getVarAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentAction__Group__0__Impl


    // $ANTLR start rule__AssignmentAction__Group__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4488:1: rule__AssignmentAction__Group__1 : rule__AssignmentAction__Group__1__Impl rule__AssignmentAction__Group__2 ;
    public final void rule__AssignmentAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4492:1: ( rule__AssignmentAction__Group__1__Impl rule__AssignmentAction__Group__2 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4493:2: rule__AssignmentAction__Group__1__Impl rule__AssignmentAction__Group__2
            {
            pushFollow(FOLLOW_rule__AssignmentAction__Group__1__Impl_in_rule__AssignmentAction__Group__19189);
            rule__AssignmentAction__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignmentAction__Group__2_in_rule__AssignmentAction__Group__19192);
            rule__AssignmentAction__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentAction__Group__1


    // $ANTLR start rule__AssignmentAction__Group__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4500:1: rule__AssignmentAction__Group__1__Impl : ( '=' ) ;
    public final void rule__AssignmentAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4504:1: ( ( '=' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4505:1: ( '=' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4505:1: ( '=' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4506:1: '='
            {
             before(grammarAccess.getAssignmentActionAccess().getEqualsSignKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__AssignmentAction__Group__1__Impl9220); 
             after(grammarAccess.getAssignmentActionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentAction__Group__1__Impl


    // $ANTLR start rule__AssignmentAction__Group__2
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4519:1: rule__AssignmentAction__Group__2 : rule__AssignmentAction__Group__2__Impl ;
    public final void rule__AssignmentAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4523:1: ( rule__AssignmentAction__Group__2__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4524:2: rule__AssignmentAction__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AssignmentAction__Group__2__Impl_in_rule__AssignmentAction__Group__29251);
            rule__AssignmentAction__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentAction__Group__2


    // $ANTLR start rule__AssignmentAction__Group__2__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4530:1: rule__AssignmentAction__Group__2__Impl : ( ( rule__AssignmentAction__ValueAssignment_2 ) ) ;
    public final void rule__AssignmentAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4534:1: ( ( ( rule__AssignmentAction__ValueAssignment_2 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4535:1: ( ( rule__AssignmentAction__ValueAssignment_2 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4535:1: ( ( rule__AssignmentAction__ValueAssignment_2 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4536:1: ( rule__AssignmentAction__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentActionAccess().getValueAssignment_2()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4537:1: ( rule__AssignmentAction__ValueAssignment_2 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4537:2: rule__AssignmentAction__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__AssignmentAction__ValueAssignment_2_in_rule__AssignmentAction__Group__2__Impl9278);
            rule__AssignmentAction__ValueAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAssignmentActionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentAction__Group__2__Impl


    // $ANTLR start rule__FLOAT_LITERAL__Group__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4553:1: rule__FLOAT_LITERAL__Group__0 : rule__FLOAT_LITERAL__Group__0__Impl rule__FLOAT_LITERAL__Group__1 ;
    public final void rule__FLOAT_LITERAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4557:1: ( rule__FLOAT_LITERAL__Group__0__Impl rule__FLOAT_LITERAL__Group__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4558:2: rule__FLOAT_LITERAL__Group__0__Impl rule__FLOAT_LITERAL__Group__1
            {
            pushFollow(FOLLOW_rule__FLOAT_LITERAL__Group__0__Impl_in_rule__FLOAT_LITERAL__Group__09314);
            rule__FLOAT_LITERAL__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FLOAT_LITERAL__Group__1_in_rule__FLOAT_LITERAL__Group__09317);
            rule__FLOAT_LITERAL__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FLOAT_LITERAL__Group__0


    // $ANTLR start rule__FLOAT_LITERAL__Group__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4565:1: rule__FLOAT_LITERAL__Group__0__Impl : ( ( rule__FLOAT_LITERAL__Alternatives_0 ) ) ;
    public final void rule__FLOAT_LITERAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4569:1: ( ( ( rule__FLOAT_LITERAL__Alternatives_0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4570:1: ( ( rule__FLOAT_LITERAL__Alternatives_0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4570:1: ( ( rule__FLOAT_LITERAL__Alternatives_0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4571:1: ( rule__FLOAT_LITERAL__Alternatives_0 )
            {
             before(grammarAccess.getFLOAT_LITERALAccess().getAlternatives_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4572:1: ( rule__FLOAT_LITERAL__Alternatives_0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4572:2: rule__FLOAT_LITERAL__Alternatives_0
            {
            pushFollow(FOLLOW_rule__FLOAT_LITERAL__Alternatives_0_in_rule__FLOAT_LITERAL__Group__0__Impl9344);
            rule__FLOAT_LITERAL__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getFLOAT_LITERALAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FLOAT_LITERAL__Group__0__Impl


    // $ANTLR start rule__FLOAT_LITERAL__Group__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4582:1: rule__FLOAT_LITERAL__Group__1 : rule__FLOAT_LITERAL__Group__1__Impl rule__FLOAT_LITERAL__Group__2 ;
    public final void rule__FLOAT_LITERAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4586:1: ( rule__FLOAT_LITERAL__Group__1__Impl rule__FLOAT_LITERAL__Group__2 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4587:2: rule__FLOAT_LITERAL__Group__1__Impl rule__FLOAT_LITERAL__Group__2
            {
            pushFollow(FOLLOW_rule__FLOAT_LITERAL__Group__1__Impl_in_rule__FLOAT_LITERAL__Group__19374);
            rule__FLOAT_LITERAL__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FLOAT_LITERAL__Group__2_in_rule__FLOAT_LITERAL__Group__19377);
            rule__FLOAT_LITERAL__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FLOAT_LITERAL__Group__1


    // $ANTLR start rule__FLOAT_LITERAL__Group__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4594:1: rule__FLOAT_LITERAL__Group__1__Impl : ( '.' ) ;
    public final void rule__FLOAT_LITERAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4598:1: ( ( '.' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4599:1: ( '.' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4599:1: ( '.' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4600:1: '.'
            {
             before(grammarAccess.getFLOAT_LITERALAccess().getFullStopKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__FLOAT_LITERAL__Group__1__Impl9405); 
             after(grammarAccess.getFLOAT_LITERALAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FLOAT_LITERAL__Group__1__Impl


    // $ANTLR start rule__FLOAT_LITERAL__Group__2
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4613:1: rule__FLOAT_LITERAL__Group__2 : rule__FLOAT_LITERAL__Group__2__Impl ;
    public final void rule__FLOAT_LITERAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4617:1: ( rule__FLOAT_LITERAL__Group__2__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4618:2: rule__FLOAT_LITERAL__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FLOAT_LITERAL__Group__2__Impl_in_rule__FLOAT_LITERAL__Group__29436);
            rule__FLOAT_LITERAL__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FLOAT_LITERAL__Group__2


    // $ANTLR start rule__FLOAT_LITERAL__Group__2__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4624:1: rule__FLOAT_LITERAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT_LITERAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4628:1: ( ( RULE_INT ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4629:1: ( RULE_INT )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4629:1: ( RULE_INT )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4630:1: RULE_INT
            {
             before(grammarAccess.getFLOAT_LITERALAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FLOAT_LITERAL__Group__2__Impl9463); 
             after(grammarAccess.getFLOAT_LITERALAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FLOAT_LITERAL__Group__2__Impl


    // $ANTLR start rule__POS_INT__Group__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4647:1: rule__POS_INT__Group__0 : rule__POS_INT__Group__0__Impl rule__POS_INT__Group__1 ;
    public final void rule__POS_INT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4651:1: ( rule__POS_INT__Group__0__Impl rule__POS_INT__Group__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4652:2: rule__POS_INT__Group__0__Impl rule__POS_INT__Group__1
            {
            pushFollow(FOLLOW_rule__POS_INT__Group__0__Impl_in_rule__POS_INT__Group__09498);
            rule__POS_INT__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__POS_INT__Group__1_in_rule__POS_INT__Group__09501);
            rule__POS_INT__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__POS_INT__Group__0


    // $ANTLR start rule__POS_INT__Group__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4659:1: rule__POS_INT__Group__0__Impl : ( '+' ) ;
    public final void rule__POS_INT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4663:1: ( ( '+' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4664:1: ( '+' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4664:1: ( '+' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4665:1: '+'
            {
             before(grammarAccess.getPOS_INTAccess().getPlusSignKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__POS_INT__Group__0__Impl9529); 
             after(grammarAccess.getPOS_INTAccess().getPlusSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__POS_INT__Group__0__Impl


    // $ANTLR start rule__POS_INT__Group__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4678:1: rule__POS_INT__Group__1 : rule__POS_INT__Group__1__Impl ;
    public final void rule__POS_INT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4682:1: ( rule__POS_INT__Group__1__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4683:2: rule__POS_INT__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__POS_INT__Group__1__Impl_in_rule__POS_INT__Group__19560);
            rule__POS_INT__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__POS_INT__Group__1


    // $ANTLR start rule__POS_INT__Group__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4689:1: rule__POS_INT__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__POS_INT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4693:1: ( ( RULE_INT ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4694:1: ( RULE_INT )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4694:1: ( RULE_INT )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4695:1: RULE_INT
            {
             before(grammarAccess.getPOS_INTAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__POS_INT__Group__1__Impl9587); 
             after(grammarAccess.getPOS_INTAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__POS_INT__Group__1__Impl


    // $ANTLR start rule__NEG_INT__Group__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4710:1: rule__NEG_INT__Group__0 : rule__NEG_INT__Group__0__Impl rule__NEG_INT__Group__1 ;
    public final void rule__NEG_INT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4714:1: ( rule__NEG_INT__Group__0__Impl rule__NEG_INT__Group__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4715:2: rule__NEG_INT__Group__0__Impl rule__NEG_INT__Group__1
            {
            pushFollow(FOLLOW_rule__NEG_INT__Group__0__Impl_in_rule__NEG_INT__Group__09620);
            rule__NEG_INT__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NEG_INT__Group__1_in_rule__NEG_INT__Group__09623);
            rule__NEG_INT__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NEG_INT__Group__0


    // $ANTLR start rule__NEG_INT__Group__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4722:1: rule__NEG_INT__Group__0__Impl : ( '-' ) ;
    public final void rule__NEG_INT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4726:1: ( ( '-' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4727:1: ( '-' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4727:1: ( '-' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4728:1: '-'
            {
             before(grammarAccess.getNEG_INTAccess().getHyphenMinusKeyword_0()); 
            match(input,45,FOLLOW_45_in_rule__NEG_INT__Group__0__Impl9651); 
             after(grammarAccess.getNEG_INTAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NEG_INT__Group__0__Impl


    // $ANTLR start rule__NEG_INT__Group__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4741:1: rule__NEG_INT__Group__1 : rule__NEG_INT__Group__1__Impl ;
    public final void rule__NEG_INT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4745:1: ( rule__NEG_INT__Group__1__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4746:2: rule__NEG_INT__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NEG_INT__Group__1__Impl_in_rule__NEG_INT__Group__19682);
            rule__NEG_INT__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NEG_INT__Group__1


    // $ANTLR start rule__NEG_INT__Group__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4752:1: rule__NEG_INT__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__NEG_INT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4756:1: ( ( RULE_INT ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4757:1: ( RULE_INT )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4757:1: ( RULE_INT )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4758:1: RULE_INT
            {
             before(grammarAccess.getNEG_INTAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NEG_INT__Group__1__Impl9709); 
             after(grammarAccess.getNEG_INTAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NEG_INT__Group__1__Impl


    // $ANTLR start rule__QNAME__Group__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4773:1: rule__QNAME__Group__0 : rule__QNAME__Group__0__Impl rule__QNAME__Group__1 ;
    public final void rule__QNAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4777:1: ( rule__QNAME__Group__0__Impl rule__QNAME__Group__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4778:2: rule__QNAME__Group__0__Impl rule__QNAME__Group__1
            {
            pushFollow(FOLLOW_rule__QNAME__Group__0__Impl_in_rule__QNAME__Group__09742);
            rule__QNAME__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QNAME__Group__1_in_rule__QNAME__Group__09745);
            rule__QNAME__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QNAME__Group__0


    // $ANTLR start rule__QNAME__Group__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4785:1: rule__QNAME__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QNAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4789:1: ( ( RULE_ID ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4790:1: ( RULE_ID )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4790:1: ( RULE_ID )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4791:1: RULE_ID
            {
             before(grammarAccess.getQNAMEAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QNAME__Group__0__Impl9772); 
             after(grammarAccess.getQNAMEAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QNAME__Group__0__Impl


    // $ANTLR start rule__QNAME__Group__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4802:1: rule__QNAME__Group__1 : rule__QNAME__Group__1__Impl ;
    public final void rule__QNAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4806:1: ( rule__QNAME__Group__1__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4807:2: rule__QNAME__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QNAME__Group__1__Impl_in_rule__QNAME__Group__19801);
            rule__QNAME__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QNAME__Group__1


    // $ANTLR start rule__QNAME__Group__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4813:1: rule__QNAME__Group__1__Impl : ( ( rule__QNAME__Group_1__0 )* ) ;
    public final void rule__QNAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4817:1: ( ( ( rule__QNAME__Group_1__0 )* ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4818:1: ( ( rule__QNAME__Group_1__0 )* )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4818:1: ( ( rule__QNAME__Group_1__0 )* )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4819:1: ( rule__QNAME__Group_1__0 )*
            {
             before(grammarAccess.getQNAMEAccess().getGroup_1()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4820:1: ( rule__QNAME__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==43) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4820:2: rule__QNAME__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QNAME__Group_1__0_in_rule__QNAME__Group__1__Impl9828);
            	    rule__QNAME__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getQNAMEAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QNAME__Group__1__Impl


    // $ANTLR start rule__QNAME__Group_1__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4834:1: rule__QNAME__Group_1__0 : rule__QNAME__Group_1__0__Impl rule__QNAME__Group_1__1 ;
    public final void rule__QNAME__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4838:1: ( rule__QNAME__Group_1__0__Impl rule__QNAME__Group_1__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4839:2: rule__QNAME__Group_1__0__Impl rule__QNAME__Group_1__1
            {
            pushFollow(FOLLOW_rule__QNAME__Group_1__0__Impl_in_rule__QNAME__Group_1__09863);
            rule__QNAME__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QNAME__Group_1__1_in_rule__QNAME__Group_1__09866);
            rule__QNAME__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QNAME__Group_1__0


    // $ANTLR start rule__QNAME__Group_1__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4846:1: rule__QNAME__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QNAME__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4850:1: ( ( '.' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4851:1: ( '.' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4851:1: ( '.' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4852:1: '.'
            {
             before(grammarAccess.getQNAMEAccess().getFullStopKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__QNAME__Group_1__0__Impl9894); 
             after(grammarAccess.getQNAMEAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QNAME__Group_1__0__Impl


    // $ANTLR start rule__QNAME__Group_1__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4865:1: rule__QNAME__Group_1__1 : rule__QNAME__Group_1__1__Impl ;
    public final void rule__QNAME__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4869:1: ( rule__QNAME__Group_1__1__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4870:2: rule__QNAME__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QNAME__Group_1__1__Impl_in_rule__QNAME__Group_1__19925);
            rule__QNAME__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QNAME__Group_1__1


    // $ANTLR start rule__QNAME__Group_1__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4876:1: rule__QNAME__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QNAME__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4880:1: ( ( RULE_ID ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4881:1: ( RULE_ID )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4881:1: ( RULE_ID )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4882:1: RULE_ID
            {
             before(grammarAccess.getQNAMEAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QNAME__Group_1__1__Impl9952); 
             after(grammarAccess.getQNAMEAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QNAME__Group_1__1__Impl


    // $ANTLR start rule__DelayLiteral__Group__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4897:1: rule__DelayLiteral__Group__0 : rule__DelayLiteral__Group__0__Impl rule__DelayLiteral__Group__1 ;
    public final void rule__DelayLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4901:1: ( rule__DelayLiteral__Group__0__Impl rule__DelayLiteral__Group__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4902:2: rule__DelayLiteral__Group__0__Impl rule__DelayLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__DelayLiteral__Group__0__Impl_in_rule__DelayLiteral__Group__09985);
            rule__DelayLiteral__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DelayLiteral__Group__1_in_rule__DelayLiteral__Group__09988);
            rule__DelayLiteral__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DelayLiteral__Group__0


    // $ANTLR start rule__DelayLiteral__Group__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4909:1: rule__DelayLiteral__Group__0__Impl : ( ( rule__DelayLiteral__IntValueAssignment_0 ) ) ;
    public final void rule__DelayLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4913:1: ( ( ( rule__DelayLiteral__IntValueAssignment_0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4914:1: ( ( rule__DelayLiteral__IntValueAssignment_0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4914:1: ( ( rule__DelayLiteral__IntValueAssignment_0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4915:1: ( rule__DelayLiteral__IntValueAssignment_0 )
            {
             before(grammarAccess.getDelayLiteralAccess().getIntValueAssignment_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4916:1: ( rule__DelayLiteral__IntValueAssignment_0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4916:2: rule__DelayLiteral__IntValueAssignment_0
            {
            pushFollow(FOLLOW_rule__DelayLiteral__IntValueAssignment_0_in_rule__DelayLiteral__Group__0__Impl10015);
            rule__DelayLiteral__IntValueAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDelayLiteralAccess().getIntValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DelayLiteral__Group__0__Impl


    // $ANTLR start rule__DelayLiteral__Group__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4926:1: rule__DelayLiteral__Group__1 : rule__DelayLiteral__Group__1__Impl ;
    public final void rule__DelayLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4930:1: ( rule__DelayLiteral__Group__1__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4931:2: rule__DelayLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DelayLiteral__Group__1__Impl_in_rule__DelayLiteral__Group__110045);
            rule__DelayLiteral__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DelayLiteral__Group__1


    // $ANTLR start rule__DelayLiteral__Group__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4937:1: rule__DelayLiteral__Group__1__Impl : ( ( rule__DelayLiteral__TimeUnitAssignment_1 ) ) ;
    public final void rule__DelayLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4941:1: ( ( ( rule__DelayLiteral__TimeUnitAssignment_1 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4942:1: ( ( rule__DelayLiteral__TimeUnitAssignment_1 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4942:1: ( ( rule__DelayLiteral__TimeUnitAssignment_1 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4943:1: ( rule__DelayLiteral__TimeUnitAssignment_1 )
            {
             before(grammarAccess.getDelayLiteralAccess().getTimeUnitAssignment_1()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4944:1: ( rule__DelayLiteral__TimeUnitAssignment_1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4944:2: rule__DelayLiteral__TimeUnitAssignment_1
            {
            pushFollow(FOLLOW_rule__DelayLiteral__TimeUnitAssignment_1_in_rule__DelayLiteral__Group__1__Impl10072);
            rule__DelayLiteral__TimeUnitAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDelayLiteralAccess().getTimeUnitAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DelayLiteral__Group__1__Impl


    // $ANTLR start rule__EPath__Group__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4958:1: rule__EPath__Group__0 : rule__EPath__Group__0__Impl rule__EPath__Group__1 ;
    public final void rule__EPath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4962:1: ( rule__EPath__Group__0__Impl rule__EPath__Group__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4963:2: rule__EPath__Group__0__Impl rule__EPath__Group__1
            {
            pushFollow(FOLLOW_rule__EPath__Group__0__Impl_in_rule__EPath__Group__010106);
            rule__EPath__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EPath__Group__1_in_rule__EPath__Group__010109);
            rule__EPath__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EPath__Group__0


    // $ANTLR start rule__EPath__Group__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4970:1: rule__EPath__Group__0__Impl : ( ( rule__EPath__VarAssignment_0 ) ) ;
    public final void rule__EPath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4974:1: ( ( ( rule__EPath__VarAssignment_0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4975:1: ( ( rule__EPath__VarAssignment_0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4975:1: ( ( rule__EPath__VarAssignment_0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4976:1: ( rule__EPath__VarAssignment_0 )
            {
             before(grammarAccess.getEPathAccess().getVarAssignment_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4977:1: ( rule__EPath__VarAssignment_0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4977:2: rule__EPath__VarAssignment_0
            {
            pushFollow(FOLLOW_rule__EPath__VarAssignment_0_in_rule__EPath__Group__0__Impl10136);
            rule__EPath__VarAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getEPathAccess().getVarAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EPath__Group__0__Impl


    // $ANTLR start rule__EPath__Group__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4987:1: rule__EPath__Group__1 : rule__EPath__Group__1__Impl ;
    public final void rule__EPath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4991:1: ( rule__EPath__Group__1__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4992:2: rule__EPath__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EPath__Group__1__Impl_in_rule__EPath__Group__110166);
            rule__EPath__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EPath__Group__1


    // $ANTLR start rule__EPath__Group__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:4998:1: rule__EPath__Group__1__Impl : ( ( rule__EPath__StepsAssignment_1 )* ) ;
    public final void rule__EPath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5002:1: ( ( ( rule__EPath__StepsAssignment_1 )* ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5003:1: ( ( rule__EPath__StepsAssignment_1 )* )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5003:1: ( ( rule__EPath__StepsAssignment_1 )* )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5004:1: ( rule__EPath__StepsAssignment_1 )*
            {
             before(grammarAccess.getEPathAccess().getStepsAssignment_1()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5005:1: ( rule__EPath__StepsAssignment_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==46) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5005:2: rule__EPath__StepsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__EPath__StepsAssignment_1_in_rule__EPath__Group__1__Impl10193);
            	    rule__EPath__StepsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getEPathAccess().getStepsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EPath__Group__1__Impl


    // $ANTLR start rule__EStep__Group__0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5019:1: rule__EStep__Group__0 : rule__EStep__Group__0__Impl rule__EStep__Group__1 ;
    public final void rule__EStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5023:1: ( rule__EStep__Group__0__Impl rule__EStep__Group__1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5024:2: rule__EStep__Group__0__Impl rule__EStep__Group__1
            {
            pushFollow(FOLLOW_rule__EStep__Group__0__Impl_in_rule__EStep__Group__010228);
            rule__EStep__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EStep__Group__1_in_rule__EStep__Group__010231);
            rule__EStep__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EStep__Group__0


    // $ANTLR start rule__EStep__Group__0__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5031:1: rule__EStep__Group__0__Impl : ( '/ ' ) ;
    public final void rule__EStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5035:1: ( ( '/ ' ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5036:1: ( '/ ' )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5036:1: ( '/ ' )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5037:1: '/ '
            {
             before(grammarAccess.getEStepAccess().getSolidusSpaceKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__EStep__Group__0__Impl10259); 
             after(grammarAccess.getEStepAccess().getSolidusSpaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EStep__Group__0__Impl


    // $ANTLR start rule__EStep__Group__1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5050:1: rule__EStep__Group__1 : rule__EStep__Group__1__Impl rule__EStep__Group__2 ;
    public final void rule__EStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5054:1: ( rule__EStep__Group__1__Impl rule__EStep__Group__2 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5055:2: rule__EStep__Group__1__Impl rule__EStep__Group__2
            {
            pushFollow(FOLLOW_rule__EStep__Group__1__Impl_in_rule__EStep__Group__110290);
            rule__EStep__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EStep__Group__2_in_rule__EStep__Group__110293);
            rule__EStep__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EStep__Group__1


    // $ANTLR start rule__EStep__Group__1__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5062:1: rule__EStep__Group__1__Impl : ( ( rule__EStep__FeatureNameAssignment_1 ) ) ;
    public final void rule__EStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5066:1: ( ( ( rule__EStep__FeatureNameAssignment_1 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5067:1: ( ( rule__EStep__FeatureNameAssignment_1 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5067:1: ( ( rule__EStep__FeatureNameAssignment_1 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5068:1: ( rule__EStep__FeatureNameAssignment_1 )
            {
             before(grammarAccess.getEStepAccess().getFeatureNameAssignment_1()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5069:1: ( rule__EStep__FeatureNameAssignment_1 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5069:2: rule__EStep__FeatureNameAssignment_1
            {
            pushFollow(FOLLOW_rule__EStep__FeatureNameAssignment_1_in_rule__EStep__Group__1__Impl10320);
            rule__EStep__FeatureNameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEStepAccess().getFeatureNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EStep__Group__1__Impl


    // $ANTLR start rule__EStep__Group__2
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5079:1: rule__EStep__Group__2 : rule__EStep__Group__2__Impl ;
    public final void rule__EStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5083:1: ( rule__EStep__Group__2__Impl )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5084:2: rule__EStep__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EStep__Group__2__Impl_in_rule__EStep__Group__210350);
            rule__EStep__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EStep__Group__2


    // $ANTLR start rule__EStep__Group__2__Impl
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5090:1: rule__EStep__Group__2__Impl : ( ( rule__EStep__FilterAssignment_2 )? ) ;
    public final void rule__EStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5094:1: ( ( ( rule__EStep__FilterAssignment_2 )? ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5095:1: ( ( rule__EStep__FilterAssignment_2 )? )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5095:1: ( ( rule__EStep__FilterAssignment_2 )? )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5096:1: ( rule__EStep__FilterAssignment_2 )?
            {
             before(grammarAccess.getEStepAccess().getFilterAssignment_2()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5097:1: ( rule__EStep__FilterAssignment_2 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_SCRIPT_EXPRESSION) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5097:2: rule__EStep__FilterAssignment_2
                    {
                    pushFollow(FOLLOW_rule__EStep__FilterAssignment_2_in_rule__EStep__Group__2__Impl10377);
                    rule__EStep__FilterAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEStepAccess().getFilterAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EStep__Group__2__Impl


    // $ANTLR start rule__StateMachine__ImportsAssignment_0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5114:1: rule__StateMachine__ImportsAssignment_0 : ( ruleResourceImport ) ;
    public final void rule__StateMachine__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5118:1: ( ( ruleResourceImport ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5119:1: ( ruleResourceImport )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5119:1: ( ruleResourceImport )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5120:1: ruleResourceImport
            {
             before(grammarAccess.getStateMachineAccess().getImportsResourceImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleResourceImport_in_rule__StateMachine__ImportsAssignment_010419);
            ruleResourceImport();
            _fsp--;

             after(grammarAccess.getStateMachineAccess().getImportsResourceImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateMachine__ImportsAssignment_0


    // $ANTLR start rule__StateMachine__StatesAssignment_1_0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5129:1: rule__StateMachine__StatesAssignment_1_0 : ( ruleState ) ;
    public final void rule__StateMachine__StatesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5133:1: ( ( ruleState ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5134:1: ( ruleState )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5134:1: ( ruleState )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5135:1: ruleState
            {
             before(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__StateMachine__StatesAssignment_1_010450);
            ruleState();
            _fsp--;

             after(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateMachine__StatesAssignment_1_0


    // $ANTLR start rule__StateMachine__TransitionsAssignment_1_1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5144:1: rule__StateMachine__TransitionsAssignment_1_1 : ( ruleAbstractTransition ) ;
    public final void rule__StateMachine__TransitionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5148:1: ( ( ruleAbstractTransition ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5149:1: ( ruleAbstractTransition )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5149:1: ( ruleAbstractTransition )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5150:1: ruleAbstractTransition
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsAbstractTransitionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAbstractTransition_in_rule__StateMachine__TransitionsAssignment_1_110481);
            ruleAbstractTransition();
            _fsp--;

             after(grammarAccess.getStateMachineAccess().getTransitionsAbstractTransitionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateMachine__TransitionsAssignment_1_1


    // $ANTLR start rule__StateMachine__VariablesAssignment_1_2
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5159:1: rule__StateMachine__VariablesAssignment_1_2 : ( ruleVarDef ) ;
    public final void rule__StateMachine__VariablesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5163:1: ( ( ruleVarDef ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5164:1: ( ruleVarDef )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5164:1: ( ruleVarDef )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5165:1: ruleVarDef
            {
             before(grammarAccess.getStateMachineAccess().getVariablesVarDefParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleVarDef_in_rule__StateMachine__VariablesAssignment_1_210512);
            ruleVarDef();
            _fsp--;

             after(grammarAccess.getStateMachineAccess().getVariablesVarDefParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateMachine__VariablesAssignment_1_2


    // $ANTLR start rule__DomainModelImport__ImportURIAssignment_2
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5174:1: rule__DomainModelImport__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__DomainModelImport__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5178:1: ( ( RULE_STRING ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5179:1: ( RULE_STRING )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5179:1: ( RULE_STRING )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5180:1: RULE_STRING
            {
             before(grammarAccess.getDomainModelImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DomainModelImport__ImportURIAssignment_210543); 
             after(grammarAccess.getDomainModelImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainModelImport__ImportURIAssignment_2


    // $ANTLR start rule__DomainDataImport__ImportURIAssignment_2
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5189:1: rule__DomainDataImport__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__DomainDataImport__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5193:1: ( ( RULE_STRING ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5194:1: ( RULE_STRING )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5194:1: ( RULE_STRING )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5195:1: RULE_STRING
            {
             before(grammarAccess.getDomainDataImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DomainDataImport__ImportURIAssignment_210574); 
             after(grammarAccess.getDomainDataImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainDataImport__ImportURIAssignment_2


    // $ANTLR start rule__State__InitialTransitionAssignment_0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5204:1: rule__State__InitialTransitionAssignment_0 : ( ruleInitialTransition ) ;
    public final void rule__State__InitialTransitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5208:1: ( ( ruleInitialTransition ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5209:1: ( ruleInitialTransition )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5209:1: ( ruleInitialTransition )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5210:1: ruleInitialTransition
            {
             before(grammarAccess.getStateAccess().getInitialTransitionInitialTransitionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleInitialTransition_in_rule__State__InitialTransitionAssignment_010605);
            ruleInitialTransition();
            _fsp--;

             after(grammarAccess.getStateAccess().getInitialTransitionInitialTransitionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__InitialTransitionAssignment_0


    // $ANTLR start rule__State__NameAssignment_1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5219:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5223:1: ( ( RULE_ID ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5224:1: ( RULE_ID )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5224:1: ( RULE_ID )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5225:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_110636); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__NameAssignment_1


    // $ANTLR start rule__State__StatesAssignment_2_1_1_0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5234:1: rule__State__StatesAssignment_2_1_1_0 : ( ruleState ) ;
    public final void rule__State__StatesAssignment_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5238:1: ( ( ruleState ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5239:1: ( ruleState )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5239:1: ( ruleState )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5240:1: ruleState
            {
             before(grammarAccess.getStateAccess().getStatesStateParserRuleCall_2_1_1_0_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__State__StatesAssignment_2_1_1_010667);
            ruleState();
            _fsp--;

             after(grammarAccess.getStateAccess().getStatesStateParserRuleCall_2_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__StatesAssignment_2_1_1_0


    // $ANTLR start rule__State__TransitionsAssignment_2_1_1_1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5249:1: rule__State__TransitionsAssignment_2_1_1_1 : ( ruleAbstractTransition ) ;
    public final void rule__State__TransitionsAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5253:1: ( ( ruleAbstractTransition ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5254:1: ( ruleAbstractTransition )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5254:1: ( ruleAbstractTransition )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5255:1: ruleAbstractTransition
            {
             before(grammarAccess.getStateAccess().getTransitionsAbstractTransitionParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleAbstractTransition_in_rule__State__TransitionsAssignment_2_1_1_110698);
            ruleAbstractTransition();
            _fsp--;

             after(grammarAccess.getStateAccess().getTransitionsAbstractTransitionParserRuleCall_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__TransitionsAssignment_2_1_1_1


    // $ANTLR start rule__State__VariablesAssignment_2_1_1_2
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5264:1: rule__State__VariablesAssignment_2_1_1_2 : ( ruleVarDef ) ;
    public final void rule__State__VariablesAssignment_2_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5268:1: ( ( ruleVarDef ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5269:1: ( ruleVarDef )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5269:1: ( ruleVarDef )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5270:1: ruleVarDef
            {
             before(grammarAccess.getStateAccess().getVariablesVarDefParserRuleCall_2_1_1_2_0()); 
            pushFollow(FOLLOW_ruleVarDef_in_rule__State__VariablesAssignment_2_1_1_210729);
            ruleVarDef();
            _fsp--;

             after(grammarAccess.getStateAccess().getVariablesVarDefParserRuleCall_2_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__VariablesAssignment_2_1_1_2


    // $ANTLR start rule__InitialTransition__ActionAssignment_2_1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5279:1: rule__InitialTransition__ActionAssignment_2_1 : ( ruleAction ) ;
    public final void rule__InitialTransition__ActionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5283:1: ( ( ruleAction ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5284:1: ( ruleAction )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5284:1: ( ruleAction )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5285:1: ruleAction
            {
             before(grammarAccess.getInitialTransitionAccess().getActionActionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__InitialTransition__ActionAssignment_2_110760);
            ruleAction();
            _fsp--;

             after(grammarAccess.getInitialTransitionAccess().getActionActionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InitialTransition__ActionAssignment_2_1


    // $ANTLR start rule__Transition__TargetAssignment_0_0_1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5294:1: rule__Transition__TargetAssignment_0_0_1 : ( ( ruleQNAME ) ) ;
    public final void rule__Transition__TargetAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5298:1: ( ( ( ruleQNAME ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5299:1: ( ( ruleQNAME ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5299:1: ( ( ruleQNAME ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5300:1: ( ruleQNAME )
            {
             before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_0_0_1_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5301:1: ( ruleQNAME )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5302:1: ruleQNAME
            {
             before(grammarAccess.getTransitionAccess().getTargetStateQNAMEParserRuleCall_0_0_1_0_1()); 
            pushFollow(FOLLOW_ruleQNAME_in_rule__Transition__TargetAssignment_0_0_110795);
            ruleQNAME();
            _fsp--;

             after(grammarAccess.getTransitionAccess().getTargetStateQNAMEParserRuleCall_0_0_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getTargetStateCrossReference_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__TargetAssignment_0_0_1


    // $ANTLR start rule__Transition__TargetAssignment_0_1_0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5313:1: rule__Transition__TargetAssignment_0_1_0 : ( ( ruleQNAME ) ) ;
    public final void rule__Transition__TargetAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5317:1: ( ( ( ruleQNAME ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5318:1: ( ( ruleQNAME ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5318:1: ( ( ruleQNAME ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5319:1: ( ruleQNAME )
            {
             before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_0_1_0_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5320:1: ( ruleQNAME )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5321:1: ruleQNAME
            {
             before(grammarAccess.getTransitionAccess().getTargetStateQNAMEParserRuleCall_0_1_0_0_1()); 
            pushFollow(FOLLOW_ruleQNAME_in_rule__Transition__TargetAssignment_0_1_010834);
            ruleQNAME();
            _fsp--;

             after(grammarAccess.getTransitionAccess().getTargetStateQNAMEParserRuleCall_0_1_0_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getTargetStateCrossReference_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__TargetAssignment_0_1_0


    // $ANTLR start rule__Transition__EventAssignment_1_1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5332:1: rule__Transition__EventAssignment_1_1 : ( ruleEvent ) ;
    public final void rule__Transition__EventAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5336:1: ( ( ruleEvent ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5337:1: ( ruleEvent )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5337:1: ( ruleEvent )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5338:1: ruleEvent
            {
             before(grammarAccess.getTransitionAccess().getEventEventParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Transition__EventAssignment_1_110869);
            ruleEvent();
            _fsp--;

             after(grammarAccess.getTransitionAccess().getEventEventParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__EventAssignment_1_1


    // $ANTLR start rule__Transition__ConditionAssignment_2_1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5347:1: rule__Transition__ConditionAssignment_2_1 : ( ruleCondition ) ;
    public final void rule__Transition__ConditionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5351:1: ( ( ruleCondition ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5352:1: ( ruleCondition )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5352:1: ( ruleCondition )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5353:1: ruleCondition
            {
             before(grammarAccess.getTransitionAccess().getConditionConditionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__Transition__ConditionAssignment_2_110900);
            ruleCondition();
            _fsp--;

             after(grammarAccess.getTransitionAccess().getConditionConditionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__ConditionAssignment_2_1


    // $ANTLR start rule__Transition__ActionAssignment_3_1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5362:1: rule__Transition__ActionAssignment_3_1 : ( ruleAction ) ;
    public final void rule__Transition__ActionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5366:1: ( ( ruleAction ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5367:1: ( ruleAction )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5367:1: ( ruleAction )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5368:1: ruleAction
            {
             before(grammarAccess.getTransitionAccess().getActionActionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__Transition__ActionAssignment_3_110931);
            ruleAction();
            _fsp--;

             after(grammarAccess.getTransitionAccess().getActionActionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__ActionAssignment_3_1


    // $ANTLR start rule__InternalTransition__EventAssignment_0_1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5377:1: rule__InternalTransition__EventAssignment_0_1 : ( ruleEvent ) ;
    public final void rule__InternalTransition__EventAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5381:1: ( ( ruleEvent ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5382:1: ( ruleEvent )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5382:1: ( ruleEvent )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5383:1: ruleEvent
            {
             before(grammarAccess.getInternalTransitionAccess().getEventEventParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__InternalTransition__EventAssignment_0_110962);
            ruleEvent();
            _fsp--;

             after(grammarAccess.getInternalTransitionAccess().getEventEventParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InternalTransition__EventAssignment_0_1


    // $ANTLR start rule__InternalTransition__ConditionAssignment_1_1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5392:1: rule__InternalTransition__ConditionAssignment_1_1 : ( ruleCondition ) ;
    public final void rule__InternalTransition__ConditionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5396:1: ( ( ruleCondition ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5397:1: ( ruleCondition )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5397:1: ( ruleCondition )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5398:1: ruleCondition
            {
             before(grammarAccess.getInternalTransitionAccess().getConditionConditionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__InternalTransition__ConditionAssignment_1_110993);
            ruleCondition();
            _fsp--;

             after(grammarAccess.getInternalTransitionAccess().getConditionConditionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InternalTransition__ConditionAssignment_1_1


    // $ANTLR start rule__InternalTransition__ActionAssignment_3
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5407:1: rule__InternalTransition__ActionAssignment_3 : ( ruleAction ) ;
    public final void rule__InternalTransition__ActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5411:1: ( ( ruleAction ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5412:1: ( ruleAction )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5412:1: ( ruleAction )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5413:1: ruleAction
            {
             before(grammarAccess.getInternalTransitionAccess().getActionActionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__InternalTransition__ActionAssignment_311024);
            ruleAction();
            _fsp--;

             after(grammarAccess.getInternalTransitionAccess().getActionActionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InternalTransition__ActionAssignment_3


    // $ANTLR start rule__SymbolicEvent__NameAssignment_0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5422:1: rule__SymbolicEvent__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SymbolicEvent__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5426:1: ( ( RULE_ID ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5427:1: ( RULE_ID )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5427:1: ( RULE_ID )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5428:1: RULE_ID
            {
             before(grammarAccess.getSymbolicEventAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SymbolicEvent__NameAssignment_011055); 
             after(grammarAccess.getSymbolicEventAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SymbolicEvent__NameAssignment_0


    // $ANTLR start rule__TransitionEvent__SourceAssignment_0_0_0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5437:1: rule__TransitionEvent__SourceAssignment_0_0_0 : ( ( ruleQNAME ) ) ;
    public final void rule__TransitionEvent__SourceAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5441:1: ( ( ( ruleQNAME ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5442:1: ( ( ruleQNAME ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5442:1: ( ( ruleQNAME ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5443:1: ( ruleQNAME )
            {
             before(grammarAccess.getTransitionEventAccess().getSourceStateCrossReference_0_0_0_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5444:1: ( ruleQNAME )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5445:1: ruleQNAME
            {
             before(grammarAccess.getTransitionEventAccess().getSourceStateQNAMEParserRuleCall_0_0_0_0_1()); 
            pushFollow(FOLLOW_ruleQNAME_in_rule__TransitionEvent__SourceAssignment_0_0_011090);
            ruleQNAME();
            _fsp--;

             after(grammarAccess.getTransitionEventAccess().getSourceStateQNAMEParserRuleCall_0_0_0_0_1()); 

            }

             after(grammarAccess.getTransitionEventAccess().getSourceStateCrossReference_0_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__SourceAssignment_0_0_0


    // $ANTLR start rule__TransitionEvent__TargetAssignment_0_0_2
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5456:1: rule__TransitionEvent__TargetAssignment_0_0_2 : ( ( ruleQNAME ) ) ;
    public final void rule__TransitionEvent__TargetAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5460:1: ( ( ( ruleQNAME ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5461:1: ( ( ruleQNAME ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5461:1: ( ( ruleQNAME ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5462:1: ( ruleQNAME )
            {
             before(grammarAccess.getTransitionEventAccess().getTargetStateCrossReference_0_0_2_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5463:1: ( ruleQNAME )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5464:1: ruleQNAME
            {
             before(grammarAccess.getTransitionEventAccess().getTargetStateQNAMEParserRuleCall_0_0_2_0_1()); 
            pushFollow(FOLLOW_ruleQNAME_in_rule__TransitionEvent__TargetAssignment_0_0_211129);
            ruleQNAME();
            _fsp--;

             after(grammarAccess.getTransitionEventAccess().getTargetStateQNAMEParserRuleCall_0_0_2_0_1()); 

            }

             after(grammarAccess.getTransitionEventAccess().getTargetStateCrossReference_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__TargetAssignment_0_0_2


    // $ANTLR start rule__TransitionEvent__TargetAssignment_0_1_0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5475:1: rule__TransitionEvent__TargetAssignment_0_1_0 : ( ( ruleQNAME ) ) ;
    public final void rule__TransitionEvent__TargetAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5479:1: ( ( ( ruleQNAME ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5480:1: ( ( ruleQNAME ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5480:1: ( ( ruleQNAME ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5481:1: ( ruleQNAME )
            {
             before(grammarAccess.getTransitionEventAccess().getTargetStateCrossReference_0_1_0_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5482:1: ( ruleQNAME )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5483:1: ruleQNAME
            {
             before(grammarAccess.getTransitionEventAccess().getTargetStateQNAMEParserRuleCall_0_1_0_0_1()); 
            pushFollow(FOLLOW_ruleQNAME_in_rule__TransitionEvent__TargetAssignment_0_1_011168);
            ruleQNAME();
            _fsp--;

             after(grammarAccess.getTransitionEventAccess().getTargetStateQNAMEParserRuleCall_0_1_0_0_1()); 

            }

             after(grammarAccess.getTransitionEventAccess().getTargetStateCrossReference_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__TargetAssignment_0_1_0


    // $ANTLR start rule__TransitionEvent__SourceAssignment_0_1_2
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5494:1: rule__TransitionEvent__SourceAssignment_0_1_2 : ( ( ruleQNAME ) ) ;
    public final void rule__TransitionEvent__SourceAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5498:1: ( ( ( ruleQNAME ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5499:1: ( ( ruleQNAME ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5499:1: ( ( ruleQNAME ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5500:1: ( ruleQNAME )
            {
             before(grammarAccess.getTransitionEventAccess().getSourceStateCrossReference_0_1_2_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5501:1: ( ruleQNAME )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5502:1: ruleQNAME
            {
             before(grammarAccess.getTransitionEventAccess().getSourceStateQNAMEParserRuleCall_0_1_2_0_1()); 
            pushFollow(FOLLOW_ruleQNAME_in_rule__TransitionEvent__SourceAssignment_0_1_211207);
            ruleQNAME();
            _fsp--;

             after(grammarAccess.getTransitionEventAccess().getSourceStateQNAMEParserRuleCall_0_1_2_0_1()); 

            }

             after(grammarAccess.getTransitionEventAccess().getSourceStateCrossReference_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__SourceAssignment_0_1_2


    // $ANTLR start rule__TransitionEvent__TargetAssignment_1_0_1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5513:1: rule__TransitionEvent__TargetAssignment_1_0_1 : ( ( ruleQNAME ) ) ;
    public final void rule__TransitionEvent__TargetAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5517:1: ( ( ( ruleQNAME ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5518:1: ( ( ruleQNAME ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5518:1: ( ( ruleQNAME ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5519:1: ( ruleQNAME )
            {
             before(grammarAccess.getTransitionEventAccess().getTargetStateCrossReference_1_0_1_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5520:1: ( ruleQNAME )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5521:1: ruleQNAME
            {
             before(grammarAccess.getTransitionEventAccess().getTargetStateQNAMEParserRuleCall_1_0_1_0_1()); 
            pushFollow(FOLLOW_ruleQNAME_in_rule__TransitionEvent__TargetAssignment_1_0_111246);
            ruleQNAME();
            _fsp--;

             after(grammarAccess.getTransitionEventAccess().getTargetStateQNAMEParserRuleCall_1_0_1_0_1()); 

            }

             after(grammarAccess.getTransitionEventAccess().getTargetStateCrossReference_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__TargetAssignment_1_0_1


    // $ANTLR start rule__TransitionEvent__TargetAssignment_1_1_0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5532:1: rule__TransitionEvent__TargetAssignment_1_1_0 : ( ( ruleQNAME ) ) ;
    public final void rule__TransitionEvent__TargetAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5536:1: ( ( ( ruleQNAME ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5537:1: ( ( ruleQNAME ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5537:1: ( ( ruleQNAME ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5538:1: ( ruleQNAME )
            {
             before(grammarAccess.getTransitionEventAccess().getTargetStateCrossReference_1_1_0_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5539:1: ( ruleQNAME )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5540:1: ruleQNAME
            {
             before(grammarAccess.getTransitionEventAccess().getTargetStateQNAMEParserRuleCall_1_1_0_0_1()); 
            pushFollow(FOLLOW_ruleQNAME_in_rule__TransitionEvent__TargetAssignment_1_1_011285);
            ruleQNAME();
            _fsp--;

             after(grammarAccess.getTransitionEventAccess().getTargetStateQNAMEParserRuleCall_1_1_0_0_1()); 

            }

             after(grammarAccess.getTransitionEventAccess().getTargetStateCrossReference_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__TargetAssignment_1_1_0


    // $ANTLR start rule__TransitionEvent__SourceAssignment_2_0_0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5551:1: rule__TransitionEvent__SourceAssignment_2_0_0 : ( ( ruleQNAME ) ) ;
    public final void rule__TransitionEvent__SourceAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5555:1: ( ( ( ruleQNAME ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5556:1: ( ( ruleQNAME ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5556:1: ( ( ruleQNAME ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5557:1: ( ruleQNAME )
            {
             before(grammarAccess.getTransitionEventAccess().getSourceStateCrossReference_2_0_0_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5558:1: ( ruleQNAME )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5559:1: ruleQNAME
            {
             before(grammarAccess.getTransitionEventAccess().getSourceStateQNAMEParserRuleCall_2_0_0_0_1()); 
            pushFollow(FOLLOW_ruleQNAME_in_rule__TransitionEvent__SourceAssignment_2_0_011324);
            ruleQNAME();
            _fsp--;

             after(grammarAccess.getTransitionEventAccess().getSourceStateQNAMEParserRuleCall_2_0_0_0_1()); 

            }

             after(grammarAccess.getTransitionEventAccess().getSourceStateCrossReference_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__SourceAssignment_2_0_0


    // $ANTLR start rule__TransitionEvent__SourceAssignment_2_1_1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5570:1: rule__TransitionEvent__SourceAssignment_2_1_1 : ( ( ruleQNAME ) ) ;
    public final void rule__TransitionEvent__SourceAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5574:1: ( ( ( ruleQNAME ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5575:1: ( ( ruleQNAME ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5575:1: ( ( ruleQNAME ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5576:1: ( ruleQNAME )
            {
             before(grammarAccess.getTransitionEventAccess().getSourceStateCrossReference_2_1_1_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5577:1: ( ruleQNAME )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5578:1: ruleQNAME
            {
             before(grammarAccess.getTransitionEventAccess().getSourceStateQNAMEParserRuleCall_2_1_1_0_1()); 
            pushFollow(FOLLOW_ruleQNAME_in_rule__TransitionEvent__SourceAssignment_2_1_111363);
            ruleQNAME();
            _fsp--;

             after(grammarAccess.getTransitionEventAccess().getSourceStateQNAMEParserRuleCall_2_1_1_0_1()); 

            }

             after(grammarAccess.getTransitionEventAccess().getSourceStateCrossReference_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TransitionEvent__SourceAssignment_2_1_1


    // $ANTLR start rule__ScriptEvent__ScriptAssignment
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5589:1: rule__ScriptEvent__ScriptAssignment : ( RULE_SCRIPT_EXPRESSION ) ;
    public final void rule__ScriptEvent__ScriptAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5593:1: ( ( RULE_SCRIPT_EXPRESSION ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5594:1: ( RULE_SCRIPT_EXPRESSION )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5594:1: ( RULE_SCRIPT_EXPRESSION )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5595:1: RULE_SCRIPT_EXPRESSION
            {
             before(grammarAccess.getScriptEventAccess().getScriptSCRIPT_EXPRESSIONTerminalRuleCall_0()); 
            match(input,RULE_SCRIPT_EXPRESSION,FOLLOW_RULE_SCRIPT_EXPRESSION_in_rule__ScriptEvent__ScriptAssignment11398); 
             after(grammarAccess.getScriptEventAccess().getScriptSCRIPT_EXPRESSIONTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ScriptEvent__ScriptAssignment


    // $ANTLR start rule__TimerEvent__DelayAssignment_2
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5604:1: rule__TimerEvent__DelayAssignment_2 : ( ruleExpression ) ;
    public final void rule__TimerEvent__DelayAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5608:1: ( ( ruleExpression ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5609:1: ( ruleExpression )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5609:1: ( ruleExpression )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5610:1: ruleExpression
            {
             before(grammarAccess.getTimerEventAccess().getDelayExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__TimerEvent__DelayAssignment_211429);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getTimerEventAccess().getDelayExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TimerEvent__DelayAssignment_2


    // $ANTLR start rule__TimerEvent__EventAssignment_4
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5619:1: rule__TimerEvent__EventAssignment_4 : ( ruleEvent ) ;
    public final void rule__TimerEvent__EventAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5623:1: ( ( ruleEvent ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5624:1: ( ruleEvent )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5624:1: ( ruleEvent )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5625:1: ruleEvent
            {
             before(grammarAccess.getTimerEventAccess().getEventEventParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__TimerEvent__EventAssignment_411460);
            ruleEvent();
            _fsp--;

             after(grammarAccess.getTimerEventAccess().getEventEventParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TimerEvent__EventAssignment_4


    // $ANTLR start rule__Condition__ScriptAssignment
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5634:1: rule__Condition__ScriptAssignment : ( RULE_SCRIPT_EXPRESSION ) ;
    public final void rule__Condition__ScriptAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5638:1: ( ( RULE_SCRIPT_EXPRESSION ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5639:1: ( RULE_SCRIPT_EXPRESSION )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5639:1: ( RULE_SCRIPT_EXPRESSION )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5640:1: RULE_SCRIPT_EXPRESSION
            {
             before(grammarAccess.getConditionAccess().getScriptSCRIPT_EXPRESSIONTerminalRuleCall_0()); 
            match(input,RULE_SCRIPT_EXPRESSION,FOLLOW_RULE_SCRIPT_EXPRESSION_in_rule__Condition__ScriptAssignment11491); 
             after(grammarAccess.getConditionAccess().getScriptSCRIPT_EXPRESSIONTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Condition__ScriptAssignment


    // $ANTLR start rule__SymbolicAction__NameAssignment_0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5649:1: rule__SymbolicAction__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SymbolicAction__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5653:1: ( ( RULE_ID ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5654:1: ( RULE_ID )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5654:1: ( RULE_ID )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5655:1: RULE_ID
            {
             before(grammarAccess.getSymbolicActionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SymbolicAction__NameAssignment_011522); 
             after(grammarAccess.getSymbolicActionAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SymbolicAction__NameAssignment_0


    // $ANTLR start rule__SymbolicAction__DelayAssignment_1_1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5664:1: rule__SymbolicAction__DelayAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__SymbolicAction__DelayAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5668:1: ( ( ruleExpression ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5669:1: ( ruleExpression )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5669:1: ( ruleExpression )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5670:1: ruleExpression
            {
             before(grammarAccess.getSymbolicActionAccess().getDelayExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__SymbolicAction__DelayAssignment_1_111553);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getSymbolicActionAccess().getDelayExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SymbolicAction__DelayAssignment_1_1


    // $ANTLR start rule__ScriptAction__ScriptAssignment
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5679:1: rule__ScriptAction__ScriptAssignment : ( RULE_SCRIPT_STATEMENTS ) ;
    public final void rule__ScriptAction__ScriptAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5683:1: ( ( RULE_SCRIPT_STATEMENTS ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5684:1: ( RULE_SCRIPT_STATEMENTS )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5684:1: ( RULE_SCRIPT_STATEMENTS )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5685:1: RULE_SCRIPT_STATEMENTS
            {
             before(grammarAccess.getScriptActionAccess().getScriptSCRIPT_STATEMENTSTerminalRuleCall_0()); 
            match(input,RULE_SCRIPT_STATEMENTS,FOLLOW_RULE_SCRIPT_STATEMENTS_in_rule__ScriptAction__ScriptAssignment11584); 
             after(grammarAccess.getScriptActionAccess().getScriptSCRIPT_STATEMENTSTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ScriptAction__ScriptAssignment


    // $ANTLR start rule__VarDef__NameAssignment_1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5694:1: rule__VarDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5698:1: ( ( RULE_ID ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5699:1: ( RULE_ID )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5699:1: ( RULE_ID )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5700:1: RULE_ID
            {
             before(grammarAccess.getVarDefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDef__NameAssignment_111615); 
             after(grammarAccess.getVarDefAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDef__NameAssignment_1


    // $ANTLR start rule__VarDef__ETypeAssignment_2_1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5709:1: rule__VarDef__ETypeAssignment_2_1 : ( ( ruleQNAME ) ) ;
    public final void rule__VarDef__ETypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5713:1: ( ( ( ruleQNAME ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5714:1: ( ( ruleQNAME ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5714:1: ( ( ruleQNAME ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5715:1: ( ruleQNAME )
            {
             before(grammarAccess.getVarDefAccess().getETypeEClassifierCrossReference_2_1_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5716:1: ( ruleQNAME )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5717:1: ruleQNAME
            {
             before(grammarAccess.getVarDefAccess().getETypeEClassifierQNAMEParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQNAME_in_rule__VarDef__ETypeAssignment_2_111650);
            ruleQNAME();
            _fsp--;

             after(grammarAccess.getVarDefAccess().getETypeEClassifierQNAMEParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getVarDefAccess().getETypeEClassifierCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDef__ETypeAssignment_2_1


    // $ANTLR start rule__VarDef__ManyAssignment_2_2
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5728:1: rule__VarDef__ManyAssignment_2_2 : ( ( rule__VarDef__ManyAlternatives_2_2_0 ) ) ;
    public final void rule__VarDef__ManyAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5732:1: ( ( ( rule__VarDef__ManyAlternatives_2_2_0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5733:1: ( ( rule__VarDef__ManyAlternatives_2_2_0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5733:1: ( ( rule__VarDef__ManyAlternatives_2_2_0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5734:1: ( rule__VarDef__ManyAlternatives_2_2_0 )
            {
             before(grammarAccess.getVarDefAccess().getManyAlternatives_2_2_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5735:1: ( rule__VarDef__ManyAlternatives_2_2_0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5735:2: rule__VarDef__ManyAlternatives_2_2_0
            {
            pushFollow(FOLLOW_rule__VarDef__ManyAlternatives_2_2_0_in_rule__VarDef__ManyAssignment_2_211685);
            rule__VarDef__ManyAlternatives_2_2_0();
            _fsp--;


            }

             after(grammarAccess.getVarDefAccess().getManyAlternatives_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDef__ManyAssignment_2_2


    // $ANTLR start rule__VarDef__InitAssignment_3_1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5744:1: rule__VarDef__InitAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__VarDef__InitAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5748:1: ( ( ruleExpression ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5749:1: ( ruleExpression )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5749:1: ( ruleExpression )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5750:1: ruleExpression
            {
             before(grammarAccess.getVarDefAccess().getInitExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__VarDef__InitAssignment_3_111718);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getVarDefAccess().getInitExpressionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDef__InitAssignment_3_1


    // $ANTLR start rule__AssignmentAction__VarAssignment_0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5759:1: rule__AssignmentAction__VarAssignment_0 : ( ( ruleQNAME ) ) ;
    public final void rule__AssignmentAction__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5763:1: ( ( ( ruleQNAME ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5764:1: ( ( ruleQNAME ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5764:1: ( ( ruleQNAME ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5765:1: ( ruleQNAME )
            {
             before(grammarAccess.getAssignmentActionAccess().getVarVarDefCrossReference_0_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5766:1: ( ruleQNAME )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5767:1: ruleQNAME
            {
             before(grammarAccess.getAssignmentActionAccess().getVarVarDefQNAMEParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQNAME_in_rule__AssignmentAction__VarAssignment_011753);
            ruleQNAME();
            _fsp--;

             after(grammarAccess.getAssignmentActionAccess().getVarVarDefQNAMEParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAssignmentActionAccess().getVarVarDefCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentAction__VarAssignment_0


    // $ANTLR start rule__AssignmentAction__ValueAssignment_2
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5778:1: rule__AssignmentAction__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__AssignmentAction__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5782:1: ( ( ruleExpression ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5783:1: ( ruleExpression )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5783:1: ( ruleExpression )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5784:1: ruleExpression
            {
             before(grammarAccess.getAssignmentActionAccess().getValueExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__AssignmentAction__ValueAssignment_211788);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getAssignmentActionAccess().getValueExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentAction__ValueAssignment_2


    // $ANTLR start rule__BooleanLiteral__BooleanValueAssignment
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5793:1: rule__BooleanLiteral__BooleanValueAssignment : ( ruleBOOLEAN_LITERAL ) ;
    public final void rule__BooleanLiteral__BooleanValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5797:1: ( ( ruleBOOLEAN_LITERAL ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5798:1: ( ruleBOOLEAN_LITERAL )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5798:1: ( ruleBOOLEAN_LITERAL )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5799:1: ruleBOOLEAN_LITERAL
            {
             before(grammarAccess.getBooleanLiteralAccess().getBooleanValueBOOLEAN_LITERALParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBOOLEAN_LITERAL_in_rule__BooleanLiteral__BooleanValueAssignment11819);
            ruleBOOLEAN_LITERAL();
            _fsp--;

             after(grammarAccess.getBooleanLiteralAccess().getBooleanValueBOOLEAN_LITERALParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BooleanLiteral__BooleanValueAssignment


    // $ANTLR start rule__IntLiteral__IntValueAssignment
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5808:1: rule__IntLiteral__IntValueAssignment : ( ( rule__IntLiteral__IntValueAlternatives_0 ) ) ;
    public final void rule__IntLiteral__IntValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5812:1: ( ( ( rule__IntLiteral__IntValueAlternatives_0 ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5813:1: ( ( rule__IntLiteral__IntValueAlternatives_0 ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5813:1: ( ( rule__IntLiteral__IntValueAlternatives_0 ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5814:1: ( rule__IntLiteral__IntValueAlternatives_0 )
            {
             before(grammarAccess.getIntLiteralAccess().getIntValueAlternatives_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5815:1: ( rule__IntLiteral__IntValueAlternatives_0 )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5815:2: rule__IntLiteral__IntValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__IntLiteral__IntValueAlternatives_0_in_rule__IntLiteral__IntValueAssignment11850);
            rule__IntLiteral__IntValueAlternatives_0();
            _fsp--;


            }

             after(grammarAccess.getIntLiteralAccess().getIntValueAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntLiteral__IntValueAssignment


    // $ANTLR start rule__FloatLiteral__FloatValueAssignment
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5824:1: rule__FloatLiteral__FloatValueAssignment : ( ruleFLOAT_LITERAL ) ;
    public final void rule__FloatLiteral__FloatValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5828:1: ( ( ruleFLOAT_LITERAL ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5829:1: ( ruleFLOAT_LITERAL )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5829:1: ( ruleFLOAT_LITERAL )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5830:1: ruleFLOAT_LITERAL
            {
             before(grammarAccess.getFloatLiteralAccess().getFloatValueFLOAT_LITERALParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleFLOAT_LITERAL_in_rule__FloatLiteral__FloatValueAssignment11883);
            ruleFLOAT_LITERAL();
            _fsp--;

             after(grammarAccess.getFloatLiteralAccess().getFloatValueFLOAT_LITERALParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FloatLiteral__FloatValueAssignment


    // $ANTLR start rule__StringLiteral__StringValueAssignment
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5839:1: rule__StringLiteral__StringValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__StringValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5843:1: ( ( RULE_STRING ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5844:1: ( RULE_STRING )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5844:1: ( RULE_STRING )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5845:1: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getStringValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__StringValueAssignment11914); 
             after(grammarAccess.getStringLiteralAccess().getStringValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringLiteral__StringValueAssignment


    // $ANTLR start rule__UriLiteral__UriAssignment
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5854:1: rule__UriLiteral__UriAssignment : ( RULE_URI_LITERAL ) ;
    public final void rule__UriLiteral__UriAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5858:1: ( ( RULE_URI_LITERAL ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5859:1: ( RULE_URI_LITERAL )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5859:1: ( RULE_URI_LITERAL )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5860:1: RULE_URI_LITERAL
            {
             before(grammarAccess.getUriLiteralAccess().getUriURI_LITERALTerminalRuleCall_0()); 
            match(input,RULE_URI_LITERAL,FOLLOW_RULE_URI_LITERAL_in_rule__UriLiteral__UriAssignment11945); 
             after(grammarAccess.getUriLiteralAccess().getUriURI_LITERALTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UriLiteral__UriAssignment


    // $ANTLR start rule__EObjectUriLiteral__UriAssignment
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5869:1: rule__EObjectUriLiteral__UriAssignment : ( RULE_EOBJECT_URI_LITERAL ) ;
    public final void rule__EObjectUriLiteral__UriAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5873:1: ( ( RULE_EOBJECT_URI_LITERAL ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5874:1: ( RULE_EOBJECT_URI_LITERAL )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5874:1: ( RULE_EOBJECT_URI_LITERAL )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5875:1: RULE_EOBJECT_URI_LITERAL
            {
             before(grammarAccess.getEObjectUriLiteralAccess().getUriEOBJECT_URI_LITERALTerminalRuleCall_0()); 
            match(input,RULE_EOBJECT_URI_LITERAL,FOLLOW_RULE_EOBJECT_URI_LITERAL_in_rule__EObjectUriLiteral__UriAssignment11976); 
             after(grammarAccess.getEObjectUriLiteralAccess().getUriEOBJECT_URI_LITERALTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EObjectUriLiteral__UriAssignment


    // $ANTLR start rule__DelayLiteral__IntValueAssignment_0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5884:1: rule__DelayLiteral__IntValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__DelayLiteral__IntValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5888:1: ( ( RULE_INT ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5889:1: ( RULE_INT )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5889:1: ( RULE_INT )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5890:1: RULE_INT
            {
             before(grammarAccess.getDelayLiteralAccess().getIntValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DelayLiteral__IntValueAssignment_012007); 
             after(grammarAccess.getDelayLiteralAccess().getIntValueINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DelayLiteral__IntValueAssignment_0


    // $ANTLR start rule__DelayLiteral__TimeUnitAssignment_1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5899:1: rule__DelayLiteral__TimeUnitAssignment_1 : ( ruleTimeUnit ) ;
    public final void rule__DelayLiteral__TimeUnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5903:1: ( ( ruleTimeUnit ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5904:1: ( ruleTimeUnit )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5904:1: ( ruleTimeUnit )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5905:1: ruleTimeUnit
            {
             before(grammarAccess.getDelayLiteralAccess().getTimeUnitTimeUnitEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTimeUnit_in_rule__DelayLiteral__TimeUnitAssignment_112038);
            ruleTimeUnit();
            _fsp--;

             after(grammarAccess.getDelayLiteralAccess().getTimeUnitTimeUnitEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DelayLiteral__TimeUnitAssignment_1


    // $ANTLR start rule__VarRef__VarAssignment
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5914:1: rule__VarRef__VarAssignment : ( ( ruleQNAME ) ) ;
    public final void rule__VarRef__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5918:1: ( ( ( ruleQNAME ) ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5919:1: ( ( ruleQNAME ) )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5919:1: ( ( ruleQNAME ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5920:1: ( ruleQNAME )
            {
             before(grammarAccess.getVarRefAccess().getVarVarDefCrossReference_0()); 
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5921:1: ( ruleQNAME )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5922:1: ruleQNAME
            {
             before(grammarAccess.getVarRefAccess().getVarVarDefQNAMEParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleQNAME_in_rule__VarRef__VarAssignment12073);
            ruleQNAME();
            _fsp--;

             after(grammarAccess.getVarRefAccess().getVarVarDefQNAMEParserRuleCall_0_1()); 

            }

             after(grammarAccess.getVarRefAccess().getVarVarDefCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarRef__VarAssignment


    // $ANTLR start rule__EPath__VarAssignment_0
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5933:1: rule__EPath__VarAssignment_0 : ( ruleVarRef ) ;
    public final void rule__EPath__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5937:1: ( ( ruleVarRef ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5938:1: ( ruleVarRef )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5938:1: ( ruleVarRef )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5939:1: ruleVarRef
            {
             before(grammarAccess.getEPathAccess().getVarVarRefParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVarRef_in_rule__EPath__VarAssignment_012108);
            ruleVarRef();
            _fsp--;

             after(grammarAccess.getEPathAccess().getVarVarRefParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EPath__VarAssignment_0


    // $ANTLR start rule__EPath__StepsAssignment_1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5948:1: rule__EPath__StepsAssignment_1 : ( ruleEStep ) ;
    public final void rule__EPath__StepsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5952:1: ( ( ruleEStep ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5953:1: ( ruleEStep )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5953:1: ( ruleEStep )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5954:1: ruleEStep
            {
             before(grammarAccess.getEPathAccess().getStepsEStepParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEStep_in_rule__EPath__StepsAssignment_112139);
            ruleEStep();
            _fsp--;

             after(grammarAccess.getEPathAccess().getStepsEStepParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EPath__StepsAssignment_1


    // $ANTLR start rule__EStep__FeatureNameAssignment_1
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5963:1: rule__EStep__FeatureNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EStep__FeatureNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5967:1: ( ( RULE_ID ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5968:1: ( RULE_ID )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5968:1: ( RULE_ID )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5969:1: RULE_ID
            {
             before(grammarAccess.getEStepAccess().getFeatureNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EStep__FeatureNameAssignment_112170); 
             after(grammarAccess.getEStepAccess().getFeatureNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EStep__FeatureNameAssignment_1


    // $ANTLR start rule__EStep__FilterAssignment_2
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5978:1: rule__EStep__FilterAssignment_2 : ( ruleEStepFilter ) ;
    public final void rule__EStep__FilterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5982:1: ( ( ruleEStepFilter ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5983:1: ( ruleEStepFilter )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5983:1: ( ruleEStepFilter )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5984:1: ruleEStepFilter
            {
             before(grammarAccess.getEStepAccess().getFilterEStepFilterParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEStepFilter_in_rule__EStep__FilterAssignment_212201);
            ruleEStepFilter();
            _fsp--;

             after(grammarAccess.getEStepAccess().getFilterEStepFilterParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EStep__FilterAssignment_2


    // $ANTLR start rule__EStepFilter__ScriptAssignment
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5993:1: rule__EStepFilter__ScriptAssignment : ( ruleScriptExpression ) ;
    public final void rule__EStepFilter__ScriptAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5997:1: ( ( ruleScriptExpression ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5998:1: ( ruleScriptExpression )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5998:1: ( ruleScriptExpression )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:5999:1: ruleScriptExpression
            {
             before(grammarAccess.getEStepFilterAccess().getScriptScriptExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleScriptExpression_in_rule__EStepFilter__ScriptAssignment12232);
            ruleScriptExpression();
            _fsp--;

             after(grammarAccess.getEStepFilterAccess().getScriptScriptExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EStepFilter__ScriptAssignment


    // $ANTLR start rule__ScriptExpression__ScriptAssignment
    // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:6008:1: rule__ScriptExpression__ScriptAssignment : ( RULE_SCRIPT_EXPRESSION ) ;
    public final void rule__ScriptExpression__ScriptAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:6012:1: ( ( RULE_SCRIPT_EXPRESSION ) )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:6013:1: ( RULE_SCRIPT_EXPRESSION )
            {
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:6013:1: ( RULE_SCRIPT_EXPRESSION )
            // ../no.hal.scxml.scxmlxt.ui/src-gen/no/hal/scxml/ui/contentassist/antlr/internal/InternalScxmlxt.g:6014:1: RULE_SCRIPT_EXPRESSION
            {
             before(grammarAccess.getScriptExpressionAccess().getScriptSCRIPT_EXPRESSIONTerminalRuleCall_0()); 
            match(input,RULE_SCRIPT_EXPRESSION,FOLLOW_RULE_SCRIPT_EXPRESSION_in_rule__ScriptExpression__ScriptAssignment12263); 
             after(grammarAccess.getScriptExpressionAccess().getScriptSCRIPT_EXPRESSIONTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ScriptExpression__ScriptAssignment


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA8_eotS =
        "\11\uffff";
    static final String DFA8_eofS =
        "\5\uffff\1\3\1\2\2\uffff";
    static final String DFA8_minS =
        "\1\5\1\35\2\uffff\3\5\1\35\1\uffff";
    static final String DFA8_maxS =
        "\1\37\1\53\2\uffff\1\5\2\41\1\53\1\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\1\3\4\uffff\1\1";
    static final String DFA8_specialS =
        "\11\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\27\uffff\1\2\1\uffff\1\3",
            "\1\5\1\uffff\1\6\13\uffff\1\4",
            "",
            "",
            "\1\7",
            "\1\10\11\uffff\1\3\16\uffff\1\3\2\uffff\1\3",
            "\1\10\11\uffff\1\2\16\uffff\1\2\2\uffff\1\2",
            "\1\5\1\uffff\1\6\13\uffff\1\4",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1423:1: rule__TransitionEvent__Alternatives : ( ( ( rule__TransitionEvent__Alternatives_0 ) ) | ( ( rule__TransitionEvent__Alternatives_1 ) ) | ( ( rule__TransitionEvent__Alternatives_2 ) ) );";
        }
    }
    static final String DFA9_eotS =
        "\6\uffff";
    static final String DFA9_eofS =
        "\6\uffff";
    static final String DFA9_minS =
        "\1\5\1\35\1\5\2\uffff\1\35";
    static final String DFA9_maxS =
        "\1\5\1\53\1\5\2\uffff\1\53";
    static final String DFA9_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA9_specialS =
        "\6\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1",
            "\1\3\1\uffff\1\4\13\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\3\1\uffff\1\4\13\uffff\1\2"
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1451:1: rule__TransitionEvent__Alternatives_0 : ( ( ( rule__TransitionEvent__Group_0_0__0 ) ) | ( ( rule__TransitionEvent__Group_0_1__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleStateMachine_in_entryRuleStateMachine61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateMachine68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__0_in_ruleStateMachine94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceImport_in_entryRuleResourceImport121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceImport__Alternatives_in_ruleResourceImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainModelImport_in_entryRuleDomainModelImport181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModelImport188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModelImport__Group__0_in_ruleDomainModelImport214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainDataImport_in_entryRuleDomainDataImport241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainDataImport248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainDataImport__Group__0_in_ruleDomainDataImport274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialTransition_in_entryRuleInitialTransition361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitialTransition368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__0_in_ruleInitialTransition394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractTransition_in_entryRuleAbstractTransition423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractTransition430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractTransition__Alternatives_in_ruleAbstractTransition456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalTransition_in_entryRuleInternalTransition543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalTransition550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalTransition__Group__0_in_ruleInternalTransition576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Alternatives_in_ruleEvent636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolicEvent_in_entryRuleSymbolicEvent663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbolicEvent670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolicEvent__Group__0_in_ruleSymbolicEvent696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionEvent_in_entryRuleTransitionEvent723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionEvent730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Alternatives_in_ruleTransitionEvent756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnterEvent_in_entryRuleEnterEvent783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnterEvent790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnterEvent__Group__0_in_ruleEnterEvent816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_entryRuleExitEvent843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitEvent850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExitEvent__Group__0_in_ruleExitEvent876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScriptEvent_in_entryRuleScriptEvent903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScriptEvent910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScriptEvent__ScriptAssignment_in_ruleScriptEvent936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimerEvent_in_entryRuleTimerEvent963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimerEvent970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimerEvent__Group__0_in_ruleTimerEvent996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__ScriptAssignment_in_ruleCondition1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Alternatives_in_ruleAction1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolicAction_in_entryRuleSymbolicAction1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbolicAction1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolicAction__Group__0_in_ruleSymbolicAction1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScriptAction_in_entryRuleScriptAction1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScriptAction1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScriptAction__ScriptAssignment_in_ruleScriptAction1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDef_in_entryRuleVarDef1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDef1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDef__Group__0_in_ruleVarDef1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentAction_in_entryRuleAssignmentAction1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentAction1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentAction__Group__0_in_ruleAssignmentAction1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_LITERAL_in_entryRuleBOOLEAN_LITERAL1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOLEAN_LITERAL1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOLEAN_LITERAL__Alternatives_in_ruleBOOLEAN_LITERAL1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFLOAT_LITERAL_in_entryRuleFLOAT_LITERAL1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFLOAT_LITERAL1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FLOAT_LITERAL__Group__0_in_ruleFLOAT_LITERAL1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePOS_INT_in_entryRulePOS_INT1503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePOS_INT1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__POS_INT__Group__0_in_rulePOS_INT1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNEG_INT_in_entryRuleNEG_INT1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNEG_INT1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NEG_INT__Group__0_in_ruleNEG_INT1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNAME_in_entryRuleQNAME1623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQNAME1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QNAME__Group__0_in_ruleQNAME1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__BooleanValueAssignment_in_ruleBooleanLiteral1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral1863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntLiteral__IntValueAssignment_in_ruleIntLiteral1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral1923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatLiteral1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLiteral__FloatValueAssignment_in_ruleFloatLiteral1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__StringValueAssignment_in_ruleStringLiteral2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUriLiteral_in_entryRuleUriLiteral2043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUriLiteral2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UriLiteral__UriAssignment_in_ruleUriLiteral2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEObjectUriLiteral_in_entryRuleEObjectUriLiteral2103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEObjectUriLiteral2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EObjectUriLiteral__UriAssignment_in_ruleEObjectUriLiteral2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelayLiteral_in_entryRuleDelayLiteral2163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelayLiteral2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelayLiteral__Group__0_in_ruleDelayLiteral2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRef_in_entryRuleVarRef2223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarRef2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarRef__VarAssignment_in_ruleVarRef2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPath_in_entryRuleEPath2283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEPath2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPath__Group__0_in_ruleEPath2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStep_in_entryRuleEStep2343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStep2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EStep__Group__0_in_ruleEStep2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStepFilter_in_entryRuleEStepFilter2403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEStepFilter2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EStepFilter__ScriptAssignment_in_ruleEStepFilter2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScriptExpression_in_entryRuleScriptExpression2463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScriptExpression2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScriptExpression__ScriptAssignment_in_ruleScriptExpression2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeUnit__Alternatives_in_ruleTimeUnit2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__StatesAssignment_1_0_in_rule__StateMachine__Alternatives_12568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__TransitionsAssignment_1_1_in_rule__StateMachine__Alternatives_12586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__VariablesAssignment_1_2_in_rule__StateMachine__Alternatives_12604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainModelImport_in_rule__ResourceImport__Alternatives2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainDataImport_in_rule__ResourceImport__Alternatives2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__State__Alternatives_22687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_2_1__0_in_rule__State__Alternatives_22706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StatesAssignment_2_1_1_0_in_rule__State__Alternatives_2_1_12739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__TransitionsAssignment_2_1_1_1_in_rule__State__Alternatives_2_1_12757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__VariablesAssignment_2_1_1_2_in_rule__State__Alternatives_2_1_12775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__AbstractTransition__Alternatives2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalTransition_in_rule__AbstractTransition__Alternatives2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_0_0__0_in_rule__Transition__Alternatives_02858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_0_1__0_in_rule__Transition__Alternatives_02876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolicEvent_in_rule__Event__Alternatives2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionEvent_in_rule__Event__Alternatives2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnterEvent_in_rule__Event__Alternatives2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_rule__Event__Alternatives2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScriptEvent_in_rule__Event__Alternatives2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimerEvent_in_rule__Event__Alternatives2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Alternatives_0_in_rule__TransitionEvent__Alternatives3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Alternatives_1_in_rule__TransitionEvent__Alternatives3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Alternatives_2_in_rule__TransitionEvent__Alternatives3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Group_0_0__0_in_rule__TransitionEvent__Alternatives_03095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Group_0_1__0_in_rule__TransitionEvent__Alternatives_03113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Group_1_0__0_in_rule__TransitionEvent__Alternatives_13146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Group_1_1__0_in_rule__TransitionEvent__Alternatives_13164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Group_2_0__0_in_rule__TransitionEvent__Alternatives_23197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Group_2_1__0_in_rule__TransitionEvent__Alternatives_23215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolicAction_in_rule__Action__Alternatives3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScriptAction_in_rule__Action__Alternatives3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentAction_in_rule__Action__Alternatives3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__VarDef__ManyAlternatives_2_2_03315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__VarDef__ManyAlternatives_2_2_03335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BOOLEAN_LITERAL__Alternatives3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BOOLEAN_LITERAL__Alternatives3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FLOAT_LITERAL__Alternatives_03424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePOS_INT_in_rule__FLOAT_LITERAL__Alternatives_03441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNEG_INT_in_rule__FLOAT_LITERAL__Alternatives_03458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Expression__Alternatives3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScriptExpression_in_rule__Expression__Alternatives3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEPath_in_rule__Expression__Alternatives3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_rule__Literal__Alternatives3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_rule__Literal__Alternatives3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUriLiteral_in_rule__Literal__Alternatives3624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEObjectUriLiteral_in_rule__Literal__Alternatives3641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelayLiteral_in_rule__Literal__Alternatives3658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntLiteral__IntValueAlternatives_03690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePOS_INT_in_rule__IntLiteral__IntValueAlternatives_03707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNEG_INT_in_rule__IntLiteral__IntValueAlternatives_03724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__TimeUnit__Alternatives3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TimeUnit__Alternatives3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TimeUnit__Alternatives3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TimeUnit__Alternatives3820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__0__Impl_in_rule__StateMachine__Group__03853 = new BitSet(new long[]{0x0000010360000022L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__1_in_rule__StateMachine__Group__03856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__ImportsAssignment_0_in_rule__StateMachine__Group__0__Impl3883 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__1__Impl_in_rule__StateMachine__Group__13914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Alternatives_1_in_rule__StateMachine__Group__1__Impl3941 = new BitSet(new long[]{0x0000010360000022L});
    public static final BitSet FOLLOW_rule__DomainModelImport__Group__0__Impl_in_rule__DomainModelImport__Group__03976 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__DomainModelImport__Group__1_in_rule__DomainModelImport__Group__03979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DomainModelImport__Group__0__Impl4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModelImport__Group__1__Impl_in_rule__DomainModelImport__Group__14041 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DomainModelImport__Group__2_in_rule__DomainModelImport__Group__14044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DomainModelImport__Group__1__Impl4072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModelImport__Group__2__Impl_in_rule__DomainModelImport__Group__24103 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__DomainModelImport__Group__3_in_rule__DomainModelImport__Group__24106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModelImport__ImportURIAssignment_2_in_rule__DomainModelImport__Group__2__Impl4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModelImport__Group__3__Impl_in_rule__DomainModelImport__Group__34163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DomainModelImport__Group__3__Impl4191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainDataImport__Group__0__Impl_in_rule__DomainDataImport__Group__04230 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DomainDataImport__Group__1_in_rule__DomainDataImport__Group__04233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DomainDataImport__Group__0__Impl4262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainDataImport__Group__1__Impl_in_rule__DomainDataImport__Group__14295 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DomainDataImport__Group__2_in_rule__DomainDataImport__Group__14298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DomainDataImport__Group__1__Impl4326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainDataImport__Group__2__Impl_in_rule__DomainDataImport__Group__24357 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__DomainDataImport__Group__3_in_rule__DomainDataImport__Group__24360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainDataImport__ImportURIAssignment_2_in_rule__DomainDataImport__Group__2__Impl4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainDataImport__Group__3__Impl_in_rule__DomainDataImport__Group__34417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DomainDataImport__Group__3__Impl4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__04484 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__04487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__InitialTransitionAssignment_0_in_rule__State__Group__0__Impl4514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__14545 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__14548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl4575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__24605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Alternatives_2_in_rule__State__Group__2__Impl4632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_2_1__0__Impl_in_rule__State__Group_2_1__04668 = new BitSet(new long[]{0x0000010370000020L});
    public static final BitSet FOLLOW_rule__State__Group_2_1__1_in_rule__State__Group_2_1__04671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__State__Group_2_1__0__Impl4699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_2_1__1__Impl_in_rule__State__Group_2_1__14730 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__State__Group_2_1__2_in_rule__State__Group_2_1__14733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Alternatives_2_1_1_in_rule__State__Group_2_1__1__Impl4760 = new BitSet(new long[]{0x0000010360000022L});
    public static final BitSet FOLLOW_rule__State__Group_2_1__2__Impl_in_rule__State__Group_2_1__24791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__State__Group_2_1__2__Impl4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__0__Impl_in_rule__InitialTransition__Group__04856 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__1_in_rule__InitialTransition__Group__04859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__1__Impl_in_rule__InitialTransition__Group__14917 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__2_in_rule__InitialTransition__Group__14920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__InitialTransition__Group__1__Impl4948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group__2__Impl_in_rule__InitialTransition__Group__24979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group_2__0_in_rule__InitialTransition__Group__2__Impl5006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group_2__0__Impl_in_rule__InitialTransition__Group_2__05043 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group_2__1_in_rule__InitialTransition__Group_2__05046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__InitialTransition__Group_2__0__Impl5074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__Group_2__1__Impl_in_rule__InitialTransition__Group_2__15105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialTransition__ActionAssignment_2_1_in_rule__InitialTransition__Group_2__1__Impl5132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__05166 = new BitSet(new long[]{0x0000000340008000L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__05169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Alternatives_0_in_rule__Transition__Group__0__Impl5196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__15226 = new BitSet(new long[]{0x0000000240008000L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__15229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_1__0_in_rule__Transition__Group__1__Impl5256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__25287 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__25290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_2__0_in_rule__Transition__Group__2__Impl5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__35348 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__35351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__0_in_rule__Transition__Group__3__Impl5378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__45409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Transition__Group__4__Impl5437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_0_0__0__Impl_in_rule__Transition__Group_0_0__05478 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Transition__Group_0_0__1_in_rule__Transition__Group_0_0__05481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Transition__Group_0_0__0__Impl5509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_0_0__1__Impl_in_rule__Transition__Group_0_0__15540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__TargetAssignment_0_0_1_in_rule__Transition__Group_0_0__1__Impl5567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_0_1__0__Impl_in_rule__Transition__Group_0_1__05601 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Transition__Group_0_1__1_in_rule__Transition__Group_0_1__05604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__TargetAssignment_0_1_0_in_rule__Transition__Group_0_1__0__Impl5631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_0_1__1__Impl_in_rule__Transition__Group_0_1__15661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Transition__Group_0_1__1__Impl5689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_1__0__Impl_in_rule__Transition__Group_1__05724 = new BitSet(new long[]{0x00000038A00000A0L});
    public static final BitSet FOLLOW_rule__Transition__Group_1__1_in_rule__Transition__Group_1__05727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Transition__Group_1__0__Impl5755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_1__1__Impl_in_rule__Transition__Group_1__15786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__EventAssignment_1_1_in_rule__Transition__Group_1__1__Impl5813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_2__0__Impl_in_rule__Transition__Group_2__05847 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Transition__Group_2__1_in_rule__Transition__Group_2__05850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Transition__Group_2__0__Impl5878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_2__1__Impl_in_rule__Transition__Group_2__15909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__ConditionAssignment_2_1_in_rule__Transition__Group_2__1__Impl5936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__0__Impl_in_rule__Transition__Group_3__05970 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__1_in_rule__Transition__Group_3__05973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Transition__Group_3__0__Impl6001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__1__Impl_in_rule__Transition__Group_3__16032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__ActionAssignment_3_1_in_rule__Transition__Group_3__1__Impl6059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalTransition__Group__0__Impl_in_rule__InternalTransition__Group__06093 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_rule__InternalTransition__Group__1_in_rule__InternalTransition__Group__06096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalTransition__Group_0__0_in_rule__InternalTransition__Group__0__Impl6123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalTransition__Group__1__Impl_in_rule__InternalTransition__Group__16154 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__InternalTransition__Group__2_in_rule__InternalTransition__Group__16157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalTransition__Group_1__0_in_rule__InternalTransition__Group__1__Impl6184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalTransition__Group__2__Impl_in_rule__InternalTransition__Group__26215 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_rule__InternalTransition__Group__3_in_rule__InternalTransition__Group__26218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__InternalTransition__Group__2__Impl6246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalTransition__Group__3__Impl_in_rule__InternalTransition__Group__36277 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__InternalTransition__Group__4_in_rule__InternalTransition__Group__36280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalTransition__ActionAssignment_3_in_rule__InternalTransition__Group__3__Impl6307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalTransition__Group__4__Impl_in_rule__InternalTransition__Group__46337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__InternalTransition__Group__4__Impl6365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalTransition__Group_0__0__Impl_in_rule__InternalTransition__Group_0__06406 = new BitSet(new long[]{0x00000038A00000A0L});
    public static final BitSet FOLLOW_rule__InternalTransition__Group_0__1_in_rule__InternalTransition__Group_0__06409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__InternalTransition__Group_0__0__Impl6437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalTransition__Group_0__1__Impl_in_rule__InternalTransition__Group_0__16468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalTransition__EventAssignment_0_1_in_rule__InternalTransition__Group_0__1__Impl6495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalTransition__Group_1__0__Impl_in_rule__InternalTransition__Group_1__06529 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__InternalTransition__Group_1__1_in_rule__InternalTransition__Group_1__06532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__InternalTransition__Group_1__0__Impl6560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalTransition__Group_1__1__Impl_in_rule__InternalTransition__Group_1__16591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalTransition__ConditionAssignment_1_1_in_rule__InternalTransition__Group_1__1__Impl6618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolicEvent__Group__0__Impl_in_rule__SymbolicEvent__Group__06652 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__SymbolicEvent__Group__1_in_rule__SymbolicEvent__Group__06655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolicEvent__NameAssignment_0_in_rule__SymbolicEvent__Group__0__Impl6682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolicEvent__Group__1__Impl_in_rule__SymbolicEvent__Group__16712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__SymbolicEvent__Group__1__Impl6740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Group_0_0__0__Impl_in_rule__TransitionEvent__Group_0_0__06775 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Group_0_0__1_in_rule__TransitionEvent__Group_0_0__06778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__SourceAssignment_0_0_0_in_rule__TransitionEvent__Group_0_0__0__Impl6805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Group_0_0__1__Impl_in_rule__TransitionEvent__Group_0_0__16835 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Group_0_0__2_in_rule__TransitionEvent__Group_0_0__16838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TransitionEvent__Group_0_0__1__Impl6866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Group_0_0__2__Impl_in_rule__TransitionEvent__Group_0_0__26897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__TargetAssignment_0_0_2_in_rule__TransitionEvent__Group_0_0__2__Impl6924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Group_0_1__0__Impl_in_rule__TransitionEvent__Group_0_1__06960 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Group_0_1__1_in_rule__TransitionEvent__Group_0_1__06963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__TargetAssignment_0_1_0_in_rule__TransitionEvent__Group_0_1__0__Impl6990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Group_0_1__1__Impl_in_rule__TransitionEvent__Group_0_1__17020 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Group_0_1__2_in_rule__TransitionEvent__Group_0_1__17023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TransitionEvent__Group_0_1__1__Impl7051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Group_0_1__2__Impl_in_rule__TransitionEvent__Group_0_1__27082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__SourceAssignment_0_1_2_in_rule__TransitionEvent__Group_0_1__2__Impl7109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Group_1_0__0__Impl_in_rule__TransitionEvent__Group_1_0__07145 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Group_1_0__1_in_rule__TransitionEvent__Group_1_0__07148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TransitionEvent__Group_1_0__0__Impl7176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Group_1_0__1__Impl_in_rule__TransitionEvent__Group_1_0__17207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__TargetAssignment_1_0_1_in_rule__TransitionEvent__Group_1_0__1__Impl7234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Group_1_1__0__Impl_in_rule__TransitionEvent__Group_1_1__07268 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Group_1_1__1_in_rule__TransitionEvent__Group_1_1__07271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__TargetAssignment_1_1_0_in_rule__TransitionEvent__Group_1_1__0__Impl7298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Group_1_1__1__Impl_in_rule__TransitionEvent__Group_1_1__17328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TransitionEvent__Group_1_1__1__Impl7356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Group_2_0__0__Impl_in_rule__TransitionEvent__Group_2_0__07391 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Group_2_0__1_in_rule__TransitionEvent__Group_2_0__07394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__SourceAssignment_2_0_0_in_rule__TransitionEvent__Group_2_0__0__Impl7421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Group_2_0__1__Impl_in_rule__TransitionEvent__Group_2_0__17451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TransitionEvent__Group_2_0__1__Impl7479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Group_2_1__0__Impl_in_rule__TransitionEvent__Group_2_1__07514 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Group_2_1__1_in_rule__TransitionEvent__Group_2_1__07517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TransitionEvent__Group_2_1__0__Impl7545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__Group_2_1__1__Impl_in_rule__TransitionEvent__Group_2_1__17576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionEvent__SourceAssignment_2_1_1_in_rule__TransitionEvent__Group_2_1__1__Impl7603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnterEvent__Group__0__Impl_in_rule__EnterEvent__Group__07637 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__EnterEvent__Group__1_in_rule__EnterEvent__Group__07640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnterEvent__Group__1__Impl_in_rule__EnterEvent__Group__17698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EnterEvent__Group__1__Impl7726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExitEvent__Group__0__Impl_in_rule__ExitEvent__Group__07761 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ExitEvent__Group__1_in_rule__ExitEvent__Group__07764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExitEvent__Group__1__Impl_in_rule__ExitEvent__Group__17822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ExitEvent__Group__1__Impl7850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimerEvent__Group__0__Impl_in_rule__TimerEvent__Group__07885 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__TimerEvent__Group__1_in_rule__TimerEvent__Group__07888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__TimerEvent__Group__0__Impl7916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimerEvent__Group__1__Impl_in_rule__TimerEvent__Group__17947 = new BitSet(new long[]{0x00003000000C06F0L});
    public static final BitSet FOLLOW_rule__TimerEvent__Group__2_in_rule__TimerEvent__Group__17950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__TimerEvent__Group__1__Impl7978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimerEvent__Group__2__Impl_in_rule__TimerEvent__Group__28009 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__TimerEvent__Group__3_in_rule__TimerEvent__Group__28012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimerEvent__DelayAssignment_2_in_rule__TimerEvent__Group__2__Impl8039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimerEvent__Group__3__Impl_in_rule__TimerEvent__Group__38069 = new BitSet(new long[]{0x00000038A00000A0L});
    public static final BitSet FOLLOW_rule__TimerEvent__Group__4_in_rule__TimerEvent__Group__38072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TimerEvent__Group__3__Impl8100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimerEvent__Group__4__Impl_in_rule__TimerEvent__Group__48131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimerEvent__EventAssignment_4_in_rule__TimerEvent__Group__4__Impl8158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolicAction__Group__0__Impl_in_rule__SymbolicAction__Group__08198 = new BitSet(new long[]{0x0000008400000000L});
    public static final BitSet FOLLOW_rule__SymbolicAction__Group__1_in_rule__SymbolicAction__Group__08201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolicAction__NameAssignment_0_in_rule__SymbolicAction__Group__0__Impl8228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolicAction__Group__1__Impl_in_rule__SymbolicAction__Group__18258 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__SymbolicAction__Group__2_in_rule__SymbolicAction__Group__18261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolicAction__Group_1__0_in_rule__SymbolicAction__Group__1__Impl8288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolicAction__Group__2__Impl_in_rule__SymbolicAction__Group__28319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__SymbolicAction__Group__2__Impl8347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolicAction__Group_1__0__Impl_in_rule__SymbolicAction__Group_1__08384 = new BitSet(new long[]{0x00003000000C06F0L});
    public static final BitSet FOLLOW_rule__SymbolicAction__Group_1__1_in_rule__SymbolicAction__Group_1__08387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__SymbolicAction__Group_1__0__Impl8415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolicAction__Group_1__1__Impl_in_rule__SymbolicAction__Group_1__18446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolicAction__DelayAssignment_1_1_in_rule__SymbolicAction__Group_1__1__Impl8473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDef__Group__0__Impl_in_rule__VarDef__Group__08507 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__VarDef__Group__1_in_rule__VarDef__Group__08510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__VarDef__Group__0__Impl8538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDef__Group__1__Impl_in_rule__VarDef__Group__18569 = new BitSet(new long[]{0x0000060000008000L});
    public static final BitSet FOLLOW_rule__VarDef__Group__2_in_rule__VarDef__Group__18572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDef__NameAssignment_1_in_rule__VarDef__Group__1__Impl8599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDef__Group__2__Impl_in_rule__VarDef__Group__28629 = new BitSet(new long[]{0x0000040000008000L});
    public static final BitSet FOLLOW_rule__VarDef__Group__3_in_rule__VarDef__Group__28632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDef__Group_2__0_in_rule__VarDef__Group__2__Impl8659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDef__Group__3__Impl_in_rule__VarDef__Group__38690 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__VarDef__Group__4_in_rule__VarDef__Group__38693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDef__Group_3__0_in_rule__VarDef__Group__3__Impl8720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDef__Group__4__Impl_in_rule__VarDef__Group__48751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__VarDef__Group__4__Impl8779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDef__Group_2__0__Impl_in_rule__VarDef__Group_2__08820 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__VarDef__Group_2__1_in_rule__VarDef__Group_2__08823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__VarDef__Group_2__0__Impl8851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDef__Group_2__1__Impl_in_rule__VarDef__Group_2__18882 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_rule__VarDef__Group_2__2_in_rule__VarDef__Group_2__18885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDef__ETypeAssignment_2_1_in_rule__VarDef__Group_2__1__Impl8912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDef__Group_2__2__Impl_in_rule__VarDef__Group_2__28942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDef__ManyAssignment_2_2_in_rule__VarDef__Group_2__2__Impl8969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDef__Group_3__0__Impl_in_rule__VarDef__Group_3__09006 = new BitSet(new long[]{0x00003000000C06F0L});
    public static final BitSet FOLLOW_rule__VarDef__Group_3__1_in_rule__VarDef__Group_3__09009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__VarDef__Group_3__0__Impl9037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDef__Group_3__1__Impl_in_rule__VarDef__Group_3__19068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDef__InitAssignment_3_1_in_rule__VarDef__Group_3__1__Impl9095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentAction__Group__0__Impl_in_rule__AssignmentAction__Group__09129 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__AssignmentAction__Group__1_in_rule__AssignmentAction__Group__09132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentAction__VarAssignment_0_in_rule__AssignmentAction__Group__0__Impl9159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentAction__Group__1__Impl_in_rule__AssignmentAction__Group__19189 = new BitSet(new long[]{0x00003000000C06F0L});
    public static final BitSet FOLLOW_rule__AssignmentAction__Group__2_in_rule__AssignmentAction__Group__19192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__AssignmentAction__Group__1__Impl9220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentAction__Group__2__Impl_in_rule__AssignmentAction__Group__29251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentAction__ValueAssignment_2_in_rule__AssignmentAction__Group__2__Impl9278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FLOAT_LITERAL__Group__0__Impl_in_rule__FLOAT_LITERAL__Group__09314 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__FLOAT_LITERAL__Group__1_in_rule__FLOAT_LITERAL__Group__09317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FLOAT_LITERAL__Alternatives_0_in_rule__FLOAT_LITERAL__Group__0__Impl9344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FLOAT_LITERAL__Group__1__Impl_in_rule__FLOAT_LITERAL__Group__19374 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FLOAT_LITERAL__Group__2_in_rule__FLOAT_LITERAL__Group__19377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__FLOAT_LITERAL__Group__1__Impl9405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FLOAT_LITERAL__Group__2__Impl_in_rule__FLOAT_LITERAL__Group__29436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FLOAT_LITERAL__Group__2__Impl9463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__POS_INT__Group__0__Impl_in_rule__POS_INT__Group__09498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__POS_INT__Group__1_in_rule__POS_INT__Group__09501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__POS_INT__Group__0__Impl9529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__POS_INT__Group__1__Impl_in_rule__POS_INT__Group__19560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__POS_INT__Group__1__Impl9587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NEG_INT__Group__0__Impl_in_rule__NEG_INT__Group__09620 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NEG_INT__Group__1_in_rule__NEG_INT__Group__09623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__NEG_INT__Group__0__Impl9651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NEG_INT__Group__1__Impl_in_rule__NEG_INT__Group__19682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NEG_INT__Group__1__Impl9709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QNAME__Group__0__Impl_in_rule__QNAME__Group__09742 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__QNAME__Group__1_in_rule__QNAME__Group__09745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QNAME__Group__0__Impl9772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QNAME__Group__1__Impl_in_rule__QNAME__Group__19801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QNAME__Group_1__0_in_rule__QNAME__Group__1__Impl9828 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__QNAME__Group_1__0__Impl_in_rule__QNAME__Group_1__09863 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__QNAME__Group_1__1_in_rule__QNAME__Group_1__09866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__QNAME__Group_1__0__Impl9894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QNAME__Group_1__1__Impl_in_rule__QNAME__Group_1__19925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QNAME__Group_1__1__Impl9952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelayLiteral__Group__0__Impl_in_rule__DelayLiteral__Group__09985 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_rule__DelayLiteral__Group__1_in_rule__DelayLiteral__Group__09988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelayLiteral__IntValueAssignment_0_in_rule__DelayLiteral__Group__0__Impl10015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelayLiteral__Group__1__Impl_in_rule__DelayLiteral__Group__110045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelayLiteral__TimeUnitAssignment_1_in_rule__DelayLiteral__Group__1__Impl10072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPath__Group__0__Impl_in_rule__EPath__Group__010106 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__EPath__Group__1_in_rule__EPath__Group__010109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPath__VarAssignment_0_in_rule__EPath__Group__0__Impl10136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPath__Group__1__Impl_in_rule__EPath__Group__110166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EPath__StepsAssignment_1_in_rule__EPath__Group__1__Impl10193 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__EStep__Group__0__Impl_in_rule__EStep__Group__010228 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EStep__Group__1_in_rule__EStep__Group__010231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__EStep__Group__0__Impl10259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EStep__Group__1__Impl_in_rule__EStep__Group__110290 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__EStep__Group__2_in_rule__EStep__Group__110293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EStep__FeatureNameAssignment_1_in_rule__EStep__Group__1__Impl10320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EStep__Group__2__Impl_in_rule__EStep__Group__210350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EStep__FilterAssignment_2_in_rule__EStep__Group__2__Impl10377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceImport_in_rule__StateMachine__ImportsAssignment_010419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__StateMachine__StatesAssignment_1_010450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractTransition_in_rule__StateMachine__TransitionsAssignment_1_110481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDef_in_rule__StateMachine__VariablesAssignment_1_210512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DomainModelImport__ImportURIAssignment_210543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DomainDataImport__ImportURIAssignment_210574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialTransition_in_rule__State__InitialTransitionAssignment_010605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_110636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__State__StatesAssignment_2_1_1_010667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractTransition_in_rule__State__TransitionsAssignment_2_1_1_110698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDef_in_rule__State__VariablesAssignment_2_1_1_210729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__InitialTransition__ActionAssignment_2_110760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNAME_in_rule__Transition__TargetAssignment_0_0_110795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNAME_in_rule__Transition__TargetAssignment_0_1_010834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Transition__EventAssignment_1_110869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__Transition__ConditionAssignment_2_110900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__Transition__ActionAssignment_3_110931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__InternalTransition__EventAssignment_0_110962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__InternalTransition__ConditionAssignment_1_110993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__InternalTransition__ActionAssignment_311024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SymbolicEvent__NameAssignment_011055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNAME_in_rule__TransitionEvent__SourceAssignment_0_0_011090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNAME_in_rule__TransitionEvent__TargetAssignment_0_0_211129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNAME_in_rule__TransitionEvent__TargetAssignment_0_1_011168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNAME_in_rule__TransitionEvent__SourceAssignment_0_1_211207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNAME_in_rule__TransitionEvent__TargetAssignment_1_0_111246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNAME_in_rule__TransitionEvent__TargetAssignment_1_1_011285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNAME_in_rule__TransitionEvent__SourceAssignment_2_0_011324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNAME_in_rule__TransitionEvent__SourceAssignment_2_1_111363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SCRIPT_EXPRESSION_in_rule__ScriptEvent__ScriptAssignment11398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__TimerEvent__DelayAssignment_211429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__TimerEvent__EventAssignment_411460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SCRIPT_EXPRESSION_in_rule__Condition__ScriptAssignment11491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SymbolicAction__NameAssignment_011522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SymbolicAction__DelayAssignment_1_111553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SCRIPT_STATEMENTS_in_rule__ScriptAction__ScriptAssignment11584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDef__NameAssignment_111615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNAME_in_rule__VarDef__ETypeAssignment_2_111650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDef__ManyAlternatives_2_2_0_in_rule__VarDef__ManyAssignment_2_211685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__VarDef__InitAssignment_3_111718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNAME_in_rule__AssignmentAction__VarAssignment_011753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__AssignmentAction__ValueAssignment_211788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_LITERAL_in_rule__BooleanLiteral__BooleanValueAssignment11819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntLiteral__IntValueAlternatives_0_in_rule__IntLiteral__IntValueAssignment11850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFLOAT_LITERAL_in_rule__FloatLiteral__FloatValueAssignment11883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__StringValueAssignment11914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URI_LITERAL_in_rule__UriLiteral__UriAssignment11945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EOBJECT_URI_LITERAL_in_rule__EObjectUriLiteral__UriAssignment11976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DelayLiteral__IntValueAssignment_012007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_rule__DelayLiteral__TimeUnitAssignment_112038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNAME_in_rule__VarRef__VarAssignment12073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRef_in_rule__EPath__VarAssignment_012108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStep_in_rule__EPath__StepsAssignment_112139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EStep__FeatureNameAssignment_112170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEStepFilter_in_rule__EStep__FilterAssignment_212201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScriptExpression_in_rule__EStepFilter__ScriptAssignment12232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SCRIPT_EXPRESSION_in_rule__ScriptExpression__ScriptAssignment12263 = new BitSet(new long[]{0x0000000000000002L});

}