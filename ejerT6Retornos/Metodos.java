import java.util.Scanner;

public class Metodos {

    public static void main(String[] args) {
        
        int operador1 = 4;
        int operador2 = 5;
        int resultado = 0;
        
        resultado = sumar(operador1, operador2);
        System.out.print(resultado + "\n");
    }
    public static int sumar (int operador1, int operador2) {
        return operador1 + operador2;
    }
}