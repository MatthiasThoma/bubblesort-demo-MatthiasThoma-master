import java.util.ArrayList;
import java.util.HashMap;

public class Flotte {

    ArrayList<Fahrzeug> flotte;

    public Flotte(ArrayList<Fahrzeug> flotte) {
        this.flotte = flotte;
    }

    public void add(Fahrzeug f){

        flotte.add(1, f);
    }

    public void printAll(){

        for (Fahrzeug fahrzeug : flotte) {

            System.out.println(fahrzeug.name);
        }
    }

    public double getDurchschnittssteuer(){

        int counter = 0;
        double total = 0;


        for (Fahrzeug fahrzeug : flotte) {

            total = total + fahrzeug.steuer();
            counter++;

        }

        double avTax = (total / counter);

        return avTax;
    }

    public Fahrzeug getMaximalSteuer(){

        double max = 0;
        Fahrzeug temp = (null);

        for (Fahrzeug fahrzeug : flotte) {

            if(max < fahrzeug.steuer()) {
                max = fahrzeug.steuer();
                temp = fahrzeug;
            }
        }

        return temp;
    }

    public HashMap<String, Integer> getFahrzeugeJeTyp(){

        HashMap<String, Integer> temp = new HashMap<>();

        int e = 0;
        int a = 0;
        int l = 0;


        for (Fahrzeug fahrzeug : flotte) {

            String type = getClass().getName();

            switch (type){
                case "ElektroAuto":
                    e++;
                    break;
                case "Auto":
                    a++;
                    break;
                case "Lastkraftwagen":
                    l++;
            }
        }

        temp.put("ElektroAuto", e);
        temp.put("Auto", a);
        temp.put("Lastkraftwagen", l);

        return temp;
    }


}
