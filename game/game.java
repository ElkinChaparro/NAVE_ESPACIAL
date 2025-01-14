package game;

import java.util.*;

public class game {
    // Array to create planets characteristics
    public static String[] namePlanet = { "Mercurio", "Venus", "Tierra", "Marte", "Júpiter", "Saturno", "Urano",
            "Neptuno" };
    public static Integer[] planetDistance = { 5800000, 10800000, 15000000, 22800000, 77800000, 140000000, 287100000,
            449500000 };
    // Array to create ship characteristics
    public static String[] nameShip = { "Armory", "Lovely", "Clansy", "Fancy", "VIP" };
    public static Integer[] maxSpeed = { 10000, 20000, 7500, 15000, 30000 };
    public static Integer[] passCap = { 15, 20, 10, 25, 4 };
    public static Integer[] O2Ability = { 300 };
    // Array to create oxygen tanks
    public static Integer[] OoxygeTanks = { 10 };
    public static Integer[] O2Capacity = { 60000 };
    // Array to create ShipSelected
    static List<String> ShipSelected = new ArrayList<>();
    // Array to create PlanetSelected
    static List<String> PlanetSelected = new ArrayList<>();

    public static void start() {
        var scGame = new Scanner(System.in);
        int option;

        do {
            showMenu();
            option = scGame.nextInt();
            switch (option) {
                case 1:// import list of planets and functions
                    boolean selectestatus1 = true;
                    do {
                        showMenuPlanets();
                        int planet = scGame.nextInt();
                        switch (planet) {
                            case 1:
                                selectestatus1 = selectPlanet(scGame, selectestatus1, planet);
                                break;
                            case 2:
                                selectestatus1 = selectPlanet(scGame, selectestatus1, planet);
                                break;
                            case 3:
                                selectestatus1 = selectPlanet(scGame, selectestatus1, planet);
                                break;
                            case 4:
                                selectestatus1 = selectPlanet(scGame, selectestatus1, planet);
                                break;
                            case 5:
                                selectestatus1 = selectPlanet(scGame, selectestatus1, planet);
                                break;
                            case 6:
                                selectestatus1 = selectPlanet(scGame, selectestatus1, planet);
                                break;
                            case 7:
                                selectestatus1 = selectPlanet(scGame, selectestatus1, planet);
                                break;
                            case 8:
                                selectestatus1 = selectPlanet(scGame, selectestatus1, planet);
                                break;
                            default:
                                System.err.println("""
                                        |===========================================================|
                                        |            Opcion no valida, intentelo de nuevo           |
                                        |===========================================================|""");
                                break;
                        }
                    } while (selectestatus1 == false);
                    break;
                case 2:// import list of ships and functions
                    boolean selectestatus2 = true;
                    do {
                        showMenuShips();
                        int ships = scGame.nextInt();
                        switch (ships) {
                            case 1:
                                selectestatus2 = selectShip(scGame, selectestatus2, ships);
                                break;
                            case 2:
                                selectestatus2 = selectShip(scGame, selectestatus2, ships);
                                break;
                            case 3:
                                selectestatus2 = selectShip(scGame, selectestatus2, ships);
                                break;
                            case 4:
                                selectestatus2 = selectShip(scGame, selectestatus2, ships);
                                break;
                            case 5:
                                selectestatus2 = selectShip(scGame, selectestatus2, ships);
                                break;
                            default:
                                System.err.println("""
                                        |===========================================================|
                                        |            Opcion no valida, intentelo de nuevo           |
                                        |===========================================================|""");
                                break;
                        }
                    } while (selectestatus2 == false);
                    break;
                case 3:// importar simulador de viaje con funciones
                       // cada pasajero consume 300 litros de oxigeno por hora
                       // a medida que avanza la barra de estado en la impresion generar un numero
                       // aleatorio y si coinciden generar un evento
                       // Imprimir barra de estado sin ln y si el porcentaje vale lo mismo que el
                       // numero aleatorio salte evento
                       // verificador de seleccion
                    if (PlanetSelected.isEmpty()) {
                        System.out.println("Seleccione primero un planeta ");
                    } else if (ShipSelected.isEmpty()) {
                        System.out.println("Seleccione primero una nave ");
                    } else {
                        //codigo simulador
                        System.out.println("sec" + PlanetSelected);
                    }
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

    private static boolean selectPlanet(Scanner scGame, boolean selectestatus1, int planet) {
        System.out.println("|===========================================================|");
        System.out.println("|-Planeta: " + namePlanet[planet - 1]);
        System.out.println("|-Distancia del planeta " + planetDistance[planet - 1]);
        System.out.print("""
                |===========================================================|
                |                 ¿Seleccionar este planeta?                |
                |===========================================================|
                |1. Claramente                                              |
                |2. Esoger otro planeta                                     |
                |===========================================================|
                |====-  """);
        Integer selec = scGame.nextInt();
        if (selec == 1) {
            System.out.println("|===========================================================|");
            System.out.println("|-Planeta seleccionado: " + namePlanet[planet - 1]);
            PlanetSelected.add(namePlanet[planet - 1]);
            selectestatus1 = true;
        } else if (selec == 2) {
            selectestatus1 = false;
        }
        return selectestatus1;
    }

    private static boolean selectShip(Scanner scGame, boolean selectestatus2, int ships) {
        System.out.println("|===========================================================|");
        System.out.println("|-Nave: " + nameShip[ships - 1]);
        System.out.println("|-Velocidad maxima " + maxSpeed[ships - 1] + "k/h");
        System.out.println("|-Capacidad de pasajeros " + passCap[ships - 1]);
        System.out.println("|-Capacidad de tanques de oxigeno " + O2Ability[0]);
        System.out.print("""
                |===========================================================|
                |                   ¿Seleccionar esta nave?                 |
                |===========================================================|
                |1. Claramente                                              |
                |2. Esoger otra nave                                        |
                |===========================================================|
                |====-  """);
        Integer selec = scGame.nextInt();
        if (selec == 1) {
            System.out.println("|===========================================================|");
            System.out.println("|-Nave seleccionada: " + nameShip[ships - 1]);
            ShipSelected.add(nameShip[ships - 1]);
            selectestatus2 = true;
        } else if (selec == 2) {
            selectestatus2 = false;
        }
        return selectestatus2;
    }

    private static void showMenuPlanets() {
        // menu ships 1
        System.out.println("""
                |===========================================================|
                |                Naves espaciales disponibles               |
                |===========================================================|""");
        System.out.print("|1. ");
        System.out.print(namePlanet[0]);
        System.out.println("                                                |");
        System.out.print("|2. ");
        System.out.print(namePlanet[1]);
        System.out.println("                                                   |");
        System.out.print("|3. ");
        System.out.print(namePlanet[2]);
        System.out.println("                                                  |");
        System.out.print("|4. ");
        System.out.print(namePlanet[3]);
        System.out.println("                                                   |");
        System.out.print("|5. ");
        System.out.print(namePlanet[4]);
        System.out.println("                                                 |");
        System.out.print("|6. ");
        System.out.print(namePlanet[5]);
        System.out.println("                                                 |");
        System.out.print("|7. ");
        System.out.print(namePlanet[6]);
        System.out.println("                                                   |");
        System.out.print("|8. ");
        System.out.print(namePlanet[7]);
        System.out.println("                                                 |");
        System.out.print("""
                |===========================================================|
                |-Seleccione un planeta
                |====-   """);
    }

    private static void showMenuShips() {
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
                |-Seleccione una nave
                |====-   """);
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
                |====-  """);
    }

}