public class Frog extends Animal{

    public Frog(String colour, int countEyes, String name){
        super(colour, countEyes, name);
    }

    @Override
    public void walk(){
        System.out.println("Der Frosch schleicht");
    }

    @Override
    public void makeNoise(){
        System.out.println("Quak");
    }

}
