import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap <String, Integer> age = new HashMap<>();

        age.put("Matthias", 31);
        age.put("Bianca", 23);
        age.put("Markus", 32);
        age.put("Lukas", 30);
        age.put("Josef", 22);
        age.put("Thomas", 29);
        age.put("Gerald", 41);
        age.put("Gerald", 47);
        age.put("Gerald", 44);
        age.put("Gerald", 65);
        age.put("Gerald", 4);

        System.out.println(age);
        System.out.println();

        double average = AverageAge(age);
        System.out.println("Geralds durchschnittliches Alter ist " + average);

    }
}