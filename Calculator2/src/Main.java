import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number1;
        int number2;
        String method;

        Intake in = new Intake();
        Calculate calc = new Calculate();

        float result;

        char cont = 'y';

        while (cont != 'n') {

            in.firstNumberIn();
            in.secondNumberIn();
            in.methodIn();
            number1 = in.getNumber1();
            number2 = in.getNumber2();
            method = in.getMethod();


            switch (method) {
                case "Addition":
                    result = calc.addition(number1, number2);
                    System.out.println(number1 + " plus " + number2 + " equals " + result);
                    break;
                case "Substraction":
                    result = calc.substraction(number1, number2);
                    System.out.println(number1 + " minus " + number2 + " equals " + result);
                    break;
                case "Multiplikation":
                    result = calc.multi(number1, number2);
                    System.out.println(number1 + " times " + number2 + " equals " + result);
                    break;
                case "Division":
                    result = calc.divi(number1, number2);
                    System.out.println(number1 + " divided by " + number2 + " equals " + result);
                    break;
                case "Modulo":
                    result = calc.mod(number1, number2);
                    System.out.println(number1 + " modulo " + number2 + " equals " + result);
                    break;
                default:
                    System.out.println("Keine gültige Eingabe.");

            }

            System.out.println("Do you want to continue? y/n");
            Scanner scan = new Scanner(System.in);
            cont = scan.next().charAt(0);

            /*if (cont != 'y' || cont != 'n'){
                System.out.println("Wrong input, System shutting down");
                cont = 'n';
            }*/
        }
    }
}