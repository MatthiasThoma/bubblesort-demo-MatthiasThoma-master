public class DivideByZero {
    public static void main(String[] args) throws Exception {

        int a = 4;
        int b = 0;

        System.out.println(divide(a, b));
        try {
            System.out.println(divide(a, b));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }finally {
            System.out.println("This is a useless Error Message");
        }
    }
    public static int divide(int a,int b) throws Exception{

        if (b == 0) {
            throw new Exception("Divide by zero not possible");
        }
        return a / b;
    }
}
