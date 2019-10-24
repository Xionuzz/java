import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numeroIntroducido = 0;
        int primerNumero = 0;
        int segundoNumero = 0;
        int resultado = 0;
        boolean bucleCalculadora = true;


        System.out.println("---CALCULADORA---");
        System.out.println("Elige una opción: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Resto división");
        System.out.println("------------------");
        System.out.println("0. Salir");
        System.out.println();

        System.out.println("Introduzca el número correspondiente a la operación: ");
        numeroIntroducido = scan.nextInt();

        switch(numeroIntroducido){

            case 1:
                System.out.print("Introduzca el primer número: ");
                primerNumero = scan.nextInt();
                System.out.println("Introduzca el segundo número: ");
                segundoNumero = scan.nextInt();
                System.out.println("El resultado de la suma es: " + (resultado = primerNumero + segundoNumero));
                break;
 
            case 2:
                System.out.println("Introduzca el primer número: ");
                primerNumero = scan.nextInt();
                System.out.println("Introduzca el segundo número: ");
                break;
            case 3:
                ;
                break;
            case 4:
                ;
                break;
            case 5:
                ;
                break;
            case 0:
                ;
                break;
        
        }

    }
}