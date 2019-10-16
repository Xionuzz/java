import java.util.Scanner;

public class Ejercicio16T3 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        float euros; 
        final float VALORESTERLINA = 1.12f;
        final float VALORDOLAR = 0.91f;

        System.out.println("Introduce una cantidad de euros: ");

        euros = scan.nextFloat();

        System.out.println("El valor de euros introducido en libras esterlinas es de: " + VALORESTERLINA * euros);
        System.out.println("El valor de euros introducido en dólares es de: " + VALORDOLAR * euros);


    }


}