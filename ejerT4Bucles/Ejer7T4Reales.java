import java.util.Scanner;

public class Ejer7T4Reales{

    public static void main(String[] args) {
        
        String s = "";
        

        for (int i = 1; i <= 9; i++){

            s = s + i;
            System.out.printf("%9s", s);
            String s2 = "";

            for (int y = s.length() - 1; y >= 0; y--){
                
                s2 = s2 + s.charAt(y);

            }
            System.out.printf("%-9s\n", s2);
        }
    }
}