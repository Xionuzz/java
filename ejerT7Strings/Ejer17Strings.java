import java.util.Scanner;

public class Ejer1T7Strings {

    public static void main(String[] args) {
        
        String frase  = "";

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        frase = scan.nextLine();

        System.out.println(cambiarLetra(frase));
    }

    public static String cambiarLetra (String frase) {

        String nuevaFrase = "";

        frase.toUpperCase();
    }
}