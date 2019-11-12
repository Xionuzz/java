import java.util.Scanner;

public class Ejer1T6M{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int entero1 = 0;
        int entero2 = 0;


        System.out.print ("Introduzca el primer número para sumar: ");
        entero1 = scan.nextInt(); 
        scan.nextLine();
        System.out.print ("Introduzca el segundo número para sumar: ");
        entero2 = scan.nextInt();
        scan.nextLine();
        System.out.println("El resultado de la suma es: " + suma(entero1, entero2));
        }

        public static int suma (int entero1, int entero2) {
            return entero1 + entero2;

    }
}