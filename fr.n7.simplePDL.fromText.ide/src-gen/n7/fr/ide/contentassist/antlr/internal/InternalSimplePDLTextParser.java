package n7.fr.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import n7.fr.services.SimplePDLTextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimplePDLTextParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_ID", "RULE_INT", "RULE_COMMENT_BODY", "RULE_WS", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'start'", "'finish'", "'process'", "':'", "'work'", "'uses'", "','", "'rule'", "'to'", "'available'"
    };
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_EOL=4;
    public static final int RULE_WS=8;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_COMMENT_BODY=7;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSimplePDLTextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimplePDLTextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimplePDLTextParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSimplePDLText.g"; }


    	private SimplePDLTextGrammarAccess grammarAccess;

    	public void setGrammarAccess(SimplePDLTextGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProcess"
    // InternalSimplePDLText.g:53:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // InternalSimplePDLText.g:54:1: ( ruleProcess EOF )
            // InternalSimplePDLText.g:55:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalSimplePDLText.g:62:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:66:2: ( ( ( rule__Process__Group__0 ) ) )
            // InternalSimplePDLText.g:67:2: ( ( rule__Process__Group__0 ) )
            {
            // InternalSimplePDLText.g:67:2: ( ( rule__Process__Group__0 ) )
            // InternalSimplePDLText.g:68:3: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // InternalSimplePDLText.g:69:3: ( rule__Process__Group__0 )
            // InternalSimplePDLText.g:69:4: rule__Process__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleSyntaxElement"
    // InternalSimplePDLText.g:78:1: entryRuleSyntaxElement : ruleSyntaxElement EOF ;
    public final void entryRuleSyntaxElement() throws RecognitionException {
        try {
            // InternalSimplePDLText.g:79:1: ( ruleSyntaxElement EOF )
            // InternalSimplePDLText.g:80:1: ruleSyntaxElement EOF
            {
             before(grammarAccess.getSyntaxElementRule()); 
            pushFollow(FOLLOW_1);
            ruleSyntaxElement();

            state._fsp--;

             after(grammarAccess.getSyntaxElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSyntaxElement"


    // $ANTLR start "ruleSyntaxElement"
    // InternalSimplePDLText.g:87:1: ruleSyntaxElement : ( ( rule__SyntaxElement__Alternatives ) ) ;
    public final void ruleSyntaxElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:91:2: ( ( ( rule__SyntaxElement__Alternatives ) ) )
            // InternalSimplePDLText.g:92:2: ( ( rule__SyntaxElement__Alternatives ) )
            {
            // InternalSimplePDLText.g:92:2: ( ( rule__SyntaxElement__Alternatives ) )
            // InternalSimplePDLText.g:93:3: ( rule__SyntaxElement__Alternatives )
            {
             before(grammarAccess.getSyntaxElementAccess().getAlternatives()); 
            // InternalSimplePDLText.g:94:3: ( rule__SyntaxElement__Alternatives )
            // InternalSimplePDLText.g:94:4: rule__SyntaxElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SyntaxElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSyntaxElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSyntaxElement"


    // $ANTLR start "entryRuleProcessElement"
    // InternalSimplePDLText.g:103:1: entryRuleProcessElement : ruleProcessElement EOF ;
    public final void entryRuleProcessElement() throws RecognitionException {
        try {
            // InternalSimplePDLText.g:104:1: ( ruleProcessElement EOF )
            // InternalSimplePDLText.g:105:1: ruleProcessElement EOF
            {
             before(grammarAccess.getProcessElementRule()); 
            pushFollow(FOLLOW_1);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // InternalSimplePDLText.g:112:1: ruleProcessElement : ( ( rule__ProcessElement__Alternatives ) ) ;
    public final void ruleProcessElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:116:2: ( ( ( rule__ProcessElement__Alternatives ) ) )
            // InternalSimplePDLText.g:117:2: ( ( rule__ProcessElement__Alternatives ) )
            {
            // InternalSimplePDLText.g:117:2: ( ( rule__ProcessElement__Alternatives ) )
            // InternalSimplePDLText.g:118:3: ( rule__ProcessElement__Alternatives )
            {
             before(grammarAccess.getProcessElementAccess().getAlternatives()); 
            // InternalSimplePDLText.g:119:3: ( rule__ProcessElement__Alternatives )
            // InternalSimplePDLText.g:119:4: rule__ProcessElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProcessElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProcessElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalSimplePDLText.g:128:1: entryRuleWorkDefinition : ruleWorkDefinition EOF ;
    public final void entryRuleWorkDefinition() throws RecognitionException {
        try {
            // InternalSimplePDLText.g:129:1: ( ruleWorkDefinition EOF )
            // InternalSimplePDLText.g:130:1: ruleWorkDefinition EOF
            {
             before(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkDefinition();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalSimplePDLText.g:137:1: ruleWorkDefinition : ( ( rule__WorkDefinition__Group__0 ) ) ;
    public final void ruleWorkDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:141:2: ( ( ( rule__WorkDefinition__Group__0 ) ) )
            // InternalSimplePDLText.g:142:2: ( ( rule__WorkDefinition__Group__0 ) )
            {
            // InternalSimplePDLText.g:142:2: ( ( rule__WorkDefinition__Group__0 ) )
            // InternalSimplePDLText.g:143:3: ( rule__WorkDefinition__Group__0 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup()); 
            // InternalSimplePDLText.g:144:3: ( rule__WorkDefinition__Group__0 )
            // InternalSimplePDLText.g:144:4: rule__WorkDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalSimplePDLText.g:153:1: entryRuleWorkSequence : ruleWorkSequence EOF ;
    public final void entryRuleWorkSequence() throws RecognitionException {
        try {
            // InternalSimplePDLText.g:154:1: ( ruleWorkSequence EOF )
            // InternalSimplePDLText.g:155:1: ruleWorkSequence EOF
            {
             before(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getWorkSequenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalSimplePDLText.g:162:1: ruleWorkSequence : ( ( rule__WorkSequence__Group__0 ) ) ;
    public final void ruleWorkSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:166:2: ( ( ( rule__WorkSequence__Group__0 ) ) )
            // InternalSimplePDLText.g:167:2: ( ( rule__WorkSequence__Group__0 ) )
            {
            // InternalSimplePDLText.g:167:2: ( ( rule__WorkSequence__Group__0 ) )
            // InternalSimplePDLText.g:168:3: ( rule__WorkSequence__Group__0 )
            {
             before(grammarAccess.getWorkSequenceAccess().getGroup()); 
            // InternalSimplePDLText.g:169:3: ( rule__WorkSequence__Group__0 )
            // InternalSimplePDLText.g:169:4: rule__WorkSequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getGroup()); 

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
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleRessource"
    // InternalSimplePDLText.g:178:1: entryRuleRessource : ruleRessource EOF ;
    public final void entryRuleRessource() throws RecognitionException {
        try {
            // InternalSimplePDLText.g:179:1: ( ruleRessource EOF )
            // InternalSimplePDLText.g:180:1: ruleRessource EOF
            {
             before(grammarAccess.getRessourceRule()); 
            pushFollow(FOLLOW_1);
            ruleRessource();

            state._fsp--;

             after(grammarAccess.getRessourceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRessource"


    // $ANTLR start "ruleRessource"
    // InternalSimplePDLText.g:187:1: ruleRessource : ( ( rule__Ressource__Group__0 ) ) ;
    public final void ruleRessource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:191:2: ( ( ( rule__Ressource__Group__0 ) ) )
            // InternalSimplePDLText.g:192:2: ( ( rule__Ressource__Group__0 ) )
            {
            // InternalSimplePDLText.g:192:2: ( ( rule__Ressource__Group__0 ) )
            // InternalSimplePDLText.g:193:3: ( rule__Ressource__Group__0 )
            {
             before(grammarAccess.getRessourceAccess().getGroup()); 
            // InternalSimplePDLText.g:194:3: ( rule__Ressource__Group__0 )
            // InternalSimplePDLText.g:194:4: rule__Ressource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getGroup()); 

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
    // $ANTLR end "ruleRessource"


    // $ANTLR start "entryRuleRessourceLink"
    // InternalSimplePDLText.g:203:1: entryRuleRessourceLink : ruleRessourceLink EOF ;
    public final void entryRuleRessourceLink() throws RecognitionException {
        try {
            // InternalSimplePDLText.g:204:1: ( ruleRessourceLink EOF )
            // InternalSimplePDLText.g:205:1: ruleRessourceLink EOF
            {
             before(grammarAccess.getRessourceLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleRessourceLink();

            state._fsp--;

             after(grammarAccess.getRessourceLinkRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRessourceLink"


    // $ANTLR start "ruleRessourceLink"
    // InternalSimplePDLText.g:212:1: ruleRessourceLink : ( ( rule__RessourceLink__Group__0 ) ) ;
    public final void ruleRessourceLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:216:2: ( ( ( rule__RessourceLink__Group__0 ) ) )
            // InternalSimplePDLText.g:217:2: ( ( rule__RessourceLink__Group__0 ) )
            {
            // InternalSimplePDLText.g:217:2: ( ( rule__RessourceLink__Group__0 ) )
            // InternalSimplePDLText.g:218:3: ( rule__RessourceLink__Group__0 )
            {
             before(grammarAccess.getRessourceLinkAccess().getGroup()); 
            // InternalSimplePDLText.g:219:3: ( rule__RessourceLink__Group__0 )
            // InternalSimplePDLText.g:219:4: rule__RessourceLink__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RessourceLink__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRessourceLinkAccess().getGroup()); 

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
    // $ANTLR end "ruleRessourceLink"


    // $ANTLR start "entryRuleGuidance"
    // InternalSimplePDLText.g:228:1: entryRuleGuidance : ruleGuidance EOF ;
    public final void entryRuleGuidance() throws RecognitionException {
        try {
            // InternalSimplePDLText.g:229:1: ( ruleGuidance EOF )
            // InternalSimplePDLText.g:230:1: ruleGuidance EOF
            {
             before(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_1);
            ruleGuidance();

            state._fsp--;

             after(grammarAccess.getGuidanceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // InternalSimplePDLText.g:237:1: ruleGuidance : ( ( rule__Guidance__Group__0 ) ) ;
    public final void ruleGuidance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:241:2: ( ( ( rule__Guidance__Group__0 ) ) )
            // InternalSimplePDLText.g:242:2: ( ( rule__Guidance__Group__0 ) )
            {
            // InternalSimplePDLText.g:242:2: ( ( rule__Guidance__Group__0 ) )
            // InternalSimplePDLText.g:243:3: ( rule__Guidance__Group__0 )
            {
             before(grammarAccess.getGuidanceAccess().getGroup()); 
            // InternalSimplePDLText.g:244:3: ( rule__Guidance__Group__0 )
            // InternalSimplePDLText.g:244:4: rule__Guidance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getGroup()); 

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
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "ruleStateType"
    // InternalSimplePDLText.g:253:1: ruleStateType : ( ( rule__StateType__Alternatives ) ) ;
    public final void ruleStateType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:257:1: ( ( ( rule__StateType__Alternatives ) ) )
            // InternalSimplePDLText.g:258:2: ( ( rule__StateType__Alternatives ) )
            {
            // InternalSimplePDLText.g:258:2: ( ( rule__StateType__Alternatives ) )
            // InternalSimplePDLText.g:259:3: ( rule__StateType__Alternatives )
            {
             before(grammarAccess.getStateTypeAccess().getAlternatives()); 
            // InternalSimplePDLText.g:260:3: ( rule__StateType__Alternatives )
            // InternalSimplePDLText.g:260:4: rule__StateType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StateType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStateTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStateType"


    // $ANTLR start "rule__SyntaxElement__Alternatives"
    // InternalSimplePDLText.g:268:1: rule__SyntaxElement__Alternatives : ( ( ruleProcessElement ) | ( ruleGuidance ) );
    public final void rule__SyntaxElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:272:1: ( ( ruleProcessElement ) | ( ruleGuidance ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalSimplePDLText.g:273:2: ( ruleProcessElement )
                    {
                    // InternalSimplePDLText.g:273:2: ( ruleProcessElement )
                    // InternalSimplePDLText.g:274:3: ruleProcessElement
                    {
                     before(grammarAccess.getSyntaxElementAccess().getProcessElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleProcessElement();

                    state._fsp--;

                     after(grammarAccess.getSyntaxElementAccess().getProcessElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimplePDLText.g:279:2: ( ruleGuidance )
                    {
                    // InternalSimplePDLText.g:279:2: ( ruleGuidance )
                    // InternalSimplePDLText.g:280:3: ruleGuidance
                    {
                     before(grammarAccess.getSyntaxElementAccess().getGuidanceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGuidance();

                    state._fsp--;

                     after(grammarAccess.getSyntaxElementAccess().getGuidanceParserRuleCall_1()); 

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
    // $ANTLR end "rule__SyntaxElement__Alternatives"


    // $ANTLR start "rule__ProcessElement__Alternatives"
    // InternalSimplePDLText.g:289:1: rule__ProcessElement__Alternatives : ( ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleRessource ) );
    public final void rule__ProcessElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:293:1: ( ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleRessource ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case RULE_INT:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSimplePDLText.g:294:2: ( ruleWorkDefinition )
                    {
                    // InternalSimplePDLText.g:294:2: ( ruleWorkDefinition )
                    // InternalSimplePDLText.g:295:3: ruleWorkDefinition
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkDefinition();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimplePDLText.g:300:2: ( ruleWorkSequence )
                    {
                    // InternalSimplePDLText.g:300:2: ( ruleWorkSequence )
                    // InternalSimplePDLText.g:301:3: ruleWorkSequence
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkSequence();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimplePDLText.g:306:2: ( ruleRessource )
                    {
                    // InternalSimplePDLText.g:306:2: ( ruleRessource )
                    // InternalSimplePDLText.g:307:3: ruleRessource
                    {
                     before(grammarAccess.getProcessElementAccess().getRessourceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRessource();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getRessourceParserRuleCall_2()); 

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
    // $ANTLR end "rule__ProcessElement__Alternatives"


    // $ANTLR start "rule__StateType__Alternatives"
    // InternalSimplePDLText.g:316:1: rule__StateType__Alternatives : ( ( ( 'start' ) ) | ( ( 'finish' ) ) );
    public final void rule__StateType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:320:1: ( ( ( 'start' ) ) | ( ( 'finish' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSimplePDLText.g:321:2: ( ( 'start' ) )
                    {
                    // InternalSimplePDLText.g:321:2: ( ( 'start' ) )
                    // InternalSimplePDLText.g:322:3: ( 'start' )
                    {
                     before(grammarAccess.getStateTypeAccess().getStartEnumLiteralDeclaration_0()); 
                    // InternalSimplePDLText.g:323:3: ( 'start' )
                    // InternalSimplePDLText.g:323:4: 'start'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getStateTypeAccess().getStartEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimplePDLText.g:327:2: ( ( 'finish' ) )
                    {
                    // InternalSimplePDLText.g:327:2: ( ( 'finish' ) )
                    // InternalSimplePDLText.g:328:3: ( 'finish' )
                    {
                     before(grammarAccess.getStateTypeAccess().getFinishEnumLiteralDeclaration_1()); 
                    // InternalSimplePDLText.g:329:3: ( 'finish' )
                    // InternalSimplePDLText.g:329:4: 'finish'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getStateTypeAccess().getFinishEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__StateType__Alternatives"


    // $ANTLR start "rule__Process__Group__0"
    // InternalSimplePDLText.g:337:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:341:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // InternalSimplePDLText.g:342:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // InternalSimplePDLText.g:349:1: rule__Process__Group__0__Impl : ( 'process' ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:353:1: ( ( 'process' ) )
            // InternalSimplePDLText.g:354:1: ( 'process' )
            {
            // InternalSimplePDLText.g:354:1: ( 'process' )
            // InternalSimplePDLText.g:355:2: 'process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_0()); 

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
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // InternalSimplePDLText.g:364:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:368:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // InternalSimplePDLText.g:369:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // InternalSimplePDLText.g:376:1: rule__Process__Group__1__Impl : ( ( rule__Process__NameAssignment_1 ) ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:380:1: ( ( ( rule__Process__NameAssignment_1 ) ) )
            // InternalSimplePDLText.g:381:1: ( ( rule__Process__NameAssignment_1 ) )
            {
            // InternalSimplePDLText.g:381:1: ( ( rule__Process__NameAssignment_1 ) )
            // InternalSimplePDLText.g:382:2: ( rule__Process__NameAssignment_1 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_1()); 
            // InternalSimplePDLText.g:383:2: ( rule__Process__NameAssignment_1 )
            // InternalSimplePDLText.g:383:3: rule__Process__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // InternalSimplePDLText.g:391:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:395:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // InternalSimplePDLText.g:396:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // InternalSimplePDLText.g:403:1: rule__Process__Group__2__Impl : ( ':' ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:407:1: ( ( ':' ) )
            // InternalSimplePDLText.g:408:1: ( ':' )
            {
            // InternalSimplePDLText.g:408:1: ( ':' )
            // InternalSimplePDLText.g:409:2: ':'
            {
             before(grammarAccess.getProcessAccess().getColonKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__3"
    // InternalSimplePDLText.g:418:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:422:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // InternalSimplePDLText.g:423:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3"


    // $ANTLR start "rule__Process__Group__3__Impl"
    // InternalSimplePDLText.g:430:1: rule__Process__Group__3__Impl : ( ( rule__Process__Group_3__0 )* ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:434:1: ( ( ( rule__Process__Group_3__0 )* ) )
            // InternalSimplePDLText.g:435:1: ( ( rule__Process__Group_3__0 )* )
            {
            // InternalSimplePDLText.g:435:1: ( ( rule__Process__Group_3__0 )* )
            // InternalSimplePDLText.g:436:2: ( rule__Process__Group_3__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_3()); 
            // InternalSimplePDLText.g:437:2: ( rule__Process__Group_3__0 )*
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // InternalSimplePDLText.g:437:3: rule__Process__Group_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Process__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Process__Group__3__Impl"


    // $ANTLR start "rule__Process__Group__4"
    // InternalSimplePDLText.g:445:1: rule__Process__Group__4 : rule__Process__Group__4__Impl ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:449:1: ( rule__Process__Group__4__Impl )
            // InternalSimplePDLText.g:450:2: rule__Process__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4"


    // $ANTLR start "rule__Process__Group__4__Impl"
    // InternalSimplePDLText.g:456:1: rule__Process__Group__4__Impl : ( ( RULE_EOL )* ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:460:1: ( ( ( RULE_EOL )* ) )
            // InternalSimplePDLText.g:461:1: ( ( RULE_EOL )* )
            {
            // InternalSimplePDLText.g:461:1: ( ( RULE_EOL )* )
            // InternalSimplePDLText.g:462:2: ( RULE_EOL )*
            {
             before(grammarAccess.getProcessAccess().getEOLTerminalRuleCall_4()); 
            // InternalSimplePDLText.g:463:2: ( RULE_EOL )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_EOL) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSimplePDLText.g:463:3: RULE_EOL
            	    {
            	    match(input,RULE_EOL,FOLLOW_6); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getEOLTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__Process__Group__4__Impl"


    // $ANTLR start "rule__Process__Group_3__0"
    // InternalSimplePDLText.g:472:1: rule__Process__Group_3__0 : rule__Process__Group_3__0__Impl rule__Process__Group_3__1 ;
    public final void rule__Process__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:476:1: ( rule__Process__Group_3__0__Impl rule__Process__Group_3__1 )
            // InternalSimplePDLText.g:477:2: rule__Process__Group_3__0__Impl rule__Process__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Process__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_3__0"


    // $ANTLR start "rule__Process__Group_3__0__Impl"
    // InternalSimplePDLText.g:484:1: rule__Process__Group_3__0__Impl : ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) ) ;
    public final void rule__Process__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:488:1: ( ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) ) )
            // InternalSimplePDLText.g:489:1: ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) )
            {
            // InternalSimplePDLText.g:489:1: ( ( ( RULE_EOL ) ) ( ( RULE_EOL )* ) )
            // InternalSimplePDLText.g:490:2: ( ( RULE_EOL ) ) ( ( RULE_EOL )* )
            {
            // InternalSimplePDLText.g:490:2: ( ( RULE_EOL ) )
            // InternalSimplePDLText.g:491:3: ( RULE_EOL )
            {
             before(grammarAccess.getProcessAccess().getEOLTerminalRuleCall_3_0()); 
            // InternalSimplePDLText.g:492:3: ( RULE_EOL )
            // InternalSimplePDLText.g:492:4: RULE_EOL
            {
            match(input,RULE_EOL,FOLLOW_6); 

            }

             after(grammarAccess.getProcessAccess().getEOLTerminalRuleCall_3_0()); 

            }

            // InternalSimplePDLText.g:495:2: ( ( RULE_EOL )* )
            // InternalSimplePDLText.g:496:3: ( RULE_EOL )*
            {
             before(grammarAccess.getProcessAccess().getEOLTerminalRuleCall_3_0()); 
            // InternalSimplePDLText.g:497:3: ( RULE_EOL )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_EOL) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSimplePDLText.g:497:4: RULE_EOL
            	    {
            	    match(input,RULE_EOL,FOLLOW_6); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getEOLTerminalRuleCall_3_0()); 

            }


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
    // $ANTLR end "rule__Process__Group_3__0__Impl"


    // $ANTLR start "rule__Process__Group_3__1"
    // InternalSimplePDLText.g:506:1: rule__Process__Group_3__1 : rule__Process__Group_3__1__Impl ;
    public final void rule__Process__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:510:1: ( rule__Process__Group_3__1__Impl )
            // InternalSimplePDLText.g:511:2: rule__Process__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_3__1"


    // $ANTLR start "rule__Process__Group_3__1__Impl"
    // InternalSimplePDLText.g:517:1: rule__Process__Group_3__1__Impl : ( ( rule__Process__ProcessElementsAssignment_3_1 ) ) ;
    public final void rule__Process__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:521:1: ( ( ( rule__Process__ProcessElementsAssignment_3_1 ) ) )
            // InternalSimplePDLText.g:522:1: ( ( rule__Process__ProcessElementsAssignment_3_1 ) )
            {
            // InternalSimplePDLText.g:522:1: ( ( rule__Process__ProcessElementsAssignment_3_1 ) )
            // InternalSimplePDLText.g:523:2: ( rule__Process__ProcessElementsAssignment_3_1 )
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_3_1()); 
            // InternalSimplePDLText.g:524:2: ( rule__Process__ProcessElementsAssignment_3_1 )
            // InternalSimplePDLText.g:524:3: rule__Process__ProcessElementsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__ProcessElementsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_3_1()); 

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
    // $ANTLR end "rule__Process__Group_3__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__0"
    // InternalSimplePDLText.g:533:1: rule__WorkDefinition__Group__0 : rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 ;
    public final void rule__WorkDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:537:1: ( rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 )
            // InternalSimplePDLText.g:538:2: rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__WorkDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__0"


    // $ANTLR start "rule__WorkDefinition__Group__0__Impl"
    // InternalSimplePDLText.g:545:1: rule__WorkDefinition__Group__0__Impl : ( 'work' ) ;
    public final void rule__WorkDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:549:1: ( ( 'work' ) )
            // InternalSimplePDLText.g:550:1: ( 'work' )
            {
            // InternalSimplePDLText.g:550:1: ( 'work' )
            // InternalSimplePDLText.g:551:2: 'work'
            {
             before(grammarAccess.getWorkDefinitionAccess().getWorkKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getWorkKeyword_0()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__1"
    // InternalSimplePDLText.g:560:1: rule__WorkDefinition__Group__1 : rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 ;
    public final void rule__WorkDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:564:1: ( rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 )
            // InternalSimplePDLText.g:565:2: rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__WorkDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__1"


    // $ANTLR start "rule__WorkDefinition__Group__1__Impl"
    // InternalSimplePDLText.g:572:1: rule__WorkDefinition__Group__1__Impl : ( ( rule__WorkDefinition__NameAssignment_1 ) ) ;
    public final void rule__WorkDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:576:1: ( ( ( rule__WorkDefinition__NameAssignment_1 ) ) )
            // InternalSimplePDLText.g:577:1: ( ( rule__WorkDefinition__NameAssignment_1 ) )
            {
            // InternalSimplePDLText.g:577:1: ( ( rule__WorkDefinition__NameAssignment_1 ) )
            // InternalSimplePDLText.g:578:2: ( rule__WorkDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); 
            // InternalSimplePDLText.g:579:2: ( rule__WorkDefinition__NameAssignment_1 )
            // InternalSimplePDLText.g:579:3: rule__WorkDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__2"
    // InternalSimplePDLText.g:587:1: rule__WorkDefinition__Group__2 : rule__WorkDefinition__Group__2__Impl ;
    public final void rule__WorkDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:591:1: ( rule__WorkDefinition__Group__2__Impl )
            // InternalSimplePDLText.g:592:2: rule__WorkDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__2"


    // $ANTLR start "rule__WorkDefinition__Group__2__Impl"
    // InternalSimplePDLText.g:598:1: rule__WorkDefinition__Group__2__Impl : ( ( rule__WorkDefinition__Group_2__0 )? ) ;
    public final void rule__WorkDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:602:1: ( ( ( rule__WorkDefinition__Group_2__0 )? ) )
            // InternalSimplePDLText.g:603:1: ( ( rule__WorkDefinition__Group_2__0 )? )
            {
            // InternalSimplePDLText.g:603:1: ( ( rule__WorkDefinition__Group_2__0 )? )
            // InternalSimplePDLText.g:604:2: ( rule__WorkDefinition__Group_2__0 )?
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_2()); 
            // InternalSimplePDLText.g:605:2: ( rule__WorkDefinition__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSimplePDLText.g:605:3: rule__WorkDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WorkDefinition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_2__0"
    // InternalSimplePDLText.g:614:1: rule__WorkDefinition__Group_2__0 : rule__WorkDefinition__Group_2__0__Impl rule__WorkDefinition__Group_2__1 ;
    public final void rule__WorkDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:618:1: ( rule__WorkDefinition__Group_2__0__Impl rule__WorkDefinition__Group_2__1 )
            // InternalSimplePDLText.g:619:2: rule__WorkDefinition__Group_2__0__Impl rule__WorkDefinition__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__WorkDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2__0"


    // $ANTLR start "rule__WorkDefinition__Group_2__0__Impl"
    // InternalSimplePDLText.g:626:1: rule__WorkDefinition__Group_2__0__Impl : ( 'uses' ) ;
    public final void rule__WorkDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:630:1: ( ( 'uses' ) )
            // InternalSimplePDLText.g:631:1: ( 'uses' )
            {
            // InternalSimplePDLText.g:631:1: ( 'uses' )
            // InternalSimplePDLText.g:632:2: 'uses'
            {
             before(grammarAccess.getWorkDefinitionAccess().getUsesKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getUsesKeyword_2_0()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_2__1"
    // InternalSimplePDLText.g:641:1: rule__WorkDefinition__Group_2__1 : rule__WorkDefinition__Group_2__1__Impl rule__WorkDefinition__Group_2__2 ;
    public final void rule__WorkDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:645:1: ( rule__WorkDefinition__Group_2__1__Impl rule__WorkDefinition__Group_2__2 )
            // InternalSimplePDLText.g:646:2: rule__WorkDefinition__Group_2__1__Impl rule__WorkDefinition__Group_2__2
            {
            pushFollow(FOLLOW_10);
            rule__WorkDefinition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2__1"


    // $ANTLR start "rule__WorkDefinition__Group_2__1__Impl"
    // InternalSimplePDLText.g:653:1: rule__WorkDefinition__Group_2__1__Impl : ( ( rule__WorkDefinition__LinkToRessourceAssignment_2_1 ) ) ;
    public final void rule__WorkDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:657:1: ( ( ( rule__WorkDefinition__LinkToRessourceAssignment_2_1 ) ) )
            // InternalSimplePDLText.g:658:1: ( ( rule__WorkDefinition__LinkToRessourceAssignment_2_1 ) )
            {
            // InternalSimplePDLText.g:658:1: ( ( rule__WorkDefinition__LinkToRessourceAssignment_2_1 ) )
            // InternalSimplePDLText.g:659:2: ( rule__WorkDefinition__LinkToRessourceAssignment_2_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinkToRessourceAssignment_2_1()); 
            // InternalSimplePDLText.g:660:2: ( rule__WorkDefinition__LinkToRessourceAssignment_2_1 )
            // InternalSimplePDLText.g:660:3: rule__WorkDefinition__LinkToRessourceAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__LinkToRessourceAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getLinkToRessourceAssignment_2_1()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_2__2"
    // InternalSimplePDLText.g:668:1: rule__WorkDefinition__Group_2__2 : rule__WorkDefinition__Group_2__2__Impl ;
    public final void rule__WorkDefinition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:672:1: ( rule__WorkDefinition__Group_2__2__Impl )
            // InternalSimplePDLText.g:673:2: rule__WorkDefinition__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2__2"


    // $ANTLR start "rule__WorkDefinition__Group_2__2__Impl"
    // InternalSimplePDLText.g:679:1: rule__WorkDefinition__Group_2__2__Impl : ( ( rule__WorkDefinition__Group_2_2__0 )* ) ;
    public final void rule__WorkDefinition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:683:1: ( ( ( rule__WorkDefinition__Group_2_2__0 )* ) )
            // InternalSimplePDLText.g:684:1: ( ( rule__WorkDefinition__Group_2_2__0 )* )
            {
            // InternalSimplePDLText.g:684:1: ( ( rule__WorkDefinition__Group_2_2__0 )* )
            // InternalSimplePDLText.g:685:2: ( rule__WorkDefinition__Group_2_2__0 )*
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_2_2()); 
            // InternalSimplePDLText.g:686:2: ( rule__WorkDefinition__Group_2_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSimplePDLText.g:686:3: rule__WorkDefinition__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__WorkDefinition__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getWorkDefinitionAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_2__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_2_2__0"
    // InternalSimplePDLText.g:695:1: rule__WorkDefinition__Group_2_2__0 : rule__WorkDefinition__Group_2_2__0__Impl rule__WorkDefinition__Group_2_2__1 ;
    public final void rule__WorkDefinition__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:699:1: ( rule__WorkDefinition__Group_2_2__0__Impl rule__WorkDefinition__Group_2_2__1 )
            // InternalSimplePDLText.g:700:2: rule__WorkDefinition__Group_2_2__0__Impl rule__WorkDefinition__Group_2_2__1
            {
            pushFollow(FOLLOW_9);
            rule__WorkDefinition__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2_2__0"


    // $ANTLR start "rule__WorkDefinition__Group_2_2__0__Impl"
    // InternalSimplePDLText.g:707:1: rule__WorkDefinition__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__WorkDefinition__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:711:1: ( ( ',' ) )
            // InternalSimplePDLText.g:712:1: ( ',' )
            {
            // InternalSimplePDLText.g:712:1: ( ',' )
            // InternalSimplePDLText.g:713:2: ','
            {
             before(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_2_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_2_2__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_2_2__1"
    // InternalSimplePDLText.g:722:1: rule__WorkDefinition__Group_2_2__1 : rule__WorkDefinition__Group_2_2__1__Impl ;
    public final void rule__WorkDefinition__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:726:1: ( rule__WorkDefinition__Group_2_2__1__Impl )
            // InternalSimplePDLText.g:727:2: rule__WorkDefinition__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2_2__1"


    // $ANTLR start "rule__WorkDefinition__Group_2_2__1__Impl"
    // InternalSimplePDLText.g:733:1: rule__WorkDefinition__Group_2_2__1__Impl : ( ( rule__WorkDefinition__LinkToRessourceAssignment_2_2_1 ) ) ;
    public final void rule__WorkDefinition__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:737:1: ( ( ( rule__WorkDefinition__LinkToRessourceAssignment_2_2_1 ) ) )
            // InternalSimplePDLText.g:738:1: ( ( rule__WorkDefinition__LinkToRessourceAssignment_2_2_1 ) )
            {
            // InternalSimplePDLText.g:738:1: ( ( rule__WorkDefinition__LinkToRessourceAssignment_2_2_1 ) )
            // InternalSimplePDLText.g:739:2: ( rule__WorkDefinition__LinkToRessourceAssignment_2_2_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinkToRessourceAssignment_2_2_1()); 
            // InternalSimplePDLText.g:740:2: ( rule__WorkDefinition__LinkToRessourceAssignment_2_2_1 )
            // InternalSimplePDLText.g:740:3: rule__WorkDefinition__LinkToRessourceAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__LinkToRessourceAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getLinkToRessourceAssignment_2_2_1()); 

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
    // $ANTLR end "rule__WorkDefinition__Group_2_2__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__0"
    // InternalSimplePDLText.g:749:1: rule__WorkSequence__Group__0 : rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 ;
    public final void rule__WorkSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:753:1: ( rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 )
            // InternalSimplePDLText.g:754:2: rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__WorkSequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__0"


    // $ANTLR start "rule__WorkSequence__Group__0__Impl"
    // InternalSimplePDLText.g:761:1: rule__WorkSequence__Group__0__Impl : ( 'rule' ) ;
    public final void rule__WorkSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:765:1: ( ( 'rule' ) )
            // InternalSimplePDLText.g:766:1: ( 'rule' )
            {
            // InternalSimplePDLText.g:766:1: ( 'rule' )
            // InternalSimplePDLText.g:767:2: 'rule'
            {
             before(grammarAccess.getWorkSequenceAccess().getRuleKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getRuleKeyword_0()); 

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
    // $ANTLR end "rule__WorkSequence__Group__0__Impl"


    // $ANTLR start "rule__WorkSequence__Group__1"
    // InternalSimplePDLText.g:776:1: rule__WorkSequence__Group__1 : rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 ;
    public final void rule__WorkSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:780:1: ( rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 )
            // InternalSimplePDLText.g:781:2: rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__WorkSequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__1"


    // $ANTLR start "rule__WorkSequence__Group__1__Impl"
    // InternalSimplePDLText.g:788:1: rule__WorkSequence__Group__1__Impl : ( ':' ) ;
    public final void rule__WorkSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:792:1: ( ( ':' ) )
            // InternalSimplePDLText.g:793:1: ( ':' )
            {
            // InternalSimplePDLText.g:793:1: ( ':' )
            // InternalSimplePDLText.g:794:2: ':'
            {
             before(grammarAccess.getWorkSequenceAccess().getColonKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__WorkSequence__Group__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__2"
    // InternalSimplePDLText.g:803:1: rule__WorkSequence__Group__2 : rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 ;
    public final void rule__WorkSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:807:1: ( rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 )
            // InternalSimplePDLText.g:808:2: rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__WorkSequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__2"


    // $ANTLR start "rule__WorkSequence__Group__2__Impl"
    // InternalSimplePDLText.g:815:1: rule__WorkSequence__Group__2__Impl : ( ( rule__WorkSequence__PredecessorStateAssignment_2 ) ) ;
    public final void rule__WorkSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:819:1: ( ( ( rule__WorkSequence__PredecessorStateAssignment_2 ) ) )
            // InternalSimplePDLText.g:820:1: ( ( rule__WorkSequence__PredecessorStateAssignment_2 ) )
            {
            // InternalSimplePDLText.g:820:1: ( ( rule__WorkSequence__PredecessorStateAssignment_2 ) )
            // InternalSimplePDLText.g:821:2: ( rule__WorkSequence__PredecessorStateAssignment_2 )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorStateAssignment_2()); 
            // InternalSimplePDLText.g:822:2: ( rule__WorkSequence__PredecessorStateAssignment_2 )
            // InternalSimplePDLText.g:822:3: rule__WorkSequence__PredecessorStateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__PredecessorStateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorStateAssignment_2()); 

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
    // $ANTLR end "rule__WorkSequence__Group__2__Impl"


    // $ANTLR start "rule__WorkSequence__Group__3"
    // InternalSimplePDLText.g:830:1: rule__WorkSequence__Group__3 : rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 ;
    public final void rule__WorkSequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:834:1: ( rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 )
            // InternalSimplePDLText.g:835:2: rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__WorkSequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__3"


    // $ANTLR start "rule__WorkSequence__Group__3__Impl"
    // InternalSimplePDLText.g:842:1: rule__WorkSequence__Group__3__Impl : ( ( rule__WorkSequence__PredecessorAssignment_3 ) ) ;
    public final void rule__WorkSequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:846:1: ( ( ( rule__WorkSequence__PredecessorAssignment_3 ) ) )
            // InternalSimplePDLText.g:847:1: ( ( rule__WorkSequence__PredecessorAssignment_3 ) )
            {
            // InternalSimplePDLText.g:847:1: ( ( rule__WorkSequence__PredecessorAssignment_3 ) )
            // InternalSimplePDLText.g:848:2: ( rule__WorkSequence__PredecessorAssignment_3 )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); 
            // InternalSimplePDLText.g:849:2: ( rule__WorkSequence__PredecessorAssignment_3 )
            // InternalSimplePDLText.g:849:3: rule__WorkSequence__PredecessorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__PredecessorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); 

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
    // $ANTLR end "rule__WorkSequence__Group__3__Impl"


    // $ANTLR start "rule__WorkSequence__Group__4"
    // InternalSimplePDLText.g:857:1: rule__WorkSequence__Group__4 : rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 ;
    public final void rule__WorkSequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:861:1: ( rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 )
            // InternalSimplePDLText.g:862:2: rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__WorkSequence__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__4"


    // $ANTLR start "rule__WorkSequence__Group__4__Impl"
    // InternalSimplePDLText.g:869:1: rule__WorkSequence__Group__4__Impl : ( 'to' ) ;
    public final void rule__WorkSequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:873:1: ( ( 'to' ) )
            // InternalSimplePDLText.g:874:1: ( 'to' )
            {
            // InternalSimplePDLText.g:874:1: ( 'to' )
            // InternalSimplePDLText.g:875:2: 'to'
            {
             before(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); 

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
    // $ANTLR end "rule__WorkSequence__Group__4__Impl"


    // $ANTLR start "rule__WorkSequence__Group__5"
    // InternalSimplePDLText.g:884:1: rule__WorkSequence__Group__5 : rule__WorkSequence__Group__5__Impl rule__WorkSequence__Group__6 ;
    public final void rule__WorkSequence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:888:1: ( rule__WorkSequence__Group__5__Impl rule__WorkSequence__Group__6 )
            // InternalSimplePDLText.g:889:2: rule__WorkSequence__Group__5__Impl rule__WorkSequence__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__WorkSequence__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__5"


    // $ANTLR start "rule__WorkSequence__Group__5__Impl"
    // InternalSimplePDLText.g:896:1: rule__WorkSequence__Group__5__Impl : ( ( rule__WorkSequence__SuccessorStateAssignment_5 ) ) ;
    public final void rule__WorkSequence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:900:1: ( ( ( rule__WorkSequence__SuccessorStateAssignment_5 ) ) )
            // InternalSimplePDLText.g:901:1: ( ( rule__WorkSequence__SuccessorStateAssignment_5 ) )
            {
            // InternalSimplePDLText.g:901:1: ( ( rule__WorkSequence__SuccessorStateAssignment_5 ) )
            // InternalSimplePDLText.g:902:2: ( rule__WorkSequence__SuccessorStateAssignment_5 )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorStateAssignment_5()); 
            // InternalSimplePDLText.g:903:2: ( rule__WorkSequence__SuccessorStateAssignment_5 )
            // InternalSimplePDLText.g:903:3: rule__WorkSequence__SuccessorStateAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__SuccessorStateAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorStateAssignment_5()); 

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
    // $ANTLR end "rule__WorkSequence__Group__5__Impl"


    // $ANTLR start "rule__WorkSequence__Group__6"
    // InternalSimplePDLText.g:911:1: rule__WorkSequence__Group__6 : rule__WorkSequence__Group__6__Impl ;
    public final void rule__WorkSequence__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:915:1: ( rule__WorkSequence__Group__6__Impl )
            // InternalSimplePDLText.g:916:2: rule__WorkSequence__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__6"


    // $ANTLR start "rule__WorkSequence__Group__6__Impl"
    // InternalSimplePDLText.g:922:1: rule__WorkSequence__Group__6__Impl : ( ( rule__WorkSequence__SuccessorAssignment_6 ) ) ;
    public final void rule__WorkSequence__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:926:1: ( ( ( rule__WorkSequence__SuccessorAssignment_6 ) ) )
            // InternalSimplePDLText.g:927:1: ( ( rule__WorkSequence__SuccessorAssignment_6 ) )
            {
            // InternalSimplePDLText.g:927:1: ( ( rule__WorkSequence__SuccessorAssignment_6 ) )
            // InternalSimplePDLText.g:928:2: ( rule__WorkSequence__SuccessorAssignment_6 )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_6()); 
            // InternalSimplePDLText.g:929:2: ( rule__WorkSequence__SuccessorAssignment_6 )
            // InternalSimplePDLText.g:929:3: rule__WorkSequence__SuccessorAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__SuccessorAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_6()); 

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
    // $ANTLR end "rule__WorkSequence__Group__6__Impl"


    // $ANTLR start "rule__Ressource__Group__0"
    // InternalSimplePDLText.g:938:1: rule__Ressource__Group__0 : rule__Ressource__Group__0__Impl rule__Ressource__Group__1 ;
    public final void rule__Ressource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:942:1: ( rule__Ressource__Group__0__Impl rule__Ressource__Group__1 )
            // InternalSimplePDLText.g:943:2: rule__Ressource__Group__0__Impl rule__Ressource__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Ressource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__0"


    // $ANTLR start "rule__Ressource__Group__0__Impl"
    // InternalSimplePDLText.g:950:1: rule__Ressource__Group__0__Impl : ( ( rule__Ressource__QuantityAssignment_0 ) ) ;
    public final void rule__Ressource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:954:1: ( ( ( rule__Ressource__QuantityAssignment_0 ) ) )
            // InternalSimplePDLText.g:955:1: ( ( rule__Ressource__QuantityAssignment_0 ) )
            {
            // InternalSimplePDLText.g:955:1: ( ( rule__Ressource__QuantityAssignment_0 ) )
            // InternalSimplePDLText.g:956:2: ( rule__Ressource__QuantityAssignment_0 )
            {
             before(grammarAccess.getRessourceAccess().getQuantityAssignment_0()); 
            // InternalSimplePDLText.g:957:2: ( rule__Ressource__QuantityAssignment_0 )
            // InternalSimplePDLText.g:957:3: rule__Ressource__QuantityAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__QuantityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getQuantityAssignment_0()); 

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
    // $ANTLR end "rule__Ressource__Group__0__Impl"


    // $ANTLR start "rule__Ressource__Group__1"
    // InternalSimplePDLText.g:965:1: rule__Ressource__Group__1 : rule__Ressource__Group__1__Impl rule__Ressource__Group__2 ;
    public final void rule__Ressource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:969:1: ( rule__Ressource__Group__1__Impl rule__Ressource__Group__2 )
            // InternalSimplePDLText.g:970:2: rule__Ressource__Group__1__Impl rule__Ressource__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Ressource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__1"


    // $ANTLR start "rule__Ressource__Group__1__Impl"
    // InternalSimplePDLText.g:977:1: rule__Ressource__Group__1__Impl : ( ( rule__Ressource__NameAssignment_1 ) ) ;
    public final void rule__Ressource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:981:1: ( ( ( rule__Ressource__NameAssignment_1 ) ) )
            // InternalSimplePDLText.g:982:1: ( ( rule__Ressource__NameAssignment_1 ) )
            {
            // InternalSimplePDLText.g:982:1: ( ( rule__Ressource__NameAssignment_1 ) )
            // InternalSimplePDLText.g:983:2: ( rule__Ressource__NameAssignment_1 )
            {
             before(grammarAccess.getRessourceAccess().getNameAssignment_1()); 
            // InternalSimplePDLText.g:984:2: ( rule__Ressource__NameAssignment_1 )
            // InternalSimplePDLText.g:984:3: rule__Ressource__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Ressource__Group__1__Impl"


    // $ANTLR start "rule__Ressource__Group__2"
    // InternalSimplePDLText.g:992:1: rule__Ressource__Group__2 : rule__Ressource__Group__2__Impl ;
    public final void rule__Ressource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:996:1: ( rule__Ressource__Group__2__Impl )
            // InternalSimplePDLText.g:997:2: rule__Ressource__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__2"


    // $ANTLR start "rule__Ressource__Group__2__Impl"
    // InternalSimplePDLText.g:1003:1: rule__Ressource__Group__2__Impl : ( 'available' ) ;
    public final void rule__Ressource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:1007:1: ( ( 'available' ) )
            // InternalSimplePDLText.g:1008:1: ( 'available' )
            {
            // InternalSimplePDLText.g:1008:1: ( 'available' )
            // InternalSimplePDLText.g:1009:2: 'available'
            {
             before(grammarAccess.getRessourceAccess().getAvailableKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRessourceAccess().getAvailableKeyword_2()); 

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
    // $ANTLR end "rule__Ressource__Group__2__Impl"


    // $ANTLR start "rule__RessourceLink__Group__0"
    // InternalSimplePDLText.g:1019:1: rule__RessourceLink__Group__0 : rule__RessourceLink__Group__0__Impl rule__RessourceLink__Group__1 ;
    public final void rule__RessourceLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:1023:1: ( rule__RessourceLink__Group__0__Impl rule__RessourceLink__Group__1 )
            // InternalSimplePDLText.g:1024:2: rule__RessourceLink__Group__0__Impl rule__RessourceLink__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RessourceLink__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RessourceLink__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RessourceLink__Group__0"


    // $ANTLR start "rule__RessourceLink__Group__0__Impl"
    // InternalSimplePDLText.g:1031:1: rule__RessourceLink__Group__0__Impl : ( ( rule__RessourceLink__QuantityAssignment_0 ) ) ;
    public final void rule__RessourceLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:1035:1: ( ( ( rule__RessourceLink__QuantityAssignment_0 ) ) )
            // InternalSimplePDLText.g:1036:1: ( ( rule__RessourceLink__QuantityAssignment_0 ) )
            {
            // InternalSimplePDLText.g:1036:1: ( ( rule__RessourceLink__QuantityAssignment_0 ) )
            // InternalSimplePDLText.g:1037:2: ( rule__RessourceLink__QuantityAssignment_0 )
            {
             before(grammarAccess.getRessourceLinkAccess().getQuantityAssignment_0()); 
            // InternalSimplePDLText.g:1038:2: ( rule__RessourceLink__QuantityAssignment_0 )
            // InternalSimplePDLText.g:1038:3: rule__RessourceLink__QuantityAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RessourceLink__QuantityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRessourceLinkAccess().getQuantityAssignment_0()); 

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
    // $ANTLR end "rule__RessourceLink__Group__0__Impl"


    // $ANTLR start "rule__RessourceLink__Group__1"
    // InternalSimplePDLText.g:1046:1: rule__RessourceLink__Group__1 : rule__RessourceLink__Group__1__Impl ;
    public final void rule__RessourceLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:1050:1: ( rule__RessourceLink__Group__1__Impl )
            // InternalSimplePDLText.g:1051:2: rule__RessourceLink__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RessourceLink__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RessourceLink__Group__1"


    // $ANTLR start "rule__RessourceLink__Group__1__Impl"
    // InternalSimplePDLText.g:1057:1: rule__RessourceLink__Group__1__Impl : ( ( rule__RessourceLink__RessourceNeededAssignment_1 ) ) ;
    public final void rule__RessourceLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:1061:1: ( ( ( rule__RessourceLink__RessourceNeededAssignment_1 ) ) )
            // InternalSimplePDLText.g:1062:1: ( ( rule__RessourceLink__RessourceNeededAssignment_1 ) )
            {
            // InternalSimplePDLText.g:1062:1: ( ( rule__RessourceLink__RessourceNeededAssignment_1 ) )
            // InternalSimplePDLText.g:1063:2: ( rule__RessourceLink__RessourceNeededAssignment_1 )
            {
             before(grammarAccess.getRessourceLinkAccess().getRessourceNeededAssignment_1()); 
            // InternalSimplePDLText.g:1064:2: ( rule__RessourceLink__RessourceNeededAssignment_1 )
            // InternalSimplePDLText.g:1064:3: rule__RessourceLink__RessourceNeededAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RessourceLink__RessourceNeededAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRessourceLinkAccess().getRessourceNeededAssignment_1()); 

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
    // $ANTLR end "rule__RessourceLink__Group__1__Impl"


    // $ANTLR start "rule__Guidance__Group__0"
    // InternalSimplePDLText.g:1073:1: rule__Guidance__Group__0 : rule__Guidance__Group__0__Impl rule__Guidance__Group__1 ;
    public final void rule__Guidance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:1077:1: ( rule__Guidance__Group__0__Impl rule__Guidance__Group__1 )
            // InternalSimplePDLText.g:1078:2: rule__Guidance__Group__0__Impl rule__Guidance__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Guidance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__0"


    // $ANTLR start "rule__Guidance__Group__0__Impl"
    // InternalSimplePDLText.g:1085:1: rule__Guidance__Group__0__Impl : ( ( rule__Guidance__ElementAssignment_0 )? ) ;
    public final void rule__Guidance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:1089:1: ( ( ( rule__Guidance__ElementAssignment_0 )? ) )
            // InternalSimplePDLText.g:1090:1: ( ( rule__Guidance__ElementAssignment_0 )? )
            {
            // InternalSimplePDLText.g:1090:1: ( ( rule__Guidance__ElementAssignment_0 )? )
            // InternalSimplePDLText.g:1091:2: ( rule__Guidance__ElementAssignment_0 )?
            {
             before(grammarAccess.getGuidanceAccess().getElementAssignment_0()); 
            // InternalSimplePDLText.g:1092:2: ( rule__Guidance__ElementAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT||LA9_0==17||LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSimplePDLText.g:1092:3: rule__Guidance__ElementAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Guidance__ElementAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGuidanceAccess().getElementAssignment_0()); 

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
    // $ANTLR end "rule__Guidance__Group__0__Impl"


    // $ANTLR start "rule__Guidance__Group__1"
    // InternalSimplePDLText.g:1100:1: rule__Guidance__Group__1 : rule__Guidance__Group__1__Impl ;
    public final void rule__Guidance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:1104:1: ( rule__Guidance__Group__1__Impl )
            // InternalSimplePDLText.g:1105:2: rule__Guidance__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__1"


    // $ANTLR start "rule__Guidance__Group__1__Impl"
    // InternalSimplePDLText.g:1111:1: rule__Guidance__Group__1__Impl : ( ( rule__Guidance__TextAssignment_1 ) ) ;
    public final void rule__Guidance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:1115:1: ( ( ( rule__Guidance__TextAssignment_1 ) ) )
            // InternalSimplePDLText.g:1116:1: ( ( rule__Guidance__TextAssignment_1 ) )
            {
            // InternalSimplePDLText.g:1116:1: ( ( rule__Guidance__TextAssignment_1 ) )
            // InternalSimplePDLText.g:1117:2: ( rule__Guidance__TextAssignment_1 )
            {
             before(grammarAccess.getGuidanceAccess().getTextAssignment_1()); 
            // InternalSimplePDLText.g:1118:2: ( rule__Guidance__TextAssignment_1 )
            // InternalSimplePDLText.g:1118:3: rule__Guidance__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getTextAssignment_1()); 

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
    // $ANTLR end "rule__Guidance__Group__1__Impl"


    // $ANTLR start "rule__Process__NameAssignment_1"
    // InternalSimplePDLText.g:1127:1: rule__Process__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Process__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:1131:1: ( ( RULE_ID ) )
            // InternalSimplePDLText.g:1132:2: ( RULE_ID )
            {
            // InternalSimplePDLText.g:1132:2: ( RULE_ID )
            // InternalSimplePDLText.g:1133:3: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Process__NameAssignment_1"


    // $ANTLR start "rule__Process__ProcessElementsAssignment_3_1"
    // InternalSimplePDLText.g:1142:1: rule__Process__ProcessElementsAssignment_3_1 : ( ruleSyntaxElement ) ;
    public final void rule__Process__ProcessElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:1146:1: ( ( ruleSyntaxElement ) )
            // InternalSimplePDLText.g:1147:2: ( ruleSyntaxElement )
            {
            // InternalSimplePDLText.g:1147:2: ( ruleSyntaxElement )
            // InternalSimplePDLText.g:1148:3: ruleSyntaxElement
            {
             before(grammarAccess.getProcessAccess().getProcessElementsSyntaxElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSyntaxElement();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsSyntaxElementParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Process__ProcessElementsAssignment_3_1"


    // $ANTLR start "rule__WorkDefinition__NameAssignment_1"
    // InternalSimplePDLText.g:1157:1: rule__WorkDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WorkDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:1161:1: ( ( RULE_ID ) )
            // InternalSimplePDLText.g:1162:2: ( RULE_ID )
            {
            // InternalSimplePDLText.g:1162:2: ( RULE_ID )
            // InternalSimplePDLText.g:1163:3: RULE_ID
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__WorkDefinition__NameAssignment_1"


    // $ANTLR start "rule__WorkDefinition__LinkToRessourceAssignment_2_1"
    // InternalSimplePDLText.g:1172:1: rule__WorkDefinition__LinkToRessourceAssignment_2_1 : ( ruleRessourceLink ) ;
    public final void rule__WorkDefinition__LinkToRessourceAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:1176:1: ( ( ruleRessourceLink ) )
            // InternalSimplePDLText.g:1177:2: ( ruleRessourceLink )
            {
            // InternalSimplePDLText.g:1177:2: ( ruleRessourceLink )
            // InternalSimplePDLText.g:1178:3: ruleRessourceLink
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinkToRessourceRessourceLinkParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRessourceLink();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getLinkToRessourceRessourceLinkParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__WorkDefinition__LinkToRessourceAssignment_2_1"


    // $ANTLR start "rule__WorkDefinition__LinkToRessourceAssignment_2_2_1"
    // InternalSimplePDLText.g:1187:1: rule__WorkDefinition__LinkToRessourceAssignment_2_2_1 : ( ruleRessourceLink ) ;
    public final void rule__WorkDefinition__LinkToRessourceAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:1191:1: ( ( ruleRessourceLink ) )
            // InternalSimplePDLText.g:1192:2: ( ruleRessourceLink )
            {
            // InternalSimplePDLText.g:1192:2: ( ruleRessourceLink )
            // InternalSimplePDLText.g:1193:3: ruleRessourceLink
            {
             before(grammarAccess.getWorkDefinitionAccess().getLinkToRessourceRessourceLinkParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRessourceLink();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getLinkToRessourceRessourceLinkParserRuleCall_2_2_1_0()); 

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
    // $ANTLR end "rule__WorkDefinition__LinkToRessourceAssignment_2_2_1"


    // $ANTLR start "rule__WorkSequence__PredecessorStateAssignment_2"
    // InternalSimplePDLText.g:1202:1: rule__WorkSequence__PredecessorStateAssignment_2 : ( ruleStateType ) ;
    public final void rule__WorkSequence__PredecessorStateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:1206:1: ( ( ruleStateType ) )
            // InternalSimplePDLText.g:1207:2: ( ruleStateType )
            {
            // InternalSimplePDLText.g:1207:2: ( ruleStateType )
            // InternalSimplePDLText.g:1208:3: ruleStateType
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorStateStateTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStateType();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getPredecessorStateStateTypeEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__WorkSequence__PredecessorStateAssignment_2"


    // $ANTLR start "rule__WorkSequence__PredecessorAssignment_3"
    // InternalSimplePDLText.g:1217:1: rule__WorkSequence__PredecessorAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__PredecessorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:1221:1: ( ( ( RULE_ID ) ) )
            // InternalSimplePDLText.g:1222:2: ( ( RULE_ID ) )
            {
            // InternalSimplePDLText.g:1222:2: ( ( RULE_ID ) )
            // InternalSimplePDLText.g:1223:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 
            // InternalSimplePDLText.g:1224:3: ( RULE_ID )
            // InternalSimplePDLText.g:1225:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 

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
    // $ANTLR end "rule__WorkSequence__PredecessorAssignment_3"


    // $ANTLR start "rule__WorkSequence__SuccessorStateAssignment_5"
    // InternalSimplePDLText.g:1236:1: rule__WorkSequence__SuccessorStateAssignment_5 : ( ruleStateType ) ;
    public final void rule__WorkSequence__SuccessorStateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:1240:1: ( ( ruleStateType ) )
            // InternalSimplePDLText.g:1241:2: ( ruleStateType )
            {
            // InternalSimplePDLText.g:1241:2: ( ruleStateType )
            // InternalSimplePDLText.g:1242:3: ruleStateType
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorStateStateTypeEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleStateType();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getSuccessorStateStateTypeEnumRuleCall_5_0()); 

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
    // $ANTLR end "rule__WorkSequence__SuccessorStateAssignment_5"


    // $ANTLR start "rule__WorkSequence__SuccessorAssignment_6"
    // InternalSimplePDLText.g:1251:1: rule__WorkSequence__SuccessorAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__SuccessorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:1255:1: ( ( ( RULE_ID ) ) )
            // InternalSimplePDLText.g:1256:2: ( ( RULE_ID ) )
            {
            // InternalSimplePDLText.g:1256:2: ( ( RULE_ID ) )
            // InternalSimplePDLText.g:1257:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_6_0()); 
            // InternalSimplePDLText.g:1258:3: ( RULE_ID )
            // InternalSimplePDLText.g:1259:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_6_0()); 

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
    // $ANTLR end "rule__WorkSequence__SuccessorAssignment_6"


    // $ANTLR start "rule__Ressource__QuantityAssignment_0"
    // InternalSimplePDLText.g:1270:1: rule__Ressource__QuantityAssignment_0 : ( RULE_INT ) ;
    public final void rule__Ressource__QuantityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:1274:1: ( ( RULE_INT ) )
            // InternalSimplePDLText.g:1275:2: ( RULE_INT )
            {
            // InternalSimplePDLText.g:1275:2: ( RULE_INT )
            // InternalSimplePDLText.g:1276:3: RULE_INT
            {
             before(grammarAccess.getRessourceAccess().getQuantityINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRessourceAccess().getQuantityINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Ressource__QuantityAssignment_0"


    // $ANTLR start "rule__Ressource__NameAssignment_1"
    // InternalSimplePDLText.g:1285:1: rule__Ressource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Ressource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:1289:1: ( ( RULE_ID ) )
            // InternalSimplePDLText.g:1290:2: ( RULE_ID )
            {
            // InternalSimplePDLText.g:1290:2: ( RULE_ID )
            // InternalSimplePDLText.g:1291:3: RULE_ID
            {
             before(grammarAccess.getRessourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRessourceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Ressource__NameAssignment_1"


    // $ANTLR start "rule__RessourceLink__QuantityAssignment_0"
    // InternalSimplePDLText.g:1300:1: rule__RessourceLink__QuantityAssignment_0 : ( RULE_INT ) ;
    public final void rule__RessourceLink__QuantityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:1304:1: ( ( RULE_INT ) )
            // InternalSimplePDLText.g:1305:2: ( RULE_INT )
            {
            // InternalSimplePDLText.g:1305:2: ( RULE_INT )
            // InternalSimplePDLText.g:1306:3: RULE_INT
            {
             before(grammarAccess.getRessourceLinkAccess().getQuantityINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRessourceLinkAccess().getQuantityINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__RessourceLink__QuantityAssignment_0"


    // $ANTLR start "rule__RessourceLink__RessourceNeededAssignment_1"
    // InternalSimplePDLText.g:1315:1: rule__RessourceLink__RessourceNeededAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RessourceLink__RessourceNeededAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:1319:1: ( ( ( RULE_ID ) ) )
            // InternalSimplePDLText.g:1320:2: ( ( RULE_ID ) )
            {
            // InternalSimplePDLText.g:1320:2: ( ( RULE_ID ) )
            // InternalSimplePDLText.g:1321:3: ( RULE_ID )
            {
             before(grammarAccess.getRessourceLinkAccess().getRessourceNeededRessourceCrossReference_1_0()); 
            // InternalSimplePDLText.g:1322:3: ( RULE_ID )
            // InternalSimplePDLText.g:1323:4: RULE_ID
            {
             before(grammarAccess.getRessourceLinkAccess().getRessourceNeededRessourceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRessourceLinkAccess().getRessourceNeededRessourceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRessourceLinkAccess().getRessourceNeededRessourceCrossReference_1_0()); 

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
    // $ANTLR end "rule__RessourceLink__RessourceNeededAssignment_1"


    // $ANTLR start "rule__Guidance__ElementAssignment_0"
    // InternalSimplePDLText.g:1334:1: rule__Guidance__ElementAssignment_0 : ( ruleProcessElement ) ;
    public final void rule__Guidance__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:1338:1: ( ( ruleProcessElement ) )
            // InternalSimplePDLText.g:1339:2: ( ruleProcessElement )
            {
            // InternalSimplePDLText.g:1339:2: ( ruleProcessElement )
            // InternalSimplePDLText.g:1340:3: ruleProcessElement
            {
             before(grammarAccess.getGuidanceAccess().getElementProcessElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getGuidanceAccess().getElementProcessElementParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Guidance__ElementAssignment_0"


    // $ANTLR start "rule__Guidance__TextAssignment_1"
    // InternalSimplePDLText.g:1349:1: rule__Guidance__TextAssignment_1 : ( RULE_COMMENT_BODY ) ;
    public final void rule__Guidance__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDLText.g:1353:1: ( ( RULE_COMMENT_BODY ) )
            // InternalSimplePDLText.g:1354:2: ( RULE_COMMENT_BODY )
            {
            // InternalSimplePDLText.g:1354:2: ( RULE_COMMENT_BODY )
            // InternalSimplePDLText.g:1355:3: RULE_COMMENT_BODY
            {
             before(grammarAccess.getGuidanceAccess().getTextCOMMENT_BODYTerminalRuleCall_1_0()); 
            match(input,RULE_COMMENT_BODY,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getTextCOMMENT_BODYTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Guidance__TextAssignment_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\27\uffff";
    static final String dfa_2s = "\5\uffff\1\11\6\uffff\1\11\2\uffff\1\11\5\uffff\2\11";
    static final String dfa_3s = "\1\6\1\5\1\20\1\5\1\uffff\1\4\1\15\1\26\1\6\1\uffff\2\5\1\4\1\5\1\25\1\4\1\15\1\6\3\5\2\4";
    static final String dfa_4s = "\1\24\1\5\1\20\1\5\1\uffff\1\22\1\16\1\26\1\6\1\uffff\2\5\1\7\1\5\1\25\1\23\1\16\1\6\3\5\1\7\1\23";
    static final String dfa_5s = "\4\uffff\1\2\4\uffff\1\1\15\uffff";
    static final String dfa_6s = "\27\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\1\4\11\uffff\1\1\2\uffff\1\2",
            "\1\5",
            "\1\6",
            "\1\7",
            "",
            "\1\11\2\uffff\1\4\12\uffff\1\10",
            "\1\12\1\13",
            "\1\14",
            "\1\15",
            "",
            "\1\16",
            "\1\16",
            "\1\11\2\uffff\1\4",
            "\1\17",
            "\1\20",
            "\1\11\2\uffff\1\4\13\uffff\1\21",
            "\1\22\1\23",
            "\1\24",
            "\1\25",
            "\1\25",
            "\1\26",
            "\1\11\2\uffff\1\4",
            "\1\11\2\uffff\1\4\13\uffff\1\21"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "268:1: rule__SyntaxElement__Alternatives : ( ( ruleProcessElement ) | ( ruleGuidance ) );";
        }
    }
    static final String dfa_8s = "\5\uffff";
    static final String dfa_9s = "\2\2\1\uffff\1\2\1\uffff";
    static final String dfa_10s = "\2\4\1\uffff\1\4\1\uffff";
    static final String dfa_11s = "\1\4\1\24\1\uffff\1\24\1\uffff";
    static final String dfa_12s = "\2\uffff\1\2\1\uffff\1\1";
    static final String dfa_13s = "\5\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\1\3\1\uffff\2\4\11\uffff\1\4\2\uffff\1\4",
            "",
            "\1\3\1\uffff\2\4\11\uffff\1\4\2\uffff\1\4",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 437:2: ( rule__Process__Group_3__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001200C0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});

}