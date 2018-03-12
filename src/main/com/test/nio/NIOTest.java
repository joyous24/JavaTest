package com.test.nio;

import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.*;

public class NIOTest {


    public static void main(String[] args) {

        //Path path = FileSystems.getDefault().getPath("C:/","test.txt");
        //等价于
        Path filePath = Paths.get("C:/", "test.txt");

        try (SeekableByteChannel channel = Files.newByteChannel(filePath, StandardOpenOption.READ)) {

            ByteBuffer buffer = ByteBuffer.allocate(1024);
            int count;
            do {
                count = channel.read(buffer);
                if (count == -1) break;

                buffer.rewind();
                for (int i = 0; i < count; i++) {
                    System.out.print((char) buffer.get());
                }

            } while (count != -1);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
