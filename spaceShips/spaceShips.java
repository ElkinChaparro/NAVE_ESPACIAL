package spaceShips;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class spaceShips {
    public String nameShip;
    public Integer maxSpeed;
    public Integer passCap;
    public static Object selectedship;

    public static void Ships() {
        var scships = new Scanner(System.in);
        // ArrayList para crear las caracteristicas de las naves
        ArrayList<String> nameShip = new ArrayList<>(
                Arrays.asList("Armory", "Lovely", "Clansy", "Fancy", "VIP"));
        ArrayList<Integer> maxSpeed = new ArrayList<>(
                Arrays.asList(100000, 200000, 75000, 50000, 300000));
        ArrayList<Integer> passCap = new ArrayList<>(
                Arrays.asList(15, 20, 10, 25, 4));
        ArrayList<Object> selecShip = new ArrayList<>(
                Arrays.asList(Ship1(nameShip, maxSpeed, passCap), Ship2(nameShip,maxSpeed,passCap), Ship3(nameShip, maxSpeed, passCap), Ship4(nameShip, maxSpeed, passCap),Ship5(nameShip, maxSpeed, passCap)));
        // Agrupamiento de datos con clases
        spaceShips ship1 = Ship1(nameShip, maxSpeed, passCap);
        spaceShips ship2 = Ship2(nameShip, maxSpeed, passCap);
        spaceShips ship3 = Ship3(nameShip, maxSpeed, passCap);
        spaceShips ship4 = Ship4(nameShip, maxSpeed, passCap);
        spaceShips ship5 = Ship5(nameShip, maxSpeed, passCap);
        boolean selectestatus = true;
        selectedship = new Object();
        do {
            // menu ships 1
            System.out.println("""
                    |===========================================================|
                    |                Naves espaciales disponibles               |
                    |===========================================================|""");
            System.out.print("|1. ");
            System.out.print(nameShip.get(0));
            System.out.println("                                                  |");
            System.out.print("|2. ");
            System.out.print(nameShip.get(1));
            System.out.println("                                                  |");
            System.out.print("|3. ");
            System.out.print(nameShip.get(2));
            System.out.println("                                                  |");
            System.out.print("|4. ");
            System.out.print(nameShip.get(3));
            System.out.println("                                                   |");
            System.out.print("|5. ");
            System.out.print(nameShip.get(4));
            System.out.println("                                                     |");
            System.out.print("""
                    |===========================================================|
                    |====   """);
            int ships = scships.nextInt();
            switch (ships) {
                case 1:
                    System.out.println("|-Nave " + ship1.nameShip);
                    System.out.println("|-Velicidad maxima " + ship1.maxSpeed);
                    System.out.println("|-Capacidad de pasajeros " + ship1.passCap);
                    System.out.println("¿Seleccionar esta nave?");
                    System.out.println("|1. YES");
                    System.out.println("|2. Esoger otra nave");
                    Integer selec1 = scships.nextInt();
                    if (selec1 == 1) {//resolver tema de pasar nave a flight
                        System.out.println("Nave seleccionada: " + ship1.nameShip);
                        selectedship = selecShip.get(0);
                        selectestatus = true;
                        System.out.println(""+selecShip.get(0));
                    } else if (selec1 == 2) {
                        selectestatus = false;
                    }
                    break;
                case 2:
                    System.out.println("|-Nave " + ship2.nameShip);
                    System.out.println("|-Velicidad maxima " + ship2.maxSpeed);
                    System.out.println("|-Capacidad de pasajeros " + ship2.passCap);
                    System.out.println("¿Seleccionar esta nave?");
                    System.out.println("|1. YES");
                    System.out.println("|2. Esoger otra nave");
                    Integer selec2 = scships.nextInt();
                    if (selec2 == 1) {
                        System.out.println("Nave seleccionada: " + ship2.nameShip);
                        selectedship = ship2;
                        selectestatus = true;
                    } else if (selec2 == 2) {
                        selectestatus = false;
                    }
                    break;
                case 3:
                    System.out.println("|-Nave " + ship3.nameShip);
                    System.out.println("|-Velicidad maxima " + ship3.maxSpeed);
                    System.out.println("|-Capacidad de pasajeros " + ship3.passCap);
                    System.out.println("¿Seleccionar esta nave?");
                    System.out.println("|1. YES");
                    System.out.println("|2. Esoger otra nave");
                    Integer selec3 = scships.nextInt();
                    if (selec3 == 1) {
                        System.out.println("Nave seleccionada: " + ship3.nameShip);
                        selectedship = ship3;
                        selectestatus = true;
                    } else if (selec3 == 2) {
                        selectestatus = false;
                    }
                    break;
                case 4:
                    System.out.println("|-Nave " + ship4.nameShip);
                    System.out.println("|-Velicidad maxima " + ship4.maxSpeed);
                    System.out.println("|-Capacidad de pasajeros " + ship4.passCap);
                    System.out.println("¿Seleccionar esta nave?");
                    System.out.println("|1. YES");
                    System.out.println("|2. Esoger otra nave");
                    Integer selec4 = scships.nextInt();
                    if (selec4 == 1) {
                        System.out.println("Nave seleccionada: " + ship4.nameShip);
                        selectedship = ship4;
                        selectestatus = true;
                    } else if (selec4 == 2) {
                        selectestatus = false;
                    }
                    break;
                case 5:
                    System.out.println("|-Nave " + ship5.nameShip);
                    System.out.println("|-Velicidad maxima " + ship5.maxSpeed);
                    System.out.println("|-Capacidad de pasajeros " + ship5.passCap);
                    System.out.println("¿Seleccionar esta nave?");
                    System.out.println("|1. YES");
                    System.out.println("|2. Esoger otra nave");
                    Integer selec5 = scships.nextInt();
                    if (selec5 == 1) {
                        System.out.println("Nave seleccionada: " + ship5.nameShip);
                        selectedship = ship5;
                        selectestatus = true;
                    } else if (selec5 == 2) {
                        selectestatus = false;
                    }
                    break;

                default:
                    break;
            }
            // Selected(selectedship);
        } while (selectestatus == false);
    }

    /*
     * public static void Selected(Object selectedship) {
     * Object selected = selectedship;
     * }
     */

    private static spaceShips Ship5(ArrayList<String> nameShip, ArrayList<Integer> maxSpeed,
            ArrayList<Integer> passCap) {
        spaceShips ship5 = new spaceShips();
        ship5.nameShip = nameShip.get(4);
        ship5.maxSpeed = maxSpeed.get(4);
        ship5.passCap = passCap.get(4);
        return ship5;
    }

    private static spaceShips Ship4(ArrayList<String> nameShip, ArrayList<Integer> maxSpeed,
            ArrayList<Integer> passCap) {
        spaceShips ship4 = new spaceShips();
        ship4.nameShip = nameShip.get(3);
        ship4.maxSpeed = maxSpeed.get(3);
        ship4.passCap = passCap.get(3);
        return ship4;
    }

    private static spaceShips Ship3(ArrayList<String> nameShip, ArrayList<Integer> maxSpeed,
            ArrayList<Integer> passCap) {
        spaceShips ship3 = new spaceShips();
        ship3.nameShip = nameShip.get(2);
        ship3.maxSpeed = maxSpeed.get(2);
        ship3.passCap = passCap.get(2);
        return ship3;
    }

    private static spaceShips Ship2(ArrayList<String> nameShip, ArrayList<Integer> maxSpeed,
            ArrayList<Integer> passCap) {
        spaceShips ship2 = new spaceShips();
        ship2.nameShip = nameShip.get(1);
        ship2.maxSpeed = maxSpeed.get(1);
        ship2.passCap = passCap.get(1);
        return ship2;
    }

    private static spaceShips Ship1(ArrayList<String> nameShip, ArrayList<Integer> maxSpeed,
            ArrayList<Integer> passCap) {
        spaceShips ship1 = new spaceShips();
        ship1.nameShip = nameShip.get(0);
        ship1.maxSpeed = maxSpeed.get(0);
        ship1.passCap = passCap.get(0);
        return ship1;
    }

}
