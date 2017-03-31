/*
 * generated by Xtext 2.10.0
 */
package org.rmemory.xtext.entities.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class EntitiesGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.rmemory.xtext.entities.Entities.Model");
		private final Assignment cEntitiesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cEntitiesEntityParserRuleCall_0 = (RuleCall)cEntitiesAssignment.eContents().get(0);
		
		//Model:
		//	entities+=Entity*;
		@Override public ParserRule getRule() { return rule; }
		
		//entities+=Entity*
		public Assignment getEntitiesAssignment() { return cEntitiesAssignment; }
		
		//Entity
		public RuleCall getEntitiesEntityParserRuleCall_0() { return cEntitiesEntityParserRuleCall_0; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.rmemory.xtext.entities.Entities.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cSuperTypeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cSuperTypeEntityCrossReference_2_1_0 = (CrossReference)cSuperTypeAssignment_2_1.eContents().get(0);
		private final RuleCall cSuperTypeEntityIDTerminalRuleCall_2_1_0_1 = (RuleCall)cSuperTypeEntityCrossReference_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAttributesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAttributesAttributeParserRuleCall_4_0 = (RuleCall)cAttributesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Entity:
		//	'entity' name=ID ('extends' superType=[Entity])? '{'
		//	attributes+=Attribute* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'entity' name=ID ('extends' superType=[Entity])? '{' attributes+=Attribute* '}'
		public Group getGroup() { return cGroup; }
		
		//'entity'
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('extends' superType=[Entity])?
		public Group getGroup_2() { return cGroup_2; }
		
		//'extends'
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }
		
		//superType=[Entity]
		public Assignment getSuperTypeAssignment_2_1() { return cSuperTypeAssignment_2_1; }
		
		//[Entity]
		public CrossReference getSuperTypeEntityCrossReference_2_1_0() { return cSuperTypeEntityCrossReference_2_1_0; }
		
		//ID
		public RuleCall getSuperTypeEntityIDTerminalRuleCall_2_1_0_1() { return cSuperTypeEntityIDTerminalRuleCall_2_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//attributes+=Attribute*
		public Assignment getAttributesAssignment_4() { return cAttributesAssignment_4; }
		
		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_4_0() { return cAttributesAttributeParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.rmemory.xtext.entities.Entities.Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypeAttributeTypeParserRuleCall_0_0 = (RuleCall)cTypeAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Attribute:
		//	type=AttributeType name=ID ';';
		@Override public ParserRule getRule() { return rule; }
		
		//type=AttributeType name=ID ';'
		public Group getGroup() { return cGroup; }
		
		//type=AttributeType
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//AttributeType
		public RuleCall getTypeAttributeTypeParserRuleCall_0_0() { return cTypeAttributeTypeParserRuleCall_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class AttributeTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.rmemory.xtext.entities.Entities.AttributeType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cElementTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cElementTypeElementTypeParserRuleCall_0_0 = (RuleCall)cElementTypeAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cArrayAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final Keyword cArrayLeftSquareBracketKeyword_1_0_0 = (Keyword)cArrayAssignment_1_0.eContents().get(0);
		private final Assignment cLengthAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cLengthINTTerminalRuleCall_1_1_0 = (RuleCall)cLengthAssignment_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//AttributeType:
		//	elementType=ElementType (array?='[' length=INT? ']')? name=ID ';';
		@Override public ParserRule getRule() { return rule; }
		
		//elementType=ElementType (array?='[' length=INT? ']')? name=ID ';'
		public Group getGroup() { return cGroup; }
		
		//elementType=ElementType
		public Assignment getElementTypeAssignment_0() { return cElementTypeAssignment_0; }
		
		//ElementType
		public RuleCall getElementTypeElementTypeParserRuleCall_0_0() { return cElementTypeElementTypeParserRuleCall_0_0; }
		
		//(array?='[' length=INT? ']')?
		public Group getGroup_1() { return cGroup_1; }
		
		//array?='['
		public Assignment getArrayAssignment_1_0() { return cArrayAssignment_1_0; }
		
		//'['
		public Keyword getArrayLeftSquareBracketKeyword_1_0_0() { return cArrayLeftSquareBracketKeyword_1_0_0; }
		
		//length=INT?
		public Assignment getLengthAssignment_1_1() { return cLengthAssignment_1_1; }
		
		//INT
		public RuleCall getLengthINTTerminalRuleCall_1_1_0() { return cLengthINTTerminalRuleCall_1_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_1_2() { return cRightSquareBracketKeyword_1_2; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class ElementTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.rmemory.xtext.entities.Entities.ElementType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cBasicTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEntityTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//ElementType:
		//	BasicType | EntityType;
		@Override public ParserRule getRule() { return rule; }
		
		//BasicType | EntityType
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//BasicType
		public RuleCall getBasicTypeParserRuleCall_0() { return cBasicTypeParserRuleCall_0; }
		
		//EntityType
		public RuleCall getEntityTypeParserRuleCall_1() { return cEntityTypeParserRuleCall_1; }
	}
	public class BasicTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.rmemory.xtext.entities.Entities.BasicType");
		private final Assignment cTypeNameAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cTypeNameAlternatives_0 = (Alternatives)cTypeNameAssignment.eContents().get(0);
		private final Keyword cTypeNameStringKeyword_0_0 = (Keyword)cTypeNameAlternatives_0.eContents().get(0);
		private final Keyword cTypeNameIntKeyword_0_1 = (Keyword)cTypeNameAlternatives_0.eContents().get(1);
		private final Keyword cTypeNameBooleanKeyword_0_2 = (Keyword)cTypeNameAlternatives_0.eContents().get(2);
		
		//BasicType:
		//	typeName=('string' | 'int' | 'boolean');
		@Override public ParserRule getRule() { return rule; }
		
		//typeName=('string' | 'int' | 'boolean')
		public Assignment getTypeNameAssignment() { return cTypeNameAssignment; }
		
		//('string' | 'int' | 'boolean')
		public Alternatives getTypeNameAlternatives_0() { return cTypeNameAlternatives_0; }
		
		//'string'
		public Keyword getTypeNameStringKeyword_0_0() { return cTypeNameStringKeyword_0_0; }
		
		//'int'
		public Keyword getTypeNameIntKeyword_0_1() { return cTypeNameIntKeyword_0_1; }
		
		//'boolean'
		public Keyword getTypeNameBooleanKeyword_0_2() { return cTypeNameBooleanKeyword_0_2; }
	}
	public class EntityTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.rmemory.xtext.entities.Entities.EntityType");
		private final Assignment cEntityAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cEntityEntityCrossReference_0 = (CrossReference)cEntityAssignment.eContents().get(0);
		private final RuleCall cEntityEntityIDTerminalRuleCall_0_1 = (RuleCall)cEntityEntityCrossReference_0.eContents().get(1);
		
		//EntityType:
		//	entity=[Entity];
		@Override public ParserRule getRule() { return rule; }
		
		//entity=[Entity]
		public Assignment getEntityAssignment() { return cEntityAssignment; }
		
		//[Entity]
		public CrossReference getEntityEntityCrossReference_0() { return cEntityEntityCrossReference_0; }
		
		//ID
		public RuleCall getEntityEntityIDTerminalRuleCall_0_1() { return cEntityEntityIDTerminalRuleCall_0_1; }
	}
	
	
	private final ModelElements pModel;
	private final EntityElements pEntity;
	private final AttributeElements pAttribute;
	private final AttributeTypeElements pAttributeType;
	private final ElementTypeElements pElementType;
	private final BasicTypeElements pBasicType;
	private final EntityTypeElements pEntityType;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public EntitiesGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pEntity = new EntityElements();
		this.pAttribute = new AttributeElements();
		this.pAttributeType = new AttributeTypeElements();
		this.pElementType = new ElementTypeElements();
		this.pBasicType = new BasicTypeElements();
		this.pEntityType = new EntityTypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.rmemory.xtext.entities.Entities".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	entities+=Entity*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Entity:
	//	'entity' name=ID ('extends' superType=[Entity])? '{'
	//	attributes+=Attribute* '}';
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//Attribute:
	//	type=AttributeType name=ID ';';
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}
	
	//AttributeType:
	//	elementType=ElementType (array?='[' length=INT? ']')? name=ID ';';
	public AttributeTypeElements getAttributeTypeAccess() {
		return pAttributeType;
	}
	
	public ParserRule getAttributeTypeRule() {
		return getAttributeTypeAccess().getRule();
	}
	
	//ElementType:
	//	BasicType | EntityType;
	public ElementTypeElements getElementTypeAccess() {
		return pElementType;
	}
	
	public ParserRule getElementTypeRule() {
		return getElementTypeAccess().getRule();
	}
	
	//BasicType:
	//	typeName=('string' | 'int' | 'boolean');
	public BasicTypeElements getBasicTypeAccess() {
		return pBasicType;
	}
	
	public ParserRule getBasicTypeRule() {
		return getBasicTypeAccess().getRule();
	}
	
	//EntityType:
	//	entity=[Entity];
	public EntityTypeElements getEntityTypeAccess() {
		return pEntityType;
	}
	
	public ParserRule getEntityTypeRule() {
		return getEntityTypeAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
