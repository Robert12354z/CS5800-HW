import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Ship> ships = new ArrayList<>();

        Ship ship1 = new Ship("Sunflower", "2020");
        CruiseShip ship2 = new CruiseShip("Mayflower", "2013", 200);
        CargoShip ship3 = new CargoShip("Spirit", "2011", 5015);
         ships.add(ship1);
         ships.add(ship2);
         ships.add(ship3);

         for(int i = 0; i < ships.size(); i++ ){

            System.out.println(ships.get(i));;

         }

    }
}
