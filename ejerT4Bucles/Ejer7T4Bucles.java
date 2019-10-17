import java.util.Scanner;

public class Ejer7T4Bucles{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        float base;
        int exponente;
        float resultado = 1;
        boolean exponenteNegativo = false;
        
        System.out.println("Introduzca el número base: ");
        base = scan.nextFloat();
        scan.reset();
        System.out.println("Introduzca el número exponente: ");
        exponente = scan.nextInt();
        scan.reset();
         
        if(exponente < 0){
            exponente = exponente * (-1);
            exponenteNegativo = true;
        }

        for (int i = 0; i < exponente; i++){
            resultado = resultado * base;
        }

        if (exponenteNegativo){
            resultado = 1 / resultado;
        }

        System.out.println("Resultado de la operación: " + resultado);
    }
}