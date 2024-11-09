package charset;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static java.nio.charset.StandardCharsets.*;

public class EncodingMain1 {
    private static final Charset EUC_KR = Charset.forName("euc-kr");
    private static final Charset MS949 = Charset.forName("ms949");

    public static void main(String[] args) {
        encoding("A", US_ASCII);
        encoding("A", ISO_8859_1);
        encoding("A", EUC_KR);
        encoding("A", MS949);
        encoding("A", UTF_8);
        encoding("A", UTF_16BE);

        System.out.println("----");

        encoding("가", EUC_KR);
        encoding("가", UTF_8);
        encoding("가", US_ASCII);

    }

    private static void encoding(String text, Charset charset) {
        byte[] bytes = text.getBytes(charset);
        System.out.printf("%s -> [%s] 인코딩 -> %s %sbyte\n", text, charset, Arrays.toString(bytes), bytes.length);
    }
}
