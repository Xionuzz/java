import java.util.Scanner;
import java.util.Random;

public class Ejer21T6M {

    public static void main(String[] args) {
        
        System.out.println("----BLACKJACK----");

    }

    public static int turnoJugador(){


    }

    public static int turnoOrdenador(){


    }

    public static int puntuaciones(){

        int turnoMaxima = 11;
        int partidaMaxima = 5;
    }

    public static void menu(){

        int introducirUsuario = 0;
        int resultadoJugador = 0;
        int puntuacionJugador = 0;
        boolean respuesta = true;

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
                System.out.print("Has sacado un: " + puntuacionJugador);
                
                
            }
            
        } while (respuesta);
}