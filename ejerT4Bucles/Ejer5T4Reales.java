import java.util.Scanner;

public class Ejer5T4Reales{

    public static void main(String Args[]) {
    
        String s = "";
        int color = 30;
    
    
        for(int i = 1; i <= 9; i++){
            s = s + i;
            System.out.printf("\u001B["+color+"m%9s\n",s);
            color++;
        }
    }
}