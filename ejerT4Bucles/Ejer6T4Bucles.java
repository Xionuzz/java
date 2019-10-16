import java.util.Scanner;

public class Ejer6T4Bucles{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        // variables necesarias para poder llevar a cabo el bucle.
        int numero;
        int contadorMult = 1;
        int resultado;

        // solicitamos al usuario un número del 1 al 10, que corresponde a una tabla de multiplicar.
        System.out.println("Introduzca un número del 1 al 10 para enseñar su respectiva tabla de multiplicar:");

        numero = scan.nextInt();

        // inicio del bucle para llevar a cabo las tablas.
        for (int i = 1; i <= 10; i++){
            
            resultado = numero * contadorMult;
            System.out.println(numero + "x" + i + "=" + resultado);
            contadorMult++;

        }
    }

}