public abstract class Animal {
    static String colour;
    static int countEyes;
    static String name;

    public Animal() {
    }

    public static String getColour() {
        return colour;
    }

    public static void setColour(String colour) {
        Animal.colour = colour;
    }

    public static int getCountEyes() {
        return countEyes;
    }

    public static void setCountEyes(int countEyes) {
        Animal.countEyes = countEyes;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Animal.name = name;
    }

    public abstract void walk();
    public abstract void makeNoise();
}
