package n7.fr.parser.antlr.internal;

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
import n7.fr.services.SimplePDLTextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimplePDLTextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_EOL", "RULE_INT", "RULE_COMMENT_BODY", "RULE_WS", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'process'", "':'", "'work'", "'uses'", "','", "'rule'", "'to'", "'available'", "'start'", "'finish'"
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
    public static final int RULE_ID=4;
    public static final int RULE_EOL=5;
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

        public InternalSimplePDLTextParser(TokenStream input, SimplePDLTextGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Process";
       	}

       	@Override
       	protected SimplePDLTextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProcess"
    // InternalSimplePDLText.g:65:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalSimplePDLText.g:65:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalSimplePDLText.g:66:2: iv_ruleProcess= ruleProcess EOF
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
    // InternalSimplePDLText.g:72:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (this_EOL_3= RULE_EOL )+ ( (lv_processElements_4_0= ruleSyntaxElement ) ) )* (this_EOL_5= RULE_EOL )* ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_EOL_3=null;
        Token this_EOL_5=null;
        EObject lv_processElements_4_0 = null;



        	enterRule();

        try {
            // InternalSimplePDLText.g:78:2: ( (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (this_EOL_3= RULE_EOL )+ ( (lv_processElements_4_0= ruleSyntaxElement ) ) )* (this_EOL_5= RULE_EOL )* ) )
            // InternalSimplePDLText.g:79:2: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (this_EOL_3= RULE_EOL )+ ( (lv_processElements_4_0= ruleSyntaxElement ) ) )* (this_EOL_5= RULE_EOL )* )
            {
            // InternalSimplePDLText.g:79:2: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (this_EOL_3= RULE_EOL )+ ( (lv_processElements_4_0= ruleSyntaxElement ) ) )* (this_EOL_5= RULE_EOL )* )
            // InternalSimplePDLText.g:80:3: otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (this_EOL_3= RULE_EOL )+ ( (lv_processElements_4_0= ruleSyntaxElement ) ) )* (this_EOL_5= RULE_EOL )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
            		
            // InternalSimplePDLText.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimplePDLText.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimplePDLText.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalSimplePDLText.g:86:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getColonKeyword_2());
            		
            // InternalSimplePDLText.g:106:3: ( (this_EOL_3= RULE_EOL )+ ( (lv_processElements_4_0= ruleSyntaxElement ) ) )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalSimplePDLText.g:107:4: (this_EOL_3= RULE_EOL )+ ( (lv_processElements_4_0= ruleSyntaxElement ) )
            	    {
            	    // InternalSimplePDLText.g:107:4: (this_EOL_3= RULE_EOL )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==RULE_EOL) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalSimplePDLText.g:108:5: this_EOL_3= RULE_EOL
            	    	    {
            	    	    this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_6); 

            	    	    					newLeafNode(this_EOL_3, grammarAccess.getProcessAccess().getEOLTerminalRuleCall_3_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt1 >= 1 ) break loop1;
            	                EarlyExitException eee =
            	                    new EarlyExitException(1, input);
            	                throw eee;
            	        }
            	        cnt1++;
            	    } while (true);

            	    // InternalSimplePDLText.g:113:4: ( (lv_processElements_4_0= ruleSyntaxElement ) )
            	    // InternalSimplePDLText.g:114:5: (lv_processElements_4_0= ruleSyntaxElement )
            	    {
            	    // InternalSimplePDLText.g:114:5: (lv_processElements_4_0= ruleSyntaxElement )
            	    // InternalSimplePDLText.g:115:6: lv_processElements_4_0= ruleSyntaxElement
            	    {

            	    						newCompositeNode(grammarAccess.getProcessAccess().getProcessElementsSyntaxElementParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_processElements_4_0=ruleSyntaxElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProcessRule());
            	    						}
            	    						add(
            	    							current,
            	    							"processElements",
            	    							lv_processElements_4_0,
            	    							"n7.fr.SimplePDLText.SyntaxElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalSimplePDLText.g:133:3: (this_EOL_5= RULE_EOL )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_EOL) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSimplePDLText.g:134:4: this_EOL_5= RULE_EOL
            	    {
            	    this_EOL_5=(Token)match(input,RULE_EOL,FOLLOW_5); 

            	    				newLeafNode(this_EOL_5, grammarAccess.getProcessAccess().getEOLTerminalRuleCall_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // InternalSimplePDLText.g:143:1: entryRuleSyntaxElement returns [EObject current=null] : iv_ruleSyntaxElement= ruleSyntaxElement EOF ;
    public final EObject entryRuleSyntaxElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSyntaxElement = null;


        try {
            // InternalSimplePDLText.g:143:54: (iv_ruleSyntaxElement= ruleSyntaxElement EOF )
            // InternalSimplePDLText.g:144:2: iv_ruleSyntaxElement= ruleSyntaxElement EOF
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
    // InternalSimplePDLText.g:150:1: ruleSyntaxElement returns [EObject current=null] : (this_ProcessElement_0= ruleProcessElement | this_Guidance_1= ruleGuidance ) ;
    public final EObject ruleSyntaxElement() throws RecognitionException {
        EObject current = null;

        EObject this_ProcessElement_0 = null;

        EObject this_Guidance_1 = null;



        	enterRule();

        try {
            // InternalSimplePDLText.g:156:2: ( (this_ProcessElement_0= ruleProcessElement | this_Guidance_1= ruleGuidance ) )
            // InternalSimplePDLText.g:157:2: (this_ProcessElement_0= ruleProcessElement | this_Guidance_1= ruleGuidance )
            {
            // InternalSimplePDLText.g:157:2: (this_ProcessElement_0= ruleProcessElement | this_Guidance_1= ruleGuidance )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalSimplePDLText.g:158:3: this_ProcessElement_0= ruleProcessElement
                    {

                    			newCompositeNode(grammarAccess.getSyntaxElementAccess().getProcessElementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProcessElement_0=ruleProcessElement();

                    state._fsp--;


                    			current = this_ProcessElement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSimplePDLText.g:167:3: this_Guidance_1= ruleGuidance
                    {

                    			newCompositeNode(grammarAccess.getSyntaxElementAccess().getGuidanceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Guidance_1=ruleGuidance();

                    state._fsp--;


                    			current = this_Guidance_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleSyntaxElement"


    // $ANTLR start "entryRuleProcessElement"
    // InternalSimplePDLText.g:179:1: entryRuleProcessElement returns [EObject current=null] : iv_ruleProcessElement= ruleProcessElement EOF ;
    public final EObject entryRuleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessElement = null;


        try {
            // InternalSimplePDLText.g:179:55: (iv_ruleProcessElement= ruleProcessElement EOF )
            // InternalSimplePDLText.g:180:2: iv_ruleProcessElement= ruleProcessElement EOF
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
    // InternalSimplePDLText.g:186:1: ruleProcessElement returns [EObject current=null] : (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Ressource_2= ruleRessource ) ;
    public final EObject ruleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject this_WorkDefinition_0 = null;

        EObject this_WorkSequence_1 = null;

        EObject this_Ressource_2 = null;



        	enterRule();

        try {
            // InternalSimplePDLText.g:192:2: ( (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Ressource_2= ruleRessource ) )
            // InternalSimplePDLText.g:193:2: (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Ressource_2= ruleRessource )
            {
            // InternalSimplePDLText.g:193:2: (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Ressource_2= ruleRessource )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case RULE_INT:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSimplePDLText.g:194:3: this_WorkDefinition_0= ruleWorkDefinition
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_WorkDefinition_0=ruleWorkDefinition();

                    state._fsp--;


                    			current = this_WorkDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSimplePDLText.g:203:3: this_WorkSequence_1= ruleWorkSequence
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WorkSequence_1=ruleWorkSequence();

                    state._fsp--;


                    			current = this_WorkSequence_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSimplePDLText.g:212:3: this_Ressource_2= ruleRessource
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getRessourceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ressource_2=ruleRessource();

                    state._fsp--;


                    			current = this_Ressource_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalSimplePDLText.g:224:1: entryRuleWorkDefinition returns [EObject current=null] : iv_ruleWorkDefinition= ruleWorkDefinition EOF ;
    public final EObject entryRuleWorkDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDefinition = null;


        try {
            // InternalSimplePDLText.g:224:55: (iv_ruleWorkDefinition= ruleWorkDefinition EOF )
            // InternalSimplePDLText.g:225:2: iv_ruleWorkDefinition= ruleWorkDefinition EOF
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
    // InternalSimplePDLText.g:231:1: ruleWorkDefinition returns [EObject current=null] : (otherlv_0= 'work' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (lv_linkToRessource_3_0= ruleRessourceLink ) ) (otherlv_4= ',' ( (lv_linkToRessource_5_0= ruleRessourceLink ) ) )* )? ) ;
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
            // InternalSimplePDLText.g:237:2: ( (otherlv_0= 'work' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (lv_linkToRessource_3_0= ruleRessourceLink ) ) (otherlv_4= ',' ( (lv_linkToRessource_5_0= ruleRessourceLink ) ) )* )? ) )
            // InternalSimplePDLText.g:238:2: (otherlv_0= 'work' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (lv_linkToRessource_3_0= ruleRessourceLink ) ) (otherlv_4= ',' ( (lv_linkToRessource_5_0= ruleRessourceLink ) ) )* )? )
            {
            // InternalSimplePDLText.g:238:2: (otherlv_0= 'work' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (lv_linkToRessource_3_0= ruleRessourceLink ) ) (otherlv_4= ',' ( (lv_linkToRessource_5_0= ruleRessourceLink ) ) )* )? )
            // InternalSimplePDLText.g:239:3: otherlv_0= 'work' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (lv_linkToRessource_3_0= ruleRessourceLink ) ) (otherlv_4= ',' ( (lv_linkToRessource_5_0= ruleRessourceLink ) ) )* )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkDefinitionAccess().getWorkKeyword_0());
            		
            // InternalSimplePDLText.g:243:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimplePDLText.g:244:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimplePDLText.g:244:4: (lv_name_1_0= RULE_ID )
            // InternalSimplePDLText.g:245:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            // InternalSimplePDLText.g:261:3: (otherlv_2= 'uses' ( (lv_linkToRessource_3_0= ruleRessourceLink ) ) (otherlv_4= ',' ( (lv_linkToRessource_5_0= ruleRessourceLink ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSimplePDLText.g:262:4: otherlv_2= 'uses' ( (lv_linkToRessource_3_0= ruleRessourceLink ) ) (otherlv_4= ',' ( (lv_linkToRessource_5_0= ruleRessourceLink ) ) )*
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getWorkDefinitionAccess().getUsesKeyword_2_0());
                    			
                    // InternalSimplePDLText.g:266:4: ( (lv_linkToRessource_3_0= ruleRessourceLink ) )
                    // InternalSimplePDLText.g:267:5: (lv_linkToRessource_3_0= ruleRessourceLink )
                    {
                    // InternalSimplePDLText.g:267:5: (lv_linkToRessource_3_0= ruleRessourceLink )
                    // InternalSimplePDLText.g:268:6: lv_linkToRessource_3_0= ruleRessourceLink
                    {

                    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinkToRessourceRessourceLinkParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_linkToRessource_3_0=ruleRessourceLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"linkToRessource",
                    							lv_linkToRessource_3_0,
                    							"n7.fr.SimplePDLText.RessourceLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimplePDLText.g:285:4: (otherlv_4= ',' ( (lv_linkToRessource_5_0= ruleRessourceLink ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==17) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSimplePDLText.g:286:5: otherlv_4= ',' ( (lv_linkToRessource_5_0= ruleRessourceLink ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_8); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getWorkDefinitionAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalSimplePDLText.g:290:5: ( (lv_linkToRessource_5_0= ruleRessourceLink ) )
                    	    // InternalSimplePDLText.g:291:6: (lv_linkToRessource_5_0= ruleRessourceLink )
                    	    {
                    	    // InternalSimplePDLText.g:291:6: (lv_linkToRessource_5_0= ruleRessourceLink )
                    	    // InternalSimplePDLText.g:292:7: lv_linkToRessource_5_0= ruleRessourceLink
                    	    {

                    	    							newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinkToRessourceRessourceLinkParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_linkToRessource_5_0=ruleRessourceLink();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"linkToRessource",
                    	    								lv_linkToRessource_5_0,
                    	    								"n7.fr.SimplePDLText.RessourceLink");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
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
    // InternalSimplePDLText.g:315:1: entryRuleWorkSequence returns [EObject current=null] : iv_ruleWorkSequence= ruleWorkSequence EOF ;
    public final EObject entryRuleWorkSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequence = null;


        try {
            // InternalSimplePDLText.g:315:53: (iv_ruleWorkSequence= ruleWorkSequence EOF )
            // InternalSimplePDLText.g:316:2: iv_ruleWorkSequence= ruleWorkSequence EOF
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
    // InternalSimplePDLText.g:322:1: ruleWorkSequence returns [EObject current=null] : (otherlv_0= 'rule' otherlv_1= ':' ( (lv_predecessorState_2_0= ruleStateType ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (lv_successorState_5_0= ruleStateType ) ) ( (otherlv_6= RULE_ID ) ) ) ;
    public final EObject ruleWorkSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_predecessorState_2_0 = null;

        Enumerator lv_successorState_5_0 = null;



        	enterRule();

        try {
            // InternalSimplePDLText.g:328:2: ( (otherlv_0= 'rule' otherlv_1= ':' ( (lv_predecessorState_2_0= ruleStateType ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (lv_successorState_5_0= ruleStateType ) ) ( (otherlv_6= RULE_ID ) ) ) )
            // InternalSimplePDLText.g:329:2: (otherlv_0= 'rule' otherlv_1= ':' ( (lv_predecessorState_2_0= ruleStateType ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (lv_successorState_5_0= ruleStateType ) ) ( (otherlv_6= RULE_ID ) ) )
            {
            // InternalSimplePDLText.g:329:2: (otherlv_0= 'rule' otherlv_1= ':' ( (lv_predecessorState_2_0= ruleStateType ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (lv_successorState_5_0= ruleStateType ) ) ( (otherlv_6= RULE_ID ) ) )
            // InternalSimplePDLText.g:330:3: otherlv_0= 'rule' otherlv_1= ':' ( (lv_predecessorState_2_0= ruleStateType ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (lv_successorState_5_0= ruleStateType ) ) ( (otherlv_6= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkSequenceAccess().getRuleKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkSequenceAccess().getColonKeyword_1());
            		
            // InternalSimplePDLText.g:338:3: ( (lv_predecessorState_2_0= ruleStateType ) )
            // InternalSimplePDLText.g:339:4: (lv_predecessorState_2_0= ruleStateType )
            {
            // InternalSimplePDLText.g:339:4: (lv_predecessorState_2_0= ruleStateType )
            // InternalSimplePDLText.g:340:5: lv_predecessorState_2_0= ruleStateType
            {

            					newCompositeNode(grammarAccess.getWorkSequenceAccess().getPredecessorStateStateTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_predecessorState_2_0=ruleStateType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkSequenceRule());
            					}
            					set(
            						current,
            						"predecessorState",
            						lv_predecessorState_2_0,
            						"n7.fr.SimplePDLText.StateType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimplePDLText.g:357:3: ( (otherlv_3= RULE_ID ) )
            // InternalSimplePDLText.g:358:4: (otherlv_3= RULE_ID )
            {
            // InternalSimplePDLText.g:358:4: (otherlv_3= RULE_ID )
            // InternalSimplePDLText.g:359:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_3, grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getWorkSequenceAccess().getToKeyword_4());
            		
            // InternalSimplePDLText.g:374:3: ( (lv_successorState_5_0= ruleStateType ) )
            // InternalSimplePDLText.g:375:4: (lv_successorState_5_0= ruleStateType )
            {
            // InternalSimplePDLText.g:375:4: (lv_successorState_5_0= ruleStateType )
            // InternalSimplePDLText.g:376:5: lv_successorState_5_0= ruleStateType
            {

            					newCompositeNode(grammarAccess.getWorkSequenceAccess().getSuccessorStateStateTypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_3);
            lv_successorState_5_0=ruleStateType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkSequenceRule());
            					}
            					set(
            						current,
            						"successorState",
            						lv_successorState_5_0,
            						"n7.fr.SimplePDLText.StateType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimplePDLText.g:393:3: ( (otherlv_6= RULE_ID ) )
            // InternalSimplePDLText.g:394:4: (otherlv_6= RULE_ID )
            {
            // InternalSimplePDLText.g:394:4: (otherlv_6= RULE_ID )
            // InternalSimplePDLText.g:395:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_6, grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_6_0());
            				

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
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleRessource"
    // InternalSimplePDLText.g:410:1: entryRuleRessource returns [EObject current=null] : iv_ruleRessource= ruleRessource EOF ;
    public final EObject entryRuleRessource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRessource = null;


        try {
            // InternalSimplePDLText.g:410:50: (iv_ruleRessource= ruleRessource EOF )
            // InternalSimplePDLText.g:411:2: iv_ruleRessource= ruleRessource EOF
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
    // InternalSimplePDLText.g:417:1: ruleRessource returns [EObject current=null] : ( ( (lv_quantity_0_0= RULE_INT ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'available' ) ;
    public final EObject ruleRessource() throws RecognitionException {
        EObject current = null;

        Token lv_quantity_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSimplePDLText.g:423:2: ( ( ( (lv_quantity_0_0= RULE_INT ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'available' ) )
            // InternalSimplePDLText.g:424:2: ( ( (lv_quantity_0_0= RULE_INT ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'available' )
            {
            // InternalSimplePDLText.g:424:2: ( ( (lv_quantity_0_0= RULE_INT ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'available' )
            // InternalSimplePDLText.g:425:3: ( (lv_quantity_0_0= RULE_INT ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'available'
            {
            // InternalSimplePDLText.g:425:3: ( (lv_quantity_0_0= RULE_INT ) )
            // InternalSimplePDLText.g:426:4: (lv_quantity_0_0= RULE_INT )
            {
            // InternalSimplePDLText.g:426:4: (lv_quantity_0_0= RULE_INT )
            // InternalSimplePDLText.g:427:5: lv_quantity_0_0= RULE_INT
            {
            lv_quantity_0_0=(Token)match(input,RULE_INT,FOLLOW_3); 

            					newLeafNode(lv_quantity_0_0, grammarAccess.getRessourceAccess().getQuantityINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRessourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quantity",
            						lv_quantity_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalSimplePDLText.g:443:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimplePDLText.g:444:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimplePDLText.g:444:4: (lv_name_1_0= RULE_ID )
            // InternalSimplePDLText.g:445:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRessourceAccess().getAvailableKeyword_2());
            		

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
    // InternalSimplePDLText.g:469:1: entryRuleRessourceLink returns [EObject current=null] : iv_ruleRessourceLink= ruleRessourceLink EOF ;
    public final EObject entryRuleRessourceLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRessourceLink = null;


        try {
            // InternalSimplePDLText.g:469:54: (iv_ruleRessourceLink= ruleRessourceLink EOF )
            // InternalSimplePDLText.g:470:2: iv_ruleRessourceLink= ruleRessourceLink EOF
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
    // InternalSimplePDLText.g:476:1: ruleRessourceLink returns [EObject current=null] : ( ( (lv_quantity_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRessourceLink() throws RecognitionException {
        EObject current = null;

        Token lv_quantity_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSimplePDLText.g:482:2: ( ( ( (lv_quantity_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) ) ) )
            // InternalSimplePDLText.g:483:2: ( ( (lv_quantity_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalSimplePDLText.g:483:2: ( ( (lv_quantity_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) ) )
            // InternalSimplePDLText.g:484:3: ( (lv_quantity_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) )
            {
            // InternalSimplePDLText.g:484:3: ( (lv_quantity_0_0= RULE_INT ) )
            // InternalSimplePDLText.g:485:4: (lv_quantity_0_0= RULE_INT )
            {
            // InternalSimplePDLText.g:485:4: (lv_quantity_0_0= RULE_INT )
            // InternalSimplePDLText.g:486:5: lv_quantity_0_0= RULE_INT
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

            // InternalSimplePDLText.g:502:3: ( (otherlv_1= RULE_ID ) )
            // InternalSimplePDLText.g:503:4: (otherlv_1= RULE_ID )
            {
            // InternalSimplePDLText.g:503:4: (otherlv_1= RULE_ID )
            // InternalSimplePDLText.g:504:5: otherlv_1= RULE_ID
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
    // InternalSimplePDLText.g:519:1: entryRuleGuidance returns [EObject current=null] : iv_ruleGuidance= ruleGuidance EOF ;
    public final EObject entryRuleGuidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidance = null;


        try {
            // InternalSimplePDLText.g:519:49: (iv_ruleGuidance= ruleGuidance EOF )
            // InternalSimplePDLText.g:520:2: iv_ruleGuidance= ruleGuidance EOF
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
    // InternalSimplePDLText.g:526:1: ruleGuidance returns [EObject current=null] : ( ( (lv_element_0_0= ruleProcessElement ) )? ( (lv_text_1_0= RULE_COMMENT_BODY ) ) ) ;
    public final EObject ruleGuidance() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        EObject lv_element_0_0 = null;



        	enterRule();

        try {
            // InternalSimplePDLText.g:532:2: ( ( ( (lv_element_0_0= ruleProcessElement ) )? ( (lv_text_1_0= RULE_COMMENT_BODY ) ) ) )
            // InternalSimplePDLText.g:533:2: ( ( (lv_element_0_0= ruleProcessElement ) )? ( (lv_text_1_0= RULE_COMMENT_BODY ) ) )
            {
            // InternalSimplePDLText.g:533:2: ( ( (lv_element_0_0= ruleProcessElement ) )? ( (lv_text_1_0= RULE_COMMENT_BODY ) ) )
            // InternalSimplePDLText.g:534:3: ( (lv_element_0_0= ruleProcessElement ) )? ( (lv_text_1_0= RULE_COMMENT_BODY ) )
            {
            // InternalSimplePDLText.g:534:3: ( (lv_element_0_0= ruleProcessElement ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT||LA8_0==15||LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSimplePDLText.g:535:4: (lv_element_0_0= ruleProcessElement )
                    {
                    // InternalSimplePDLText.g:535:4: (lv_element_0_0= ruleProcessElement )
                    // InternalSimplePDLText.g:536:5: lv_element_0_0= ruleProcessElement
                    {

                    					newCompositeNode(grammarAccess.getGuidanceAccess().getElementProcessElementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_element_0_0=ruleProcessElement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGuidanceRule());
                    					}
                    					set(
                    						current,
                    						"element",
                    						lv_element_0_0,
                    						"n7.fr.SimplePDLText.ProcessElement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSimplePDLText.g:553:3: ( (lv_text_1_0= RULE_COMMENT_BODY ) )
            // InternalSimplePDLText.g:554:4: (lv_text_1_0= RULE_COMMENT_BODY )
            {
            // InternalSimplePDLText.g:554:4: (lv_text_1_0= RULE_COMMENT_BODY )
            // InternalSimplePDLText.g:555:5: lv_text_1_0= RULE_COMMENT_BODY
            {
            lv_text_1_0=(Token)match(input,RULE_COMMENT_BODY,FOLLOW_2); 

            					newLeafNode(lv_text_1_0, grammarAccess.getGuidanceAccess().getTextCOMMENT_BODYTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGuidanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"n7.fr.SimplePDLText.COMMENT_BODY");
            				

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
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "ruleStateType"
    // InternalSimplePDLText.g:575:1: ruleStateType returns [Enumerator current=null] : ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'finish' ) ) ;
    public final Enumerator ruleStateType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSimplePDLText.g:581:2: ( ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'finish' ) ) )
            // InternalSimplePDLText.g:582:2: ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'finish' ) )
            {
            // InternalSimplePDLText.g:582:2: ( (enumLiteral_0= 'start' ) | (enumLiteral_1= 'finish' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSimplePDLText.g:583:3: (enumLiteral_0= 'start' )
                    {
                    // InternalSimplePDLText.g:583:3: (enumLiteral_0= 'start' )
                    // InternalSimplePDLText.g:584:4: enumLiteral_0= 'start'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getStateTypeAccess().getStartEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStateTypeAccess().getStartEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSimplePDLText.g:591:3: (enumLiteral_1= 'finish' )
                    {
                    // InternalSimplePDLText.g:591:3: (enumLiteral_1= 'finish' )
                    // InternalSimplePDLText.g:592:4: enumLiteral_1= 'finish'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getStateTypeAccess().getFinishEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStateTypeAccess().getFinishEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleStateType"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\2\2\2\uffff";
    static final String dfa_3s = "\2\5\2\uffff";
    static final String dfa_4s = "\1\5\1\22\2\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\1";
    static final String dfa_6s = "\4\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\1\2\3\7\uffff\1\3\2\uffff\1\3",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 106:3: ( (this_EOL_3= RULE_EOL )+ ( (lv_processElements_4_0= ruleSyntaxElement ) ) )*";
        }
    }
    static final String dfa_8s = "\27\uffff";
    static final String dfa_9s = "\5\uffff\1\11\6\uffff\1\11\2\uffff\1\11\5\uffff\2\11";
    static final String dfa_10s = "\1\6\1\4\1\16\1\4\1\uffff\1\5\1\25\1\24\1\6\1\uffff\2\4\1\5\1\4\1\23\1\5\1\25\1\6\3\4\2\5";
    static final String dfa_11s = "\1\22\1\4\1\16\1\4\1\uffff\1\20\1\26\1\24\1\6\1\uffff\2\4\1\7\1\4\1\23\1\21\1\26\1\6\3\4\1\7\1\21";
    static final String dfa_12s = "\4\uffff\1\2\4\uffff\1\1\15\uffff";
    static final String dfa_13s = "\27\uffff}>";
    static final String[] dfa_14s = {
            "\1\3\1\4\7\uffff\1\1\2\uffff\1\2",
            "\1\5",
            "\1\6",
            "\1\7",
            "",
            "\1\11\1\uffff\1\4\10\uffff\1\10",
            "\1\12\1\13",
            "\1\14",
            "\1\15",
            "",
            "\1\16",
            "\1\16",
            "\1\11\1\uffff\1\4",
            "\1\17",
            "\1\20",
            "\1\11\1\uffff\1\4\11\uffff\1\21",
            "\1\22\1\23",
            "\1\24",
            "\1\25",
            "\1\25",
            "\1\26",
            "\1\11\1\uffff\1\4",
            "\1\11\1\uffff\1\4\11\uffff\1\21"
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
            return "157:2: (this_ProcessElement_0= ruleProcessElement | this_Guidance_1= ruleGuidance )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000480E0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000080L});

}