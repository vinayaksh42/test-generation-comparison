/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 18 23:41:14 GMT 2024
 */

package ru.yandex.qatools.allure.data;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.inject.AbstractModule;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import ru.yandex.qatools.allure.data.AllureGuiceModule;
import ru.yandex.qatools.allure.data.AllureReportGenerator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AllureReportGenerator_ESTest extends AllureReportGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      File[] fileArray0 = new File[0];
      AllureGuiceModule allureGuiceModule0 = new AllureGuiceModule(classLoader0, fileArray0);
      AllureReportGenerator allureReportGenerator0 = null;
      try {
        allureReportGenerator0 = new AllureReportGenerator(allureGuiceModule0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to create injector, see the following errors:
         // 
         // 1) No implementation for com.google.inject.internal.MoreTypes$GenericArrayTypeImpl@0000000756 annotated with @ru.yandex.qatools.allure.data.io.ResultDirectories() was bound.
         //   while locating com.google.inject.internal.MoreTypes$GenericArrayTypeImpl@0000000004 annotated with @ru.yandex.qatools.allure.data.io.ResultDirectories()
         //     for parameter 0 at ru.yandex.qatools.allure.data.io.TestSuiteReader.<init>(TestSuiteReader.java:26)
         //   at <evosuite>.<evosuite>(<evosuite>)
         // 
         // 2) No implementation for com.google.inject.internal.MoreTypes$ParameterizedTypeImpl@0000000805 was bound.
         //   while locating com.google.inject.internal.MoreTypes$ParameterizedTypeImpl@0000000009
         //     for parameter 0 at ru.yandex.qatools.allure.data.io.TestCaseReader.<init>(TestCaseReader.java:32)
         //   at <evosuite>.<evosuite>(<evosuite>)
         // 
         // 3) No implementation for com.google.inject.internal.MoreTypes$GenericArrayTypeImpl@0000000852 annotated with @ru.yandex.qatools.allure.data.io.ResultDirectories() was bound.
         //   while locating com.google.inject.internal.MoreTypes$GenericArrayTypeImpl@0000000014 annotated with @ru.yandex.qatools.allure.data.io.ResultDirectories()
         //     for parameter 0 at ru.yandex.qatools.allure.data.io.EnvironmentReader.<init>(EnvironmentReader.java:33)
         //   at <evosuite>.<evosuite>(<evosuite>)
         // 
         // 4) No implementation for java.lang.ClassLoader annotated with @ru.yandex.qatools.allure.data.plugins.PluginClassLoader() was bound.
         //   while locating java.lang.ClassLoader annotated with @ru.yandex.qatools.allure.data.plugins.PluginClassLoader()
         //     for parameter 0 at ru.yandex.qatools.allure.data.plugins.DefaultPluginLoader.<init>(DefaultPluginLoader.groovy:24)
         //   at <evosuite>.<evosuite>(<evosuite>)
         // 
         // 5) No implementation for com.google.inject.internal.MoreTypes$GenericArrayTypeImpl@0000001024 annotated with @ru.yandex.qatools.allure.data.io.ResultDirectories() was bound.
         //   while locating com.google.inject.internal.MoreTypes$GenericArrayTypeImpl@0000000023 annotated with @ru.yandex.qatools.allure.data.io.ResultDirectories()
         //     for parameter 0 at ru.yandex.qatools.allure.data.index.DefaultAttachmentsIndex.<init>(DefaultAttachmentsIndex.groovy:25)
         //   at <evosuite>.<evosuite>(<evosuite>)
         // 
         // 5 errors
         //
         verifyException("com.google.inject.internal.Errors", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AllureReportGenerator allureReportGenerator0 = null;
      try {
        allureReportGenerator0 = new AllureReportGenerator((AbstractModule) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // module cannot be null.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      File[] fileArray0 = new File[0];
      AllureReportGenerator allureReportGenerator0 = null;
      try {
        allureReportGenerator0 = new AllureReportGenerator(fileArray0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Unable to create injector, see the following errors:
         // 
         // 1) No implementation for com.google.inject.internal.MoreTypes$GenericArrayTypeImpl@0000000752 annotated with @ru.yandex.qatools.allure.data.io.ResultDirectories() was bound.
         //   while locating com.google.inject.internal.MoreTypes$GenericArrayTypeImpl@0000000047 annotated with @ru.yandex.qatools.allure.data.io.ResultDirectories()
         //     for parameter 0 at ru.yandex.qatools.allure.data.io.TestSuiteReader.<init>(TestSuiteReader.java:26)
         //   at <evosuite>.<evosuite>(<evosuite>)
         // 
         // 2) No implementation for com.google.inject.internal.MoreTypes$ParameterizedTypeImpl@0000000808 was bound.
         //   while locating com.google.inject.internal.MoreTypes$ParameterizedTypeImpl@0000000051
         //     for parameter 0 at ru.yandex.qatools.allure.data.io.TestCaseReader.<init>(TestCaseReader.java:32)
         //   at <evosuite>.<evosuite>(<evosuite>)
         // 
         // 3) No implementation for com.google.inject.internal.MoreTypes$GenericArrayTypeImpl@0000000855 annotated with @ru.yandex.qatools.allure.data.io.ResultDirectories() was bound.
         //   while locating com.google.inject.internal.MoreTypes$GenericArrayTypeImpl@0000000055 annotated with @ru.yandex.qatools.allure.data.io.ResultDirectories()
         //     for parameter 0 at ru.yandex.qatools.allure.data.io.EnvironmentReader.<init>(EnvironmentReader.java:33)
         //   at <evosuite>.<evosuite>(<evosuite>)
         // 
         // 4) No implementation for java.lang.ClassLoader annotated with @ru.yandex.qatools.allure.data.plugins.PluginClassLoader() was bound.
         //   while locating java.lang.ClassLoader annotated with @ru.yandex.qatools.allure.data.plugins.PluginClassLoader()
         //     for parameter 0 at ru.yandex.qatools.allure.data.plugins.DefaultPluginLoader.<init>(DefaultPluginLoader.groovy:24)
         //   at <evosuite>.<evosuite>(<evosuite>)
         // 
         // 5) No implementation for com.google.inject.internal.MoreTypes$GenericArrayTypeImpl@0000001027 annotated with @ru.yandex.qatools.allure.data.io.ResultDirectories() was bound.
         //   while locating com.google.inject.internal.MoreTypes$GenericArrayTypeImpl@0000000062 annotated with @ru.yandex.qatools.allure.data.io.ResultDirectories()
         //     for parameter 0 at ru.yandex.qatools.allure.data.index.DefaultAttachmentsIndex.<init>(DefaultAttachmentsIndex.groovy:25)
         //   at <evosuite>.<evosuite>(<evosuite>)
         // 
         // 5 errors
         //
         verifyException("com.google.inject.internal.Errors", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      File[] fileArray0 = new File[0];
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      AllureReportGenerator allureReportGenerator0 = null;
      try {
        allureReportGenerator0 = new AllureReportGenerator(classLoader0, fileArray0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Unable to create injector, see the following errors:
         // 
         // 1) No implementation for com.google.inject.internal.MoreTypes$GenericArrayTypeImpl@0000000756 annotated with @ru.yandex.qatools.allure.data.io.ResultDirectories() was bound.
         //   while locating com.google.inject.internal.MoreTypes$GenericArrayTypeImpl@0000000085 annotated with @ru.yandex.qatools.allure.data.io.ResultDirectories()
         //     for parameter 0 at ru.yandex.qatools.allure.data.io.TestSuiteReader.<init>(TestSuiteReader.java:26)
         //   at <evosuite>.<evosuite>(<evosuite>)
         // 
         // 2) No implementation for com.google.inject.internal.MoreTypes$ParameterizedTypeImpl@0000000805 was bound.
         //   while locating com.google.inject.internal.MoreTypes$ParameterizedTypeImpl@0000000089
         //     for parameter 0 at ru.yandex.qatools.allure.data.io.TestCaseReader.<init>(TestCaseReader.java:32)
         //   at <evosuite>.<evosuite>(<evosuite>)
         // 
         // 3) No implementation for com.google.inject.internal.MoreTypes$GenericArrayTypeImpl@0000000852 annotated with @ru.yandex.qatools.allure.data.io.ResultDirectories() was bound.
         //   while locating com.google.inject.internal.MoreTypes$GenericArrayTypeImpl@0000000093 annotated with @ru.yandex.qatools.allure.data.io.ResultDirectories()
         //     for parameter 0 at ru.yandex.qatools.allure.data.io.EnvironmentReader.<init>(EnvironmentReader.java:33)
         //   at <evosuite>.<evosuite>(<evosuite>)
         // 
         // 4) No implementation for java.lang.ClassLoader annotated with @ru.yandex.qatools.allure.data.plugins.PluginClassLoader() was bound.
         //   while locating java.lang.ClassLoader annotated with @ru.yandex.qatools.allure.data.plugins.PluginClassLoader()
         //     for parameter 0 at ru.yandex.qatools.allure.data.plugins.DefaultPluginLoader.<init>(DefaultPluginLoader.groovy:24)
         //   at <evosuite>.<evosuite>(<evosuite>)
         // 
         // 5) No implementation for com.google.inject.internal.MoreTypes$GenericArrayTypeImpl@0000001024 annotated with @ru.yandex.qatools.allure.data.io.ResultDirectories() was bound.
         //   while locating com.google.inject.internal.MoreTypes$GenericArrayTypeImpl@0000000100 annotated with @ru.yandex.qatools.allure.data.io.ResultDirectories()
         //     for parameter 0 at ru.yandex.qatools.allure.data.index.DefaultAttachmentsIndex.<init>(DefaultAttachmentsIndex.groovy:25)
         //   at <evosuite>.<evosuite>(<evosuite>)
         // 
         // 5 errors
         //
         verifyException("com.google.inject.internal.Errors", e);
      }
  }
}