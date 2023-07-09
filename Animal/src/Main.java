public class Main {
    public static void main(String[] args) {

        Animal KarlOtto = new Cat("grey and white", 2, "KarlOtto");
        KarlOtto.makeNoise();
        KarlOtto.walk();

        Animal Tweety = new Bird("yellow", 2, "Tweety");
        Tweety.makeNoise();
        Tweety.walk();

        //tweety.flyable funktioniert NICHT!!!

        Flyable flyable = (Flyable) Tweety;
        flyable.fly();
    }
}