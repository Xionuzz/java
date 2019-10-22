import java.util.Random;

public class Ejer13T4Bucles {

    public static void main(String Args[]) {

    int moneda = 0;
    float cara = 0;
    float cruz = 0;
    
    Random rnd = new Random();
    

    for(int i = 0; i <= 1000000; i++){
        moneda = rnd.nextInt(2 - 1 + 1) + 1;

        if (moneda == 1) {
        cara++;
        }

        else
        cruz++;
    }

    System.out.println(cara);
    System.out.println(cruz);

    System.out.println(cara / (cara + cruz) * cara);
    }
}