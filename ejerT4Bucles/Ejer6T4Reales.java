import java.util.Scanner;

public class Ejer6T4Reales{

    public static void main(String[] args) {
        
        String s = "";

        for (int i = 1; i <= 9; i++){

            s = s + i;
            System.out.printf("%9s", s);
            System.out.printf("%1s\n", s);
        }
    }
}