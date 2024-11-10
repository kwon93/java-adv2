package io.buffered;

import java.io.FileInputStream;
import java.io.IOException;

import static io.buffered.BufferedConst.BUFFER_SIZE;
import static io.buffered.BufferedConst.FILE_NAME;

public class ReadFileV2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(FILE_NAME);

        long startTime = System.currentTimeMillis();
        byte[] buffer = new byte[BUFFER_SIZE];
        int size;
        int fileSzie = 0;
        while ((size = fis.read(buffer)) != -1) {
            fileSzie += size;
        }
        fis.close();


        long endTime = System.currentTimeMillis();
        System.out.println("File name: " + FILE_NAME);
        System.out.println("File Size: " + fileSzie / 1024 / 1024 + "MB");
        System.out.println("Time take: " + (endTime - startTime) + "ms");
    }
}
