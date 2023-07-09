import java.util.Arrays;
import java.util.Objects;

public class Student implements Comparable<Student>{
    public int matrNr;
    public String fistName;
    public String lastName;


    public Student(int matrNr, String fistName, String lastName) {
        this.matrNr = matrNr;
        this.fistName = fistName;
        this.lastName = lastName;
    }

    public int getMatrNr() {
        return matrNr;
    }

    public void setMatrNr(int matrNr) {
        this.matrNr = matrNr;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "matrNr=" + matrNr +
                ", fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return matrNr == student.matrNr && Objects.equals(fistName, student.fistName) && Objects.equals(lastName, student.lastName) && Arrays.equals(numbers, student.numbers) && Arrays.equals(words, student.words) && Arrays.equals(studentarry, student.studentarry);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(matrNr, fistName, lastName);
        result = 31 * result + Arrays.hashCode(numbers);
        result = 31 * result + Arrays.hashCode(words);
        result = 31 * result + Arrays.hashCode(studentarry);
        return result;
    }

    int [] numbers = {10, 12, 14, 16, 18, 20, 11, 13, 15, 17, 19};


    String [] words = {"Hallo", "dieser", "Satz", "ist", "wertlos"};

    Student[] studentarry = {
        new Student(18, "Matthias", "Thoma"),
        new Student(120, "Methusalem", "Opa"),
        new Student(20, "Dominik", "Klein"),
        new Student(19, "Jonas", "Demharter"),
        new Student(30, "Simon", "Thomas"),

    };

    @Override
    public int compareTo(Student other){
        return Integer.compare(other.matrNr, this.matrNr);
    }


}
