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
    public static Integer[] O2Ability = { 250 };

    // Array to create PlanetSelected
    static List<String> PlanetNameSelected = new ArrayList<>();
    static List<Integer> PlanetDistanceSelected = new ArrayList<>();
    // Array to create ShipSelected
    static List<String> ShipNameSelected = new ArrayList<>();
    static List<Integer> ShipVelocitySelected = new ArrayList<>();
    static List<Integer> ShipCapacitySelected = new ArrayList<>();
    static List<Integer> ShipPassangersSelected = new ArrayList<>();
    // Array to create human charactaristics
    public static Integer[] humanRequiredOxygen = { 300 };
    // Array to create oxygen tanks
    static List<Integer> OoxygeTanks = new ArrayList<>();
    public static Integer[] O2Capacity = { 6000 };

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
                case 3:// import travel simulator with functions
                       // Ship and planet selection checker
                    if (PlanetNameSelected.isEmpty()) {
                        System.out.println("""
                                |===========================================================|
                                |-Seleccione primero un planeta                             |
                                    """);
                    } else if (ShipNameSelected.isEmpty()) {
                        System.out.println("""
                                |===========================================================|
                                |-Seleccione primero una nave                               |
                                    """);
                    } else {
                        // Ship and planet selected
                        Selected();
                        // Estimated flight time
                        var EstFlightTime = estimatedFlightTime();
                        // Number of passengers
                        NumberOfPassangers(scGame);
                        // Required oxygen
                        oxygenFormula(EstFlightTime);
                        // codigo simulador
                        // a medida que avanza la barra de estado en la impresion generar un numero
                        // aleatorio y si coinciden generar un evento
                        // Imprimir barra de estado sin ln y si el porcentaje vale lo mismo que el
                        // numero aleatorio salte evento
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

    // Formulas
    private static int estimatedFlightTime() {
        var EstFlightTime = (PlanetDistanceSelected.get(0) / ShipVelocitySelected.get(0));
        System.out.println("|-El tiempo de vuelo estimado es de : " + EstFlightTime + " Horas");
        return EstFlightTime;
    }

    private static void oxygenFormula(int EstFlightTime) {
        var Formula01 = (((humanRequiredOxygen[0] * ShipPassangersSelected.get(0)) * EstFlightTime) / O2Capacity[0]);
        System.out.println("|-Las balas de oxigeno nesesarias para el vuelo son: " + Formula01);
        System.out.println("|-Que equivalente a " + Formula01 * O2Capacity[0] + " Litros de O2 Totales");
        System.out.println("|- Con un consumo normal por persona de: " + humanRequiredOxygen[0] + "L/H");
    }

    // selectors

    private static void NumberOfPassangers(Scanner scGame) {
        var question = true;
        do {
            System.out.println("Cantidad de pasajeros a viajar");
            var numPass = scGame.nextInt();
            if (numPass > ShipCapacitySelected.get(0)) {
                System.out.println("Supera la capacidad maxima de pasajeros");
                question = true;
            } else {
                ShipPassangersSelected.add(numPass);
                question = false;
            }
        } while (question == true);
    }

    private static void Selected() {
        System.out.println("|===========================================================|");
        System.out.println("|-Planeta: " + PlanetNameSelected);
        System.out.println("|-Distancia del planeta " + PlanetDistanceSelected);
        System.out.println("|===========================================================|");
        System.out.println("|-Nave: " + ShipNameSelected);
        System.out.println("|-Velocidad maxima " + ShipVelocitySelected);
        System.out.println("|-Capacidad de pasajeros " + ShipCapacitySelected);
        System.out.println("|-Capacidad de tanques de oxigeno " + O2Ability[0]);
        System.out.println("|===========================================================|");
    }

    private static boolean selectPlanet(Scanner scGame, boolean selectestatus1, int planet) {
        // impression of the planet's features
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
            // Adds new features to the array
            String planetSelected = namePlanet[planet - 1];
            Integer DistanceSelected = planetDistance[planet - 1];
            PlanetNameSelected.add(planetSelected);
            PlanetDistanceSelected.add(DistanceSelected);

            selectestatus1 = true;
        } else if (selec == 2) {
            selectestatus1 = false;
        }
        return selectestatus1;
    }

    private static boolean selectShip(Scanner scGame, boolean selectestatus2, int ships) {
        // impression of the ship's features
        System.out.println("|===========================================================|");
        System.out.println("|-Nave: " + nameShip[ships - 1]);
        System.out.println("|-Velocidad maxima " + maxSpeed[ships - 1] + " k/h");
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
            // Adds new features to the array
            String NameSelected = nameShip[ships - 1];
            Integer VelocitySelected = maxSpeed[ships - 1];
            Integer CapacitySelected = passCap[ships - 1];
            ShipNameSelected.add(NameSelected);
            ShipVelocitySelected.add(VelocitySelected);
            ShipCapacitySelected.add(CapacitySelected);

            selectestatus2 = true;
        } else if (selec == 2) {
            selectestatus2 = false;
        }
        return selectestatus2;
    }

    // PrintMenu's

    private static void showMenuPlanets() {
        // menu planets 1
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
        // Print menu 1
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