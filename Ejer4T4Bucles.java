public class Ejer4T4Bucles{

    public static void main(String[] args) {

        // vairable que nos permite mostrar el número de impares que hay.
        int contador = 0;

        // un for para crear un bucle que nos enseñe los números impares comprendidos entre el 1 y el 100.
        for (int i = 1; i < 101; i++){

            // dentro del for, un if para poder mostrar por pantalla el total de números impares.
            if (i % 2 != 0){
                contador++;
                System.out.println(i);
            }
        }
        System.out.println("El número total de impares que se encuentran \ncomprendidos entre el 1 y el 100 son: " + contador);
    }

}