import java.util.*;

import game.game;

public class executable {
    public static void main(String[] args) {
        var scexect = new Scanner(System.in);
        var playsAgain = false;
        do {
            // Imagen de cohete en caracteres ASCCI
            System.out.println("""
                    |===========================================================|
                    |                  Viajes Interplanetarios                  |
                    |===========================================================|
                    |   %###*******++**#%                                       |
                    |  %+========:    .:=*%                                     |
                    | %#++===+-             .+%                                 |
                    | %#+++=.   .-=++**+==:    .*%                              |
                    | %#+-    -***+=--:::+*+=    .*%                            |
                    | %*    .=**+++++==--::+*=     .*%                          |
                    | %-   .+**++++++++==-=*+.      :#%                         |
                    |  %:   :**+==++++++++*+-         -%                        |
                    |   %=   .-+**********=.            -******##%              |
                    |     %=     .:---::                 .-========*%           |
                    |       %#=.          .                .++=======#%         |
                    |           %*:              :=-:. .     :*+======+%        |
                    |               %+:           .-=--.       =**##%#*+#%      |
                    |                   %+:         ..-=-:    :*%               |
                    |                    %#*+-:        ..-=:==-=+*%             |
                    |                     %*+==++=:.    .=*--=:.:-=+#%          |
                    |                     %*+=====++*++##*=-:.....--=+*%        |
                    |                      %#+======+%    %#+=---:----++*%      |
                    |                         %#*+==+%       %*++=-----+++#%    |
                    |                              %*+%         %#*++++++++#%   |
                    |                                               %#*+++++*%  |
                    |===========================================================|""");
            pressEnter(scexect);
            // Iporte del menu
            game.start();
            //Pregunta al final del programa
            System.out.println("¿Desea Iniciar de nuevo? Y|N");
            var option = scexect.nextLine();
            playsAgain = !option.equalsIgnoreCase("n");
        } while (playsAgain);
        scexect.close();
    }

    public static void pressEnter(Scanner enter) {
        // Pausas y limpiesa de Buffer
        System.out.print("""
                |===========================================================|
                |              Presione ENTER para continuar                |
                |===========================================================|""");
        enter.nextLine();
    }
}