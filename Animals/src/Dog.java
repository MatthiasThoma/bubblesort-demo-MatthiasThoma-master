import java.util.Objects;

public class Dog extends Animal{

    private String colour;
    private String race;

    public Dog(String name, int legs, int eyes, String colour, String race) {
        super(name, legs, eyes);
        this.colour = colour;
        this.race = race;
    }

    public String getNameDog(){
        return super.getName();
    }

    public int getLegsDog(){
        return super.getLegs();
    }

    public int geteyesDog(){
        return super.getEyes();
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(colour, dog.colour) && Objects.equals(race, dog.race);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), colour, race);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "colour='" + colour + '\'' +
                ", race='" + race + '\'' +
                '}';
    }


    public void bark(){
        System.out.println("Woof!");
    }
}
