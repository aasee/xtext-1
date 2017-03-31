/*
 * generated by Xtext 2.10.0
 */
package org.rmemory.xtext.entities.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.rmemory.xtext.entities.ide.contentassist.antlr.internal.InternalEntitiesParser;
import org.rmemory.xtext.entities.services.EntitiesGrammarAccess;

public class EntitiesParser extends AbstractContentAssistParser {

	@Inject
	private EntitiesGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalEntitiesParser createParser() {
		InternalEntitiesParser result = new InternalEntitiesParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getElementTypeAccess().getAlternatives(), "rule__ElementType__Alternatives");
					put(grammarAccess.getBasicTypeAccess().getTypeNameAlternatives_0(), "rule__BasicType__TypeNameAlternatives_0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getEntityAccess().getGroup_2(), "rule__Entity__Group_2__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getAttributeTypeAccess().getGroup(), "rule__AttributeType__Group__0");
					put(grammarAccess.getAttributeTypeAccess().getGroup_1(), "rule__AttributeType__Group_1__0");
					put(grammarAccess.getModelAccess().getEntitiesAssignment(), "rule__Model__EntitiesAssignment");
					put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
					put(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1(), "rule__Entity__SuperTypeAssignment_2_1");
					put(grammarAccess.getEntityAccess().getAttributesAssignment_4(), "rule__Entity__AttributesAssignment_4");
					put(grammarAccess.getAttributeAccess().getTypeAssignment_0(), "rule__Attribute__TypeAssignment_0");
					put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
					put(grammarAccess.getAttributeTypeAccess().getElementTypeAssignment_0(), "rule__AttributeType__ElementTypeAssignment_0");
					put(grammarAccess.getAttributeTypeAccess().getArrayAssignment_1_0(), "rule__AttributeType__ArrayAssignment_1_0");
					put(grammarAccess.getAttributeTypeAccess().getLengthAssignment_1_1(), "rule__AttributeType__LengthAssignment_1_1");
					put(grammarAccess.getAttributeTypeAccess().getNameAssignment_2(), "rule__AttributeType__NameAssignment_2");
					put(grammarAccess.getBasicTypeAccess().getTypeNameAssignment(), "rule__BasicType__TypeNameAssignment");
					put(grammarAccess.getEntityTypeAccess().getEntityAssignment(), "rule__EntityType__EntityAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalEntitiesParser typedParser = (InternalEntitiesParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public EntitiesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EntitiesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
