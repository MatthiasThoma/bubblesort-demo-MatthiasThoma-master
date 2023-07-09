public class Starship {

    private String name;
    private Transporter transporter1;

    public Starship(String name /*,Transporter transporter1*/) {
        this.name = name;
        this.transporter1 = new Transporter();
    }

    public void beamUp(String person, String from) {
        try {
            transporter1.beam(person, name, from, true);
        } catch (TransporterMalfunctionException e) {
            System.out.println("Fehler beim Beamen, schnell wieder abbrechen!!!");
            System.out.println(e.getMessage());
        } finally {
            transporter1.shutdown();
        }
    }
}
