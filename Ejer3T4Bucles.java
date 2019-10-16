import java.util.Scanner;

public class Ejer3T4Bucles{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int primerNumero;
        int numeroVeces;
        int resultado = 0;

        // Pide al usuario el número y la cantidad

        System.out.println("Introduzca el primer número para multiplicar: ");

        primerNumero = scan.nextInt();

        System.out.println("Introduzca el número de veces: ");

        numeroVeces = scan.nextInt();
        
        // Itera, sumando hasta alcanzar el producto de la multipicación.

        for (int i = 0; i < numeroVeces; i++){
            resultado = resultado + primerNumero;
        }
    
        // Muestra el resultado por pantalla.
        
        System.out.println(resultado);
        
    }
}