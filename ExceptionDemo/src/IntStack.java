public class IntStack {

    private int[] stack;
    private int pointer;

    public IntStack(int maxSize) {
        this.stack = new int[maxSize] ;
        this.pointer = -1;
    }

    public void push(int value){
        pointer++;
        stack[pointer] = value;
    }

    public int pop(){
        int value = stack[pointer];
        stack[pointer--] = 0;
        return value;
    }
}
