import java.util.Arrays;

public class BattleShipMap {


    private int[][] map = {
            {0, 0, 0, +2, 0, +1, +1, 0, 0, 0},
            {0, +3, -1, +2, 0, 0, 0, +2, 0, 0},
            {0, +3, -1, 0, +4, +4, 0, 0, +2, +2},
            {0, 0, +2, 0, 0, 0, 0, 0, 0, 0},
            {-1, 0, +2, 0, -1, +2, +2, 0, 0, 0},
            {-3, +1, 0, 0, -3, 0, -1, 0, 0, +3},
            {0, 0, 0, -3, 0, 0, 0, -1, 0, +3},
            {0, 0, -2, 0, -2, 0, -2, 0, 0, 0}
    };


    public void print() {

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(" " + map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int totalBattleshipStrenght(char player) {

        int strength = 0;

        if (player == 'a') {

            for (int[] line : map) {
                for (int element : line) {
                    if (element > 0) {
                        strength = strength + element;
                    }

                }

            }


        } else if (player == 'b') {

            for (int[] line : map) {
                for (int element : line) {
                    if (element < 0) {
                        strength = strength - element;
                    }

                }

            }
        } else
            System.out.println("Wrong choice, pls enter 'a' or 'b' for playerchoice");

        if (strength < 0)
            strength = strength * (-1);

        return strength;
    }

    public int totalCountBattleships(){

        int count = 0;


        for (int[] line : map) {
            for (int element : line) {
                if (element != 0) {
                    count++;
                }

            }

        }
        return count;
    }

    public int[] countOfShipsPerLine(){


        int nrLine = 0;
        int [] shipsPerLine = new int[map.length];

        for (int[] line : map) {
            for (int element : line) {
                if (element != 0){
                    shipsPerLine[nrLine]++;
                }

            }
            nrLine++;

        }
        return shipsPerLine;
    }

    @Override
    public String toString() {
        return "BattleShipMap{" +
                "map=" + Arrays.toString(map) +
                '}';
    }

    public double averageShipstrengthPlayerA(){

        double average = 0;
        double totalstrength = 0;
        int count = 0;

        for (int[] line : map) {
            for (int element : line) {

                if (element > 0 ){
                    totalstrength = totalstrength + element;
                    count++;
                }

            }

        }

        average = totalstrength / count;

        return average;
    }
}

