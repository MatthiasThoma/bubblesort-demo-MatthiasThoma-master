public class IntStackDemo {

    public static void main(String[] args) {

        try{

            //Beginn kritischer Code

            IntStack stack = new IntStack(2);
            stack.push(1);
            int value = stack.pop();
            System.out.println(value);

            //stack.pop();
            stack.push(3);
            stack.push(4);
            stack.push(1);
        } catch (ExceptionHandler e){
            e.printStackTrace();
            System.out.println("Exception gefangen");
        }

    }
}


