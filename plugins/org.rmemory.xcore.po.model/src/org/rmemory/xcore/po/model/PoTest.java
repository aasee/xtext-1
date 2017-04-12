package org.rmemory.xcore.po.model;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.rmemory.xcore.po.model.po.Item;
import org.rmemory.xcore.po.model.po.PoFactory;
import org.rmemory.xcore.po.model.po.PurchaseOrder;
import org.rmemory.xcore.po.model.po.USAddress;

public class PoTest {

	public static void main(String[] args) {
		PoFactory factory = PoFactory.eINSTANCE;
		
		PurchaseOrder po = factory.createPurchaseOrder();
		
		USAddress shipTo = factory.createUSAddress();
		USAddress billTo = factory.createUSAddress();
		
		po.setBillTo(billTo);
		po.setShipTo(shipTo);
		
		/*
		 * 1) Rules that run on the UI DM which can be invoked by CLI
		 * 
		 * 2) The user modifies something in the UI, we should be able validate in 
		 * a reasonable way, and communicate 
		 * 
		 * 3) The file should never be saved in incorrect state
		 */
		
		Item item = factory.createItem();
		
		item.setComment("this is a comment");
		item.setProductName("MyProduct");
		item.setQuantity(-1);
		
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(po);
		
		System.out.println("po test complete");

	}

}
