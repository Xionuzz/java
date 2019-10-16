public class Ejercicio3T3{
    public static void main(String args[]){

        float precio = 85f;
        float descuento = 15f;
        float precioFinal; 
        float descuentoTotal = (precio * descuento)/100;
        precioFinal = precio - descuentoTotal;

        System.out.println(precioFinal);
       
    
    }
}