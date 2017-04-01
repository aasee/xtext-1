package org.rmemory.xtend.examples;

@SuppressWarnings("all")
public class XtendOverrideExampleWithConstructors {
  public XtendOverrideExampleWithConstructors() {
  }
  
  public XtendOverrideExampleWithConstructors(final String s) {
  }
  
  /**
   * And example of using override
   */
  @Override
  public String toString() {
    return "some useful string";
  }
}
