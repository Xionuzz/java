import java.util.Scanner;

public class Ejer17T6M {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);

        int ancho = 0;
        int alto = 0;
        String caracter = "";

        System.out.print("Introduce el ancho del rectángulo: ");
        ancho = scan.nextInt();
        scan.nextLine();
        System.out.print("Introduce el alto del rectángulo: ");
        alto = scan.nextInt();
        scan.nextLine();
        System.out.print("Introduce el carácter con el que desea imprimir el rectángulo: ");
        caracter = scan.nextLine();
        rectángulo(ancho, alto, caracter);
    }
    public static void rectángulo (int ancho, int alto, String caracter) {

        for(int i = 0; i < ancho; i++) {
            for (int j = 0; j < alto; j++) {
               System.out.print(caracter); 
            }
            System.out.println("");
        }
    }
}