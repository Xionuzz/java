public class Ejer2T4Bucles{

    public static void main(String[] args) {
        
        // variables necesarias para poder llevar a cabo las sumas en el bucle
        int resultado = 0;
        int numero = 0;

        // sumamos los números comprendidos entre 1 y 1000
        while(numero < 1000){
            resultado = resultado + numero;
            numero++;
        }
        System.out.println("La suma de los mil primeros números es: " + resultado);
    }
}