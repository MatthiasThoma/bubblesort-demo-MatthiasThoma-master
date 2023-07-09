import java.util.Objects;
import java.util.Scanner;

public class Intake {

    private int number1;
    private int number2;
    private String method;

    /*

    public Intake(int number, int number1, String method) {
        this.number1 = number;
        this.number2 = number1;
        method = method;
    }*/

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Intake intake = (Intake) o;
        return number1 == intake.number1 && number2 == intake.number2 && Objects.equals(method, intake.method);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number1, number2, method);
    }

    @Override
    public String toString() {
        return "Intake{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                ", Method='" + method + '\'' +
                '}';
    }

    public void firstNumberIn(){
        System.out.println("What is the first number?");
        Scanner scan = new Scanner(System.in);

        number1 = scan.nextInt();

    }

    public void secondNumberIn(){
        System.out.println("What is the second number?");
        Scanner scan = new Scanner(System.in);

        number2 = scan.nextInt();

    }

    public String methodIn(){
        System.out.println("What do you want to do with these Numbers? " +
                "Choices are: Addition, Substraction, Mulitplication, Division, Modulo");
        Scanner scan = new Scanner(System.in);

        method = scan.next();

        if (method.equals("Addition") || method.equals("Substraction") || method.equals("Multiplication")
                ||method.equals("Division") ||method.equals("Modulo")){
            return method;
        }
        else {
            System.out.println("Wrong entry, pls start again");
            method = null;
            return method;
        }
    }

}
