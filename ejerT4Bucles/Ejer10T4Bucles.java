import java.util.Scanner; 

public class Ejer10T4Bucles{

    public static void main(String[] args) {
        
        //Declaración de variables.

        boolean bucleSuma = true;
        int numero = 0;
        int resultado = 0;

        Scanner scan = new Scanner(System.in);

        /*El bucle itera pidiendo al usuario enteros hasta que se introduce un 0
        * entonces, se detiene el bucle.*/

        while (bucleSuma){
            System.out.println("Introduce un número entero: ");
            numero = scan.nextInt();

        
            if (numero == 0){
                bucleSuma = false;
            }
            resultado = resultado + numero;
        }

        //Muestra por pantalla el resultado de la suma de los números introducidos.
        System.out.println("El resultado de la suma es: " + resultado);
    }
}