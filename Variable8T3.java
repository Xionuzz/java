import java.util.Scanner;

public class Variable8T3{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int edad;
        
        System.out.println("Por favor, indique su edad:");

        edad = scan.nextInt();

        int diasBisiestos = edad / 4;

        
        int diasVividos = (edad * 365) - diasBisiestos;



        System.out.println("Usted tiene: " + diasVividos + " días de vida");
        System.out.println("Usted ha vivido: " + diasBisiestos + " días bisiestos");

    }

}