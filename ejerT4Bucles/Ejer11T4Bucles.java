import java.util.Scanner; 

public class Ejer11T4Bucles{

    public static void main(String[] args) {
        
        //Declaración de variables.

        boolean bucleSuma = true;
        int numero = 0;
        int resultado = 0;
        int contadorMedia = 0;

        Scanner scan = new Scanner(System.in);

        /*El bucle itera pidiendo al usuario enteros hasta que se introduce un negativo
        * entonces, se detiene el bucle.*/

        while (bucleSuma){
            System.out.println("Introduce un número entero: ");
            numero = scan.nextInt();

            resultado = resultado + numero;
            contadorMedia++;

            if (numero < 0){
                bucleSuma = false;
                resultado = resultado - numero;
                contadorMedia--;
            }
        }

        //Muestra por pantalla el resultado de la suma de los números introducidos y su media.
        System.out.println("El resultado de la suma es: " + resultado);
        System.out.println("La media de los números introducidos: " + resultado / contadorMedia);
    }
}