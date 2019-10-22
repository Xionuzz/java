import java.util.Random;

public class Ejer13T4Bucles {

    public static void main(String Args[]) {
    
        int moneda = 0;
        int cara = 0;
        int cruz = 0;
        float resultadoCara = 0f;
        float resultadoCruz = 0f;


        Random rnd = new Random();
        
        /* Lanza la moneda un millón de veces, añade un ounto a un contador cada vez
        /* que sale cara o cruz. */
        
        for(int i = 1; i <= 1000000; i++){
            moneda = rnd.nextInt(2 - 1 + 1) + 1;
            
            
            if (moneda == 1) {
                cara++;
            }
            
            else
                cruz++;
        }
        
        // Asocia los resultados a variables float para mostrar el porcentaje

        resultadoCara = cara;
        resultadoCruz = cruz;

        // Mostrar resultado por pantalla.
        
        System.out.println("/// RESULTADOS ///");
        System.out.println("Total monedas lanzadas: " + (cara+cruz));
        System.out.println("Total caras: " + cara);
        System.out.println("Total cruces: " + cruz);
        System.out.println("Porcentaje de caras: " + (resultadoCara / 1000000)  * 100 + "%");
        System.out.println("Porcentaje de cruces: " + (resultadoCruz / 1000000) * 100 + "%");
    }
}