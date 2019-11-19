import java.util.Scanner;

public class Ejer2T6M{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        float radio = 0f;

        System.out.print("Introduce el radio de la circunferencia: ");
        radio = scan.nextFloat();
        scan.nextLine();
        System.out.println("El área de la circunferencia es: " + area(radio));
        System.out.println("La longitud de la circunferencia es: " + longitud(radio));
    }
    public static double area ( float radio) {
        return  Math.PI * radio * radio;
    }
    public static double longitud (float radio) {
        return 2 * Math.PI * radio;
    }
}