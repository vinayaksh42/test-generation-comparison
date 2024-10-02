package com.github.davidmoten.rx;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.junit.Test;

import rx.Observable;

public class SerializedTestKryo {

    @Test
    public void testKryoWriteRead() throws IOException {
        // Create some test data
        List<MyData> data = Arrays.asList(
            new MyData("a", 1),
            new MyData("b", 2),
            new MyData("c", 3)
        );
        Observable<MyData> source = Observable.from(data);

        // Create a temporary file
        File tempFile = File.createTempFile("kryoTest", ".dat");
        tempFile.deleteOnExit();

        // Use Serialized.KryoBuilder to write data to file
        Serialized.kryo().write(source, tempFile).subscribe();

        // Read data back from file
        List<MyData> readData = Serialized.kryo().read(MyData.class, tempFile)
            .toList()
            .toBlocking()
            .single();

        // Verify that read data matches original data
        assertEquals(data, readData);
    }

    private static class MyData {
        String name;
        int value;

        public MyData() {
        }

        public MyData(String name, int value) {
            this.name = name;
            this.value = value;
        }

        // Implement equals and hashCode for comparison in the test
        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof MyData)) {
                return false;
            }
            MyData other = (MyData) obj;
            return Objects.equals(name, other.name) && value == other.value;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, value);
        }
    }
}
