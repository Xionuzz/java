import java.util.Scanner;

import sun.jvm.hotspot.tools.SysPropsDumper;

public class Ejer6T4Bucles{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        // variables necesarias para poder llevar a cabo el bucle.
        int numero;
        int contadorMult = 1;
        int resultado;
        boolean validado;
        
        // solicitamos al usuario un número del 1 al 10, que corresponde a una tabla de multiplicar.
        System.out.println("Introduzca un número del 1 al 10 para enseñar su respectiva tabla de multiplicar:");

        numero = scan.nextInt();

        do {
            System.out.println("Introduzca un número del 1 al 10: ");
            numero = scan.NextInt();
            validado = numero <= 10;
            
        } while (validado == true)
            System.out.println();
        if(numero > 10){

            System.out.println("Número no válido, por favor, introduce un número entre 1 y 10: ");
        }
        // inicio del bucle para llevar a cabo las tablas según el número indicado por el usuario.
        for (int i = 1; i <= 10; i++){
            
            resultado = numero * contadorMult;
            System.out.println(numero + "x" + i + "=" + resultado);
            contadorMult++;

        }
    }
}