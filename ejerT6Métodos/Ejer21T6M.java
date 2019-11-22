import java.util.Scanner;
import java.util.Random;

public class Ejer21T6M {

    public static void main(String[] args) {
        
        System.out.println("----BLACKJACK----");
        menu();
    
    }

    public static int turnoJugador() {

        return 1;
    }

    public static int turnoOrdenador() {

        return 1;
    }

    public static int puntuaciones() {

        int turnoMaxima = 11;
        int partidaMaxima = 5;
        return 1;
    }

    public static void menu() {

        int introducirUsuario = 0;
        int resultadoJugador = 0;
        int puntuacionJugador = 0;
        int porrasTotales = 0;

        boolean respuesta = true;
        boolean turnoJugador = true;
        boolean turnoOrdenador = true;

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        do {
            System.out.println("1.- Lanzar dado");
            System.out.println("2.- Plantarse");
            System.out.println("3.- Ver la puntuación actual");
            introducirUsuario = scan.nextInt();
            
            switch (introducirUsuario) {

                case 1:
                puntuacionJugador = rnd.nextInt(6 - 1 + 1) + 1;
                resultadoJugador = resultadoJugador + puntuacionJugador;
                System.out.println("Has sacado un: " + puntuacionJugador);
                break;

                case 2:
                System.out.println("Te has plantado con: " + resultadoJugador);
                turnoJugador = false;
                turnoOrdenador = true;
                break;

                case 3:
                System.out.println("Tu puntuación es:");
                System.out.println("Turno actual: " + resultadoJugador);
                System.out.println("Porras totales: " + porrasTotales);
                break;

                default:
                System.out.println("Comando no válido, inténtalo otra vez.");
                break; 
            }
            
        } while (respuesta);
    }
}