import java.util.Scanner;

import menu.menu;

public class ejecutable {
    public static void main(String[] args) {
        var sceject = new Scanner(System.in);
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
            pressEnter(sceject);
            // Iporte del menu
            menu.start();
            System.out.println("¿Desea Iniciar de nuevo? Y|N");
            var option = sceject.nextLine();
            playsAgain = !option.equalsIgnoreCase("n");
        } while (playsAgain);
        sceject.close();
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