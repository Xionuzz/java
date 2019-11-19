import java.util.Scanner;

public class Ejer4T6M {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int numero4 = 0;
        double maximo1 = 0;
        double maximo2 = 0;
        

        System.out.print("Introduce el primer número: ");
        numero1  = scan.nextInt();
        scan.nextLine();
        System.out.print("Introduce el segundo número: ");
        numero2 = scan.nextInt();
        System.out.print("Introduce el tercer número: ");
        numero3 = scan.nextInt();
        System.out.print("Introduce el cuarto número: ");
        numero4 = scan.nextInt();
        

        System.out.println("El número mayor es: ");
    }
    public static int maximo (int numero1, int numero2) {

        if (numero1 > numero2)
            return numero1;
        else 
            return numero2; 
    }
    
}