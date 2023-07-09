import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ListSortDemo {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(3);
        integers.add(1);
        integers.add(10);
        integers.add(5);
        integers.add(4);

     Collections.sort(integers);
        System.out.println(integers);


    ArrayList<Highscore> highscores = new ArrayList<>();
            highscores.add("Matthias", 100);
            highscores.add("Daniel", 99);
            highscores.add("David", 101);
            highscores.add("Lukas", 5);


}
}
