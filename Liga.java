import java.util.Scanner;

public class Liga {
    public static void main(String[] args) {
        int opcion = 0;

        //Instancias
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        Torneo torneo = new Torneo();
        Equipo equipo = new Equipo();

        while(opcion != 4) {
            menu.ImprimirMenu();
            opcion = sc.nextInt();

            switch(opcion) {
                case 1:
                    equipo.LlenarEquipo();
                    break;
                case 2:
                    torneo.LlenarTorneoE();
                    break;
                case 3:
                    torneo.LlenarTorneo();
                    break;
                case 4:
                    torneo.Imprimir();
                    equipo.ImprimirJugadores();
                    break;
                case 5:
                    break;
            }
        }
        sc.close();
    }
    
}