package org.rmemory.xtend.examples;

@SuppressWarnings("all")
public class XtendIdenticalReturnExamples {
  /**
   * All of the following methods return the same thing, in
   * this case a String.
   * 
   * Note the XText folks recommend that if a method is an
   * API that an explicit return method is used to make the
   * intentions clear, and also it will prevent inadvertently
   * breaking the API if the method signature changes.
   */
  public String m1() {
    return "";
  }
  
  public String m2() {
    return "";
  }
  
  public String m3() {
    return "";
  }
  
  public String m4() {
    return "";
  }
}
