import java.util.Scanner;

public class Ejercicio13T3{

    public static void main(String args[]){
        
        Scanner lector = new Scanner(System.in);

        int segundos;
        int minutos;
        int horas;
        int dias;
        int seg;

        System.out.println("Número de segundos: ");
        
        segundos = lector.nextInt();
        minutos = segundos / 60;
        segundos = segundos % 60;
        horas = minutos / 60;
        minutos = minutos % 60;
        dias = horas / 24;
        horas = horas % 24;
        
        System.out.println("La cantidad indicada expresada en días es de: " + dias + " días " + minutos + " minutos " + segundos + " segundos");






    }   
}