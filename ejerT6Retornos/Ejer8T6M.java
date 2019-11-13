import java.util.Scanner;

public class Ejer8T6M {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int primerNumero = 0;
        int segundoNumero = 0;
        int tercerNumero = 0;
        int cuartoNumero = 0;
        boolean capicua = true;

        System.out.print("Introduce el primer número: ");
        primerNumero = scan.nextInt();
        scan.nextLine();
        System.out.print("Introduce el segundo número: ");
        segundoNumero = scan.nextInt();
        System.out.print("Introduce el tercer número: ");
        tercerNumero = scan.nextInt();
        System.out.print("Introduce el cuarto número: ");
        cuartoNumero = scan.nextInt();
        system.out.print("El número formado es capicua: " + capicuacorrecto(primerNumero, segundoNumero, tercerNumero, cuartoNumero));
    }
    public static int capicuacorrecto (int primerNumero, int segundoNumero, int tercerNumero, int cuartoNumero) {
        if (primerNumero == cuartoNumero && segundoNumero == tercerNumero) {
            System.out.print("El número formado es capicua");
        } else (capicua == false)
    }
}