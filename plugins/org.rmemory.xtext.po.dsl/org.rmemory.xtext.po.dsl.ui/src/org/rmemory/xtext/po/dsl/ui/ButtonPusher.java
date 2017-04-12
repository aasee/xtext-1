package org.rmemory.xtext.po.dsl.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.rmemory.xtext.po.dsl.PurchaseOrderStandaloneSetup;
import org.rmemory.xtext.po.dsl.purchaseOrder.Model;

import com.google.inject.Injector;

public class ButtonPusher extends AbstractHandler {

	private Model fTheModel;
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// do this only once per application
		Injector injector = new PurchaseOrderStandaloneSetup().createInjectorAndDoEMFRegistration();
		 
		// obtain a resourceset from the injector
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		
		IWorkspace workspace=ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IProject project  = root.getProject("MyProject");
		IFile file = project.getFile("my.po");
		
		// load a resource by URI, in this case from the file system
		Resource resource = resourceSet.getResource(URI.createFileURI(file.getLocation().toOSString()), true);
		
		EcoreUtil.resolveAll(resource);
		
		EObject rootObject = resource.getContents().get(0);
		if (rootObject instanceof Model) {
			fTheModel = (Model)rootObject;
		}
		return null;
	}
	
	public Model getModel() {
		return fTheModel;
	}
}
