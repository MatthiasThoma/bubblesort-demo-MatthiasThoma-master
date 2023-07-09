import java.util.Comparator;
import java.util.Objects;

public class Students implements Comparator<Students> {

    private int matrNr;
    private String firstName;
    private String lastName;

    public Students(int matrNr, String firstName, String lastName) {
        this.matrNr = matrNr;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getMatrNr() {
        return matrNr;
    }

    public void setMatrNr(int matrNr) {
        this.matrNr = matrNr;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int compare(Students students, Students other) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return matrNr == students.matrNr && Objects.equals(firstName, students.firstName) && Objects.equals(lastName, students.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matrNr, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Students{" +
                "matrNr=" + matrNr +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
