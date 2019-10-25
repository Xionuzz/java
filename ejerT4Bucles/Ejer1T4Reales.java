import java.util.Scanner;

public class Ejer1T4Reales{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double numeroIntroducido = 0;

        System.out.print("Escriba un número real: ");
        numeroIntroducido = scan.nextDouble();

        System.out.printf("El número introducido es: %.2f\n",numeroIntroducido);
        
    }
}