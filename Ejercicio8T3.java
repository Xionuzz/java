import java.util.Scanner;

public class Ejercicio8T3{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int edad;

        System.out.println("Por favor, indique su edad:");

        edad = scan.nextInt();

        System.out.println("Usted tiene " + edad*365  + " días de vida");
    }
}