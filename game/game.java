package game;

import java.util.*;

public class game {
    // Array to create ship characteristics
    public static String[] nameShip = { "Armory", "Lovely", "Clansy", "Fancy", "VIP" };
    public static Integer[] maxSpeed = { 100000, 200000, 75000, 50000, 300000 };
    public static Integer[] passCap = { 15, 20, 10, 25, 4 };
    // Array to create planets characteristics
    public static String[] namePlanet = {};
    public static String[] characterPlanets = {};

    public static void start() {
        var scGame = new Scanner(System.in);
        int option;
        Object selectedship;
        do {
            showMenu();
            option = scGame.nextInt();
            switch (option) {
                case 1:// import list of planets and functions
                    break;
                case 2:// import list of ships and functions
                    boolean selectestatus = true;
                    do {
                        // menu ships 1
                        System.out.println("""
                                |===========================================================|
                                |                Naves espaciales disponibles               |
                                |===========================================================|""");
                        System.out.print("|1. ");
                        System.out.print(nameShip[0]);
                        System.out.println("                                                  |");
                        System.out.print("|2. ");
                        System.out.print(nameShip[1]);
                        System.out.println("                                                  |");
                        System.out.print("|3. ");
                        System.out.print(nameShip[2]);
                        System.out.println("                                                  |");
                        System.out.print("|4. ");
                        System.out.print(nameShip[3]);
                        System.out.println("                                                   |");
                        System.out.print("|5. ");
                        System.out.print(nameShip[4]);
                        System.out.println("                                                     |");
                        System.out.print("""
                                |===========================================================|
                                |====   """);
                        int ships = scGame.nextInt();
                        switch (ships) {
                            case 1:
                                System.out.println("|-Nave " + nameShip[0]);
                                System.out.println("|-Velicidad maxima " + maxSpeed[0]);
                                System.out.println("|-Capacidad de pasajeros " + passCap[0]);
                                System.out.println("¿Seleccionar esta nave?");
                                System.out.println("|1. Si");
                                System.out.println("|2. Esoger otra nave");
                                Integer selec1 = scGame.nextInt();
                                if (selec1 == 1) {// resolver tema de pasar nave a flight
                                    System.out.println("Nave seleccionada: " + nameShip[0]);
                                    selectedship = nameShip;
                                    selectestatus = true;
                                } else if (selec1 == 2) {
                                    selectestatus = false;
                                }
                                break;
                            case 2:
                                System.out.println("|-Nave " + nameShip[1]);
                                System.out.println("|-Velicidad maxima " + maxSpeed[1]);
                                System.out.println("|-Capacidad de pasajeros " + passCap[1]);
                                System.out.println("¿Seleccionar esta nave?");
                                System.out.println("|1. YES");
                                System.out.println("|2. Esoger otra nave");
                                Integer selec2 = scGame.nextInt();
                                if (selec2 == 1) {
                                    System.out.println("Nave seleccionada: " + nameShip[1]);
                                    selectedship = nameShip;
                                    selectestatus = true;
                                } else if (selec2 == 2) {
                                    selectestatus = false;
                                }
                                break;
                            case 3:
                                System.out.println("|-Nave " + nameShip[2]);
                                System.out.println("|-Velicidad maxima " + maxSpeed[2]);
                                System.out.println("|-Capacidad de pasajeros " + passCap[2]);
                                System.out.println("¿Seleccionar esta nave?");
                                System.out.println("|1. YES");
                                System.out.println("|2. Esoger otra nave");
                                Integer selec3 = scGame.nextInt();
                                if (selec3 == 1) {
                                    System.out.println("Nave seleccionada: " + nameShip[2]);
                                    selectedship = nameShip;
                                    selectestatus = true;
                                } else if (selec3 == 2) {
                                    selectestatus = false;
                                }
                                break;
                            case 4:
                                System.out.println("|-Nave " + nameShip[3]);
                                System.out.println("|-Velicidad maxima " + maxSpeed[3]);
                                System.out.println("|-Capacidad de pasajeros " + passCap[3]);
                                System.out.println("¿Seleccionar esta nave?");
                                System.out.println("|1. YES");
                                System.out.println("|2. Esoger otra nave");
                                Integer selec4 = scGame.nextInt();
                                if (selec4 == 1) {
                                    System.out.println("Nave seleccionada: " + nameShip[3]);
                                    selectedship = nameShip;
                                    selectestatus = true;
                                } else if (selec4 == 2) {
                                    selectestatus = false;
                                }
                                break;
                            case 5:
                                System.out.println("|-Nave " + nameShip[4]);
                                System.out.println("|-Velicidad maxima " + maxSpeed[4]);
                                System.out.println("|-Capacidad de pasajeros " + passCap[4]);
                                System.out.println("¿Seleccionar esta nave?");
                                System.out.println("|1. YES");
                                System.out.println("|2. Esoger otra nave");
                                Integer selec5 = scGame.nextInt();
                                if (selec5 == 1) {
                                    System.out.println("Nave seleccionada: " + nameShip[4]);
                                    selectedship = nameShip;
                                    selectestatus = true;
                                } else if (selec5 == 2) {
                                    selectestatus = false;
                                }
                                break;

                            default:
                                break;
                        }
                    } while (selectestatus == false);
                    break;
                case 3:// importar simulador de viaje con funciones
                    break;
                case 4:// TODO Finalizacion del programa
                    System.out.println("""
                            |===========================================================|
                            |           Muchas gracias por volar con nosotros           |
                            |===========================================================|
                            |
                            |CREDITOS
                            |===========================================================|""");
                    break;
                default:// Mensaje de error de opcion
                    System.err.println("""
                            |===========================================================|
                            |            Opcion no valida, intentelo de nuevo           |
                            |===========================================================|""");
            }
        } while (option != 4);
        scGame.close();
    }

    private static void showMenu() {
        // Impresion del menu 1
        System.out.print("""
                |===========================================================|
                |                   Seleccione una opcion                   |
                |===========================================================|
                |1. Escoger planeta destino.                                |
                |2. Ecoger una nave espacial.                               |
                |3. Iniciar simulacion de viaje.                            |
                |4. Fin del programa.                                       |
                |===========================================================|
                |====   """);
    }

}