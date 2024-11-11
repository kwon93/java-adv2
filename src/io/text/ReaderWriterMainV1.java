package io.text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static io.text.TextConst.FILE_NAME;
import static java.nio.charset.StandardCharsets.*;

public class ReaderWriterMainV1 {

    public static void main(String[] args) throws IOException {
        String writeString = "ABC";
        byte[] writeByte = writeString.getBytes(UTF_8);
        System.out.println("write String: " + writeString);
        System.out.println("write Byte: " + Arrays.toString(writeByte));

        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        fos.write(writeByte);
        fos.close();

        FileInputStream fis = new FileInputStream(FILE_NAME);
        byte[] bytes = fis.readAllBytes();
        fis.close();
        String s = new String(bytes, UTF_8);
        System.out.println(s);
    }
}
