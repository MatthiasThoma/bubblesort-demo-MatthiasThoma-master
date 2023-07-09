public class Dog extends Animal{

    public Cat(String colour, int countEyes, String name){
        super(colour, countEyes, name);
    }

    @Override
    public void walk(){
        System.out.println("Der Hund rennt");
    }

    @Override
    public void makeNoise(){
        System.out.println("Wuff");
    }
}
