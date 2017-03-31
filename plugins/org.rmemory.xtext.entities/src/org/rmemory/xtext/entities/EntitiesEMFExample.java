package org.rmemory.xtext.entities;

import org.rmemory.xtext.entities.entities.Attribute;
import org.rmemory.xtext.entities.entities.AttributeType;
import org.rmemory.xtext.entities.entities.EntitiesFactory;
import org.rmemory.xtext.entities.entities.Entity;
import org.rmemory.xtext.entities.entities.EntityType;
import org.rmemory.xtext.entities.entities.Model;

public class EntitiesEMFExample {

	public static void main(String[] args) {
		EntitiesFactory factory = EntitiesFactory.eINSTANCE;

		Entity superEntity = factory.createEntity();
		superEntity.setName("MySuperEntity");
		
		Entity entity  = factory.createEntity();
		entity.setName("MyEntity");
		entity.setSuperType(superEntity);
		
		Attribute attribute = factory.createAttribute();
		attribute.setName("myattribute");
		AttributeType attributeType = factory.createAttributeType();
		attributeType.setArray(false);
		attributeType.setLength(10);
		EntityType entityType = factory.createEntityType();
		entityType.setEntity(superEntity);
		attributeType.setElementType(entityType);
		attribute.setType(attributeType);
		
		entity.getAttributes().add(attribute);
		
		Model model = factory.createModel();
		model.getEntities().add(superEntity);
		model.getEntities().add(entity);
	}

}
