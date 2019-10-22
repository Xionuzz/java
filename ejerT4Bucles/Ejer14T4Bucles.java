import java.util.Random;

public class Ejer14T4Bucles {

    public static void main(String Args[]) {

        int dado = 0;
        int contadorUno = 0;
        int contadorDos = 0;
        int contadorTres = 0;
        int contadorCuatro = 0;
        int contadorCinco = 0;
        int contadorSeis = 0;
        float resultadoUno = 0f;
        float resultadoDos = 0f;
        float resultadoTres = 0f;
        float resultadoCuatro = 0f;
        float resultadoCinco = 0f;
        float resultadoSeis = 0f;


        Random rnd = new Random();

        // Lanza el dado un millón de veces y anota los resultados.

        for(int i = 0; i <= 1000000; i++){
            dado = rnd.nextInt(6 - 1 + 1) + 1;

            switch (dado){
            case 1:
            contadorUno++;
            break;
            case 2:
            contadorDos++;
            break;
            case 3:
            contadorTres++;
            break;
            case 4:
            contadorCuatro++;
            break;
            case 5:
            contadorCinco++;
            break;
            case 6:
            contadorSeis++;
            break;
            default:
            System.out.println("Error");
            break;
                
            }
        }
        
        // Asocia las variables float para mostrar el porcentaje.

        resultadoUno = contadorUno;
        resultadoDos = contadorDos;
        resultadoTres = contadorTres;
        resultadoCuatro = contadorCuatro;
        resultadoCinco = contadorCinco;
        resultadoSeis = contadorSeis;

        // Muestra por pantalla los resultados
        
        System.out.println("/// RESULTADOS ///");
        System.out.println("Total unos: " + contadorUno);
        System.out.println("Total doses: " + contadorUno);
        System.out.println("Total treses: " + contadorTres);
        System.out.println("Total cuatros: " + contadorCuatro);
        System.out.println("Total cincos: " + contadorCinco);
        System.out.println("Total seises: " + contadorSeis);
        System.out.println("Porcentaje de unos: " + (resultadoUno / 1000000) * 100 + "%");
        System.out.println("Porcentaje de doses: " + (resultadoDos / 1000000) * 100 + "%");
        System.out.println("Porcentaje de treses: " + (resultadoTres / 1000000) * 100 + "%");
        System.out.println("Porcentaje de cuatros: " + (resultadoCuatro / 1000000) * 100 + "%");
        System.out.println("Porcentaje de cincos: " + (resultadoCinco / 1000000) * 100 + "%");
        System.out.println("Porcentaje de seises: " + (resultadoSeis / 1000000) * 100 + "%");
    }
}