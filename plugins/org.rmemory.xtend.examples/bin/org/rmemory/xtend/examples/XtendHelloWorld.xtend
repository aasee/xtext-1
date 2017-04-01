package org.rmemory.xtend.examples

import java.util.Collections
import java.util.LinkedList
import java.util.List

/* 
 * Various examples of using xtend
 */
class XtendHelloWorld {
	def static void main(String[] args) {
		println("Hello world")
	}
}

class XtendOverrideExampleWithConstructors {
	new() {
		//defaultConstructor
	}
	
	new (String s) {
		//Constructor taking a String
	}
	
	/*
	 * And example of using override
	 */
	override String toString() {
		return "some useful string"
	}
}

class XtendFieldsAndVarsExample {
	/* 
	 * val's are always final
	 * var's are always non-final
	 * 
	 * Both are public by default
	 */
	 
	 /* 
	  * The usage of the '#' char creates a collection of literals
	  * or in other words, and immutable collection
	  */
	val aList = #["a", "b"] // creates a list of strings
	val String[] anArray = #["a", "b"] // creates an array of strings
	val aSet = #{"a", "b"} // creates a set
	val aMap = #{"a" -> 0, "b"->1} // creates a (hash) map
	
	def myMethod() {
		val s = "my variable" // final variable
		println(s)
		var myList = new LinkedList<Integer> // Non final variable, type inferred
		myList.add(new Integer(2));
		val aList = newArrayList // newArrayList method defined in Xtext's CollectionLiterals
		aList += ""
	}
	
	def myMethod(List<String>list) {
		
	}
	
	def extensionMethodExample() {
		val aString = "my string".toFirstUpper // toFirstUpper is an extension method
		
		val list = newArrayList("a", "b", "c")
		println(list.head) // prints a
		println(list.last) // prints c
		
		list.myMethod // calls myMethod(List<String>list) in the same class and passes the list as an arg
	}
}

class XtendIdenticalReturnExamples {
	/*
	 * All of the following methods return the same thing, in
	 * this case a String.
	 * 
	 * Note the XText folks recommend that if a method is an 
	 * API that an explicit return method is used to make the
	 * intentions clear, and also it will prevent inadvertently
	 * breaking the API if the method signature changes. 
	 */ 
	def m1() {
		""
	}
	
	def String m2() {
		""
	}
	
	def m3() {
		return ""
	}
	
	def String m4() {
		return ""
	}
}

class XtendLambdaExamples {
	/*
	 * Lambdas are function pointer with variables
	 */
	def myMethod() {
		/*
		 * A lambda which takes a string and an integer
		 * and returns the string concatenated with the 
		 * integer
		 */  
		val l = [String s, int i | s + i]
		println(l.apply("s", 10))
		
		/* 
		 * The same thing could be written as follows, where
		 * lNew is the new variable. Here the input args are
		 * seperated from the return type in the overall type
		 * declaration of lNew
		 */
		 val (String, int) => String lNew = [String s, int i | s + i]
		 
		 /*
		  * This is the same thing with the types remove from the lambda
		  */
		  val (String, int) => String lNewNew = [s, i | s + i]
		  
		  /*
		   * java.util.Collections.sort expects a List<T> and a Comparator<T> , which is a 
		   * functional interface in Java 8, with the abstract method int compare(T o1, T o2).
		   */
		  val list = newArrayList("Second", "First", "Third")
		  Collections.sort(list, [ arg0, arg1 | arg0.compareToIgnoreCase(arg1) ])
	}	
	
	/*
	 * This is an example of a method which takes a lambda as an input
	 * arg, where 'f' is the lambda
	 */
	 def executeALambda((String, int)=>String f) {
	 	f.apply("s", 10)	
	 }
	 
	 /* 
	  * Use the executeALambda method
	  */
	 def callexecuteALambda() {
	 	// Note the algorithm is declared here
	 	executeALambda([s, i | s + i])
	 }
}