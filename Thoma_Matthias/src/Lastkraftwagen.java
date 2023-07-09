import java.util.Objects;

public class Lastkraftwagen extends Fahrzeug{

    int maxTonnage;

    public Lastkraftwagen(int anzahlAchsen, int PS, String name, int maxTonnage) {
        super(anzahlAchsen, PS, name);

        this.maxTonnage = maxTonnage;
    }

    public int getMaxTonnage() {
        return maxTonnage;
    }

    public void setMaxTonnage(int maxTonnage) {
        this.maxTonnage = maxTonnage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lastkraftwagen that = (Lastkraftwagen) o;
        return maxTonnage == that.maxTonnage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxTonnage);
    }

    @Override
    public String toString() {
        return "Lastkraftwagen{" +
                "maxTonnage=" + maxTonnage +
                ", Name:'" + name + '\'' +
                ", Anzahl Achsen:" + anzahlAchsen +
                ", PS:" + PS +
                '}';
    }

    @Override
    double steuer() {

        int tax;
        int ps = getPS();

        switch (anzahlAchsen){
            case 2:
                tax = ps * (maxTonnage / 3);
                break;

            case 3:
                tax = ps * (maxTonnage / 2);
                break;

            case 4:
                tax = ps * maxTonnage;

            default:
                tax = (ps * maxTonnage) + 1000;
        }

        return tax;
    }
}
