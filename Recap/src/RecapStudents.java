import java.util.ArrayList;
import java.util.Comparator;

public class RecapStudents {

    public static void main(String[] args) {
        ArrayList<Students> students = new ArrayList<>();

        students.add(new Students(3, "Matthias", "Thoma"));
        students.add(new Students(4, "Lukas", "Hollmann"));
        students.add(new Students(12, "Jonas", "Wollnik"));
        students.add(new Students(1, "Alex", "Feldkirchner"));
        students.add(new Students(2, "Fabian", "Thoma"));

        students.sort(new Comparator<Students>() {
            @Override
            public int compare(Students students, Students other) {
                return other.getLastName().compareTo(students.getLastName());
            }

        });

        System.out.println(students);

        //Sortierung nach Vornahme aufsteigend

        students.sort(Comparator.comparing(Students::getFirstName));

        // Sortieren nach Nachnahmen aufsteigend dann nach Vornahmen aufsteigend
        students.sort(Comparator.comparing(Students::getLastName)
                .thenComparing(Students::getFirstName));

        students.sort(
                (student, other) -> student.getLastName().compareTo(other.getLastName()));

    }

}

