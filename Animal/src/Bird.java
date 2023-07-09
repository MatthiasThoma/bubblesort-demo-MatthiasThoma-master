public class Bird extends Animal implements Flyable{

        public Bird(String colour, int countEyes, String name){
            super(colour, countEyes, name);
        }

        @Override
        public void walk(){
            System.out.println("Der Vogel hüpft hin und her");
        }

        @Override
        public void makeNoise(){
            System.out.println("Piep");
        }

        @Override
        public void fly(){
            System.out.println("Der Vogel fliegt davon");
        }

}
