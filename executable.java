import java.util.*;

import game.game;

public class executable {
    public static void main(String[] args) throws InterruptedException {
        var scexect = new Scanner(System.in);

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