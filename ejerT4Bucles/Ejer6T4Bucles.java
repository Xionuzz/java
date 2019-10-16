import java.util.Scanner;

public class Ejer6T4Bucles{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numero;
        int contadorMult = 1;
        int resultado;

        System.out.println("Introduzca un número del 1 al 10 para enseñar su respectiva tabla de multiplicar:");

        numero = scan.nextInt();

        for (int i = 1; i <= 10; i++){
            
            resultado = numero * contadorMult;

            System.out.println(numero + "x" + i + "=" + resultado);
            contadorMult++;

        }
    }

}