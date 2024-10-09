/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 02 21:00:28 GMT 2024
 */

package org.dynjs.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.util.List;
import org.dynjs.Config;
import org.dynjs.cli.Arguments;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Arguments_ESTest extends Arguments_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Arguments arguments0 = new Arguments();
      Config config0 = arguments0.getConfig();
      config0.setV8Compatible(false);
      Config config1 = arguments0.initConfig(config0);
      assertFalse(config1.isDebug());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Arguments arguments0 = new Arguments();
      Config config0 = new Config();
      config0.setJitEnabled(true);
      Config config1 = arguments0.initConfig(config0);
      assertFalse(config1.isDebug());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Arguments arguments0 = new Arguments();
      Config config0 = new Config();
      config0.setJitAsync(true);
      Config config1 = arguments0.initConfig(config0);
      assertFalse(config1.isDebug());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Arguments arguments0 = new Arguments();
      Config config0 = new Config();
      config0.setInvokeDynamicEnabled(false);
      Config config1 = arguments0.initConfig(config0);
      assertFalse(config1.isDebug());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Arguments arguments0 = new Arguments();
      Config config0 = new Config();
      config0.setCommonJSCompatible(false);
      Config config1 = arguments0.initConfig(config0);
      assertFalse(config1.isDebug());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Arguments arguments0 = new Arguments();
      // Undeclared exception!
      try { 
        arguments0.initConfig((Config) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dynjs.cli.Arguments", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Arguments arguments0 = new Arguments();
      boolean boolean0 = arguments0.isDebug();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Arguments arguments0 = new Arguments();
      String string0 = arguments0.getFilename();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Arguments arguments0 = new Arguments();
      boolean boolean0 = arguments0.isVersion();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Arguments arguments0 = new Arguments();
      boolean boolean0 = arguments0.isHelp();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Arguments arguments0 = new Arguments();
      List<File> list0 = arguments0.getClasspath();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Arguments arguments0 = new Arguments();
      String string0 = arguments0.getEval();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Arguments arguments0 = new Arguments();
      boolean boolean0 = arguments0.isProperties();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Arguments arguments0 = new Arguments();
      boolean boolean0 = arguments0.isConsole();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Arguments arguments0 = new Arguments();
      Config config0 = arguments0.getConfig();
      config0.setDebug(true);
      Config config1 = arguments0.initConfig(config0);
      assertSame(config1, config0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Arguments arguments0 = new Arguments();
      boolean boolean0 = arguments0.isAST();
      assertFalse(boolean0);
  }
}
