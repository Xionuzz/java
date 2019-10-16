import java.util.Scanner;
public class Ejercicio14T3{
     
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double radio;
        double longitud;
        double area;
        final float PI = 3.141559f;

        System.out.println("Ingresa el radio de la circunferencia: ");
        radio = lector.nextDouble();
        lector.nextLine();

        longitud = 2 * PI * radio;
        area = PI * radio * 2;
        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El aŕea de la circunferencia es: " + area);


    }
}
