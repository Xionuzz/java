import java.util.Random;
import java.util.Arrays;

public class Ejercicio25 {
    public static void main(String[] args) {
        int[] V = new int[50];
        for (int i = 0;i < V.length;i++) {
            V[i] = metodoRandom();
            //invocamos 
        }
        int[] P = new int[50];
        for (int i = 0; i < P.length; i++) {
            if (V[i] % 2 == 0) {
               P[i] = V[i]; 
               //si es par
            } else {
                System.out.println("El numero de la posicion " + i + " no es par");
                // no es par
            }
        }
        System.out.println("Total V: " + Arrays.toString(V));
        System.out.println("Total P: " + Arrays.toString(P));
    }
    /*
    *
    *
    */
    
    public static int metodoRandom () {
        //ponemos int por ello ponemos return
        Random rdm = new Random();
        int numero = rdm.nextInt(100+1);
        return numero;
    }
}