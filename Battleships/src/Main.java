import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BattleShipMap bs = new BattleShipMap();

        bs.print();
        System.out.println();

        char playerchoice = 'a';

        int strength = bs.totalBattleshipStrenght('b');
        System.out.println("Player " + playerchoice + " has a strength of " + strength);
        System.out.println();

        System.out.println("The number of battleships in total are: " + bs.totalCountBattleships());

        System.out.println();

        int [] spl = bs.countOfShipsPerLine();
        System.out.println("The number of Battleships per Line are" + Arrays.toString(spl));
        System.out.println();

        System.out.println("The Average strength of ships of Player A are " + bs.averageShipstrengthPlayerA());
    }
}