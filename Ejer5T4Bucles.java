import java.util.Scanner;

public class Ejer5T4Bucles{

    public static void main(String[] args) {
         
        // variables para poder llevar a cabo el recuento de todos los números y sus sumas.
        int contadorPares = 0;
        int sumaPares = 0;
        int contadorImpares = 0;
        int contadorMultiplos = 0;
        int sumaImpares = 0; 
        int sumaMultiplos = 0;

        for (int i = 1; i < 101; i++){

            // if y else if para indicar que si el resto de la división entre el número (i) y 2, es 0, par, si no, impar.
            if (i % 2 == 0){
                System.out.println(i + " par");
                contadorPares++;
                // en vez de poner "sumaPares = sumaPares + i", ponemos "+="" para abreviar.
                sumaPares += i;

            } else if (i % 2 != 0){
                System.out.println(i + " impar");
                contadorImpares++;
                sumaImpares += i;
            }
            // if para mostrar los múltiplos de 5.
            if (i % 5 == 0){
                System.out.println(i + " múltiplo de 5.");
                contadorMultiplos++;
                sumaMultiplos += i;
            }
        }
        // mostramos por pantalla el total de los números y sus sumas.
        System.out.println("El total de números pares es de: " + contadorPares);
        System.out.println("La suma de todos los números pares es: " + sumaPares);
        System.out.println("El total de los números impares es de: " + contadorImpares);
        System.out.println("La suma de todos los números impares es: " + sumaImpares);
        System.out.println("El total de números múltiplos es de: " + contadorMultiplos);
        System.out.println("La suma de todos los múltiplos de 5 es: " + sumaMultiplos);
    } 
}