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
    public static Integer[] Kerosene = { 80, 120, 70, 90, 200 };
    public static Integer[] O2Ability = { 400 };

    // Array to create PlanetSelected
    static List<String> PlanetNameSelected = new ArrayList<>();
    static List<Integer> PlanetDistanceSelected = new ArrayList<>();
    // Array to create ShipSelected
    static List<String> ShipNameSelected = new ArrayList<>();
    static List<Integer> ShipVelocitySelected = new ArrayList<>();
    static List<Integer> ShipCapacitySelected = new ArrayList<>();
    static List<Integer> ShipPassangersSelected = new ArrayList<>();
    static List<Integer> ShipKeroseneSelected = new ArrayList<>();
    // Array to create human charactaristics
    public static Integer[] humanRequiredOxygen = { 300 };
    // Array to create oxygen tanks
    static List<Integer> OxygenTanks = new ArrayList<>();
    static List<Integer> OxygenSelected = new ArrayList<>();
    public static Integer[] O2Capacity = { 6000 };

    public static void start() throws InterruptedException {
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
                        System.out.print(
                                """
                                        |===========================================================|
                                        |-Seleccione primero un planeta                             |
                                            """);
                    } else if (ShipNameSelected.isEmpty()) {
                        System.out.print("""
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
                        // Simulator code
                        int total = 100;
                        for (int i = 0; i <= total; i++) {
                            // Call the method to display the progress bar
                            printLoadingBar(i, total, scGame);
                            // Events
                            var random = new Random();
                            if (random.nextInt(10) == 0) { // Approximately 10% chance
                                ejecutarEventoSecundario(scGame);
                            }
                            // Simulates a process with a small delay
                            Thread.sleep(300);
                        }
                        break;
                    }
                    break;
                case 4:// credits
                    System.out.println("""
                            |===========================================================|
                            |           Muchas gracias por volar con nosotros           |
                            |===========================================================|
                            |                                                           |
                            |-----------------------Produced by: -----------------------|
                            |--------Ingeniero Elkin Humberto Chaparro Franklin---------|
                            |                                                           |
                            |===========================================================|""");
                    break;
                default:// Option error message
                    System.err.println("""
                            |===========================================================|
                            |            Opcion no valida, intentelo de nuevo           |
                            |===========================================================|""");
            }
        } while (option != 4);
        scGame.close();

    }

    // Random events
    public static void ejecutarEventoSecundario(Scanner scGame) {
        Random random = new Random();
        int secretnumber = random.nextInt(2) + 1;
        switch (secretnumber) {
            case 1:
                System.out.println("|===========================================================|");
                System.out.print("""
                        |-Tu Compañero esta muy mal herido, ¿deseas salvarlo?
                        |1. Si               -400000 (O2)
                        |2. No               +15000 (O2)
                        |===========================================================|
                        |====-""");
                var answer = scGame.nextInt();
                Integer operator01 = OxygenSelected.get(0);
                Integer operator02 = ShipPassangersSelected.get(0);
                if (answer == 1) {
                    int result = operator01 - 400000;
                    OxygenSelected.clear();
                    OxygenSelected.add(result);
                    System.out.println("|===========================================================|");
                    System.out.println("|-Oxigeno restante: " + OxygenSelected.get(0));
                    System.out.println("|===========================================================|");
                    operator01 = OxygenSelected.get(0);
                    if (operator02 == 0) {
                        System.out.println("|===========================================================|");
                        System.out.println("|-El juego ha terminado!!!! PERDISTE!!!                     |");
                        System.out.println("|===========================================================|");
                        System.out.println("|===========================================================|");
                        System.out.println("|-Personas restantes: " + ShipPassangersSelected.get(0));
                        System.out.println("|===========================================================|");
                    }
                } else {
                    int result = operator01 + 15000;
                    int result01 = operator02 - 1;
                    OxygenSelected.clear();
                    OxygenSelected.add(result);
                    ShipPassangersSelected.clear();
                    ShipPassangersSelected.add(result01);
                    System.out.println("|===========================================================|");
                    System.out.println("|-Oxigeno restante: " + OxygenSelected.get(0));
                    System.out.println("|===========================================================|");
                    System.out.println("|-Personas restantes: " + ShipPassangersSelected.get(0));
                    System.out.println("|===========================================================|");
                    operator02 = ShipPassangersSelected.get(0);
                    if (operator02 == 0) {
                        System.out.println("|===========================================================|");
                        System.out.println("|-El juego ha terminado!!!! PERDISTE!!!                     |");
                        System.out.println("|===========================================================|");
                    }
                }
                break;
            case 2:
                System.out.println("|===========================================================|");
                System.out.println("|-Falla en el motor, pierdes queroseno irremediablemente    |");
                System.out.println("|===========================================================|");
                Integer operator03 = ShipKeroseneSelected.get(0);
                int result = operator03 - 15;
                ShipKeroseneSelected.clear();
                ShipKeroseneSelected.add(result);
                System.out.println("|===========================================================|");
                System.out.println("|-Queroseno Actual: " + ShipKeroseneSelected.get(0));
                System.out.println("|===========================================================|");
                operator03 = ShipKeroseneSelected.get(0);
                if (operator03 == 0) {
                    System.out.println("|===========================================================|");
                    System.out.println("|-El juego ha terminado!!!! PERDISTE!!!                     |");
                    System.out.println("|===========================================================|");
                }
                scGame.nextLine();
                pressEnter(scGame);
                break;
        }
    }

    // Loading bar
    public static void printLoadingBar(int progress, int total, Scanner scGame) {
        int widthBar = 50; // Width of bar in characters
        int complete = (progress * widthBar) / total; // Proportion completed
        int restante = widthBar - complete; // Part not completed

        // Loading Bar Builder
        StringBuilder bar = new StringBuilder();
        bar.append("[");
        for (int i = 0; i < complete; i++) {
            bar.append("=");
        }
        for (int i = 0; i < restante; i++) {
            bar.append(" ");
        }
        bar.append("]");

        // Calculate the percentage
        int percentage = (progress * 100) / total;

        // Print the bar with the percentage
        System.out.println("\r" + bar + " " + percentage + "%");

        // End the line if progress reaches 100%
        if (progress == total) {
            System.out.println("|===========================================================|");
            System.out.println("|-----------Viaje Terminado Experiencia completada----------|");
            System.out.println("|===========================================================|");
        }
    }

    // Formulas

    private static int estimatedFlightTime() {
        var EstFlightTime = (PlanetDistanceSelected.get(0) / ShipVelocitySelected.get(0));
        System.out.println("|===========================================================|");
        System.out.println("|-El tiempo de vuelo estimado es de : " + EstFlightTime + " Horas");
        System.out.println("|===========================================================|");
        System.out.println("|-Tienes actualmente " + ShipKeroseneSelected.get(0) + " Galones de Queroseno");
        return EstFlightTime;
    }

    private static void oxygenFormula(int EstFlightTime) {
        var scGame = new Scanner(System.in);
        var Formula01 = (((humanRequiredOxygen[0] * ShipPassangersSelected.get(0)) * EstFlightTime) / O2Capacity[0]);
        var Formula02 = Formula01 * O2Capacity[0];
        System.out.println("|===========================================================|");
        System.out.println("|-Las balas de oxigeno nesesarias para el vuelo son: " + Formula01);
        System.out.println("|-Que equivalente a " + Formula02 + " Litros de O2 Totales");
        System.out.println("|-Con un consumo normal por persona de: " + humanRequiredOxygen[0] + "L/H");
        OxygenSelected.add(Formula02);
        pressEnter(scGame);
    }

    // selectors

    private static void NumberOfPassangers(Scanner scGame) {
        var question = true;
        do {
            System.out.println("|===========================================================|");
            System.out.println("|-Cantidad de pasajeros a viajar                            |");
            System.out.println("|===========================================================|");
            System.out.print("|====-");
            var numPass = scGame.nextInt();
            if (numPass > ShipCapacitySelected.get(0)) {
                System.out.println("|===========================================================|");
                System.out.println("|Supera la capacidad maxima de pasajeros                    |");

                question = true;
            } else {
                ShipPassangersSelected.add(numPass);
                question = false;
            }
        } while (question == true);
    }

    private static void Selected() {
        System.out.println("|===========================================================|");
        System.out.println("|-Planeta: " + PlanetNameSelected.get(0));
        System.out.println("|-Distancia del planeta " + PlanetDistanceSelected.get(0));
        System.out.println("|===========================================================|");
        System.out.println("|-Nave: " + ShipNameSelected.get(0));
        System.out.println("|===========================================================|");
        System.out.println("|-Velocidad maxima " + ShipVelocitySelected.get(0));
        System.out.println("|-Capacidad de pasajeros " + ShipCapacitySelected.get(0));
        System.out.println("|-Capacidad de tanques de Queroseno " + ShipKeroseneSelected.get(0));
        System.out.println("|-Capacidad de tanques de oxigeno " + O2Ability[0]);
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
        System.out.println("|-Capacidad de galones de Queroseno " + Kerosene[ships - 1]);
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
            Integer keroseneSelected = Kerosene[ships - 1];
            ShipNameSelected.add(NameSelected);
            ShipVelocitySelected.add(VelocitySelected);
            ShipCapacitySelected.add(CapacitySelected);
            ShipKeroseneSelected.add(keroseneSelected);

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
                |-Seleccione un planeta                                     |
                |===========================================================|
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
                |-Seleccione una nave                                       |
                |===========================================================|
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

    public static void pressEnter(Scanner scGame) {
        // Bufferosene breaks and cleaning
        System.out.println("""
                |===========================================================|
                |       Presione ENTER para continuar con el vuelo          |
                |===========================================================|""");
        scGame.nextLine();
    }
}