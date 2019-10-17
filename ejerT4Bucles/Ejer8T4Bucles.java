import java.util.Scanner;

public class Ejer8T4Bucles{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numero;
        long factorial = 1;

        System.out.println("Introduzca su número para factorizar: ");
        numero = scan.nextInt();

        for(int i = numero; i > 0; i--){
            factorial = factorial * i;

        }
        System.out.println("El resultado de la factorización es: " + factorial);
    }
}