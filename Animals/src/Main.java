import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 4, 2, "brown","Schäferhund");
        Dog dog2 = new Dog("Winston", 4,1, "white", "Mops");
        Dog dog3 = new Dog("Karl", 4,2, "red", "Fox");
        Dog dog4 = new Dog("Stuart", 3,2, "black", "Labrador");
        Dog dog5 = new Dog("Elisabeth", 4,2, "white", "Shepperd");
        Dog dog6 = new Dog("Lisa", 4,0, "brown", "Labrador");

        Cat cat = new Cat("Karli", 4, 2, "white", "EK");
        Cat cat1 = new Cat("Franz", 4 ,2,"brown", "EK");
        Cat cat2 = new Cat("Mauzi", 3 ,2,"Red", "No Idea");
        Cat cat3 = new Cat("Shadow", 4 ,1,"black", "Main Coon");
        Cat cat4 = new Cat("Franz", 3 ,2,"white", "EK");



        HashMap<String, String> theGang = new HashMap<>();

        theGang.put("leader",dog.getNameDog());
        theGang.put("lt",dog5.getNameDog());
        theGang.put("sgt",dog3.getNameDog());
        theGang.put("grunt1",dog4.getNameDog());
        theGang.put("grunt3",dog2.getNameDog());
        theGang.put("grunt4",dog6.getNameDog());

        System.out.println(cat2);

        System.out.println(dog2);

        System.out.println("The Gang consists of " + theGang);
    }

}