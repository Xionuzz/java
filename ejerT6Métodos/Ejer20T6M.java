import java.util.Scanner;

public class Ejer20T6M {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        int fechaNacimiento = 0;
        int numero = 0;



        System.out.print("Introduce tu fecha de nacimiento (dd/mm/aa): ");
        fechaNacimiento = scan.nextInt();

        if (fechaNacimiento != numero) {
            System.out.print("Este no es un caracter disponible, introduce otro, por favor: ")
            fechaNacimiento = scan.nextInt();
        } else {
            System.out.print("Prosiga");
        }

        
    }
}