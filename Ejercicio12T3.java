import java.util.Scanner;

public class Ejercicio12T3{

    public static void main (String args[]){;

        Scanner scan = new Scanner(System.in);
        
        int dividendo;

        int divisor; 

        System.out.println("Por favor, indique un dividendo: ");

        dividendo = scan.nextInt();

        System.out.println("Ahora, indique un divisor, por favor: ");

        divisor = scan.nextInt();

        System.out.println("El resultado de su resta es: " + (dividendo/divisor));

    }


}