import java.util.Scanner;

public class Ejer7T4{

    public static void main(String[] args) {
    
        int edad; 
        int socio; 
        float cuota = 500f;
        int padresSocios;

        System.out.println("Introduzca su edad: ");

        Scanner scan = new Scanner(System.in);

        edad = scan.nextInt();

        if (edad >= 65) {
            cuota = cuota - 250;
            System.out.println("Usted tiene un descuento del 50% en la cuota por tener 65 años o más. ");
            System.out.println("Su cuota es de " + cuota + "€.");
        }
        else if (edad <= 18) {
            System.out.println("Usted es menor de edad, son sus padres socios? ");
            padresSocios = scan.nextLine();
        
            if (padresSocios= "S") {
                cuota = cuota-175;
                System.out.println("Su descuento es del 35% por ser menor de edad y que sus padres sean socios. ");
                System.out.println("Su cuota es de " + cuota + "€.");
            }

        }
    }
}