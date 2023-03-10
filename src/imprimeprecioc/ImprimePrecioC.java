package imprimeprecioc;
import java.util.Scanner;

/**
 *
 * @author El Chistes (Kevin MR)
 *
 * Scanner 
 * Este programa calcula e imprime la cantidad de una orden de compra.
 *
 */
public class ImprimePrecioC {
    Scanner stdIn = new Scanner(System.in);
    static double precio = 0; // precio de compra del artículo
    static double cant = 0; // número de artículos comprados
    public void IMP(double precio, double cant){
         System.out.print("Precio de compra del artículo: ");
         precio = stdIn.nextDouble();
         System.out.print("Cantidad: ");
         cant = stdIn.nextDouble();
         System.out.println("Total de orden de compra = $" + precio * cant);
         
    }
    
    public static void main(String[] args) {
      ImprimePrecioC IMP = new ImprimePrecioC();
      IMP. IMP(precio,cant);
    }

}
