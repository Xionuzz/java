import java.util.Scanner;

public class Ejercicio15T3{

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        double celsius;
        double kelvin;
        double fahrenheit;

        System.out.println("Introduzca la temperatura en centígrados: ");

        celsius = lector.nextDouble();
        lector.nextLine();

        kelvin = celsius + 273.15;
        fahrenheit = celsius * (9/5) + 32;

        System.out.println(celsius + " celsius son: " + kelvin + " kelvin" + " y " + fahrenheit + " fahrenheit");
    }
}