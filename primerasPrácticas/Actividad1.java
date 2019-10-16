import java.util.Scanner;
public class Actividad1 {
        public static void main(String args []) {
            int x;
            int y;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        x = lector.nextInt();
        System.out.println("Introduce el segundo número");
        y = lector.nextInt();
        int z = x + y;
        System.out.println("El resultado es: " + z);
    
    }
}
