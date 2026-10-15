package fr.n7.simplePDL.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.n7.simplePDL.services.TextSimplePDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTextSimplePDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_COMMENT_BODY", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'process'", "'{'", "'}'", "'\\n'", "';'", "'wd'", "'uses'", "','", "'ws'", "':'", "'--'", "'->'", "'res'", "'%'", "'s2s'", "'s2f'", "'f2s'", "'f2f'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_COMMENT_BODY=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTextSimplePDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTextSimplePDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTextSimplePDLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTextSimplePDL.g"; }



     	private TextSimplePDLGrammarAccess grammarAccess;

        public InternalTextSimplePDLParser(TokenStream input, TextSimplePDLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Process";
       	}

       	@Override
       	protected TextSimplePDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProcess"
    // InternalTextSimplePDL.g:65:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalTextSimplePDL.g:65:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalTextSimplePDL.g:66:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalTextSimplePDL.g:72:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleSyntaxElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_processElements_3_0 = null;



        	enterRule();

        try {
            // InternalTextSimplePDL.g:78:2: ( (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleSyntaxElement ) )* otherlv_4= '}' ) )
            // InternalTextSimplePDL.g:79:2: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleSyntaxElement ) )* otherlv_4= '}' )
            {
            // InternalTextSimplePDL.g:79:2: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleSyntaxElement ) )* otherlv_4= '}' )
            // InternalTextSimplePDL.g:80:3: otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleSyntaxElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
            		
            // InternalTextSimplePDL.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTextSimplePDL.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTextSimplePDL.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalTextSimplePDL.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTextSimplePDL.g:106:3: ( (lv_processElements_3_0= ruleSyntaxElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17||LA1_0==20||(LA1_0>=24 && LA1_0<=25)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTextSimplePDL.g:107:4: (lv_processElements_3_0= ruleSyntaxElement )
            	    {
            	    // InternalTextSimplePDL.g:107:4: (lv_processElements_3_0= ruleSyntaxElement )
            	    // InternalTextSimplePDL.g:108:5: lv_processElements_3_0= ruleSyntaxElement
            	    {

            	    					newCompositeNode(grammarAccess.getProcessAccess().getProcessElementsSyntaxElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_processElements_3_0=ruleSyntaxElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"processElements",
            	    						lv_processElements_3_0,
            	    						"fr.n7.simplePDL.TextSimplePDL.SyntaxElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleSyntaxElement"
    // InternalTextSimplePDL.g:133:1: entryRuleSyntaxElement returns [EObject current=null] : iv_ruleSyntaxElement= ruleSyntaxElement EOF ;
    public final EObject entryRuleSyntaxElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSyntaxElement = null;


        try {
            // InternalTextSimplePDL.g:133:54: (iv_ruleSyntaxElement= ruleSyntaxElement EOF )
            // InternalTextSimplePDL.g:134:2: iv_ruleSyntaxElement= ruleSyntaxElement EOF
            {
             newCompositeNode(grammarAccess.getSyntaxElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSyntaxElement=ruleSyntaxElement();

            state._fsp--;

             current =iv_ruleSyntaxElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSyntaxElement"


    // $ANTLR start "ruleSyntaxElement"
    // InternalTextSimplePDL.g:140:1: ruleSyntaxElement returns [EObject current=null] : ( (this_Guidance_0= ruleGuidance | this_ProcessElement_1= ruleProcessElement ) otherlv_2= '\\n' ) ;
    public final EObject ruleSyntaxElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Guidance_0 = null;

        EObject this_ProcessElement_1 = null;



        	enterRule();

        try {
            // InternalTextSimplePDL.g:146:2: ( ( (this_Guidance_0= ruleGuidance | this_ProcessElement_1= ruleProcessElement ) otherlv_2= '\\n' ) )
            // InternalTextSimplePDL.g:147:2: ( (this_Guidance_0= ruleGuidance | this_ProcessElement_1= ruleProcessElement ) otherlv_2= '\\n' )
            {
            // InternalTextSimplePDL.g:147:2: ( (this_Guidance_0= ruleGuidance | this_ProcessElement_1= ruleProcessElement ) otherlv_2= '\\n' )
            // InternalTextSimplePDL.g:148:3: (this_Guidance_0= ruleGuidance | this_ProcessElement_1= ruleProcessElement ) otherlv_2= '\\n'
            {
            // InternalTextSimplePDL.g:148:3: (this_Guidance_0= ruleGuidance | this_ProcessElement_1= ruleProcessElement )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalTextSimplePDL.g:149:4: this_Guidance_0= ruleGuidance
                    {

                    				newCompositeNode(grammarAccess.getSyntaxElementAccess().getGuidanceParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_6);
                    this_Guidance_0=ruleGuidance();

                    state._fsp--;


                    				current = this_Guidance_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalTextSimplePDL.g:158:4: this_ProcessElement_1= ruleProcessElement
                    {

                    				newCompositeNode(grammarAccess.getSyntaxElementAccess().getProcessElementParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_6);
                    this_ProcessElement_1=ruleProcessElement();

                    state._fsp--;


                    				current = this_ProcessElement_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getSyntaxElementAccess().getLineFeedKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSyntaxElement"


    // $ANTLR start "entryRuleProcessElement"
    // InternalTextSimplePDL.g:175:1: entryRuleProcessElement returns [EObject current=null] : iv_ruleProcessElement= ruleProcessElement EOF ;
    public final EObject entryRuleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessElement = null;


        try {
            // InternalTextSimplePDL.g:175:55: (iv_ruleProcessElement= ruleProcessElement EOF )
            // InternalTextSimplePDL.g:176:2: iv_ruleProcessElement= ruleProcessElement EOF
            {
             newCompositeNode(grammarAccess.getProcessElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessElement=ruleProcessElement();

            state._fsp--;

             current =iv_ruleProcessElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // InternalTextSimplePDL.g:182:1: ruleProcessElement returns [EObject current=null] : ( (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Ressource_2= ruleRessource ) otherlv_3= ';' ) ;
    public final EObject ruleProcessElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_WorkDefinition_0 = null;

        EObject this_WorkSequence_1 = null;

        EObject this_Ressource_2 = null;



        	enterRule();

        try {
            // InternalTextSimplePDL.g:188:2: ( ( (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Ressource_2= ruleRessource ) otherlv_3= ';' ) )
            // InternalTextSimplePDL.g:189:2: ( (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Ressource_2= ruleRessource ) otherlv_3= ';' )
            {
            // InternalTextSimplePDL.g:189:2: ( (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Ressource_2= ruleRessource ) otherlv_3= ';' )
            // InternalTextSimplePDL.g:190:3: (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Ressource_2= ruleRessource ) otherlv_3= ';'
            {
            // InternalTextSimplePDL.g:190:3: (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Ressource_2= ruleRessource )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 24:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTextSimplePDL.g:191:4: this_WorkDefinition_0= ruleWorkDefinition
                    {

                    				newCompositeNode(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_7);
                    this_WorkDefinition_0=ruleWorkDefinition();

                    state._fsp--;


                    				current = this_WorkDefinition_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalTextSimplePDL.g:200:4: this_WorkSequence_1= ruleWorkSequence
                    {

                    				newCompositeNode(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_7);
                    this_WorkSequence_1=ruleWorkSequence();

                    state._fsp--;


                    				current = this_WorkSequence_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalTextSimplePDL.g:209:4: this_Ressource_2= ruleRessource
                    {

                    				newCompositeNode(grammarAccess.getProcessElementAccess().getRessourceParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_7);
                    this_Ressource_2=ruleRessource();

                    state._fsp--;


                    				current = this_Ressource_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getProcessElementAccess().getSemicolonKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalTextSimplePDL.g:226:1: entryRuleWorkDefinition returns [EObject current=null] : iv_ruleWorkDefinition= ruleWorkDefinition EOF ;
    public final EObject entryRuleWorkDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDefinition = null;


        try {
            // InternalTextSimplePDL.g:226:55: (iv_ruleWorkDefinition= ruleWorkDefinition EOF )
            // InternalTextSimplePDL.g:227:2: iv_ruleWorkDefinition= ruleWorkDefinition EOF
            {
             newCompositeNode(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkDefinition=ruleWorkDefinition();

            state._fsp--;

             current =iv_ruleWorkDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalTextSimplePDL.g:233:1: ruleWorkDefinition returns [EObject current=null] : (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (lv_linkToRessource_3_0= ruleRessourceLink ) ) (otherlv_4= ',' ( (lv_linkToRessource_5_0= ruleRessourceLink ) ) )* )? ) ;
    public final EObject ruleWorkDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_linkToRessource_3_0 = null;

        EObject lv_linkToRessource_5_0 = null;



        	enterRule();

        try {
            // InternalTextSimplePDL.g:239:2: ( (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (lv_linkToRessource_3_0= ruleRessourceLink ) ) (otherlv_4= ',' ( (lv_linkToRessource_5_0= ruleRessourceLink ) ) )* )? ) )
            // InternalTextSimplePDL.g:240:2: (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (lv_linkToRessource_3_0= ruleRessourceLink ) ) (otherlv_4= ',' ( (lv_linkToRessource_5_0= ruleRessourceLink ) ) )* )? )
            {
            // InternalTextSimplePDL.g:240:2: (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (lv_linkToRessource_3_0= ruleRessourceLink ) ) (otherlv_4= ',' ( (lv_linkToRessource_5_0= ruleRessourceLink ) ) )* )? )
            // InternalTextSimplePDL.g:241:3: otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (lv_linkToRessource_3_0= ruleRessourceLink ) ) (otherlv_4= ',' ( (lv_linkToRessource_5_0= ruleRessourceLink ) ) )* )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkDefinitionAccess().getWdKeyword_0());
            		
            // InternalTextSimplePDL.g:245:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTextSimplePDL.g:246:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTextSimplePDL.g:246:4: (lv_name_1_0= RULE_ID )
            // InternalTextSimplePDL.g:247:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalTextSimplePDL.g:263:3: (otherlv_2= 'uses' ( (lv_linkToRessource_3_0= ruleRessourceLink ) ) (otherlv_4= ',' ( (lv_linkToRessource_5_0= ruleRessourceLink ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTextSimplePDL.g:264:4: otherlv_2= 'uses' ( (lv_linkToRessource_3_0= ruleRessourceLink ) ) (otherlv_4= ',' ( (lv_linkToRessource_5_0= ruleRessourceLink ) ) )*
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getWorkDefinitionAccess().getUsesKeyword_2_0());
                    			
                    // InternalTextSimplePDL.g:268:4: ( (lv_linkToRessource_3_0= ruleRessourceLink ) )
                    // InternalTextSimplePDL.g:269:5: (lv_linkToRessource_3_0= ruleRessourceLink )
                    {
                    // InternalTextSimplePDL.g:269:5: (lv_linkToRessource_3_0= ruleRessourceLink )
                    // InternalTextSimplePDL.g:270:6: lv_linkToRessource_3_0= ruleRessourceLink
                    {

                    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinkToRessourceRessourceLinkParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_linkToRessource_3_0=ruleRessourceLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"linkToRessource",
                    							lv_linkToRessource_3_0,
                    							"fr.n7.simplePDL.TextSimplePDL.RessourceLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTextSimplePDL.g:287:4: (otherlv_4= ',' ( (lv_linkToRessource_5_0= ruleRessourceLink ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==19) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalTextSimplePDL.g:288:5: otherlv_4= ',' ( (lv_linkToRessource_5_0= ruleRessourceLink ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_9); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getWorkDefinitionAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalTextSimplePDL.g:292:5: ( (lv_linkToRessource_5_0= ruleRessourceLink ) )
                    	    // InternalTextSimplePDL.g:293:6: (lv_linkToRessource_5_0= ruleRessourceLink )
                    	    {
                    	    // InternalTextSimplePDL.g:293:6: (lv_linkToRessource_5_0= ruleRessourceLink )
                    	    // InternalTextSimplePDL.g:294:7: lv_linkToRessource_5_0= ruleRessourceLink
                    	    {

                    	    							newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinkToRessourceRessourceLinkParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_linkToRessource_5_0=ruleRessourceLink();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"linkToRessource",
                    	    								lv_linkToRessource_5_0,
                    	    								"fr.n7.simplePDL.TextSimplePDL.RessourceLink");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalTextSimplePDL.g:317:1: entryRuleWorkSequence returns [EObject current=null] : iv_ruleWorkSequence= ruleWorkSequence EOF ;
    public final EObject entryRuleWorkSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequence = null;


        try {
            // InternalTextSimplePDL.g:317:53: (iv_ruleWorkSequence= ruleWorkSequence EOF )
            // InternalTextSimplePDL.g:318:2: iv_ruleWorkSequence= ruleWorkSequence EOF
            {
             newCompositeNode(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkSequence=ruleWorkSequence();

            state._fsp--;

             current =iv_ruleWorkSequence; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalTextSimplePDL.g:324:1: ruleWorkSequence returns [EObject current=null] : (otherlv_0= 'ws' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '--' ( (lv_linkType_5_0= ruleWorkSequenceType ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) )? ) ;
    public final EObject ruleWorkSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_linkType_5_0 = null;



        	enterRule();

        try {
            // InternalTextSimplePDL.g:330:2: ( (otherlv_0= 'ws' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '--' ( (lv_linkType_5_0= ruleWorkSequenceType ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) )? ) )
            // InternalTextSimplePDL.g:331:2: (otherlv_0= 'ws' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '--' ( (lv_linkType_5_0= ruleWorkSequenceType ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) )? )
            {
            // InternalTextSimplePDL.g:331:2: (otherlv_0= 'ws' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '--' ( (lv_linkType_5_0= ruleWorkSequenceType ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) )? )
            // InternalTextSimplePDL.g:332:3: otherlv_0= 'ws' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '--' ( (lv_linkType_5_0= ruleWorkSequenceType ) ) otherlv_6= '->' ( (otherlv_7= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkSequenceAccess().getWsKeyword_0());
            		
            // InternalTextSimplePDL.g:336:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTextSimplePDL.g:337:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTextSimplePDL.g:337:4: (lv_name_1_0= RULE_ID )
            // InternalTextSimplePDL.g:338:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWorkSequenceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkSequenceAccess().getColonKeyword_2());
            		
            // InternalTextSimplePDL.g:358:3: ( (otherlv_3= RULE_ID ) )
            // InternalTextSimplePDL.g:359:4: (otherlv_3= RULE_ID )
            {
            // InternalTextSimplePDL.g:359:4: (otherlv_3= RULE_ID )
            // InternalTextSimplePDL.g:360:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getWorkSequenceAccess().getHyphenMinusHyphenMinusKeyword_4());
            		
            // InternalTextSimplePDL.g:375:3: ( (lv_linkType_5_0= ruleWorkSequenceType ) )
            // InternalTextSimplePDL.g:376:4: (lv_linkType_5_0= ruleWorkSequenceType )
            {
            // InternalTextSimplePDL.g:376:4: (lv_linkType_5_0= ruleWorkSequenceType )
            // InternalTextSimplePDL.g:377:5: lv_linkType_5_0= ruleWorkSequenceType
            {

            					newCompositeNode(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
            lv_linkType_5_0=ruleWorkSequenceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkSequenceRule());
            					}
            					set(
            						current,
            						"linkType",
            						lv_linkType_5_0,
            						"fr.n7.simplePDL.TextSimplePDL.WorkSequenceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getWorkSequenceAccess().getHyphenMinusGreaterThanSignKeyword_6());
            		
            // InternalTextSimplePDL.g:398:3: ( (otherlv_7= RULE_ID ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTextSimplePDL.g:399:4: (otherlv_7= RULE_ID )
                    {
                    // InternalTextSimplePDL.g:399:4: (otherlv_7= RULE_ID )
                    // InternalTextSimplePDL.g:400:5: otherlv_7= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getWorkSequenceRule());
                    					}
                    				
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getWorkSequenceAccess().getSucessorWorkDefinitionCrossReference_7_0());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleRessource"
    // InternalTextSimplePDL.g:415:1: entryRuleRessource returns [EObject current=null] : iv_ruleRessource= ruleRessource EOF ;
    public final EObject entryRuleRessource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRessource = null;


        try {
            // InternalTextSimplePDL.g:415:50: (iv_ruleRessource= ruleRessource EOF )
            // InternalTextSimplePDL.g:416:2: iv_ruleRessource= ruleRessource EOF
            {
             newCompositeNode(grammarAccess.getRessourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRessource=ruleRessource();

            state._fsp--;

             current =iv_ruleRessource; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRessource"


    // $ANTLR start "ruleRessource"
    // InternalTextSimplePDL.g:422:1: ruleRessource returns [EObject current=null] : (otherlv_0= 'res' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_quantity_3_0= RULE_INT ) ) ) ;
    public final EObject ruleRessource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_quantity_3_0=null;


        	enterRule();

        try {
            // InternalTextSimplePDL.g:428:2: ( (otherlv_0= 'res' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_quantity_3_0= RULE_INT ) ) ) )
            // InternalTextSimplePDL.g:429:2: (otherlv_0= 'res' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_quantity_3_0= RULE_INT ) ) )
            {
            // InternalTextSimplePDL.g:429:2: (otherlv_0= 'res' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_quantity_3_0= RULE_INT ) ) )
            // InternalTextSimplePDL.g:430:3: otherlv_0= 'res' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_quantity_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRessourceAccess().getResKeyword_0());
            		
            // InternalTextSimplePDL.g:434:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTextSimplePDL.g:435:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTextSimplePDL.g:435:4: (lv_name_1_0= RULE_ID )
            // InternalTextSimplePDL.g:436:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRessourceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRessourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getRessourceAccess().getColonKeyword_2());
            		
            // InternalTextSimplePDL.g:456:3: ( (lv_quantity_3_0= RULE_INT ) )
            // InternalTextSimplePDL.g:457:4: (lv_quantity_3_0= RULE_INT )
            {
            // InternalTextSimplePDL.g:457:4: (lv_quantity_3_0= RULE_INT )
            // InternalTextSimplePDL.g:458:5: lv_quantity_3_0= RULE_INT
            {
            lv_quantity_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_quantity_3_0, grammarAccess.getRessourceAccess().getQuantityINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRessourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quantity",
            						lv_quantity_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRessource"


    // $ANTLR start "entryRuleRessourceLink"
    // InternalTextSimplePDL.g:478:1: entryRuleRessourceLink returns [EObject current=null] : iv_ruleRessourceLink= ruleRessourceLink EOF ;
    public final EObject entryRuleRessourceLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRessourceLink = null;


        try {
            // InternalTextSimplePDL.g:478:54: (iv_ruleRessourceLink= ruleRessourceLink EOF )
            // InternalTextSimplePDL.g:479:2: iv_ruleRessourceLink= ruleRessourceLink EOF
            {
             newCompositeNode(grammarAccess.getRessourceLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRessourceLink=ruleRessourceLink();

            state._fsp--;

             current =iv_ruleRessourceLink; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRessourceLink"


    // $ANTLR start "ruleRessourceLink"
    // InternalTextSimplePDL.g:485:1: ruleRessourceLink returns [EObject current=null] : ( ( (lv_quantity_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRessourceLink() throws RecognitionException {
        EObject current = null;

        Token lv_quantity_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTextSimplePDL.g:491:2: ( ( ( (lv_quantity_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) ) ) )
            // InternalTextSimplePDL.g:492:2: ( ( (lv_quantity_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalTextSimplePDL.g:492:2: ( ( (lv_quantity_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) ) )
            // InternalTextSimplePDL.g:493:3: ( (lv_quantity_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) )
            {
            // InternalTextSimplePDL.g:493:3: ( (lv_quantity_0_0= RULE_INT ) )
            // InternalTextSimplePDL.g:494:4: (lv_quantity_0_0= RULE_INT )
            {
            // InternalTextSimplePDL.g:494:4: (lv_quantity_0_0= RULE_INT )
            // InternalTextSimplePDL.g:495:5: lv_quantity_0_0= RULE_INT
            {
            lv_quantity_0_0=(Token)match(input,RULE_INT,FOLLOW_3); 

            					newLeafNode(lv_quantity_0_0, grammarAccess.getRessourceLinkAccess().getQuantityINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRessourceLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quantity",
            						lv_quantity_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalTextSimplePDL.g:511:3: ( (otherlv_1= RULE_ID ) )
            // InternalTextSimplePDL.g:512:4: (otherlv_1= RULE_ID )
            {
            // InternalTextSimplePDL.g:512:4: (otherlv_1= RULE_ID )
            // InternalTextSimplePDL.g:513:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRessourceLinkRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getRessourceLinkAccess().getRessourceNeededRessourceCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRessourceLink"


    // $ANTLR start "entryRuleGuidance"
    // InternalTextSimplePDL.g:528:1: entryRuleGuidance returns [EObject current=null] : iv_ruleGuidance= ruleGuidance EOF ;
    public final EObject entryRuleGuidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidance = null;


        try {
            // InternalTextSimplePDL.g:528:49: (iv_ruleGuidance= ruleGuidance EOF )
            // InternalTextSimplePDL.g:529:2: iv_ruleGuidance= ruleGuidance EOF
            {
             newCompositeNode(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuidance=ruleGuidance();

            state._fsp--;

             current =iv_ruleGuidance; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // InternalTextSimplePDL.g:535:1: ruleGuidance returns [EObject current=null] : (this_GuidedProcessElement_0= ruleGuidedProcessElement | (otherlv_1= '%' ( (lv_text_2_0= RULE_COMMENT_BODY ) ) ) ) ;
    public final EObject ruleGuidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_text_2_0=null;
        EObject this_GuidedProcessElement_0 = null;



        	enterRule();

        try {
            // InternalTextSimplePDL.g:541:2: ( (this_GuidedProcessElement_0= ruleGuidedProcessElement | (otherlv_1= '%' ( (lv_text_2_0= RULE_COMMENT_BODY ) ) ) ) )
            // InternalTextSimplePDL.g:542:2: (this_GuidedProcessElement_0= ruleGuidedProcessElement | (otherlv_1= '%' ( (lv_text_2_0= RULE_COMMENT_BODY ) ) ) )
            {
            // InternalTextSimplePDL.g:542:2: (this_GuidedProcessElement_0= ruleGuidedProcessElement | (otherlv_1= '%' ( (lv_text_2_0= RULE_COMMENT_BODY ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17||LA7_0==20||LA7_0==24) ) {
                alt7=1;
            }
            else if ( (LA7_0==25) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTextSimplePDL.g:543:3: this_GuidedProcessElement_0= ruleGuidedProcessElement
                    {

                    			newCompositeNode(grammarAccess.getGuidanceAccess().getGuidedProcessElementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GuidedProcessElement_0=ruleGuidedProcessElement();

                    state._fsp--;


                    			current = this_GuidedProcessElement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTextSimplePDL.g:552:3: (otherlv_1= '%' ( (lv_text_2_0= RULE_COMMENT_BODY ) ) )
                    {
                    // InternalTextSimplePDL.g:552:3: (otherlv_1= '%' ( (lv_text_2_0= RULE_COMMENT_BODY ) ) )
                    // InternalTextSimplePDL.g:553:4: otherlv_1= '%' ( (lv_text_2_0= RULE_COMMENT_BODY ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getGuidanceAccess().getPercentSignKeyword_1_0());
                    			
                    // InternalTextSimplePDL.g:557:4: ( (lv_text_2_0= RULE_COMMENT_BODY ) )
                    // InternalTextSimplePDL.g:558:5: (lv_text_2_0= RULE_COMMENT_BODY )
                    {
                    // InternalTextSimplePDL.g:558:5: (lv_text_2_0= RULE_COMMENT_BODY )
                    // InternalTextSimplePDL.g:559:6: lv_text_2_0= RULE_COMMENT_BODY
                    {
                    lv_text_2_0=(Token)match(input,RULE_COMMENT_BODY,FOLLOW_2); 

                    						newLeafNode(lv_text_2_0, grammarAccess.getGuidanceAccess().getTextCOMMENT_BODYTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGuidanceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"text",
                    							lv_text_2_0,
                    							"fr.n7.simplePDL.TextSimplePDL.COMMENT_BODY");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "entryRuleGuidedProcessElement"
    // InternalTextSimplePDL.g:580:1: entryRuleGuidedProcessElement returns [EObject current=null] : iv_ruleGuidedProcessElement= ruleGuidedProcessElement EOF ;
    public final EObject entryRuleGuidedProcessElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidedProcessElement = null;


        try {
            // InternalTextSimplePDL.g:580:61: (iv_ruleGuidedProcessElement= ruleGuidedProcessElement EOF )
            // InternalTextSimplePDL.g:581:2: iv_ruleGuidedProcessElement= ruleGuidedProcessElement EOF
            {
             newCompositeNode(grammarAccess.getGuidedProcessElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuidedProcessElement=ruleGuidedProcessElement();

            state._fsp--;

             current =iv_ruleGuidedProcessElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGuidedProcessElement"


    // $ANTLR start "ruleGuidedProcessElement"
    // InternalTextSimplePDL.g:587:1: ruleGuidedProcessElement returns [EObject current=null] : ( ( (lv_element_0_0= ruleProcessElement ) ) otherlv_1= '%' ( (lv_text_2_0= RULE_COMMENT_BODY ) ) ) ;
    public final EObject ruleGuidedProcessElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_text_2_0=null;
        EObject lv_element_0_0 = null;



        	enterRule();

        try {
            // InternalTextSimplePDL.g:593:2: ( ( ( (lv_element_0_0= ruleProcessElement ) ) otherlv_1= '%' ( (lv_text_2_0= RULE_COMMENT_BODY ) ) ) )
            // InternalTextSimplePDL.g:594:2: ( ( (lv_element_0_0= ruleProcessElement ) ) otherlv_1= '%' ( (lv_text_2_0= RULE_COMMENT_BODY ) ) )
            {
            // InternalTextSimplePDL.g:594:2: ( ( (lv_element_0_0= ruleProcessElement ) ) otherlv_1= '%' ( (lv_text_2_0= RULE_COMMENT_BODY ) ) )
            // InternalTextSimplePDL.g:595:3: ( (lv_element_0_0= ruleProcessElement ) ) otherlv_1= '%' ( (lv_text_2_0= RULE_COMMENT_BODY ) )
            {
            // InternalTextSimplePDL.g:595:3: ( (lv_element_0_0= ruleProcessElement ) )
            // InternalTextSimplePDL.g:596:4: (lv_element_0_0= ruleProcessElement )
            {
            // InternalTextSimplePDL.g:596:4: (lv_element_0_0= ruleProcessElement )
            // InternalTextSimplePDL.g:597:5: lv_element_0_0= ruleProcessElement
            {

            					newCompositeNode(grammarAccess.getGuidedProcessElementAccess().getElementProcessElementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_element_0_0=ruleProcessElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGuidedProcessElementRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_0_0,
            						"fr.n7.simplePDL.TextSimplePDL.ProcessElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getGuidedProcessElementAccess().getPercentSignKeyword_1());
            		
            // InternalTextSimplePDL.g:618:3: ( (lv_text_2_0= RULE_COMMENT_BODY ) )
            // InternalTextSimplePDL.g:619:4: (lv_text_2_0= RULE_COMMENT_BODY )
            {
            // InternalTextSimplePDL.g:619:4: (lv_text_2_0= RULE_COMMENT_BODY )
            // InternalTextSimplePDL.g:620:5: lv_text_2_0= RULE_COMMENT_BODY
            {
            lv_text_2_0=(Token)match(input,RULE_COMMENT_BODY,FOLLOW_2); 

            					newLeafNode(lv_text_2_0, grammarAccess.getGuidedProcessElementAccess().getTextCOMMENT_BODYTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGuidedProcessElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_2_0,
            						"fr.n7.simplePDL.TextSimplePDL.COMMENT_BODY");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGuidedProcessElement"


    // $ANTLR start "ruleWorkSequenceType"
    // InternalTextSimplePDL.g:640:1: ruleWorkSequenceType returns [Enumerator current=null] : ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 's2f' ) | (enumLiteral_2= 'f2s' ) | (enumLiteral_3= 'f2f' ) ) ;
    public final Enumerator ruleWorkSequenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTextSimplePDL.g:646:2: ( ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 's2f' ) | (enumLiteral_2= 'f2s' ) | (enumLiteral_3= 'f2f' ) ) )
            // InternalTextSimplePDL.g:647:2: ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 's2f' ) | (enumLiteral_2= 'f2s' ) | (enumLiteral_3= 'f2f' ) )
            {
            // InternalTextSimplePDL.g:647:2: ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 's2f' ) | (enumLiteral_2= 'f2s' ) | (enumLiteral_3= 'f2f' ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt8=1;
                }
                break;
            case 27:
                {
                alt8=2;
                }
                break;
            case 28:
                {
                alt8=3;
                }
                break;
            case 29:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalTextSimplePDL.g:648:3: (enumLiteral_0= 's2s' )
                    {
                    // InternalTextSimplePDL.g:648:3: (enumLiteral_0= 's2s' )
                    // InternalTextSimplePDL.g:649:4: enumLiteral_0= 's2s'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTextSimplePDL.g:656:3: (enumLiteral_1= 's2f' )
                    {
                    // InternalTextSimplePDL.g:656:3: (enumLiteral_1= 's2f' )
                    // InternalTextSimplePDL.g:657:4: enumLiteral_1= 's2f'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTextSimplePDL.g:664:3: (enumLiteral_2= 'f2s' )
                    {
                    // InternalTextSimplePDL.g:664:3: (enumLiteral_2= 'f2s' )
                    // InternalTextSimplePDL.g:665:4: enumLiteral_2= 'f2s'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTextSimplePDL.g:672:3: (enumLiteral_3= 'f2f' )
                    {
                    // InternalTextSimplePDL.g:672:3: (enumLiteral_3= 'f2f' )
                    // InternalTextSimplePDL.g:673:4: enumLiteral_3= 'f2f'
                    {
                    enumLiteral_3=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkSequenceType"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\33\uffff";
    static final String dfa_2s = "\1\21\3\4\1\uffff\1\20\2\25\1\5\1\17\1\4\1\5\1\4\1\uffff\1\26\2\20\1\32\1\5\4\27\2\4\2\20";
    static final String dfa_3s = "\1\31\3\4\1\uffff\1\22\2\25\1\5\1\31\1\4\1\5\1\4\1\uffff\1\26\1\20\1\23\1\35\1\5\4\27\1\4\1\20\1\23\1\20";
    static final String dfa_4s = "\4\uffff\1\1\10\uffff\1\2\15\uffff";
    static final String dfa_5s = "\33\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\2\3\uffff\1\3\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "",
            "\1\11\1\uffff\1\10",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15\11\uffff\1\4",
            "\1\16",
            "\1\17",
            "\1\20",
            "",
            "\1\21",
            "\1\11",
            "\1\11\2\uffff\1\22",
            "\1\23\1\24\1\25\1\26",
            "\1\27",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\31",
            "\1\32\13\uffff\1\11",
            "\1\11\2\uffff\1\22",
            "\1\11"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "148:3: (this_Guidance_0= ruleGuidance | this_ProcessElement_1= ruleProcessElement )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000003124000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});

}