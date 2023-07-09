import java.util.Arrays;

public class HighscoreDemo {

    public static void main(String[] args) {
        Highscore[] highscores = {
                new Highscore("Matthias", 100),
                new Highscore("Daniel", 99),
                new Highscore("David", 101),
                new Highscore("Lukas", 5)
        };

        System.out.println("Array before sorting = " + Arrays.toString(highscores));

        Arrays.sort(highscores);

        System.out.println("Array after sorting = " + Arrays.toString(highscores));
    }


}
