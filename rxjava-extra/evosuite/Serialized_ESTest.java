/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 02 19:47:25 GMT 2024
 */

package com.github.davidmoten.rx;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.util.DefaultStreamFactory;
import com.esotericsoftware.kryo.util.MapReferenceResolver;
import com.github.davidmoten.rx.Serialized;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.Delayed;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;
import rx.Observable;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.subjects.UnicastSubject;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Serialized_ESTest extends Serialized_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Serialized.KryoBuilder serialized_KryoBuilder0 = Serialized.kryo();
      MockFile mockFile0 = new MockFile("", "rx.internal.operators.OperatorCast");
      Class<Delayed> class0 = Delayed.class;
      Observable<Delayed> observable0 = serialized_KryoBuilder0.read(class0, (File) mockFile0, 0);
      assertNotNull(observable0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      File file0 = MockFile.createTempFile("com.google.common.cache.AbstractCache", "bx");
      Observable<Integer> observable0 = Serialized.write((Observable<Integer>) null, file0, false, 0);
      assertNotNull(observable0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Serialized serialized0 = new Serialized();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Observable<Integer> observable0 = Observable.just(integer0);
      MockFile mockFile0 = new MockFile("", "rx.internal.operators.OperatorCast");
      Observable<Integer> observable1 = Serialized.write(observable0, (File) mockFile0);
      assertFalse(observable1.equals((Object)observable0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Observable<Integer> observable0 = Serialized.read((File) mockFile0);
      assertNotNull(observable0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Observable<Integer> observable0 = Serialized.read((ObjectInputStream) null);
      assertNotNull(observable0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "com.github.davidmoten.rx.Serialized$KryoBuilder$2");
      Observable<Integer> observable0 = Serialized.read((File) mockFile0, 0);
      Action1<Object> action1_0 = (Action1<Object>) mock(Action1.class, new ViolatedAssumptionAnswer());
      Action1<Throwable> action1_1 = (Action1<Throwable>) mock(Action1.class, new ViolatedAssumptionAnswer());
      Action0 action0_0 = mock(Action0.class, new ViolatedAssumptionAnswer());
      observable0.forEach(action1_0, action1_1, action0_0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
      // Undeclared exception!
      try { 
        Serialized.write((Observable<Integer>) null, objectOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.davidmoten.rx.Serialized", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      File file0 = MockFile.createTempFile("com.google.common.cache.AbstractCache", "bx");
      MapReferenceResolver mapReferenceResolver0 = new MapReferenceResolver();
      Kryo kryo0 = new Kryo(mapReferenceResolver0);
      Serialized.KryoBuilder serialized_KryoBuilder0 = Serialized.kryo(kryo0);
      UnicastSubject<Delayed> unicastSubject0 = UnicastSubject.create(24);
      Observable<Delayed> observable0 = serialized_KryoBuilder0.write((Observable<Delayed>) unicastSubject0, file0);
      assertNotNull(observable0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Serialized.KryoBuilder serialized_KryoBuilder0 = Serialized.kryo();
      MockFile mockFile0 = new MockFile("", "rx.internal.operators.OperatorCast");
      Class<Integer> class0 = Integer.class;
      Observable<Integer> observable0 = serialized_KryoBuilder0.read(class0, (File) mockFile0);
      assertNotNull(observable0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Observable<Integer> observable0 = Observable.just(integer0);
      MockFile mockFile0 = new MockFile("", "rx.internal.operators.OperatorCast");
      Observable<Integer> observable1 = Serialized.write(observable0, (File) mockFile0, true);
      assertFalse(observable1.equals((Object)observable0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Kryo kryo0 = new Kryo();
      Serialized.KryoBuilder serialized_KryoBuilder0 = Serialized.kryo(kryo0);
      Class<Integer> class0 = Integer.class;
      DefaultStreamFactory defaultStreamFactory0 = new DefaultStreamFactory();
      byte[] byteArray0 = new byte[9];
      Input input0 = defaultStreamFactory0.getInput(byteArray0, 438, 0);
      Observable<Integer> observable0 = serialized_KryoBuilder0.read(class0, input0, 76);
      assertNotNull(observable0);
  }
}
