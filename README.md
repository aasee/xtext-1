XText (see https://eclipse.org/Xtext/index.html) is a framework integrated with Eclipse, based on the Eclipse Modeling Framework (EMF) which allows the user to create a Domain Specific Language (DSL) for a particular task. Examples of DSLs include SQL, HTML, JSON, among others.

Another example of a DSL is the Device Tree syntax used by Linux, a hardware description syntax. See the following:

https://www.devicetree.org/
https://github.com/devicetree-org/devicetree-specification-released/blob/master/devicetree-specification-v0.1-20160524.pdf
https://events.linuxfoundation.org/sites/events/files/slides/petazzoni-device-tree-dummies.pdf

This repo contains my expirementation using XText, some based on examples, and some of my own. Unless otherwise stated, I am using XText 2.10.

Misc Notes:
===============

1) Xtext provides:

* IDE integration (Eclipse, intellij, and web). It can also be used standalone. See the following:

http://typefox.io/how-and-why-use-xtext-without-the-ide

* Syntax highlighting
* Syntax and semantic validation
* Error markers
* Content Assist (in Eclipse, ctrl+space bar)
* Hyperlinking
* Quick fixes
* Outline support

2) According to the book, the Antlr Jar (BSD license and not EPL) is no needed at runtime. That said, the folks at itemis have also created an eclipse plugin containing Antlr. Use this update site:
http://download.itemis.com/updates/releases/

3) Each node in the grammar becomes an EMF class/object. For example, this grammar statement:

Entity:
	'entity' name = ID ('extends' superType=[Entity])? '{'
	 attributes += Attribute* '}'
   
Results in this EMF Interface:

public interface Entity extends EObject
{

  String getName();
  
  void setName(String value);

  Entity getSuperType();

  void setSuperType(Entity value);

  EList<Attribute> getAttributes();

} // Entity

4) Usage of brackets in grammar statements (as Entity is used above in the superType) implies a cross-reference, and the XText editor will search the file for an element of that type.

5) Access to the underlying EMF model is used for validation.
