import java.util.Scanner;

public class Input {

    private float first;
    private float second;

    String method;

    public Input(float first, float second) {
        this.first = first;
        this.second = second;
        this.method = method;
    }

    public float getnumber1(){
        System.out.println("What is the first number?");
        Scanner scan = new Scanner(System.in);
        first = scan.nextFloat();

        return first;
    };

    public float getnumber2(){
        System.out.println("What is the second number?");
        Scanner scan = new Scanner(System.in);
        second = scan.nextFloat();

        return second;
    };

    public String getMethod(){
        System.out.println("What do you want to do with these two numbers?");
        Scanner scan2 = new Scanner(System.in);
        method = scan2.next();

        return method;
    }




    public float getFirst() {
        return first;
    }

    public void setFirst(float first) {
        this.first = first;
    }

    public float getSecond() {
        return second;
    }

    public void setSecond(float second) {
        this.second = second;
    }

}
