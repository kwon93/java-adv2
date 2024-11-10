package io.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;


public class StreamStartMain3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("temp/hello.dat");
        byte[] input = {65, 66, 67, 68};
        fos.write(input);
        fos.close();

        FileInputStream fis = new FileInputStream("temp/hello.dat");
        byte[] readBytes = fis.readAllBytes(); //-1 까지 모두 읽어보기 , 너무 큰 파일의 경우 OOM 의 위험
        System.out.println(Arrays.toString(readBytes));
        fis.close();

    }
}
