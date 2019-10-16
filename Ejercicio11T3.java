import java.util.Scanner;

public class Ejercicio11T3{

    public static void main (String args[]){;

        Scanner scan = new Scanner(System.in);
        
        int minuendo;

        int sustraendo; 

        System.out.println("Por favor, indique un minuendo: ");

        minuendo = scan.nextInt();

        System.out.println("Ahora, indique un sustraendo, por favor: ");

        sustraendo = scan.nextInt();

        System.out.println("El resultado de su resta es: " + (minuendo-sustraendo));

    }


}