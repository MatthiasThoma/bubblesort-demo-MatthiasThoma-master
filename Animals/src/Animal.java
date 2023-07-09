import java.util.Objects;

public class Animal {

    private String name;
    private int legs;
    private int eyes;

    public Animal(String name, int legs, int eyes) {
        this.name = name;
        this.legs = legs;
        this.eyes = eyes;
    }

    public String getName() {
        return name;
    }

    public void setName(String colour) {
        this.name = colour;
    }


    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return legs == animal.legs && eyes == animal.eyes && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, legs, eyes);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", legs=" + legs +
                ", eyes=" + eyes +
                '}';
    }
}
