package menu;

import java.util.Scanner;

import ships.ships;

public class menu {
    public static void start() {
        var entrance = new Scanner(System.in);
        int option;
        do {// Impresion del menu 1
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
            option = entrance.nextInt();
            switch (option) {
                case 1:// importar lista de planetas y funciones

                    break;
                case 2:// importar lista de naves y funciones

                    break;
                case 3:// importar simulador de viaje con funciones
                    ships.Ships();
                    break;
                case 4:// Finalizacion del programa
                    System.out.println("""
                            |===========================================================|
                            |           Muchas gracias por volar con nosotros           |
                            |===========================================================|""");
                    break;
                default:
                    System.err.println("""
                            |===========================================================|
                            |            Opcion no valida, intentelo de nuevo           |
                            |===========================================================|""");
            }
        } while (option != 4);
        entrance.close();
    }
}