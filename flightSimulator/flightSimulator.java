package flightSimulator;

import java.util.Scanner;
import spaceShips.spaceShips;
import planets.planets;

public class flightSimulator extends spaceShips{
    public static void simulator() {
        var scSimulator = new Scanner(System.in);
        if (selectedship == null) {
            System.out.println("selleccione una nave");
        }
        else {
            System.out.println("Nave seleccionada"+selectedship);
        }
    }

    public flightSimulator(Object selectedship){

    }
}
