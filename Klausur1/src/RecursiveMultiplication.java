import java.io.FilterOutputStream;

public class RecursiveMultiplication {

    public static void main(String[] args) {
        int a = 4;
        int b = 5;

        System.out.println(a);
        System.out.println(b);

        System.out.println("Multiplication: " + multiplicate(a, b));
    }

    public static int multiplicate(int num1, int num2) {

        //System.out.println(num1);
        //System.out.println(num2);

        int result = 0;

        if (num2 != 0)
            return (num1 + multiplicate(num1, num2 - 1));
        else
            return 0;
    }

}
