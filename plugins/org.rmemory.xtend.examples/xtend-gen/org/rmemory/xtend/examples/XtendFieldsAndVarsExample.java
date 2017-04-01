package org.rmemory.xtend.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class XtendFieldsAndVarsExample {
  /**
   * The usage of the '#' char creates a collection of literals
   * or in other words, and immutable collection
   */
  private final List<String> aList = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("a", "b"));
  
  private final String[] anArray = { "a", "b" };
  
  private final Set<String> aSet = Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("a", "b"));
  
  private final Map<String, Integer> aMap = Collections.<String, Integer>unmodifiableMap(CollectionLiterals.<String, Integer>newHashMap(Pair.<String, Integer>of("a", Integer.valueOf(0)), Pair.<String, Integer>of("b", Integer.valueOf(1))));
  
  public boolean myMethod() {
    boolean _xblockexpression = false;
    {
      final String s = "my variable";
      InputOutput.<String>println(s);
      LinkedList<Integer> myList = new LinkedList<Integer>();
      Integer _integer = new Integer(2);
      myList.add(_integer);
      final ArrayList<String> aList = CollectionLiterals.<String>newArrayList();
      _xblockexpression = aList.add("");
    }
    return _xblockexpression;
  }
  
  public Object myMethod(final List<String> list) {
    return null;
  }
  
  public Object extensionMethodExample() {
    Object _xblockexpression = null;
    {
      final String aString = StringExtensions.toFirstUpper("my string");
      final ArrayList<String> list = CollectionLiterals.<String>newArrayList("a", "b", "c");
      String _head = IterableExtensions.<String>head(list);
      InputOutput.<String>println(_head);
      String _last = IterableExtensions.<String>last(list);
      InputOutput.<String>println(_last);
      _xblockexpression = this.myMethod(list);
    }
    return _xblockexpression;
  }
}
