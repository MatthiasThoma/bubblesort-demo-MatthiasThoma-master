public class Cat extends Animal{

    public Cat(String colour, int countEyes, String name){
        super(colour, countEyes, name);
    }

    @Override
    public void walk(){
        System.out.println("Die Katze schleicht");
    }

    @Override
    public void makeNoise(){
        System.out.println("Miau");
    }

}
