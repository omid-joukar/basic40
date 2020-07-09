import java.nio.charset.Charset;

/**
 * Created by KPS on 7/9/2020.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("List of available character sets: ");
        for (String str : Charset.availableCharsets().keySet()) {
            System.out.println(str);
        }
    }
}
