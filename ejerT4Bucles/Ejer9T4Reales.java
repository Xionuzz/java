import java.util.Scanner;

public class Ejer9T4Reales{

    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);
        String ciudad = "";
        int día = 0;
        int mes = 0;
        int año = 0;
        int hora = 0;
        int minutos = 0;
        int segundos = 0;
        int viento = 0; //KM/H
        int temperatura = 0; //Celsius
        int presión = 0; //hPa
        int lluvia = 0; //en %
        int radiación = 0;
        boolean validado; 

        System.out.println("Introduzca los datos que desea analizar: ");
        do {
            System.out.print("Ciudad: ");
            ciudad = scan.nextLine();
        } while (ciudad.equals(""));

        do {
            System.out.print("Día: ");
            día = scan.nextInt();
            validado = día > 0 && día < 32;
        } while (!validado);
        
        do {
            System.out.print("Mes: ");
            mes = scan.nextInt();
            validado = mes > 0 && mes <= 12;
        } while (!validado);

        System.out.print("Año: ");
        año = scan.nextInt();

        System.out.print("Hora: ");
        hora = scan.nextInt();

        System.out.print("Minutos: ");
        minutos = scan.nextInt();
        System.out.print("Segundos: ");
        segundos = scan.nextInt();

        System.out.print("Velocidad del viento (en Km/h): ");
        viento = scan.nextInt();

        



        

        


    }
}