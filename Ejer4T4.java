import java.util.Scanner;

public class Ejer4T4{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        float numeroPrimero;
        float numeroSegundo;

        System.out.println("Introduzca un número: ");
        numeroPrimero = scan.nextFloat();
        System.out.println("Introduzca un segundo número: ");
        numeroSegundo = scan.nextFloat();

        if (numeroPrimero > numeroSegundo){
            System.out.println(numeroPrimero);
            System.out.println(numeroSegundo);
        }
        else {
            System.out.println(numeroSegundo);
            System.out.println(numeroPrimero);
        }
    }
}

