public class DemoFlotte {

    public static void main(String[] args) {

        Lastkraftwagen l1 = new Lastkraftwagen(3, 250, "Mercedes", 40);
        Lastkraftwagen l2 = new Lastkraftwagen(4, 150, "Volvo", 30);
        Lastkraftwagen l3 = new Lastkraftwagen(2, 350, "Mercedes", 10);
        Lastkraftwagen l4 = new Lastkraftwagen(3, 1000, "SuperMega", 100);

        ElektroAuto e1 = new ElektroAuto(2, 150, "Tesla", 10);
        ElektroAuto e2 = new ElektroAuto(2, 250, "TeslaM", 1000);
        ElektroAuto e3 = new ElektroAuto(3, 150, "Tesla", 100);
        ElektroAuto e4 = new ElektroAuto(2, 350, "TeslaS", 1000);
        ElektroAuto e5 = new ElektroAuto(4, 150, "TeslaMax", 5000);

        Auto a1 = new Auto(2, 75, "Smart", 50);
        Auto a2 = new Auto(2, 100, "Mercedes", 50);
        Auto a3 = new Auto(2, 80, "Volvo", 50);
        Auto a4 = new Auto(2, 500, "Porsche", 50);
        Auto a5 = new Auto(2, 120, "Skoda", 50);
        Auto a6 = new Auto(2, 100, "Dacia", 50);


        System.out.println(a4.anzahlAchsen);


    /*
        System.out.println("Die Durchschnittssteuer beträgt: " + );
        System.out.println("Alle Fahrzeuge: " + );
        System.out.println("Die höchste Steuer wird gezahlt für " + );
        System.out.println("Die gesamte Flotte: " + );

        
     */
    }



}
