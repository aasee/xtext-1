package org.rmemory.xtend.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class XtendLambdaExamples {
  /**
   * Lambdas are function pointer with variables
   */
  public void myMethod() {
    final Function2<String, Integer, String> _function = (String s, Integer i) -> {
      return (s + Integer.valueOf(i));
    };
    final Function2<String, Integer, String> l = _function;
    String _apply = l.apply("s", Integer.valueOf(10));
    InputOutput.<String>println(_apply);
    final Function2<String, Integer, String> _function_1 = (String s, Integer i) -> {
      return (s + Integer.valueOf(i));
    };
    final Function2<? super String, ? super Integer, ? extends String> lNew = _function_1;
    final Function2<String, Integer, String> _function_2 = (String s, Integer i) -> {
      return (s + i);
    };
    final Function2<? super String, ? super Integer, ? extends String> lNewNew = _function_2;
    final ArrayList<String> list = CollectionLiterals.<String>newArrayList("Second", "First", "Third");
    final Comparator<String> _function_3 = (String arg0, String arg1) -> {
      return arg0.compareToIgnoreCase(arg1);
    };
    Collections.<String>sort(list, _function_3);
  }
  
  /**
   * This is an example of a method which takes a lambda as an input
   * arg, where 'f' is the lambda
   */
  public String executeALambda(final Function2<? super String, ? super Integer, ? extends String> f) {
    return f.apply("s", Integer.valueOf(10));
  }
  
  /**
   * Use the executeALambda method
   */
  public String callexecuteALambda() {
    final Function2<String, Integer, String> _function = (String s, Integer i) -> {
      return (s + i);
    };
    return this.executeALambda(_function);
  }
}
