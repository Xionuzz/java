import java.util.Scanner;

public class Ejer3T6M {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;

        System.out.print("Introduce el primer número: ");
        numero1  = scan.nextInt();
        scan.nextLine();
        System.out.print("Introduce el segundo número: ");
        numero2 = scan.nextInt();
        System.out.println("El número mayor es: " + maximo(numero1, numero2));
    }
    public static int maximo (int numero1, int numero2) {
         if (numero1 > numero2 )
            return numero1;
        else 
            return numero2;
    }    
}