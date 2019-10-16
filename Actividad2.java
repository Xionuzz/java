import java.util.Scanner;
public class Actividad2 {
    public static void main(String args[]) {
    Scanner lector = new Scanner (System.in);
    int valor;
    System.out.println("Introduce un número");
    valor = lector.nextInt();
    int divisor = 2;
    int resultado = valor % divisor;
    
    if (resultado == 0){
        System.out.println("El número es par");
    }else{
        System.out.println("El número es impar");
        }
    }
}