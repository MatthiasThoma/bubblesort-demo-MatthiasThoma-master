import java.util.ArrayList;
import java.util.Arrays;

public class SecureHelper {

    public static int[] encrypt(String textToEncrpy, int key) {

        int[] temp = new int[textToEncrpy.length()];

        char[] charArray = textToEncrpy.toCharArray();

        for (char aChar : charArray) {

            int charValue = (int) aChar;

        }

        for (int i = 0; i < charArray.length; i++) {

            temp[i] = charArray[i] + key;

        }

        return temp;

    }


    public static char[] decrypt(int[] encodedText, int key){

        int[] clean = new int[encodedText.length];

        for (int i = 0; i < encodedText.length; i++) {

            clean[i] = encodedText[i] - key;

        }

        for (int intWert : clean) {

            char zeichen = (char) intWert;

        }

        return clean;

    }

    public static void main(String[] args) {

        String text = "Hello World";
        int key = 5;

        System.out.println((Arrays.toString(encrypt(text, key))));

        System.out.println(decrypt());
    }
}

