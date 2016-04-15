package org.xtext.cnp.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.cnp.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_BOOLEAN", "RULE_INT", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AgentAttributes'", "'TaskAttributes'", "'BidAttributes'", "'ContractAttributes'", "'String'", "'boolean'", "'int'", "'double'", "'Agent'", "'Task'", "'Contract'", "'Bid'", "'List'", "'<'", "'>'", "'{'", "'}'", "'OrganizationalModel'", "'end OrganizationalModel'", "'TasksModel'", "'end TasksModel'", "'ContractNetProtocal'", "'RoleBehaviors'", "'end RoleBehaviors'", "'end ContractNetProtocal'", "'role'", "'actions'", "'start at'", "'stop at'", "'default'", "'='", "'action'", "'('", "','", "')'", "'backgroundState'", "'state'", "'if'", "'else'", "'=='", "'>='", "'<='", "'!='", "'and'", "'or'", "'Do'", "'->'", "'+'", "'-'", "'*'", "'/'", "'.'"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_ID=4;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=7;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_DOUBLE=8;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'AgentAttributes' ( (lv_agentAttributes_1_0= ruleClassAttributes ) ) otherlv_2= 'TaskAttributes' ( (lv_taskAttributes_3_0= ruleClassAttributes ) ) otherlv_4= 'BidAttributes' ( (lv_bidAttributes_5_0= ruleClassAttributes ) ) otherlv_6= 'ContractAttributes' ( (lv_contractAttributes_7_0= ruleClassAttributes ) ) ( (lv_organizationalModel_8_0= ruleOrganizationalModel ) ) ( (lv_tasksModel_9_0= ruleTasksModel ) ) ( (lv_contractNetProtocols_10_0= ruleContractNetProtocol ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_agentAttributes_1_0 = null;

        EObject lv_taskAttributes_3_0 = null;

        EObject lv_bidAttributes_5_0 = null;

        EObject lv_contractAttributes_7_0 = null;

        EObject lv_organizationalModel_8_0 = null;

        EObject lv_tasksModel_9_0 = null;

        EObject lv_contractNetProtocols_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'AgentAttributes' ( (lv_agentAttributes_1_0= ruleClassAttributes ) ) otherlv_2= 'TaskAttributes' ( (lv_taskAttributes_3_0= ruleClassAttributes ) ) otherlv_4= 'BidAttributes' ( (lv_bidAttributes_5_0= ruleClassAttributes ) ) otherlv_6= 'ContractAttributes' ( (lv_contractAttributes_7_0= ruleClassAttributes ) ) ( (lv_organizationalModel_8_0= ruleOrganizationalModel ) ) ( (lv_tasksModel_9_0= ruleTasksModel ) ) ( (lv_contractNetProtocols_10_0= ruleContractNetProtocol ) )* ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'AgentAttributes' ( (lv_agentAttributes_1_0= ruleClassAttributes ) ) otherlv_2= 'TaskAttributes' ( (lv_taskAttributes_3_0= ruleClassAttributes ) ) otherlv_4= 'BidAttributes' ( (lv_bidAttributes_5_0= ruleClassAttributes ) ) otherlv_6= 'ContractAttributes' ( (lv_contractAttributes_7_0= ruleClassAttributes ) ) ( (lv_organizationalModel_8_0= ruleOrganizationalModel ) ) ( (lv_tasksModel_9_0= ruleTasksModel ) ) ( (lv_contractNetProtocols_10_0= ruleContractNetProtocol ) )* )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'AgentAttributes' ( (lv_agentAttributes_1_0= ruleClassAttributes ) ) otherlv_2= 'TaskAttributes' ( (lv_taskAttributes_3_0= ruleClassAttributes ) ) otherlv_4= 'BidAttributes' ( (lv_bidAttributes_5_0= ruleClassAttributes ) ) otherlv_6= 'ContractAttributes' ( (lv_contractAttributes_7_0= ruleClassAttributes ) ) ( (lv_organizationalModel_8_0= ruleOrganizationalModel ) ) ( (lv_tasksModel_9_0= ruleTasksModel ) ) ( (lv_contractNetProtocols_10_0= ruleContractNetProtocol ) )* )
            // InternalMyDsl.g:79:3: otherlv_0= 'AgentAttributes' ( (lv_agentAttributes_1_0= ruleClassAttributes ) ) otherlv_2= 'TaskAttributes' ( (lv_taskAttributes_3_0= ruleClassAttributes ) ) otherlv_4= 'BidAttributes' ( (lv_bidAttributes_5_0= ruleClassAttributes ) ) otherlv_6= 'ContractAttributes' ( (lv_contractAttributes_7_0= ruleClassAttributes ) ) ( (lv_organizationalModel_8_0= ruleOrganizationalModel ) ) ( (lv_tasksModel_9_0= ruleTasksModel ) ) ( (lv_contractNetProtocols_10_0= ruleContractNetProtocol ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getAgentAttributesKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_agentAttributes_1_0= ruleClassAttributes ) )
            // InternalMyDsl.g:84:4: (lv_agentAttributes_1_0= ruleClassAttributes )
            {
            // InternalMyDsl.g:84:4: (lv_agentAttributes_1_0= ruleClassAttributes )
            // InternalMyDsl.g:85:5: lv_agentAttributes_1_0= ruleClassAttributes
            {

            					newCompositeNode(grammarAccess.getModelAccess().getAgentAttributesClassAttributesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_agentAttributes_1_0=ruleClassAttributes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"agentAttributes",
            						lv_agentAttributes_1_0,
            						"org.xtext.cnp.mydsl.MyDsl.ClassAttributes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getTaskAttributesKeyword_2());
            		
            // InternalMyDsl.g:106:3: ( (lv_taskAttributes_3_0= ruleClassAttributes ) )
            // InternalMyDsl.g:107:4: (lv_taskAttributes_3_0= ruleClassAttributes )
            {
            // InternalMyDsl.g:107:4: (lv_taskAttributes_3_0= ruleClassAttributes )
            // InternalMyDsl.g:108:5: lv_taskAttributes_3_0= ruleClassAttributes
            {

            					newCompositeNode(grammarAccess.getModelAccess().getTaskAttributesClassAttributesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_taskAttributes_3_0=ruleClassAttributes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"taskAttributes",
            						lv_taskAttributes_3_0,
            						"org.xtext.cnp.mydsl.MyDsl.ClassAttributes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getBidAttributesKeyword_4());
            		
            // InternalMyDsl.g:129:3: ( (lv_bidAttributes_5_0= ruleClassAttributes ) )
            // InternalMyDsl.g:130:4: (lv_bidAttributes_5_0= ruleClassAttributes )
            {
            // InternalMyDsl.g:130:4: (lv_bidAttributes_5_0= ruleClassAttributes )
            // InternalMyDsl.g:131:5: lv_bidAttributes_5_0= ruleClassAttributes
            {

            					newCompositeNode(grammarAccess.getModelAccess().getBidAttributesClassAttributesParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_bidAttributes_5_0=ruleClassAttributes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"bidAttributes",
            						lv_bidAttributes_5_0,
            						"org.xtext.cnp.mydsl.MyDsl.ClassAttributes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getModelAccess().getContractAttributesKeyword_6());
            		
            // InternalMyDsl.g:152:3: ( (lv_contractAttributes_7_0= ruleClassAttributes ) )
            // InternalMyDsl.g:153:4: (lv_contractAttributes_7_0= ruleClassAttributes )
            {
            // InternalMyDsl.g:153:4: (lv_contractAttributes_7_0= ruleClassAttributes )
            // InternalMyDsl.g:154:5: lv_contractAttributes_7_0= ruleClassAttributes
            {

            					newCompositeNode(grammarAccess.getModelAccess().getContractAttributesClassAttributesParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_7);
            lv_contractAttributes_7_0=ruleClassAttributes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"contractAttributes",
            						lv_contractAttributes_7_0,
            						"org.xtext.cnp.mydsl.MyDsl.ClassAttributes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:171:3: ( (lv_organizationalModel_8_0= ruleOrganizationalModel ) )
            // InternalMyDsl.g:172:4: (lv_organizationalModel_8_0= ruleOrganizationalModel )
            {
            // InternalMyDsl.g:172:4: (lv_organizationalModel_8_0= ruleOrganizationalModel )
            // InternalMyDsl.g:173:5: lv_organizationalModel_8_0= ruleOrganizationalModel
            {

            					newCompositeNode(grammarAccess.getModelAccess().getOrganizationalModelOrganizationalModelParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_8);
            lv_organizationalModel_8_0=ruleOrganizationalModel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"organizationalModel",
            						lv_organizationalModel_8_0,
            						"org.xtext.cnp.mydsl.MyDsl.OrganizationalModel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:190:3: ( (lv_tasksModel_9_0= ruleTasksModel ) )
            // InternalMyDsl.g:191:4: (lv_tasksModel_9_0= ruleTasksModel )
            {
            // InternalMyDsl.g:191:4: (lv_tasksModel_9_0= ruleTasksModel )
            // InternalMyDsl.g:192:5: lv_tasksModel_9_0= ruleTasksModel
            {

            					newCompositeNode(grammarAccess.getModelAccess().getTasksModelTasksModelParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_9);
            lv_tasksModel_9_0=ruleTasksModel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"tasksModel",
            						lv_tasksModel_9_0,
            						"org.xtext.cnp.mydsl.MyDsl.TasksModel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:209:3: ( (lv_contractNetProtocols_10_0= ruleContractNetProtocol ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==34) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:210:4: (lv_contractNetProtocols_10_0= ruleContractNetProtocol )
            	    {
            	    // InternalMyDsl.g:210:4: (lv_contractNetProtocols_10_0= ruleContractNetProtocol )
            	    // InternalMyDsl.g:211:5: lv_contractNetProtocols_10_0= ruleContractNetProtocol
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getContractNetProtocolsContractNetProtocolParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_contractNetProtocols_10_0=ruleContractNetProtocol();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"contractNetProtocols",
            	    						lv_contractNetProtocols_10_0,
            	    						"org.xtext.cnp.mydsl.MyDsl.ContractNetProtocol");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:232:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalMyDsl.g:232:44: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:233:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:239:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Class_0= ruleClass | this_DataType_1= ruleDataType ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Class_0 = null;

        AntlrDatatypeRuleToken this_DataType_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:245:2: ( (this_Class_0= ruleClass | this_DataType_1= ruleDataType ) )
            // InternalMyDsl.g:246:2: (this_Class_0= ruleClass | this_DataType_1= ruleDataType )
            {
            // InternalMyDsl.g:246:2: (this_Class_0= ruleClass | this_DataType_1= ruleDataType )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=21 && LA2_0<=24)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=17 && LA2_0<=20)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:247:3: this_Class_0= ruleClass
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Class_0=ruleClass();

                    state._fsp--;


                    			current.merge(this_Class_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:258:3: this_DataType_1= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_1=ruleDataType();

                    state._fsp--;


                    			current.merge(this_DataType_1);
                    		

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // InternalMyDsl.g:272:1: entryRuleDataType returns [String current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final String entryRuleDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataType = null;


        try {
            // InternalMyDsl.g:272:48: (iv_ruleDataType= ruleDataType EOF )
            // InternalMyDsl.g:273:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType.getText(); 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalMyDsl.g:279:1: ruleDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'String' | kw= 'boolean' | kw= 'int' | kw= 'double' ) ;
    public final AntlrDatatypeRuleToken ruleDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:285:2: ( (kw= 'String' | kw= 'boolean' | kw= 'int' | kw= 'double' ) )
            // InternalMyDsl.g:286:2: (kw= 'String' | kw= 'boolean' | kw= 'int' | kw= 'double' )
            {
            // InternalMyDsl.g:286:2: (kw= 'String' | kw= 'boolean' | kw= 'int' | kw= 'double' )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            case 20:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:287:3: kw= 'String'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getStringKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:293:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getBooleanKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:299:3: kw= 'int'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getIntKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:305:3: kw= 'double'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getDoubleKeyword_3());
                    		

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleClass"
    // InternalMyDsl.g:314:1: entryRuleClass returns [String current=null] : iv_ruleClass= ruleClass EOF ;
    public final String entryRuleClass() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClass = null;


        try {
            // InternalMyDsl.g:314:45: (iv_ruleClass= ruleClass EOF )
            // InternalMyDsl.g:315:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass.getText(); 
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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalMyDsl.g:321:1: ruleClass returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Agent' | kw= 'Task' | kw= 'Contract' | kw= 'Bid' ) ;
    public final AntlrDatatypeRuleToken ruleClass() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:327:2: ( (kw= 'Agent' | kw= 'Task' | kw= 'Contract' | kw= 'Bid' ) )
            // InternalMyDsl.g:328:2: (kw= 'Agent' | kw= 'Task' | kw= 'Contract' | kw= 'Bid' )
            {
            // InternalMyDsl.g:328:2: (kw= 'Agent' | kw= 'Task' | kw= 'Contract' | kw= 'Bid' )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt4=1;
                }
                break;
            case 22:
                {
                alt4=2;
                }
                break;
            case 23:
                {
                alt4=3;
                }
                break;
            case 24:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:329:3: kw= 'Agent'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassAccess().getAgentKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:335:3: kw= 'Task'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassAccess().getTaskKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:341:3: kw= 'Contract'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassAccess().getContractKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:347:3: kw= 'Bid'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassAccess().getBidKeyword_3());
                    		

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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleAbstractType"
    // InternalMyDsl.g:356:1: entryRuleAbstractType returns [EObject current=null] : iv_ruleAbstractType= ruleAbstractType EOF ;
    public final EObject entryRuleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractType = null;


        try {
            // InternalMyDsl.g:356:53: (iv_ruleAbstractType= ruleAbstractType EOF )
            // InternalMyDsl.g:357:2: iv_ruleAbstractType= ruleAbstractType EOF
            {
             newCompositeNode(grammarAccess.getAbstractTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractType=ruleAbstractType();

            state._fsp--;

             current =iv_ruleAbstractType; 
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
    // $ANTLR end "entryRuleAbstractType"


    // $ANTLR start "ruleAbstractType"
    // InternalMyDsl.g:363:1: ruleAbstractType returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) | ( ( (lv_listType_1_0= 'List' ) ) otherlv_2= '<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' ) ) ;
    public final EObject ruleAbstractType() throws RecognitionException {
        EObject current = null;

        Token lv_listType_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:369:2: ( ( ( (lv_type_0_0= ruleType ) ) | ( ( (lv_listType_1_0= 'List' ) ) otherlv_2= '<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' ) ) )
            // InternalMyDsl.g:370:2: ( ( (lv_type_0_0= ruleType ) ) | ( ( (lv_listType_1_0= 'List' ) ) otherlv_2= '<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' ) )
            {
            // InternalMyDsl.g:370:2: ( ( (lv_type_0_0= ruleType ) ) | ( ( (lv_listType_1_0= 'List' ) ) otherlv_2= '<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=17 && LA5_0<=24)) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:371:3: ( (lv_type_0_0= ruleType ) )
                    {
                    // InternalMyDsl.g:371:3: ( (lv_type_0_0= ruleType ) )
                    // InternalMyDsl.g:372:4: (lv_type_0_0= ruleType )
                    {
                    // InternalMyDsl.g:372:4: (lv_type_0_0= ruleType )
                    // InternalMyDsl.g:373:5: lv_type_0_0= ruleType
                    {

                    					newCompositeNode(grammarAccess.getAbstractTypeAccess().getTypeTypeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_0=ruleType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAbstractTypeRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_0,
                    						"org.xtext.cnp.mydsl.MyDsl.Type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:391:3: ( ( (lv_listType_1_0= 'List' ) ) otherlv_2= '<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' )
                    {
                    // InternalMyDsl.g:391:3: ( ( (lv_listType_1_0= 'List' ) ) otherlv_2= '<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' )
                    // InternalMyDsl.g:392:4: ( (lv_listType_1_0= 'List' ) ) otherlv_2= '<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>'
                    {
                    // InternalMyDsl.g:392:4: ( (lv_listType_1_0= 'List' ) )
                    // InternalMyDsl.g:393:5: (lv_listType_1_0= 'List' )
                    {
                    // InternalMyDsl.g:393:5: (lv_listType_1_0= 'List' )
                    // InternalMyDsl.g:394:6: lv_listType_1_0= 'List'
                    {
                    lv_listType_1_0=(Token)match(input,25,FOLLOW_10); 

                    						newLeafNode(lv_listType_1_0, grammarAccess.getAbstractTypeAccess().getListTypeListKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAbstractTypeRule());
                    						}
                    						setWithLastConsumed(current, "listType", true, "List");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,26,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getAbstractTypeAccess().getLessThanSignKeyword_1_1());
                    			
                    // InternalMyDsl.g:410:4: ( (lv_type_3_0= ruleType ) )
                    // InternalMyDsl.g:411:5: (lv_type_3_0= ruleType )
                    {
                    // InternalMyDsl.g:411:5: (lv_type_3_0= ruleType )
                    // InternalMyDsl.g:412:6: lv_type_3_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getAbstractTypeAccess().getTypeTypeParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_type_3_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAbstractTypeRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_3_0,
                    							"org.xtext.cnp.mydsl.MyDsl.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getAbstractTypeAccess().getGreaterThanSignKeyword_1_3());
                    			

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
    // $ANTLR end "ruleAbstractType"


    // $ANTLR start "entryRuleClassAttributes"
    // InternalMyDsl.g:438:1: entryRuleClassAttributes returns [EObject current=null] : iv_ruleClassAttributes= ruleClassAttributes EOF ;
    public final EObject entryRuleClassAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassAttributes = null;


        try {
            // InternalMyDsl.g:438:56: (iv_ruleClassAttributes= ruleClassAttributes EOF )
            // InternalMyDsl.g:439:2: iv_ruleClassAttributes= ruleClassAttributes EOF
            {
             newCompositeNode(grammarAccess.getClassAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassAttributes=ruleClassAttributes();

            state._fsp--;

             current =iv_ruleClassAttributes; 
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
    // $ANTLR end "entryRuleClassAttributes"


    // $ANTLR start "ruleClassAttributes"
    // InternalMyDsl.g:445:1: ruleClassAttributes returns [EObject current=null] : (otherlv_0= '{' ( (lv_agentAttributes_1_0= ruleAttribute ) )+ otherlv_2= '}' ) ;
    public final EObject ruleClassAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_agentAttributes_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:451:2: ( (otherlv_0= '{' ( (lv_agentAttributes_1_0= ruleAttribute ) )+ otherlv_2= '}' ) )
            // InternalMyDsl.g:452:2: (otherlv_0= '{' ( (lv_agentAttributes_1_0= ruleAttribute ) )+ otherlv_2= '}' )
            {
            // InternalMyDsl.g:452:2: (otherlv_0= '{' ( (lv_agentAttributes_1_0= ruleAttribute ) )+ otherlv_2= '}' )
            // InternalMyDsl.g:453:3: otherlv_0= '{' ( (lv_agentAttributes_1_0= ruleAttribute ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getClassAttributesAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalMyDsl.g:457:3: ( (lv_agentAttributes_1_0= ruleAttribute ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=17 && LA6_0<=25)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:458:4: (lv_agentAttributes_1_0= ruleAttribute )
            	    {
            	    // InternalMyDsl.g:458:4: (lv_agentAttributes_1_0= ruleAttribute )
            	    // InternalMyDsl.g:459:5: lv_agentAttributes_1_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getClassAttributesAccess().getAgentAttributesAttributeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_agentAttributes_1_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassAttributesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"agentAttributes",
            	    						lv_agentAttributes_1_0,
            	    						"org.xtext.cnp.mydsl.MyDsl.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_2=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getClassAttributesAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleClassAttributes"


    // $ANTLR start "entryRuleOrganizationalModel"
    // InternalMyDsl.g:484:1: entryRuleOrganizationalModel returns [EObject current=null] : iv_ruleOrganizationalModel= ruleOrganizationalModel EOF ;
    public final EObject entryRuleOrganizationalModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrganizationalModel = null;


        try {
            // InternalMyDsl.g:484:60: (iv_ruleOrganizationalModel= ruleOrganizationalModel EOF )
            // InternalMyDsl.g:485:2: iv_ruleOrganizationalModel= ruleOrganizationalModel EOF
            {
             newCompositeNode(grammarAccess.getOrganizationalModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrganizationalModel=ruleOrganizationalModel();

            state._fsp--;

             current =iv_ruleOrganizationalModel; 
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
    // $ANTLR end "entryRuleOrganizationalModel"


    // $ANTLR start "ruleOrganizationalModel"
    // InternalMyDsl.g:491:1: ruleOrganizationalModel returns [EObject current=null] : (otherlv_0= 'OrganizationalModel' ( (lv_agents_1_0= ruleAgent ) )+ otherlv_2= 'end OrganizationalModel' ) ;
    public final EObject ruleOrganizationalModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_agents_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:497:2: ( (otherlv_0= 'OrganizationalModel' ( (lv_agents_1_0= ruleAgent ) )+ otherlv_2= 'end OrganizationalModel' ) )
            // InternalMyDsl.g:498:2: (otherlv_0= 'OrganizationalModel' ( (lv_agents_1_0= ruleAgent ) )+ otherlv_2= 'end OrganizationalModel' )
            {
            // InternalMyDsl.g:498:2: (otherlv_0= 'OrganizationalModel' ( (lv_agents_1_0= ruleAgent ) )+ otherlv_2= 'end OrganizationalModel' )
            // InternalMyDsl.g:499:3: otherlv_0= 'OrganizationalModel' ( (lv_agents_1_0= ruleAgent ) )+ otherlv_2= 'end OrganizationalModel'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getOrganizationalModelAccess().getOrganizationalModelKeyword_0());
            		
            // InternalMyDsl.g:503:3: ( (lv_agents_1_0= ruleAgent ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:504:4: (lv_agents_1_0= ruleAgent )
            	    {
            	    // InternalMyDsl.g:504:4: (lv_agents_1_0= ruleAgent )
            	    // InternalMyDsl.g:505:5: lv_agents_1_0= ruleAgent
            	    {

            	    					newCompositeNode(grammarAccess.getOrganizationalModelAccess().getAgentsAgentParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_agents_1_0=ruleAgent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOrganizationalModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"agents",
            	    						lv_agents_1_0,
            	    						"org.xtext.cnp.mydsl.MyDsl.Agent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            otherlv_2=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getOrganizationalModelAccess().getEndOrganizationalModelKeyword_2());
            		

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
    // $ANTLR end "ruleOrganizationalModel"


    // $ANTLR start "entryRuleAgent"
    // InternalMyDsl.g:530:1: entryRuleAgent returns [EObject current=null] : iv_ruleAgent= ruleAgent EOF ;
    public final EObject entryRuleAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgent = null;


        try {
            // InternalMyDsl.g:530:46: (iv_ruleAgent= ruleAgent EOF )
            // InternalMyDsl.g:531:2: iv_ruleAgent= ruleAgent EOF
            {
             newCompositeNode(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAgent=ruleAgent();

            state._fsp--;

             current =iv_ruleAgent; 
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
    // $ANTLR end "entryRuleAgent"


    // $ANTLR start "ruleAgent"
    // InternalMyDsl.g:537:1: ruleAgent returns [EObject current=null] : (otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributeValues_3_0= ruleAttributeValue ) )* otherlv_4= '}' ) ;
    public final EObject ruleAgent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributeValues_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:543:2: ( (otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributeValues_3_0= ruleAttributeValue ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:544:2: (otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributeValues_3_0= ruleAttributeValue ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:544:2: (otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributeValues_3_0= ruleAttributeValue ) )* otherlv_4= '}' )
            // InternalMyDsl.g:545:3: otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributeValues_3_0= ruleAttributeValue ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAgentAccess().getAgentKeyword_0());
            		
            // InternalMyDsl.g:549:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:550:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:550:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:551:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAgentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:571:3: ( (lv_attributeValues_3_0= ruleAttributeValue ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:572:4: (lv_attributeValues_3_0= ruleAttributeValue )
            	    {
            	    // InternalMyDsl.g:572:4: (lv_attributeValues_3_0= ruleAttributeValue )
            	    // InternalMyDsl.g:573:5: lv_attributeValues_3_0= ruleAttributeValue
            	    {

            	    					newCompositeNode(grammarAccess.getAgentAccess().getAttributeValuesAttributeValueParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_attributeValues_3_0=ruleAttributeValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAgentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributeValues",
            	    						lv_attributeValues_3_0,
            	    						"org.xtext.cnp.mydsl.MyDsl.AttributeValue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAgentAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleAgent"


    // $ANTLR start "entryRuleTasksModel"
    // InternalMyDsl.g:598:1: entryRuleTasksModel returns [EObject current=null] : iv_ruleTasksModel= ruleTasksModel EOF ;
    public final EObject entryRuleTasksModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTasksModel = null;


        try {
            // InternalMyDsl.g:598:51: (iv_ruleTasksModel= ruleTasksModel EOF )
            // InternalMyDsl.g:599:2: iv_ruleTasksModel= ruleTasksModel EOF
            {
             newCompositeNode(grammarAccess.getTasksModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTasksModel=ruleTasksModel();

            state._fsp--;

             current =iv_ruleTasksModel; 
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
    // $ANTLR end "entryRuleTasksModel"


    // $ANTLR start "ruleTasksModel"
    // InternalMyDsl.g:605:1: ruleTasksModel returns [EObject current=null] : (otherlv_0= 'TasksModel' ( (lv_tasks_1_0= ruleTask ) )+ otherlv_2= 'end TasksModel' ) ;
    public final EObject ruleTasksModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_tasks_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:611:2: ( (otherlv_0= 'TasksModel' ( (lv_tasks_1_0= ruleTask ) )+ otherlv_2= 'end TasksModel' ) )
            // InternalMyDsl.g:612:2: (otherlv_0= 'TasksModel' ( (lv_tasks_1_0= ruleTask ) )+ otherlv_2= 'end TasksModel' )
            {
            // InternalMyDsl.g:612:2: (otherlv_0= 'TasksModel' ( (lv_tasks_1_0= ruleTask ) )+ otherlv_2= 'end TasksModel' )
            // InternalMyDsl.g:613:3: otherlv_0= 'TasksModel' ( (lv_tasks_1_0= ruleTask ) )+ otherlv_2= 'end TasksModel'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getTasksModelAccess().getTasksModelKeyword_0());
            		
            // InternalMyDsl.g:617:3: ( (lv_tasks_1_0= ruleTask ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:618:4: (lv_tasks_1_0= ruleTask )
            	    {
            	    // InternalMyDsl.g:618:4: (lv_tasks_1_0= ruleTask )
            	    // InternalMyDsl.g:619:5: lv_tasks_1_0= ruleTask
            	    {

            	    					newCompositeNode(grammarAccess.getTasksModelAccess().getTasksTaskParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_tasks_1_0=ruleTask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTasksModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tasks",
            	    						lv_tasks_1_0,
            	    						"org.xtext.cnp.mydsl.MyDsl.Task");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_2=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTasksModelAccess().getEndTasksModelKeyword_2());
            		

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
    // $ANTLR end "ruleTasksModel"


    // $ANTLR start "entryRuleTask"
    // InternalMyDsl.g:644:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalMyDsl.g:644:45: (iv_ruleTask= ruleTask EOF )
            // InternalMyDsl.g:645:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalMyDsl.g:651:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributeValues_3_0= ruleAttributeValue ) )* otherlv_4= '}' ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributeValues_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:657:2: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributeValues_3_0= ruleAttributeValue ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:658:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributeValues_3_0= ruleAttributeValue ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:658:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributeValues_3_0= ruleAttributeValue ) )* otherlv_4= '}' )
            // InternalMyDsl.g:659:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributeValues_3_0= ruleAttributeValue ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            // InternalMyDsl.g:663:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:664:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:664:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:665:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:685:3: ( (lv_attributeValues_3_0= ruleAttributeValue ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:686:4: (lv_attributeValues_3_0= ruleAttributeValue )
            	    {
            	    // InternalMyDsl.g:686:4: (lv_attributeValues_3_0= ruleAttributeValue )
            	    // InternalMyDsl.g:687:5: lv_attributeValues_3_0= ruleAttributeValue
            	    {

            	    					newCompositeNode(grammarAccess.getTaskAccess().getAttributeValuesAttributeValueParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_attributeValues_3_0=ruleAttributeValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTaskRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributeValues",
            	    						lv_attributeValues_3_0,
            	    						"org.xtext.cnp.mydsl.MyDsl.AttributeValue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleContractNetProtocol"
    // InternalMyDsl.g:712:1: entryRuleContractNetProtocol returns [EObject current=null] : iv_ruleContractNetProtocol= ruleContractNetProtocol EOF ;
    public final EObject entryRuleContractNetProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContractNetProtocol = null;


        try {
            // InternalMyDsl.g:712:60: (iv_ruleContractNetProtocol= ruleContractNetProtocol EOF )
            // InternalMyDsl.g:713:2: iv_ruleContractNetProtocol= ruleContractNetProtocol EOF
            {
             newCompositeNode(grammarAccess.getContractNetProtocolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContractNetProtocol=ruleContractNetProtocol();

            state._fsp--;

             current =iv_ruleContractNetProtocol; 
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
    // $ANTLR end "entryRuleContractNetProtocol"


    // $ANTLR start "ruleContractNetProtocol"
    // InternalMyDsl.g:719:1: ruleContractNetProtocol returns [EObject current=null] : (otherlv_0= 'ContractNetProtocal' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variables_2_0= ruleVariable ) )* otherlv_3= 'RoleBehaviors' ( (lv_roleBehavior_4_0= ruleRoleBehavior ) )* otherlv_5= 'end RoleBehaviors' otherlv_6= 'end ContractNetProtocal' ) ;
    public final EObject ruleContractNetProtocol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_variables_2_0 = null;

        EObject lv_roleBehavior_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:725:2: ( (otherlv_0= 'ContractNetProtocal' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variables_2_0= ruleVariable ) )* otherlv_3= 'RoleBehaviors' ( (lv_roleBehavior_4_0= ruleRoleBehavior ) )* otherlv_5= 'end RoleBehaviors' otherlv_6= 'end ContractNetProtocal' ) )
            // InternalMyDsl.g:726:2: (otherlv_0= 'ContractNetProtocal' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variables_2_0= ruleVariable ) )* otherlv_3= 'RoleBehaviors' ( (lv_roleBehavior_4_0= ruleRoleBehavior ) )* otherlv_5= 'end RoleBehaviors' otherlv_6= 'end ContractNetProtocal' )
            {
            // InternalMyDsl.g:726:2: (otherlv_0= 'ContractNetProtocal' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variables_2_0= ruleVariable ) )* otherlv_3= 'RoleBehaviors' ( (lv_roleBehavior_4_0= ruleRoleBehavior ) )* otherlv_5= 'end RoleBehaviors' otherlv_6= 'end ContractNetProtocal' )
            // InternalMyDsl.g:727:3: otherlv_0= 'ContractNetProtocal' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variables_2_0= ruleVariable ) )* otherlv_3= 'RoleBehaviors' ( (lv_roleBehavior_4_0= ruleRoleBehavior ) )* otherlv_5= 'end RoleBehaviors' otherlv_6= 'end ContractNetProtocal'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getContractNetProtocolAccess().getContractNetProtocalKeyword_0());
            		
            // InternalMyDsl.g:731:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:732:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:732:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:733:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContractNetProtocolAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContractNetProtocolRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:749:3: ( (lv_variables_2_0= ruleVariable ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=17 && LA11_0<=25)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:750:4: (lv_variables_2_0= ruleVariable )
            	    {
            	    // InternalMyDsl.g:750:4: (lv_variables_2_0= ruleVariable )
            	    // InternalMyDsl.g:751:5: lv_variables_2_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getContractNetProtocolAccess().getVariablesVariableParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_variables_2_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContractNetProtocolRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_2_0,
            	    						"org.xtext.cnp.mydsl.MyDsl.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_3=(Token)match(input,35,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getContractNetProtocolAccess().getRoleBehaviorsKeyword_3());
            		
            // InternalMyDsl.g:772:3: ( (lv_roleBehavior_4_0= ruleRoleBehavior ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==38) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:773:4: (lv_roleBehavior_4_0= ruleRoleBehavior )
            	    {
            	    // InternalMyDsl.g:773:4: (lv_roleBehavior_4_0= ruleRoleBehavior )
            	    // InternalMyDsl.g:774:5: lv_roleBehavior_4_0= ruleRoleBehavior
            	    {

            	    					newCompositeNode(grammarAccess.getContractNetProtocolAccess().getRoleBehaviorRoleBehaviorParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_roleBehavior_4_0=ruleRoleBehavior();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContractNetProtocolRule());
            	    					}
            	    					add(
            	    						current,
            	    						"roleBehavior",
            	    						lv_roleBehavior_4_0,
            	    						"org.xtext.cnp.mydsl.MyDsl.RoleBehavior");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_5=(Token)match(input,36,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getContractNetProtocolAccess().getEndRoleBehaviorsKeyword_5());
            		
            otherlv_6=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getContractNetProtocolAccess().getEndContractNetProtocalKeyword_6());
            		

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
    // $ANTLR end "ruleContractNetProtocol"


    // $ANTLR start "entryRuleRoleBehavior"
    // InternalMyDsl.g:803:1: entryRuleRoleBehavior returns [EObject current=null] : iv_ruleRoleBehavior= ruleRoleBehavior EOF ;
    public final EObject entryRuleRoleBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleBehavior = null;


        try {
            // InternalMyDsl.g:803:53: (iv_ruleRoleBehavior= ruleRoleBehavior EOF )
            // InternalMyDsl.g:804:2: iv_ruleRoleBehavior= ruleRoleBehavior EOF
            {
             newCompositeNode(grammarAccess.getRoleBehaviorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoleBehavior=ruleRoleBehavior();

            state._fsp--;

             current =iv_ruleRoleBehavior; 
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
    // $ANTLR end "entryRuleRoleBehavior"


    // $ANTLR start "ruleRoleBehavior"
    // InternalMyDsl.g:810:1: ruleRoleBehavior returns [EObject current=null] : (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ( (lv_states_7_0= ruleState ) )+ otherlv_8= 'start at' ( (otherlv_9= RULE_ID ) ) otherlv_10= 'stop at' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) ;
    public final EObject ruleRoleBehavior() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_actions_5_0 = null;

        EObject lv_states_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:816:2: ( (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ( (lv_states_7_0= ruleState ) )+ otherlv_8= 'start at' ( (otherlv_9= RULE_ID ) ) otherlv_10= 'stop at' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) )
            // InternalMyDsl.g:817:2: (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ( (lv_states_7_0= ruleState ) )+ otherlv_8= 'start at' ( (otherlv_9= RULE_ID ) ) otherlv_10= 'stop at' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            {
            // InternalMyDsl.g:817:2: (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ( (lv_states_7_0= ruleState ) )+ otherlv_8= 'start at' ( (otherlv_9= RULE_ID ) ) otherlv_10= 'stop at' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            // InternalMyDsl.g:818:3: otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' ( (lv_states_7_0= ruleState ) )+ otherlv_8= 'start at' ( (otherlv_9= RULE_ID ) ) otherlv_10= 'stop at' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleBehaviorAccess().getRoleKeyword_0());
            		
            // InternalMyDsl.g:822:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:823:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:823:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:824:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRoleBehaviorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleBehaviorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getRoleBehaviorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRoleBehaviorAccess().getActionsKeyword_3());
            		
            otherlv_4=(Token)match(input,28,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getRoleBehaviorAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:852:3: ( (lv_actions_5_0= ruleAction ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==44) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:853:4: (lv_actions_5_0= ruleAction )
            	    {
            	    // InternalMyDsl.g:853:4: (lv_actions_5_0= ruleAction )
            	    // InternalMyDsl.g:854:5: lv_actions_5_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getRoleBehaviorAccess().getActionsActionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_actions_5_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRoleBehaviorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_5_0,
            	    						"org.xtext.cnp.mydsl.MyDsl.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_6=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getRoleBehaviorAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalMyDsl.g:875:3: ( (lv_states_7_0= ruleState ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=48 && LA14_0<=49)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:876:4: (lv_states_7_0= ruleState )
            	    {
            	    // InternalMyDsl.g:876:4: (lv_states_7_0= ruleState )
            	    // InternalMyDsl.g:877:5: lv_states_7_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getRoleBehaviorAccess().getStatesStateParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_states_7_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRoleBehaviorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_7_0,
            	    						"org.xtext.cnp.mydsl.MyDsl.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_8=(Token)match(input,40,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getRoleBehaviorAccess().getStartAtKeyword_8());
            		
            // InternalMyDsl.g:898:3: ( (otherlv_9= RULE_ID ) )
            // InternalMyDsl.g:899:4: (otherlv_9= RULE_ID )
            {
            // InternalMyDsl.g:899:4: (otherlv_9= RULE_ID )
            // InternalMyDsl.g:900:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleBehaviorRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_9, grammarAccess.getRoleBehaviorAccess().getStartStateStateCrossReference_9_0());
            				

            }


            }

            otherlv_10=(Token)match(input,41,FOLLOW_17); 

            			newLeafNode(otherlv_10, grammarAccess.getRoleBehaviorAccess().getStopAtKeyword_10());
            		
            // InternalMyDsl.g:915:3: ( (otherlv_11= RULE_ID ) )
            // InternalMyDsl.g:916:4: (otherlv_11= RULE_ID )
            {
            // InternalMyDsl.g:916:4: (otherlv_11= RULE_ID )
            // InternalMyDsl.g:917:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleBehaviorRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_11, grammarAccess.getRoleBehaviorAccess().getEndStateStateCrossReference_11_0());
            				

            }


            }

            otherlv_12=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getRoleBehaviorAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleRoleBehavior"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:936:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyDsl.g:936:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyDsl.g:937:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:943:1: ruleAttribute returns [EObject current=null] : ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'default' ( (lv_default_3_0= ruleParameter ) ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:949:2: ( ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'default' ( (lv_default_3_0= ruleParameter ) ) )? ) )
            // InternalMyDsl.g:950:2: ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'default' ( (lv_default_3_0= ruleParameter ) ) )? )
            {
            // InternalMyDsl.g:950:2: ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'default' ( (lv_default_3_0= ruleParameter ) ) )? )
            // InternalMyDsl.g:951:3: ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'default' ( (lv_default_3_0= ruleParameter ) ) )?
            {
            // InternalMyDsl.g:951:3: ( (lv_type_0_0= ruleAbstractType ) )
            // InternalMyDsl.g:952:4: (lv_type_0_0= ruleAbstractType )
            {
            // InternalMyDsl.g:952:4: (lv_type_0_0= ruleAbstractType )
            // InternalMyDsl.g:953:5: lv_type_0_0= ruleAbstractType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeAbstractTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_type_0_0=ruleAbstractType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.cnp.mydsl.MyDsl.AbstractType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:970:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:971:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:971:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:972:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:988:3: (otherlv_2= 'default' ( (lv_default_3_0= ruleParameter ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==42) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:989:4: otherlv_2= 'default' ( (lv_default_3_0= ruleParameter ) )
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_31); 

                    				newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalMyDsl.g:993:4: ( (lv_default_3_0= ruleParameter ) )
                    // InternalMyDsl.g:994:5: (lv_default_3_0= ruleParameter )
                    {
                    // InternalMyDsl.g:994:5: (lv_default_3_0= ruleParameter )
                    // InternalMyDsl.g:995:6: lv_default_3_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getDefaultParameterParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_default_3_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_3_0,
                    							"org.xtext.cnp.mydsl.MyDsl.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeValue"
    // InternalMyDsl.g:1017:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // InternalMyDsl.g:1017:55: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // InternalMyDsl.g:1018:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;

             current =iv_ruleAttributeValue; 
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
    // $ANTLR end "entryRuleAttributeValue"


    // $ANTLR start "ruleAttributeValue"
    // InternalMyDsl.g:1024:1: ruleAttributeValue returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1030:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) ) )
            // InternalMyDsl.g:1031:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) )
            {
            // InternalMyDsl.g:1031:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) ) )
            // InternalMyDsl.g:1032:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleParameter ) )
            {
            // InternalMyDsl.g:1032:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:1033:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:1033:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:1034:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeValueRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(otherlv_0, grammarAccess.getAttributeValueAccess().getAttributeAttributeCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeValueAccess().getEqualsSignKeyword_1());
            		
            // InternalMyDsl.g:1049:3: ( (lv_value_2_0= ruleParameter ) )
            // InternalMyDsl.g:1050:4: (lv_value_2_0= ruleParameter )
            {
            // InternalMyDsl.g:1050:4: (lv_value_2_0= ruleParameter )
            // InternalMyDsl.g:1051:5: lv_value_2_0= ruleParameter
            {

            					newCompositeNode(grammarAccess.getAttributeValueAccess().getValueParameterParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.cnp.mydsl.MyDsl.Parameter");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleAttributeValue"


    // $ANTLR start "entryRuleVariable"
    // InternalMyDsl.g:1072:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMyDsl.g:1072:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMyDsl.g:1073:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMyDsl.g:1079:1: ruleVariable returns [EObject current=null] : ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1085:2: ( ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:1086:2: ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1086:2: ( ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:1087:3: ( (lv_type_0_0= ruleAbstractType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMyDsl.g:1087:3: ( (lv_type_0_0= ruleAbstractType ) )
            // InternalMyDsl.g:1088:4: (lv_type_0_0= ruleAbstractType )
            {
            // InternalMyDsl.g:1088:4: (lv_type_0_0= ruleAbstractType )
            // InternalMyDsl.g:1089:5: lv_type_0_0= ruleAbstractType
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getTypeAbstractTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_type_0_0=ruleAbstractType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.cnp.mydsl.MyDsl.AbstractType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1106:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1107:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1107:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1108:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalMyDsl.g:1128:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalMyDsl.g:1128:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalMyDsl.g:1129:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalMyDsl.g:1135:1: ruleVariableDeclaration returns [EObject current=null] : (this_Variable_0= ruleVariable () otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Variable_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1141:2: ( (this_Variable_0= ruleVariable () otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) )
            // InternalMyDsl.g:1142:2: (this_Variable_0= ruleVariable () otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            {
            // InternalMyDsl.g:1142:2: (this_Variable_0= ruleVariable () otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            // InternalMyDsl.g:1143:3: this_Variable_0= ruleVariable () otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) )
            {

            			newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_Variable_0=ruleVariable();

            state._fsp--;


            			current = this_Variable_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:1151:3: ()
            // InternalMyDsl.g:1152:4: 
            {

            				current = forceCreateModelElementAndSet(
            					grammarAccess.getVariableDeclarationAccess().getVariableDeclarationVariableAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,43,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalMyDsl.g:1162:3: ( (lv_value_3_0= ruleExpression ) )
            // InternalMyDsl.g:1163:4: (lv_value_3_0= ruleExpression )
            {
            // InternalMyDsl.g:1163:4: (lv_value_3_0= ruleExpression )
            // InternalMyDsl.g:1164:5: lv_value_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValueExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.cnp.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleAction"
    // InternalMyDsl.g:1185:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMyDsl.g:1185:47: (iv_ruleAction= ruleAction EOF )
            // InternalMyDsl.g:1186:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMyDsl.g:1192:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleVariable ) )? (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_inputs_3_0 = null;

        EObject lv_inputs_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1198:2: ( (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleVariable ) )? (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )* otherlv_6= ')' ) )
            // InternalMyDsl.g:1199:2: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleVariable ) )? (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )* otherlv_6= ')' )
            {
            // InternalMyDsl.g:1199:2: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleVariable ) )? (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )* otherlv_6= ')' )
            // InternalMyDsl.g:1200:3: otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleVariable ) )? (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalMyDsl.g:1204:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1205:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1205:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1206:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,45,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:1226:3: ( (lv_inputs_3_0= ruleVariable ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=17 && LA16_0<=25)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1227:4: (lv_inputs_3_0= ruleVariable )
                    {
                    // InternalMyDsl.g:1227:4: (lv_inputs_3_0= ruleVariable )
                    // InternalMyDsl.g:1228:5: lv_inputs_3_0= ruleVariable
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getInputsVariableParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_36);
                    lv_inputs_3_0=ruleVariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRule());
                    					}
                    					add(
                    						current,
                    						"inputs",
                    						lv_inputs_3_0,
                    						"org.xtext.cnp.mydsl.MyDsl.Variable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1245:3: (otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==46) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:1246:4: otherlv_4= ',' ( (lv_inputs_5_0= ruleVariable ) )
            	    {
            	    otherlv_4=(Token)match(input,46,FOLLOW_13); 

            	    				newLeafNode(otherlv_4, grammarAccess.getActionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:1250:4: ( (lv_inputs_5_0= ruleVariable ) )
            	    // InternalMyDsl.g:1251:5: (lv_inputs_5_0= ruleVariable )
            	    {
            	    // InternalMyDsl.g:1251:5: (lv_inputs_5_0= ruleVariable )
            	    // InternalMyDsl.g:1252:6: lv_inputs_5_0= ruleVariable
            	    {

            	    						newCompositeNode(grammarAccess.getActionAccess().getInputsVariableParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_inputs_5_0=ruleVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getActionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"inputs",
            	    							lv_inputs_5_0,
            	    							"org.xtext.cnp.mydsl.MyDsl.Variable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_6=(Token)match(input,47,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getActionAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleState"
    // InternalMyDsl.g:1278:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMyDsl.g:1278:46: (iv_ruleState= ruleState EOF )
            // InternalMyDsl.g:1279:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMyDsl.g:1285:1: ruleState returns [EObject current=null] : ( ( ( (lv_backgroundState_0_0= 'backgroundState' ) ) ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_variables_5_0= ruleVariable ) )* ( (lv_activities_6_0= ruleActivity ) )+ otherlv_7= '}' ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_backgroundState_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_variables_5_0 = null;

        EObject lv_activities_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1291:2: ( ( ( ( (lv_backgroundState_0_0= 'backgroundState' ) ) ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_variables_5_0= ruleVariable ) )* ( (lv_activities_6_0= ruleActivity ) )+ otherlv_7= '}' ) ) )
            // InternalMyDsl.g:1292:2: ( ( ( (lv_backgroundState_0_0= 'backgroundState' ) ) ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_variables_5_0= ruleVariable ) )* ( (lv_activities_6_0= ruleActivity ) )+ otherlv_7= '}' ) )
            {
            // InternalMyDsl.g:1292:2: ( ( ( (lv_backgroundState_0_0= 'backgroundState' ) ) ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_variables_5_0= ruleVariable ) )* ( (lv_activities_6_0= ruleActivity ) )+ otherlv_7= '}' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==48) ) {
                alt20=1;
            }
            else if ( (LA20_0==49) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1293:3: ( ( (lv_backgroundState_0_0= 'backgroundState' ) ) ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // InternalMyDsl.g:1293:3: ( ( (lv_backgroundState_0_0= 'backgroundState' ) ) ( (lv_name_1_0= RULE_ID ) ) )
                    // InternalMyDsl.g:1294:4: ( (lv_backgroundState_0_0= 'backgroundState' ) ) ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:1294:4: ( (lv_backgroundState_0_0= 'backgroundState' ) )
                    // InternalMyDsl.g:1295:5: (lv_backgroundState_0_0= 'backgroundState' )
                    {
                    // InternalMyDsl.g:1295:5: (lv_backgroundState_0_0= 'backgroundState' )
                    // InternalMyDsl.g:1296:6: lv_backgroundState_0_0= 'backgroundState'
                    {
                    lv_backgroundState_0_0=(Token)match(input,48,FOLLOW_17); 

                    						newLeafNode(lv_backgroundState_0_0, grammarAccess.getStateAccess().getBackgroundStateBackgroundStateKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStateRule());
                    						}
                    						setWithLastConsumed(current, "backgroundState", true, "backgroundState");
                    					

                    }


                    }

                    // InternalMyDsl.g:1308:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalMyDsl.g:1309:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1309:5: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:1310:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStateRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1328:3: (otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_variables_5_0= ruleVariable ) )* ( (lv_activities_6_0= ruleActivity ) )+ otherlv_7= '}' )
                    {
                    // InternalMyDsl.g:1328:3: (otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_variables_5_0= ruleVariable ) )* ( (lv_activities_6_0= ruleActivity ) )+ otherlv_7= '}' )
                    // InternalMyDsl.g:1329:4: otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_variables_5_0= ruleVariable ) )* ( (lv_activities_6_0= ruleActivity ) )+ otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,49,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getStateAccess().getStateKeyword_1_0());
                    			
                    // InternalMyDsl.g:1333:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalMyDsl.g:1334:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1334:5: (lv_name_3_0= RULE_ID )
                    // InternalMyDsl.g:1335:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_3); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStateRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,28,FOLLOW_37); 

                    				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1_2());
                    			
                    // InternalMyDsl.g:1355:4: ( (lv_variables_5_0= ruleVariable ) )*
                    loop18:
                    do {
                        int alt18=2;
                        alt18 = dfa18.predict(input);
                        switch (alt18) {
                    	case 1 :
                    	    // InternalMyDsl.g:1356:5: (lv_variables_5_0= ruleVariable )
                    	    {
                    	    // InternalMyDsl.g:1356:5: (lv_variables_5_0= ruleVariable )
                    	    // InternalMyDsl.g:1357:6: lv_variables_5_0= ruleVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getStateAccess().getVariablesVariableParserRuleCall_1_3_0());
                    	    					
                    	    pushFollow(FOLLOW_37);
                    	    lv_variables_5_0=ruleVariable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getStateRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"variables",
                    	    							lv_variables_5_0,
                    	    							"org.xtext.cnp.mydsl.MyDsl.Variable");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    // InternalMyDsl.g:1374:4: ( (lv_activities_6_0= ruleActivity ) )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>=17 && LA19_0<=25)||LA19_0==50) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalMyDsl.g:1375:5: (lv_activities_6_0= ruleActivity )
                    	    {
                    	    // InternalMyDsl.g:1375:5: (lv_activities_6_0= ruleActivity )
                    	    // InternalMyDsl.g:1376:6: lv_activities_6_0= ruleActivity
                    	    {

                    	    						newCompositeNode(grammarAccess.getStateAccess().getActivitiesActivityParserRuleCall_1_4_0());
                    	    					
                    	    pushFollow(FOLLOW_38);
                    	    lv_activities_6_0=ruleActivity();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getStateRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"activities",
                    	    							lv_activities_6_0,
                    	    							"org.xtext.cnp.mydsl.MyDsl.Activity");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);

                    otherlv_7=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_1_5());
                    			

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleActivity"
    // InternalMyDsl.g:1402:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // InternalMyDsl.g:1402:49: (iv_ruleActivity= ruleActivity EOF )
            // InternalMyDsl.g:1403:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalMyDsl.g:1409:1: ruleActivity returns [EObject current=null] : ( ( (lv_declarations_0_0= ruleVariableDeclaration ) )* otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleCondition ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_then_6_0= ruleStatement ) )+ otherlv_7= '}' (otherlv_8= 'else' ( ( (lv_elseif_9_0= ruleActivity ) ) | (otherlv_10= '{' ( (lv_else_11_0= ruleStatement ) )+ otherlv_12= '}' ) ) )? ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_declarations_0_0 = null;

        EObject lv_if_3_0 = null;

        EObject lv_then_6_0 = null;

        EObject lv_elseif_9_0 = null;

        EObject lv_else_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1415:2: ( ( ( (lv_declarations_0_0= ruleVariableDeclaration ) )* otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleCondition ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_then_6_0= ruleStatement ) )+ otherlv_7= '}' (otherlv_8= 'else' ( ( (lv_elseif_9_0= ruleActivity ) ) | (otherlv_10= '{' ( (lv_else_11_0= ruleStatement ) )+ otherlv_12= '}' ) ) )? ) )
            // InternalMyDsl.g:1416:2: ( ( (lv_declarations_0_0= ruleVariableDeclaration ) )* otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleCondition ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_then_6_0= ruleStatement ) )+ otherlv_7= '}' (otherlv_8= 'else' ( ( (lv_elseif_9_0= ruleActivity ) ) | (otherlv_10= '{' ( (lv_else_11_0= ruleStatement ) )+ otherlv_12= '}' ) ) )? )
            {
            // InternalMyDsl.g:1416:2: ( ( (lv_declarations_0_0= ruleVariableDeclaration ) )* otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleCondition ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_then_6_0= ruleStatement ) )+ otherlv_7= '}' (otherlv_8= 'else' ( ( (lv_elseif_9_0= ruleActivity ) ) | (otherlv_10= '{' ( (lv_else_11_0= ruleStatement ) )+ otherlv_12= '}' ) ) )? )
            // InternalMyDsl.g:1417:3: ( (lv_declarations_0_0= ruleVariableDeclaration ) )* otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleCondition ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_then_6_0= ruleStatement ) )+ otherlv_7= '}' (otherlv_8= 'else' ( ( (lv_elseif_9_0= ruleActivity ) ) | (otherlv_10= '{' ( (lv_else_11_0= ruleStatement ) )+ otherlv_12= '}' ) ) )?
            {
            // InternalMyDsl.g:1417:3: ( (lv_declarations_0_0= ruleVariableDeclaration ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=17 && LA21_0<=25)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:1418:4: (lv_declarations_0_0= ruleVariableDeclaration )
            	    {
            	    // InternalMyDsl.g:1418:4: (lv_declarations_0_0= ruleVariableDeclaration )
            	    // InternalMyDsl.g:1419:5: lv_declarations_0_0= ruleVariableDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getActivityAccess().getDeclarationsVariableDeclarationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_declarations_0_0=ruleVariableDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActivityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declarations",
            	    						lv_declarations_0_0,
            	    						"org.xtext.cnp.mydsl.MyDsl.VariableDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_1=(Token)match(input,50,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getActivityAccess().getIfKeyword_1());
            		
            otherlv_2=(Token)match(input,45,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getActivityAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:1444:3: ( (lv_if_3_0= ruleCondition ) )
            // InternalMyDsl.g:1445:4: (lv_if_3_0= ruleCondition )
            {
            // InternalMyDsl.g:1445:4: (lv_if_3_0= ruleCondition )
            // InternalMyDsl.g:1446:5: lv_if_3_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getActivityAccess().getIfConditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_39);
            lv_if_3_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActivityRule());
            					}
            					set(
            						current,
            						"if",
            						lv_if_3_0,
            						"org.xtext.cnp.mydsl.MyDsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,28,FOLLOW_40); 

            			newLeafNode(otherlv_5, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:1471:3: ( (lv_then_6_0= ruleStatement ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||(LA22_0>=58 && LA22_0<=59)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:1472:4: (lv_then_6_0= ruleStatement )
            	    {
            	    // InternalMyDsl.g:1472:4: (lv_then_6_0= ruleStatement )
            	    // InternalMyDsl.g:1473:5: lv_then_6_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getActivityAccess().getThenStatementParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_41);
            	    lv_then_6_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActivityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"then",
            	    						lv_then_6_0,
            	    						"org.xtext.cnp.mydsl.MyDsl.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_7=(Token)match(input,29,FOLLOW_42); 

            			newLeafNode(otherlv_7, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_7());
            		
            // InternalMyDsl.g:1494:3: (otherlv_8= 'else' ( ( (lv_elseif_9_0= ruleActivity ) ) | (otherlv_10= '{' ( (lv_else_11_0= ruleStatement ) )+ otherlv_12= '}' ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==51) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1495:4: otherlv_8= 'else' ( ( (lv_elseif_9_0= ruleActivity ) ) | (otherlv_10= '{' ( (lv_else_11_0= ruleStatement ) )+ otherlv_12= '}' ) )
                    {
                    otherlv_8=(Token)match(input,51,FOLLOW_43); 

                    				newLeafNode(otherlv_8, grammarAccess.getActivityAccess().getElseKeyword_8_0());
                    			
                    // InternalMyDsl.g:1499:4: ( ( (lv_elseif_9_0= ruleActivity ) ) | (otherlv_10= '{' ( (lv_else_11_0= ruleStatement ) )+ otherlv_12= '}' ) )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=17 && LA24_0<=25)||LA24_0==50) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==28) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalMyDsl.g:1500:5: ( (lv_elseif_9_0= ruleActivity ) )
                            {
                            // InternalMyDsl.g:1500:5: ( (lv_elseif_9_0= ruleActivity ) )
                            // InternalMyDsl.g:1501:6: (lv_elseif_9_0= ruleActivity )
                            {
                            // InternalMyDsl.g:1501:6: (lv_elseif_9_0= ruleActivity )
                            // InternalMyDsl.g:1502:7: lv_elseif_9_0= ruleActivity
                            {

                            							newCompositeNode(grammarAccess.getActivityAccess().getElseifActivityParserRuleCall_8_1_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_elseif_9_0=ruleActivity();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getActivityRule());
                            							}
                            							set(
                            								current,
                            								"elseif",
                            								lv_elseif_9_0,
                            								"org.xtext.cnp.mydsl.MyDsl.Activity");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:1520:5: (otherlv_10= '{' ( (lv_else_11_0= ruleStatement ) )+ otherlv_12= '}' )
                            {
                            // InternalMyDsl.g:1520:5: (otherlv_10= '{' ( (lv_else_11_0= ruleStatement ) )+ otherlv_12= '}' )
                            // InternalMyDsl.g:1521:6: otherlv_10= '{' ( (lv_else_11_0= ruleStatement ) )+ otherlv_12= '}'
                            {
                            otherlv_10=(Token)match(input,28,FOLLOW_40); 

                            						newLeafNode(otherlv_10, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_8_1_1_0());
                            					
                            // InternalMyDsl.g:1525:6: ( (lv_else_11_0= ruleStatement ) )+
                            int cnt23=0;
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==RULE_ID||(LA23_0>=58 && LA23_0<=59)) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // InternalMyDsl.g:1526:7: (lv_else_11_0= ruleStatement )
                            	    {
                            	    // InternalMyDsl.g:1526:7: (lv_else_11_0= ruleStatement )
                            	    // InternalMyDsl.g:1527:8: lv_else_11_0= ruleStatement
                            	    {

                            	    								newCompositeNode(grammarAccess.getActivityAccess().getElseStatementParserRuleCall_8_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_41);
                            	    lv_else_11_0=ruleStatement();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getActivityRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"else",
                            	    									lv_else_11_0,
                            	    									"org.xtext.cnp.mydsl.MyDsl.Statement");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt23 >= 1 ) break loop23;
                                        EarlyExitException eee =
                                            new EarlyExitException(23, input);
                                        throw eee;
                                }
                                cnt23++;
                            } while (true);

                            otherlv_12=(Token)match(input,29,FOLLOW_2); 

                            						newLeafNode(otherlv_12, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_8_1_1_2());
                            					

                            }


                            }
                            break;

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
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleOperator"
    // InternalMyDsl.g:1555:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalMyDsl.g:1555:49: (iv_ruleOperator= ruleOperator EOF )
            // InternalMyDsl.g:1556:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator; 
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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalMyDsl.g:1562:1: ruleOperator returns [EObject current=null] : ( ( (lv_equalTo_0_0= '==' ) ) | ( (lv_largerThan_1_0= '>' ) ) | ( (lv_smallerThan_2_0= '<' ) ) | ( (lv_largerOrEqualTo_3_0= '>=' ) ) | ( (lv_smallerOrEqualTo_4_0= '<=' ) ) | ( (lv_notEqualTo_5_0= '!=' ) ) ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        Token lv_equalTo_0_0=null;
        Token lv_largerThan_1_0=null;
        Token lv_smallerThan_2_0=null;
        Token lv_largerOrEqualTo_3_0=null;
        Token lv_smallerOrEqualTo_4_0=null;
        Token lv_notEqualTo_5_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1568:2: ( ( ( (lv_equalTo_0_0= '==' ) ) | ( (lv_largerThan_1_0= '>' ) ) | ( (lv_smallerThan_2_0= '<' ) ) | ( (lv_largerOrEqualTo_3_0= '>=' ) ) | ( (lv_smallerOrEqualTo_4_0= '<=' ) ) | ( (lv_notEqualTo_5_0= '!=' ) ) ) )
            // InternalMyDsl.g:1569:2: ( ( (lv_equalTo_0_0= '==' ) ) | ( (lv_largerThan_1_0= '>' ) ) | ( (lv_smallerThan_2_0= '<' ) ) | ( (lv_largerOrEqualTo_3_0= '>=' ) ) | ( (lv_smallerOrEqualTo_4_0= '<=' ) ) | ( (lv_notEqualTo_5_0= '!=' ) ) )
            {
            // InternalMyDsl.g:1569:2: ( ( (lv_equalTo_0_0= '==' ) ) | ( (lv_largerThan_1_0= '>' ) ) | ( (lv_smallerThan_2_0= '<' ) ) | ( (lv_largerOrEqualTo_3_0= '>=' ) ) | ( (lv_smallerOrEqualTo_4_0= '<=' ) ) | ( (lv_notEqualTo_5_0= '!=' ) ) )
            int alt26=6;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt26=1;
                }
                break;
            case 27:
                {
                alt26=2;
                }
                break;
            case 26:
                {
                alt26=3;
                }
                break;
            case 53:
                {
                alt26=4;
                }
                break;
            case 54:
                {
                alt26=5;
                }
                break;
            case 55:
                {
                alt26=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1570:3: ( (lv_equalTo_0_0= '==' ) )
                    {
                    // InternalMyDsl.g:1570:3: ( (lv_equalTo_0_0= '==' ) )
                    // InternalMyDsl.g:1571:4: (lv_equalTo_0_0= '==' )
                    {
                    // InternalMyDsl.g:1571:4: (lv_equalTo_0_0= '==' )
                    // InternalMyDsl.g:1572:5: lv_equalTo_0_0= '=='
                    {
                    lv_equalTo_0_0=(Token)match(input,52,FOLLOW_2); 

                    					newLeafNode(lv_equalTo_0_0, grammarAccess.getOperatorAccess().getEqualToEqualsSignEqualsSignKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperatorRule());
                    					}
                    					setWithLastConsumed(current, "equalTo", true, "==");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1585:3: ( (lv_largerThan_1_0= '>' ) )
                    {
                    // InternalMyDsl.g:1585:3: ( (lv_largerThan_1_0= '>' ) )
                    // InternalMyDsl.g:1586:4: (lv_largerThan_1_0= '>' )
                    {
                    // InternalMyDsl.g:1586:4: (lv_largerThan_1_0= '>' )
                    // InternalMyDsl.g:1587:5: lv_largerThan_1_0= '>'
                    {
                    lv_largerThan_1_0=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_largerThan_1_0, grammarAccess.getOperatorAccess().getLargerThanGreaterThanSignKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperatorRule());
                    					}
                    					setWithLastConsumed(current, "largerThan", true, ">");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1600:3: ( (lv_smallerThan_2_0= '<' ) )
                    {
                    // InternalMyDsl.g:1600:3: ( (lv_smallerThan_2_0= '<' ) )
                    // InternalMyDsl.g:1601:4: (lv_smallerThan_2_0= '<' )
                    {
                    // InternalMyDsl.g:1601:4: (lv_smallerThan_2_0= '<' )
                    // InternalMyDsl.g:1602:5: lv_smallerThan_2_0= '<'
                    {
                    lv_smallerThan_2_0=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_smallerThan_2_0, grammarAccess.getOperatorAccess().getSmallerThanLessThanSignKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperatorRule());
                    					}
                    					setWithLastConsumed(current, "smallerThan", true, "<");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1615:3: ( (lv_largerOrEqualTo_3_0= '>=' ) )
                    {
                    // InternalMyDsl.g:1615:3: ( (lv_largerOrEqualTo_3_0= '>=' ) )
                    // InternalMyDsl.g:1616:4: (lv_largerOrEqualTo_3_0= '>=' )
                    {
                    // InternalMyDsl.g:1616:4: (lv_largerOrEqualTo_3_0= '>=' )
                    // InternalMyDsl.g:1617:5: lv_largerOrEqualTo_3_0= '>='
                    {
                    lv_largerOrEqualTo_3_0=(Token)match(input,53,FOLLOW_2); 

                    					newLeafNode(lv_largerOrEqualTo_3_0, grammarAccess.getOperatorAccess().getLargerOrEqualToGreaterThanSignEqualsSignKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperatorRule());
                    					}
                    					setWithLastConsumed(current, "largerOrEqualTo", true, ">=");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1630:3: ( (lv_smallerOrEqualTo_4_0= '<=' ) )
                    {
                    // InternalMyDsl.g:1630:3: ( (lv_smallerOrEqualTo_4_0= '<=' ) )
                    // InternalMyDsl.g:1631:4: (lv_smallerOrEqualTo_4_0= '<=' )
                    {
                    // InternalMyDsl.g:1631:4: (lv_smallerOrEqualTo_4_0= '<=' )
                    // InternalMyDsl.g:1632:5: lv_smallerOrEqualTo_4_0= '<='
                    {
                    lv_smallerOrEqualTo_4_0=(Token)match(input,54,FOLLOW_2); 

                    					newLeafNode(lv_smallerOrEqualTo_4_0, grammarAccess.getOperatorAccess().getSmallerOrEqualToLessThanSignEqualsSignKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperatorRule());
                    					}
                    					setWithLastConsumed(current, "smallerOrEqualTo", true, "<=");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1645:3: ( (lv_notEqualTo_5_0= '!=' ) )
                    {
                    // InternalMyDsl.g:1645:3: ( (lv_notEqualTo_5_0= '!=' ) )
                    // InternalMyDsl.g:1646:4: (lv_notEqualTo_5_0= '!=' )
                    {
                    // InternalMyDsl.g:1646:4: (lv_notEqualTo_5_0= '!=' )
                    // InternalMyDsl.g:1647:5: lv_notEqualTo_5_0= '!='
                    {
                    lv_notEqualTo_5_0=(Token)match(input,55,FOLLOW_2); 

                    					newLeafNode(lv_notEqualTo_5_0, grammarAccess.getOperatorAccess().getNotEqualToExclamationMarkEqualsSignKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperatorRule());
                    					}
                    					setWithLastConsumed(current, "notEqualTo", true, "!=");
                    				

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleCondition"
    // InternalMyDsl.g:1663:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMyDsl.g:1663:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMyDsl.g:1664:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMyDsl.g:1670:1: ruleCondition returns [EObject current=null] : ( ( ( (lv_subjective_0_0= ruleQualifiedName ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) ) ( ( ( (lv_and_3_0= 'and' ) ) | ( (lv_or_4_0= 'or' ) ) ) ( (lv_compareCondition_5_0= ruleCondition ) ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_and_3_0=null;
        Token lv_or_4_0=null;
        AntlrDatatypeRuleToken lv_subjective_0_0 = null;

        EObject lv_operator_1_0 = null;

        EObject lv_objective_2_0 = null;

        EObject lv_compareCondition_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1676:2: ( ( ( ( (lv_subjective_0_0= ruleQualifiedName ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) ) ( ( ( (lv_and_3_0= 'and' ) ) | ( (lv_or_4_0= 'or' ) ) ) ( (lv_compareCondition_5_0= ruleCondition ) ) )? ) )
            // InternalMyDsl.g:1677:2: ( ( ( (lv_subjective_0_0= ruleQualifiedName ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) ) ( ( ( (lv_and_3_0= 'and' ) ) | ( (lv_or_4_0= 'or' ) ) ) ( (lv_compareCondition_5_0= ruleCondition ) ) )? )
            {
            // InternalMyDsl.g:1677:2: ( ( ( (lv_subjective_0_0= ruleQualifiedName ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) ) ( ( ( (lv_and_3_0= 'and' ) ) | ( (lv_or_4_0= 'or' ) ) ) ( (lv_compareCondition_5_0= ruleCondition ) ) )? )
            // InternalMyDsl.g:1678:3: ( ( (lv_subjective_0_0= ruleQualifiedName ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) ) ( ( ( (lv_and_3_0= 'and' ) ) | ( (lv_or_4_0= 'or' ) ) ) ( (lv_compareCondition_5_0= ruleCondition ) ) )?
            {
            // InternalMyDsl.g:1678:3: ( ( (lv_subjective_0_0= ruleQualifiedName ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) ) )
            // InternalMyDsl.g:1679:4: ( (lv_subjective_0_0= ruleQualifiedName ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_objective_2_0= ruleExpression ) )
            {
            // InternalMyDsl.g:1679:4: ( (lv_subjective_0_0= ruleQualifiedName ) )
            // InternalMyDsl.g:1680:5: (lv_subjective_0_0= ruleQualifiedName )
            {
            // InternalMyDsl.g:1680:5: (lv_subjective_0_0= ruleQualifiedName )
            // InternalMyDsl.g:1681:6: lv_subjective_0_0= ruleQualifiedName
            {

            						newCompositeNode(grammarAccess.getConditionAccess().getSubjectiveQualifiedNameParserRuleCall_0_0_0());
            					
            pushFollow(FOLLOW_44);
            lv_subjective_0_0=ruleQualifiedName();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getConditionRule());
            						}
            						set(
            							current,
            							"subjective",
            							lv_subjective_0_0,
            							"org.xtext.cnp.mydsl.MyDsl.QualifiedName");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalMyDsl.g:1698:4: ( (lv_operator_1_0= ruleOperator ) )
            // InternalMyDsl.g:1699:5: (lv_operator_1_0= ruleOperator )
            {
            // InternalMyDsl.g:1699:5: (lv_operator_1_0= ruleOperator )
            // InternalMyDsl.g:1700:6: lv_operator_1_0= ruleOperator
            {

            						newCompositeNode(grammarAccess.getConditionAccess().getOperatorOperatorParserRuleCall_0_1_0());
            					
            pushFollow(FOLLOW_33);
            lv_operator_1_0=ruleOperator();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getConditionRule());
            						}
            						set(
            							current,
            							"operator",
            							lv_operator_1_0,
            							"org.xtext.cnp.mydsl.MyDsl.Operator");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalMyDsl.g:1717:4: ( (lv_objective_2_0= ruleExpression ) )
            // InternalMyDsl.g:1718:5: (lv_objective_2_0= ruleExpression )
            {
            // InternalMyDsl.g:1718:5: (lv_objective_2_0= ruleExpression )
            // InternalMyDsl.g:1719:6: lv_objective_2_0= ruleExpression
            {

            						newCompositeNode(grammarAccess.getConditionAccess().getObjectiveExpressionParserRuleCall_0_2_0());
            					
            pushFollow(FOLLOW_45);
            lv_objective_2_0=ruleExpression();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getConditionRule());
            						}
            						set(
            							current,
            							"objective",
            							lv_objective_2_0,
            							"org.xtext.cnp.mydsl.MyDsl.Expression");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalMyDsl.g:1737:3: ( ( ( (lv_and_3_0= 'and' ) ) | ( (lv_or_4_0= 'or' ) ) ) ( (lv_compareCondition_5_0= ruleCondition ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=56 && LA28_0<=57)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1738:4: ( ( (lv_and_3_0= 'and' ) ) | ( (lv_or_4_0= 'or' ) ) ) ( (lv_compareCondition_5_0= ruleCondition ) )
                    {
                    // InternalMyDsl.g:1738:4: ( ( (lv_and_3_0= 'and' ) ) | ( (lv_or_4_0= 'or' ) ) )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==56) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==57) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalMyDsl.g:1739:5: ( (lv_and_3_0= 'and' ) )
                            {
                            // InternalMyDsl.g:1739:5: ( (lv_and_3_0= 'and' ) )
                            // InternalMyDsl.g:1740:6: (lv_and_3_0= 'and' )
                            {
                            // InternalMyDsl.g:1740:6: (lv_and_3_0= 'and' )
                            // InternalMyDsl.g:1741:7: lv_and_3_0= 'and'
                            {
                            lv_and_3_0=(Token)match(input,56,FOLLOW_17); 

                            							newLeafNode(lv_and_3_0, grammarAccess.getConditionAccess().getAndAndKeyword_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(current, "and", true, "and");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:1754:5: ( (lv_or_4_0= 'or' ) )
                            {
                            // InternalMyDsl.g:1754:5: ( (lv_or_4_0= 'or' ) )
                            // InternalMyDsl.g:1755:6: (lv_or_4_0= 'or' )
                            {
                            // InternalMyDsl.g:1755:6: (lv_or_4_0= 'or' )
                            // InternalMyDsl.g:1756:7: lv_or_4_0= 'or'
                            {
                            lv_or_4_0=(Token)match(input,57,FOLLOW_17); 

                            							newLeafNode(lv_or_4_0, grammarAccess.getConditionAccess().getOrOrKeyword_1_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(current, "or", true, "or");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalMyDsl.g:1769:4: ( (lv_compareCondition_5_0= ruleCondition ) )
                    // InternalMyDsl.g:1770:5: (lv_compareCondition_5_0= ruleCondition )
                    {
                    // InternalMyDsl.g:1770:5: (lv_compareCondition_5_0= ruleCondition )
                    // InternalMyDsl.g:1771:6: lv_compareCondition_5_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getCompareConditionConditionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_compareCondition_5_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"compareCondition",
                    							lv_compareCondition_5_0,
                    							"org.xtext.cnp.mydsl.MyDsl.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleStatement"
    // InternalMyDsl.g:1793:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMyDsl.g:1793:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyDsl.g:1794:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMyDsl.g:1800:1: ruleStatement returns [EObject current=null] : ( ( ( (lv_isAction_0_0= 'Do' ) ) ( (lv_actionStatement_1_0= ruleActionStatement ) ) ) | ( ( (lv_isChangeState_2_0= '->' ) ) ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) ) ) | ( (lv_assertStatement_4_0= ruleAssertStatement ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token lv_isAction_0_0=null;
        Token lv_isChangeState_2_0=null;
        EObject lv_actionStatement_1_0 = null;

        EObject lv_changeStateStatement_3_0 = null;

        EObject lv_assertStatement_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1806:2: ( ( ( ( (lv_isAction_0_0= 'Do' ) ) ( (lv_actionStatement_1_0= ruleActionStatement ) ) ) | ( ( (lv_isChangeState_2_0= '->' ) ) ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) ) ) | ( (lv_assertStatement_4_0= ruleAssertStatement ) ) ) )
            // InternalMyDsl.g:1807:2: ( ( ( (lv_isAction_0_0= 'Do' ) ) ( (lv_actionStatement_1_0= ruleActionStatement ) ) ) | ( ( (lv_isChangeState_2_0= '->' ) ) ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) ) ) | ( (lv_assertStatement_4_0= ruleAssertStatement ) ) )
            {
            // InternalMyDsl.g:1807:2: ( ( ( (lv_isAction_0_0= 'Do' ) ) ( (lv_actionStatement_1_0= ruleActionStatement ) ) ) | ( ( (lv_isChangeState_2_0= '->' ) ) ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) ) ) | ( (lv_assertStatement_4_0= ruleAssertStatement ) ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt29=1;
                }
                break;
            case 59:
                {
                alt29=2;
                }
                break;
            case RULE_ID:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1808:3: ( ( (lv_isAction_0_0= 'Do' ) ) ( (lv_actionStatement_1_0= ruleActionStatement ) ) )
                    {
                    // InternalMyDsl.g:1808:3: ( ( (lv_isAction_0_0= 'Do' ) ) ( (lv_actionStatement_1_0= ruleActionStatement ) ) )
                    // InternalMyDsl.g:1809:4: ( (lv_isAction_0_0= 'Do' ) ) ( (lv_actionStatement_1_0= ruleActionStatement ) )
                    {
                    // InternalMyDsl.g:1809:4: ( (lv_isAction_0_0= 'Do' ) )
                    // InternalMyDsl.g:1810:5: (lv_isAction_0_0= 'Do' )
                    {
                    // InternalMyDsl.g:1810:5: (lv_isAction_0_0= 'Do' )
                    // InternalMyDsl.g:1811:6: lv_isAction_0_0= 'Do'
                    {
                    lv_isAction_0_0=(Token)match(input,58,FOLLOW_17); 

                    						newLeafNode(lv_isAction_0_0, grammarAccess.getStatementAccess().getIsActionDoKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    						setWithLastConsumed(current, "isAction", true, "Do");
                    					

                    }


                    }

                    // InternalMyDsl.g:1823:4: ( (lv_actionStatement_1_0= ruleActionStatement ) )
                    // InternalMyDsl.g:1824:5: (lv_actionStatement_1_0= ruleActionStatement )
                    {
                    // InternalMyDsl.g:1824:5: (lv_actionStatement_1_0= ruleActionStatement )
                    // InternalMyDsl.g:1825:6: lv_actionStatement_1_0= ruleActionStatement
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getActionStatementActionStatementParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_actionStatement_1_0=ruleActionStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"actionStatement",
                    							lv_actionStatement_1_0,
                    							"org.xtext.cnp.mydsl.MyDsl.ActionStatement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1844:3: ( ( (lv_isChangeState_2_0= '->' ) ) ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) ) )
                    {
                    // InternalMyDsl.g:1844:3: ( ( (lv_isChangeState_2_0= '->' ) ) ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) ) )
                    // InternalMyDsl.g:1845:4: ( (lv_isChangeState_2_0= '->' ) ) ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) )
                    {
                    // InternalMyDsl.g:1845:4: ( (lv_isChangeState_2_0= '->' ) )
                    // InternalMyDsl.g:1846:5: (lv_isChangeState_2_0= '->' )
                    {
                    // InternalMyDsl.g:1846:5: (lv_isChangeState_2_0= '->' )
                    // InternalMyDsl.g:1847:6: lv_isChangeState_2_0= '->'
                    {
                    lv_isChangeState_2_0=(Token)match(input,59,FOLLOW_46); 

                    						newLeafNode(lv_isChangeState_2_0, grammarAccess.getStatementAccess().getIsChangeStateHyphenMinusGreaterThanSignKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatementRule());
                    						}
                    						setWithLastConsumed(current, "isChangeState", true, "->");
                    					

                    }


                    }

                    // InternalMyDsl.g:1859:4: ( (lv_changeStateStatement_3_0= ruleChangeStateStatement ) )
                    // InternalMyDsl.g:1860:5: (lv_changeStateStatement_3_0= ruleChangeStateStatement )
                    {
                    // InternalMyDsl.g:1860:5: (lv_changeStateStatement_3_0= ruleChangeStateStatement )
                    // InternalMyDsl.g:1861:6: lv_changeStateStatement_3_0= ruleChangeStateStatement
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getChangeStateStatementChangeStateStatementParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_changeStateStatement_3_0=ruleChangeStateStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"changeStateStatement",
                    							lv_changeStateStatement_3_0,
                    							"org.xtext.cnp.mydsl.MyDsl.ChangeStateStatement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1880:3: ( (lv_assertStatement_4_0= ruleAssertStatement ) )
                    {
                    // InternalMyDsl.g:1880:3: ( (lv_assertStatement_4_0= ruleAssertStatement ) )
                    // InternalMyDsl.g:1881:4: (lv_assertStatement_4_0= ruleAssertStatement )
                    {
                    // InternalMyDsl.g:1881:4: (lv_assertStatement_4_0= ruleAssertStatement )
                    // InternalMyDsl.g:1882:5: lv_assertStatement_4_0= ruleAssertStatement
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getAssertStatementAssertStatementParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_assertStatement_4_0=ruleAssertStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					set(
                    						current,
                    						"assertStatement",
                    						lv_assertStatement_4_0,
                    						"org.xtext.cnp.mydsl.MyDsl.AssertStatement");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleActionStatement"
    // InternalMyDsl.g:1903:1: entryRuleActionStatement returns [EObject current=null] : iv_ruleActionStatement= ruleActionStatement EOF ;
    public final EObject entryRuleActionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionStatement = null;


        try {
            // InternalMyDsl.g:1903:56: (iv_ruleActionStatement= ruleActionStatement EOF )
            // InternalMyDsl.g:1904:2: iv_ruleActionStatement= ruleActionStatement EOF
            {
             newCompositeNode(grammarAccess.getActionStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionStatement=ruleActionStatement();

            state._fsp--;

             current =iv_ruleActionStatement; 
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
    // $ANTLR end "entryRuleActionStatement"


    // $ANTLR start "ruleActionStatement"
    // InternalMyDsl.g:1910:1: ruleActionStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputs_2_0= ruleQualifiedName ) )* otherlv_3= ')' ) ;
    public final EObject ruleActionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_inputs_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1916:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputs_2_0= ruleQualifiedName ) )* otherlv_3= ')' ) )
            // InternalMyDsl.g:1917:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputs_2_0= ruleQualifiedName ) )* otherlv_3= ')' )
            {
            // InternalMyDsl.g:1917:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputs_2_0= ruleQualifiedName ) )* otherlv_3= ')' )
            // InternalMyDsl.g:1918:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputs_2_0= ruleQualifiedName ) )* otherlv_3= ')'
            {
            // InternalMyDsl.g:1918:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:1919:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:1919:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:1920:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_0, grammarAccess.getActionStatementAccess().getActionActionCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getActionStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1935:3: ( (lv_inputs_2_0= ruleQualifiedName ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyDsl.g:1936:4: (lv_inputs_2_0= ruleQualifiedName )
            	    {
            	    // InternalMyDsl.g:1936:4: (lv_inputs_2_0= ruleQualifiedName )
            	    // InternalMyDsl.g:1937:5: lv_inputs_2_0= ruleQualifiedName
            	    {

            	    					newCompositeNode(grammarAccess.getActionStatementAccess().getInputsQualifiedNameParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_47);
            	    lv_inputs_2_0=ruleQualifiedName();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActionStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inputs",
            	    						lv_inputs_2_0,
            	    						"org.xtext.cnp.mydsl.MyDsl.QualifiedName");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_3=(Token)match(input,47,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getActionStatementAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleActionStatement"


    // $ANTLR start "entryRuleAssertStatement"
    // InternalMyDsl.g:1962:1: entryRuleAssertStatement returns [EObject current=null] : iv_ruleAssertStatement= ruleAssertStatement EOF ;
    public final EObject entryRuleAssertStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertStatement = null;


        try {
            // InternalMyDsl.g:1962:56: (iv_ruleAssertStatement= ruleAssertStatement EOF )
            // InternalMyDsl.g:1963:2: iv_ruleAssertStatement= ruleAssertStatement EOF
            {
             newCompositeNode(grammarAccess.getAssertStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertStatement=ruleAssertStatement();

            state._fsp--;

             current =iv_ruleAssertStatement; 
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
    // $ANTLR end "entryRuleAssertStatement"


    // $ANTLR start "ruleAssertStatement"
    // InternalMyDsl.g:1969:1: ruleAssertStatement returns [EObject current=null] : ( ( (lv_input_0_0= ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssertStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_input_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1975:2: ( ( ( (lv_input_0_0= ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // InternalMyDsl.g:1976:2: ( ( (lv_input_0_0= ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // InternalMyDsl.g:1976:2: ( ( (lv_input_0_0= ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // InternalMyDsl.g:1977:3: ( (lv_input_0_0= ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // InternalMyDsl.g:1977:3: ( (lv_input_0_0= ruleQualifiedName ) )
            // InternalMyDsl.g:1978:4: (lv_input_0_0= ruleQualifiedName )
            {
            // InternalMyDsl.g:1978:4: (lv_input_0_0= ruleQualifiedName )
            // InternalMyDsl.g:1979:5: lv_input_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getAssertStatementAccess().getInputQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
            lv_input_0_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssertStatementRule());
            					}
            					set(
            						current,
            						"input",
            						lv_input_0_0,
            						"org.xtext.cnp.mydsl.MyDsl.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getAssertStatementAccess().getEqualsSignKeyword_1());
            		
            // InternalMyDsl.g:2000:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalMyDsl.g:2001:4: (lv_value_2_0= ruleExpression )
            {
            // InternalMyDsl.g:2001:4: (lv_value_2_0= ruleExpression )
            // InternalMyDsl.g:2002:5: lv_value_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAssertStatementAccess().getValueExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssertStatementRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.cnp.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleAssertStatement"


    // $ANTLR start "entryRuleChangeStateStatement"
    // InternalMyDsl.g:2023:1: entryRuleChangeStateStatement returns [EObject current=null] : iv_ruleChangeStateStatement= ruleChangeStateStatement EOF ;
    public final EObject entryRuleChangeStateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeStateStatement = null;


        try {
            // InternalMyDsl.g:2023:61: (iv_ruleChangeStateStatement= ruleChangeStateStatement EOF )
            // InternalMyDsl.g:2024:2: iv_ruleChangeStateStatement= ruleChangeStateStatement EOF
            {
             newCompositeNode(grammarAccess.getChangeStateStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeStateStatement=ruleChangeStateStatement();

            state._fsp--;

             current =iv_ruleChangeStateStatement; 
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
    // $ANTLR end "entryRuleChangeStateStatement"


    // $ANTLR start "ruleChangeStateStatement"
    // InternalMyDsl.g:2030:1: ruleChangeStateStatement returns [EObject current=null] : (otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleChangeStateStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2036:2: ( (otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:2037:2: (otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:2037:2: (otherlv_0= 'state' ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:2038:3: otherlv_0= 'state' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeStateStatementAccess().getStateKeyword_0());
            		
            // InternalMyDsl.g:2042:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:2043:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:2043:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:2044:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChangeStateStatementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getChangeStateStatementAccess().getTargetStateStateCrossReference_1_0());
            				

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
    // $ANTLR end "ruleChangeStateStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:2059:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:2059:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:2060:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:2066:1: ruleExpression returns [EObject current=null] : (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Term_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2072:2: ( (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* ) )
            // InternalMyDsl.g:2073:2: (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* )
            {
            // InternalMyDsl.g:2073:2: (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* )
            // InternalMyDsl.g:2074:3: this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_48);
            this_Term_0=ruleTerm();

            state._fsp--;


            			current = this_Term_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:2082:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=60 && LA32_0<=61)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMyDsl.g:2083:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) )
            	    {
            	    // InternalMyDsl.g:2083:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==60) ) {
            	        alt31=1;
            	    }
            	    else if ( (LA31_0==61) ) {
            	        alt31=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalMyDsl.g:2084:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalMyDsl.g:2084:5: ( () otherlv_2= '+' )
            	            // InternalMyDsl.g:2085:6: () otherlv_2= '+'
            	            {
            	            // InternalMyDsl.g:2085:6: ()
            	            // InternalMyDsl.g:2086:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpressionAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,60,FOLLOW_33); 

            	            						newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:2098:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalMyDsl.g:2098:5: ( () otherlv_4= '-' )
            	            // InternalMyDsl.g:2099:6: () otherlv_4= '-'
            	            {
            	            // InternalMyDsl.g:2099:6: ()
            	            // InternalMyDsl.g:2100:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpressionAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,61,FOLLOW_33); 

            	            						newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:2112:4: ( (lv_right_5_0= ruleTerm ) )
            	    // InternalMyDsl.g:2113:5: (lv_right_5_0= ruleTerm )
            	    {
            	    // InternalMyDsl.g:2113:5: (lv_right_5_0= ruleTerm )
            	    // InternalMyDsl.g:2114:6: lv_right_5_0= ruleTerm
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightTermParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_48);
            	    lv_right_5_0=ruleTerm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.xtext.cnp.mydsl.MyDsl.Term");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleTerm"
    // InternalMyDsl.g:2136:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalMyDsl.g:2136:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalMyDsl.g:2137:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalMyDsl.g:2143:1: ruleTerm returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2149:2: ( (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalMyDsl.g:2150:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalMyDsl.g:2150:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalMyDsl.g:2151:3: this_Factor_0= ruleFactor ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_49);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:2159:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=62 && LA34_0<=63)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMyDsl.g:2160:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalMyDsl.g:2160:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==62) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==63) ) {
            	        alt33=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalMyDsl.g:2161:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalMyDsl.g:2161:5: ( () otherlv_2= '*' )
            	            // InternalMyDsl.g:2162:6: () otherlv_2= '*'
            	            {
            	            // InternalMyDsl.g:2162:6: ()
            	            // InternalMyDsl.g:2163:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getTermAccess().getMultiplyLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,62,FOLLOW_33); 

            	            						newLeafNode(otherlv_2, grammarAccess.getTermAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:2175:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalMyDsl.g:2175:5: ( () otherlv_4= '/' )
            	            // InternalMyDsl.g:2176:6: () otherlv_4= '/'
            	            {
            	            // InternalMyDsl.g:2176:6: ()
            	            // InternalMyDsl.g:2177:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getTermAccess().getDivisionLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,63,FOLLOW_33); 

            	            						newLeafNode(otherlv_4, grammarAccess.getTermAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:2189:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalMyDsl.g:2190:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalMyDsl.g:2190:5: (lv_right_5_0= ruleFactor )
            	    // InternalMyDsl.g:2191:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getTermAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_49);
            	    lv_right_5_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTermRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.xtext.cnp.mydsl.MyDsl.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleFactor"
    // InternalMyDsl.g:2213:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalMyDsl.g:2213:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalMyDsl.g:2214:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMyDsl.g:2220:1: ruleFactor returns [EObject current=null] : ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_variable_1_0= ruleQualifiedName ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_boolean_3_0= RULE_BOOLEAN ) ) | (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ) ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token lv_string_2_0=null;
        Token lv_boolean_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_number_0_0 = null;

        AntlrDatatypeRuleToken lv_variable_1_0 = null;

        EObject lv_expression_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2226:2: ( ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_variable_1_0= ruleQualifiedName ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_boolean_3_0= RULE_BOOLEAN ) ) | (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ) ) )
            // InternalMyDsl.g:2227:2: ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_variable_1_0= ruleQualifiedName ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_boolean_3_0= RULE_BOOLEAN ) ) | (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ) )
            {
            // InternalMyDsl.g:2227:2: ( ( (lv_number_0_0= ruleNumber ) ) | ( (lv_variable_1_0= ruleQualifiedName ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_boolean_3_0= RULE_BOOLEAN ) ) | (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ) )
            int alt35=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt35=1;
                }
                break;
            case RULE_ID:
                {
                alt35=2;
                }
                break;
            case RULE_STRING:
                {
                alt35=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt35=4;
                }
                break;
            case 45:
                {
                alt35=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:2228:3: ( (lv_number_0_0= ruleNumber ) )
                    {
                    // InternalMyDsl.g:2228:3: ( (lv_number_0_0= ruleNumber ) )
                    // InternalMyDsl.g:2229:4: (lv_number_0_0= ruleNumber )
                    {
                    // InternalMyDsl.g:2229:4: (lv_number_0_0= ruleNumber )
                    // InternalMyDsl.g:2230:5: lv_number_0_0= ruleNumber
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getNumberNumberParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_number_0_0=ruleNumber();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"number",
                    						lv_number_0_0,
                    						"org.xtext.cnp.mydsl.MyDsl.Number");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2248:3: ( (lv_variable_1_0= ruleQualifiedName ) )
                    {
                    // InternalMyDsl.g:2248:3: ( (lv_variable_1_0= ruleQualifiedName ) )
                    // InternalMyDsl.g:2249:4: (lv_variable_1_0= ruleQualifiedName )
                    {
                    // InternalMyDsl.g:2249:4: (lv_variable_1_0= ruleQualifiedName )
                    // InternalMyDsl.g:2250:5: lv_variable_1_0= ruleQualifiedName
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getVariableQualifiedNameParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variable_1_0=ruleQualifiedName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"variable",
                    						lv_variable_1_0,
                    						"org.xtext.cnp.mydsl.MyDsl.QualifiedName");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2268:3: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // InternalMyDsl.g:2268:3: ( (lv_string_2_0= RULE_STRING ) )
                    // InternalMyDsl.g:2269:4: (lv_string_2_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:2269:4: (lv_string_2_0= RULE_STRING )
                    // InternalMyDsl.g:2270:5: lv_string_2_0= RULE_STRING
                    {
                    lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_2_0, grammarAccess.getFactorAccess().getStringSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFactorRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2287:3: ( (lv_boolean_3_0= RULE_BOOLEAN ) )
                    {
                    // InternalMyDsl.g:2287:3: ( (lv_boolean_3_0= RULE_BOOLEAN ) )
                    // InternalMyDsl.g:2288:4: (lv_boolean_3_0= RULE_BOOLEAN )
                    {
                    // InternalMyDsl.g:2288:4: (lv_boolean_3_0= RULE_BOOLEAN )
                    // InternalMyDsl.g:2289:5: lv_boolean_3_0= RULE_BOOLEAN
                    {
                    lv_boolean_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    					newLeafNode(lv_boolean_3_0, grammarAccess.getFactorAccess().getBooleanBOOLEANTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFactorRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"boolean",
                    						lv_boolean_3_0,
                    						"org.xtext.cnp.mydsl.MyDsl.BOOLEAN");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:2306:3: (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' )
                    {
                    // InternalMyDsl.g:2306:3: (otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' )
                    // InternalMyDsl.g:2307:4: otherlv_4= '(' ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalMyDsl.g:2311:4: ( (lv_expression_5_0= ruleExpression ) )
                    // InternalMyDsl.g:2312:5: (lv_expression_5_0= ruleExpression )
                    {
                    // InternalMyDsl.g:2312:5: (lv_expression_5_0= ruleExpression )
                    // InternalMyDsl.g:2313:6: lv_expression_5_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_expression_5_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_5_0,
                    							"org.xtext.cnp.mydsl.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,47,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getFactorAccess().getRightParenthesisKeyword_4_2());
                    			

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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleNumber"
    // InternalMyDsl.g:2339:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalMyDsl.g:2339:46: (iv_ruleNumber= ruleNumber EOF )
            // InternalMyDsl.g:2340:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMyDsl.g:2346:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2352:2: ( (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE ) )
            // InternalMyDsl.g:2353:2: (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE )
            {
            // InternalMyDsl.g:2353:2: (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_DOUBLE) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:2354:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2362:3: this_DOUBLE_1= RULE_DOUBLE
                    {
                    this_DOUBLE_1=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    			current.merge(this_DOUBLE_1);
                    		

                    			newLeafNode(this_DOUBLE_1, grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleParameter"
    // InternalMyDsl.g:2373:1: entryRuleParameter returns [String current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final String entryRuleParameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameter = null;


        try {
            // InternalMyDsl.g:2373:49: (iv_ruleParameter= ruleParameter EOF )
            // InternalMyDsl.g:2374:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter.getText(); 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalMyDsl.g:2380:1: ruleParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Number_0= ruleNumber | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID | this_BOOLEAN_3= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleParameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_1=null;
        Token this_ID_2=null;
        Token this_BOOLEAN_3=null;
        AntlrDatatypeRuleToken this_Number_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2386:2: ( (this_Number_0= ruleNumber | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID | this_BOOLEAN_3= RULE_BOOLEAN ) )
            // InternalMyDsl.g:2387:2: (this_Number_0= ruleNumber | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID | this_BOOLEAN_3= RULE_BOOLEAN )
            {
            // InternalMyDsl.g:2387:2: (this_Number_0= ruleNumber | this_STRING_1= RULE_STRING | this_ID_2= RULE_ID | this_BOOLEAN_3= RULE_BOOLEAN )
            int alt37=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt37=1;
                }
                break;
            case RULE_STRING:
                {
                alt37=2;
                }
                break;
            case RULE_ID:
                {
                alt37=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt37=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:2388:3: this_Number_0= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getParameterAccess().getNumberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_0=ruleNumber();

                    state._fsp--;


                    			current.merge(this_Number_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2399:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getParameterAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2407:3: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_2);
                    		

                    			newLeafNode(this_ID_2, grammarAccess.getParameterAccess().getIDTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2415:3: this_BOOLEAN_3= RULE_BOOLEAN
                    {
                    this_BOOLEAN_3=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    			current.merge(this_BOOLEAN_3);
                    		

                    			newLeafNode(this_BOOLEAN_3, grammarAccess.getParameterAccess().getBOOLEANTerminalRuleCall_3());
                    		

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMyDsl.g:2426:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalMyDsl.g:2426:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalMyDsl.g:2427:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMyDsl.g:2433:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2439:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )* ) )
            // InternalMyDsl.g:2440:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )* )
            {
            // InternalMyDsl.g:2440:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )* )
            // InternalMyDsl.g:2441:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.' this_INT_4= RULE_INT )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_50); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalMyDsl.g:2448:3: (kw= '.' this_ID_2= RULE_ID )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==64) ) {
                    int LA38_1 = input.LA(2);

                    if ( (LA38_1==RULE_ID) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // InternalMyDsl.g:2449:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,64,FOLLOW_17); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_50); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            // InternalMyDsl.g:2462:3: (kw= '.' this_INT_4= RULE_INT )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==64) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalMyDsl.g:2463:4: kw= '.' this_INT_4= RULE_INT
            	    {
            	    kw=(Token)match(input,64,FOLLOW_51); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_2_0());
            	    			
            	    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_50); 

            	    				current.merge(this_INT_4);
            	    			

            	    				newLeafNode(this_INT_4, grammarAccess.getQualifiedNameAccess().getINTTerminalRuleCall_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\27\uffff";
    static final String dfa_2s = "\1\21\10\4\1\32\1\uffff\2\21\1\uffff\10\33\1\4";
    static final String dfa_3s = "\1\62\10\4\1\32\1\uffff\1\62\1\30\1\uffff\10\33\1\4";
    static final String dfa_4s = "\12\uffff\1\2\2\uffff\1\1\11\uffff";
    static final String dfa_5s = "\27\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\1\6\1\7\1\10\1\1\1\2\1\3\1\4\1\11\30\uffff\1\12",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\14",
            "",
            "\11\15\21\uffff\1\12\6\uffff\1\15",
            "\1\22\1\23\1\24\1\25\1\16\1\17\1\20\1\21",
            "",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\13"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 1355:4: ( (lv_variables_5_0= ruleVariable ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001FE0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003FE0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000023FE0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000803FE0000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0003010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00002000000001F0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000C00003FE0000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000003FE0000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000023FE0000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0C00000000000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0C00000020000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0004000013FE0000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00F000000C000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000080L});

}