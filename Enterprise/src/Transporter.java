public class Transporter {

    public void beam(String person, String from,
                       String to, boolean urgent)
            throws TransporterMalfunctionException

    {

        System.out.println("Beaming " + person + " from " + from + " to " + to);

        if (urgent){
            if (Math.random() < 0.5){
              throw new TransporterMalfunctionException("Error on beaming " + person + " from " + from + "to " + to);
            }
        }

        System.out.println("Enjoy your stay at " + to +", " + person);

    }

    public void shutdown(){
        System.out.println("The Transporter has been shut down");
    }
}
