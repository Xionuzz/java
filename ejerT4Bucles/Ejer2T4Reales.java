import java.util.Scanner;

public class Ejer2T4Reales {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double horas = 0;
        double minutos = 0;
        double segundos = 0;

        System.out.print("Introduce una hora: ");
        horas = scan.nextDouble();

        System.out.print("Introduce unos minutos: ");
        minutos = scan.nextDouble();

        System.out.print("Introduce unos segundos: ");
        segundos = scan.nextDouble();

        System.out.printf("La hora introducida es: %02d:%02d:%02d", horas, minutos, segundos);
    }
}