package com.github.davidmoten.rtree;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import org.junit.Test;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Kryo.DefaultInstantiatorStrategy;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

import com.github.davidmoten.rtree.RTree;
import com.github.davidmoten.rtree.Context;
import com.github.davidmoten.rtree.geometry.Geometries;
import com.github.davidmoten.rtree.geometry.Point;

import org.objenesis.strategy.StdInstantiatorStrategy;

public class KryoRTreeSerializationTest {

  @Test
  public void testRTreeSerialization() {
    // Create a new instance of Kryo
    Kryo kryo = new Kryo();

    // Configure Kryo to handle classes without no-arg constructors
    kryo.setInstantiatorStrategy(new DefaultInstantiatorStrategy(new StdInstantiatorStrategy()));

    // Register classes involved in serialization
    kryo.register(RTree.class);
    kryo.register(Context.class);
    // ... register other necessary classes

    // Create an RTree and add entries
    RTree<String, Point> tree = RTree.<String, Point>create()
        .add("thing", Geometries.point(10, 20))
        .add("monster", Geometries.point(23, 45));

    // Serialize the RTree to a byte array
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    Output output = new Output(outputStream);
    kryo.writeObject(output, tree);
    output.close();

    // Deserialize the RTree from the byte array
    ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
    Input input = new Input(inputStream);
    RTree<String, Point> deserializedTree = kryo.readObject(input, RTree.class);
    input.close();

    // Verify that the deserialized tree has the correct number of entries
    int entryCount = deserializedTree.entries().count().toBlocking().single();
    assertEquals("The deserialized RTree should have 2 entries", 2, entryCount);
  }
}
