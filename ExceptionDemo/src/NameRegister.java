import java.util.ArrayList;

public class NameRegister {

    private ArrayList<String> names = new ArrayList<>();

    public void addName(String name){
        names.add((name));
    }
    public static void main(String[] args) {
        NameRegister nr = new NameRegister();
        nr.addName("Max");
    }



}
