import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Recap {
    public static void main(String[] args) {
        int [] numbers = {1,3,5,6,8,90,5,2,46,236,235,4};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        ArrayList<String> names = new ArrayList<>();
        names.add("Matthias");
        names.add("Lukas");
        names.add("Alex");
        names.add("Jonas");
        names.add("Hannah");
        names.add("Marvin");

        Collections.sort(names);
        System.out.println(names);


    ArrayList<Apple> apples = new ArrayList<>();

    apples.add(new Apple("red", 20));
    apples.add(new Apple("green", 15));
    apples.add(new Apple("yellow", 35));

    Collections.sort(apples);
    System.out.println(apples);
    }
}
