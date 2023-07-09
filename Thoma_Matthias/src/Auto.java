import java.util.Objects;

public class Auto extends Fahrzeug{

    int co2;

    public Auto(int anzahlAchsen, int PS, String name, int co2) {
        super(anzahlAchsen, PS, name);
        this.co2 = co2;
    }

    public int getCo2() {
        return co2;
    }

    public void setCo2(int co2) {
        this.co2 = co2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Auto auto = (Auto) o;
        return co2 == auto.co2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), co2);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "co2=" + co2 +
                ", Name='" + name + '\'' +
                ", Anzahl Achsen:" + anzahlAchsen +
                ", PS:" + PS +
                '}';
    }

    @Override
    double steuer() {

        int tax;
        int ps = getPS();
        int co = getCo2();

        tax = (ps * 15) + (co * 5);

        if (co < 100)
            tax = tax / 2;


        return tax;
    }
}
