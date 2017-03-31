XText (see https://eclipse.org/Xtext/index.html) is a framework integrated with Eclipse, based on the Eclipse Modeling Framework (EMF) which allows the user to create a Domain Specific Language (DSL) for a particular task. Examples of DSLs include SQL, HTML, JSON, among others.

Another example of a DSL is the Device Tree syntax used by Linux, a hardware description syntax. See the following:

https://www.devicetree.org/
https://github.com/devicetree-org/devicetree-specification-released/blob/master/devicetree-specification-v0.1-20160524.pdf
https://events.linuxfoundation.org/sites/events/files/slides/petazzoni-device-tree-dummies.pdf

This repo contains my expirementation using XText, some based on examples from Bettni's book, and also some of my own. Unless otherwise stated, I am using XText 2.10.

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

6) Xtend notes:

* Interoperable with Java
* Less syntactic noise than Java
* Terminating semicolons are optional
* All method declarations must begin with "def" or "override". 
* If a method is overriden, the keyword "override" is required.
* All methods are public by default
* Multiple top level types may be specified in a single file
* Constructor names are simply "new"
* Everything is an expression. This means return statements are also optional
* Fields and local variables are declared using "val" for final fields and variables. "var" for non-final.
* Method parameters are always final
* The type of a variable can be inferred.
* "==" translates to "equals". "===" is used for equality.
* Instead of obj.getName(), you can simply use obj.name (even if "name" is private)
* single or double quotes are allowed for strings
* Literals are specified with #[] syntax. For example,

val aList = #["a", "b"] //creates a list
val String[] anArray = #["a", "b"]
val aSet = #{"a", "b"}
val aMap = #{"a" -> 0, "b" -> 1}

* . Xtend supports the concept of "extension methods", which is a mechanism that allows you to "add" new methods to existing types without modifying them (or more accurately, "extend" rather than "add"). 

For example, lets say I have myClass.myNewMethod(SomeExistingType). And lets say the variable "e" is of type "SomeExistingType", then I can write this:

e.myNewMethod() instead of myNewMethod(e), even though myNewMethod isn't definited in SomeExistingType. This allows call chains that look like this: o.foo().bar() instead of bar(foo(o))

* Xtend also includes several utility classes and static methods which can be used as extension methods. For example, 

"my string".toFirstUpper

is the equivalent of 

StringExtensions.toFirstUpper("my string")

* The implicit variable – it

Instead of this:
def trans2(String s) {
var it = s
toLowerCase // it.toLowerCase
}

You can do this:

def trans1(String it) {
toLowerCase // it.toLowerCase
}

* Lamda expressions are anonymous objects which can be passed to methods or stored in a variable for later evaluation. They are somewhat comparable to a function pointer in C/C++ (although a lambda encapsulates both the method and variables).

Xtend lambda expressions are declared using square brackets, []. The parameters and the body are seperated using a pipe symbol, |. The body of the lambda is executed by calling its apply method.

The following code snippet defines a lambda expression, assigned to a local variable. It takes a string and an integer as parameters, return the string concatenation of the two, then evaluated by passing the two arguments

val l = [ String s, int i | s + i ]
println(l.apply("s", 10))

These are equivalent:

val (String, int)=>String l = [ String s, int i | s + i ]

val (String, int)=>String l = [ s, i | s + i ]

Function types are useful when declaring methods that take a lambda expression as a parameter (remember that the types of parameters must always be specified), for example:

def execute((String, int)=>String f) {
f.apply("s", 10)
}


