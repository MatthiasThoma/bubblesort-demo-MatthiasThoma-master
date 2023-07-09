import java.util.Arrays;

public class ArraySortDemo {

    public static void main(String[] args) {
        int [] numbers = {2,4,6,8,1,3,5,7,9};
        Arrays.sort(numbers);

        for (int number : numbers){
            System.out.println(number);
        }

        char [] chars = {'a', 'c', 'e', 'g', 'i'};
        Arrays.sort(chars);
        System.out.println(chars);

        String [] names = {"max", "susi", "tobi", "luise"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

    }
}
