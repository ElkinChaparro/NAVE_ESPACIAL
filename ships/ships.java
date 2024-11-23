package ships;

import java.util.Scanner;

public class ships {
    public static void Ships() {
        var entrance = new Scanner(System.in);
        // menu ships 1
        System.out.println("""
                |===========================================================|
                |                   Seleccione una opcion                   |
                |===========================================================|
                |1. Armory                                                  |
                |2. Lovely                                                  |
                |3. Clansy                                                  |
                |4. Fancy                                                   |
                |5. VIP                                                     |
                |===========================================================|
                |====   """);
        int nave = entrance.nextInt();
        switch (nave) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;

            default:
                break;
        }
        entrance.close();
    }
}
