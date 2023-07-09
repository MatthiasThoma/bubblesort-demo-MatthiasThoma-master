import java.util.Objects;

public class ElektroAuto  extends Fahrzeug{

    int kapazitaet;

    public ElektroAuto(int anzahlAchsen, int PS, String name, int kapazitaet) {
        super(anzahlAchsen, PS, name);
        this.kapazitaet = kapazitaet;
    }

    public int getKapazitaet() {
        return kapazitaet;
    }

    public void setKapazitaet(int kapazitaet) {
        this.kapazitaet = kapazitaet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ElektroAuto that = (ElektroAuto) o;
        return kapazitaet == that.kapazitaet;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), kapazitaet);
    }

    @Override
    public String toString() {
        return "ElektroAuto{" +
                "kapazitaet=" + kapazitaet +
                ", Name:'" + name + '\'' +
                ", AnzahlAchsen:" + anzahlAchsen +
                ", PS:" + PS +
                '}';
    }

    @Override
    double steuer() {

        int temp;
        double tax;
        int ps = getPS();

        if (kapazitaet < 50)
            tax = 100;
        else if (kapazitaet >= 50 && kapazitaet <100) {

            tax = kapazitaet + (ps * 10);
            if (tax > 100)
                tax = 1000;

        } else {

            tax = kapazitaet + (ps * 8.5);
            if (tax < 1200)
                tax = 1200;

        }


        return tax;
    }
}
