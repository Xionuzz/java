import java.util.Arrays;
import java.util.Random;

public class Ejercicio24 {
    
    public static void main(String[] args) {
        
    
    public Ejercicio24(){

        int[] V = new int[50];
        int[] P = new int[50];

        fillArray(V);
        copyArray(V, P);

        System.out.print("FIRST ARRAY: ");
        System.out.println(Arrays.toString(V));
        System.out.println("");
        System.out.print("SECOND ARRAY: ");
        System.out.println(Arrays.toString(P));
        System.out.println("");

    }


    public static void fillArray(int[] V){

        Random rnd = new Random();

        for(int i = 0; i < V.length; i++){
            V[i] = rnd.nextInt(11);
        }
    }

    
    public static void copyArray(int[] V, int[] P){

        int arrayCounter = 0;

        for(int i = 0; i < V.length; i++){
            P[i] = V[i] + arrayCounter;
            arrayCounter += V[i];
        }
    }
}
