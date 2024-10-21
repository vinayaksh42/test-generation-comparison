package com.esotericsoftware.reflectasm;

import com.esotericsoftware.reflectasm.MethodAccess;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MethodAccessTestss {

  public static class SampleClass {
    public String greet(String name) {
      return "Hello, " + name;
    }
  }

  @Test
  public void testMethodAccess() {
    // Obtain MethodAccess for SampleClass
    MethodAccess methodAccess = MethodAccess.get(SampleClass.class);

    // Create an instance of SampleClass
    SampleClass sample = new SampleClass();

    // Get the index of the "greet" method with a String parameter
    int methodIndex = methodAccess.getIndex("greet", String.class);

    // Invoke the method using MethodAccess
    String result = (String) methodAccess.invoke(sample, methodIndex, "World");

    // Assert that the result is as expected
    assertEquals("Hello, World", result);
  }
}
