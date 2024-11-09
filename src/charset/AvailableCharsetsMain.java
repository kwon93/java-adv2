package charset;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.SortedMap;

public class AvailableCharsetsMain {
    public static void main(String[] args) {
        SortedMap<String, Charset> charsets = Charset.availableCharsets();
        for (String charsetName : charsets.keySet()) {
            System.out.println("charset name: " + charsetName);
        }

        System.out.println("----");
        Charset ms949 = Charset.forName("MS949");
        System.out.println("charset name: " + ms949.getClass().getSimpleName());

        //상수로 조회
        Charset utf8 = StandardCharsets.UTF_8;
        System.out.println("charset name: " + utf8);

        Charset defaultChar = Charset.defaultCharset();
        System.out.println("defaultChar name: " + defaultChar);
    }
}
