import java.util.Objects;

public class Apple implements Comparable<Apple>{

    private String colour;
    private int weigh;

    public Apple(String colour, int weigh) {
        this.colour = colour;
        this.weigh = weigh;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    @Override
    public int compareTo(Apple other){
        return Integer.compare(this.weigh, other.weigh);
        // Absteigend: Para in Klammern tauschen.
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return weigh == apple.weigh && Objects.equals(colour, apple.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, weigh);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "colour='" + colour + '\'' +
                ", weigh=" + weigh +
                '}';
    }
}


