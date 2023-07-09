import java.util.Objects;

public class Cat extends Animal{

    private String colour;
    private String race;

    public Cat(String name, int legs, int eyes, String name1, String race) {
        super(name, legs, eyes);
        this.colour = name1;
        this.race = race;
    }

    public String getRace() {
        return race;
    }


    public void setRace(String race) {
        this.race = race;
    }


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getNameCat(){
        return super.getName();
    }

    public int getLegsCat(){
        return super.getLegs();
    }

    public int getEyesCat(){
        return super.getEyes();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(colour, cat.colour) && Objects.equals(race, cat.race);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), colour, race);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + colour + '\'' +
                ", race='" + race + '\'' +
                '}';
    }
}
