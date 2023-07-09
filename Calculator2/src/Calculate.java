public class Calculate {


    public int addition(int a, int b){
        return a + b;
    }

    public int substraction(int a, int b){
        return a - b;
    }

    public int multi(int a, int b){
        return a * b;
    }

    public int divi(int a, int b){

        if (b != 0)
            return a / b;
        else {
            System.out.println("Division through 0 not allowed!");
            return 0;
        }
    }

    public int mod(int a, int b){
        return a % b;
    }

}
