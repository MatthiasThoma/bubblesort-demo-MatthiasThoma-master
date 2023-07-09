import java.util.Objects;

public abstract class Fahrzeug {

    String name;
    int anzahlAchsen;
    int PS;


    public Fahrzeug(int anzahlAchsen, int PS, String name) {
        this.anzahlAchsen = anzahlAchsen;
        this.PS = PS;
        this.name = name;
    }

    public int getAnzahlAchsen() {
        return anzahlAchsen;
    }

    public void setAnzahlAchsen(int anzahlAchsen) {
        this.anzahlAchsen = anzahlAchsen;
    }

    public int getPS() {
        return PS;
    }

    public void setPS(int PS) {
        this.PS = PS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fahrzeug fahrzeug = (Fahrzeug) o;
        return anzahlAchsen == fahrzeug.anzahlAchsen && PS == fahrzeug.PS && Objects.equals(name, fahrzeug.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anzahlAchsen, PS, name);
    }

    @Override
    public String toString() {
        return "Fahrzeug{" +
                "Name: " + name +
                "Anzahl Achsen:" + anzahlAchsen +
                ", PS: " + PS +
                '}';
    }


    abstract double steuer();
}
