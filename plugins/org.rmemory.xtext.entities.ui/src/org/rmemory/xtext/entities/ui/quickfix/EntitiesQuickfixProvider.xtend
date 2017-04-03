/*
 * generated by Xtext 2.10.0
 */
package org.rmemory.xtext.entities.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import org.rmemory.xtext.entities.validation.EntitiesValidator

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class EntitiesQuickfixProvider extends DefaultQuickfixProvider {

@Fix(EntitiesValidator.INVALID_ENTITY_NAME)
def void capitalizeEntityNameFirstLetter(Issue issue, 
	IssueResolutionAcceptor acceptor) {
 		changeFirstLetterToUpperCase(issue, acceptor)
	}
	
@Fix (EntitiesValidator.INVALID_ATTRIBUTE_NAME)
def void capitalizeAttributeFirstLetter(Issue issue,
	IssueResolutionAcceptor acceptor) {
		changeFirstLetterToUpperCase(issue, acceptor)
	}
	
protected def void changeFirstLetterToUpperCase(Issue issue, 
	IssueResolutionAcceptor acceptor) {
				acceptor.accept(issue,
			"Capitalize first letter", //label
			"Captialize first letter of '" + issue.data.get(0) + "'", // description
		    "Entity.gif", //icon
		    [context | 
		    	val xtextDocument = context.xtextDocument
		    	val firstLetter = xtextDocument.get(issue.offset, 1);
		    	xtextDocument.replace(issue.offset, 1, firstLetter.toFirstUpper)
		    ])
	}
//	@Fix(EntitiesValidator.INVALID_NAME)
//	def capitalizeName(Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue, 'Capitalize name', 'Capitalize the name.', 'upcase.png') [
//			context |
//			val xtextDocument = context.xtextDocument
//			val firstLetter = xtextDocument.get(issue.offset, 1)
//			xtextDocument.replace(issue.offset, 1, firstLetter.toUpperCase)
//		]
//	}
}
