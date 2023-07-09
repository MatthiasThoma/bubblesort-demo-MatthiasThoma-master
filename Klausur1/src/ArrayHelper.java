import javax.imageio.stream.ImageInputStream;
import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class ArrayHelper {

    public static void main(String[] args) {

        int maximum = 100;
        int size = 5;

        int [] test =  new int [size];

        test =createIntArray(size, maximum);

        System.out.println(Arrays.toString(test));

        System.out.println("Validation: All digits are singles: " + validateTip(test));

        for (int i = 0; i < size; i++) {

            int temp = test[i];

            System.out.println("Die Glückszahl an der Stelle " + (i+1) + " lautet: " + temp);

        }
    }

    public static int [] createIntArray(int sizeOfArray, int maxValue){

        int [] values = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            values[i] = new Random().nextInt(maxValue + 1);

        }
        return values;

    }

    public static boolean validateTip(int [] array){

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j])
                    return false;

            }

            }

        return true;

    }




}
