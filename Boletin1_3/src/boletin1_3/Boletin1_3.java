
package boletin1_3;
import java.util.Scanner;

public class Boletin1_3 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        float dolares = 0;
        System.out.println("teclea la cantidad en euros : ");
        float euros = ler.nextFloat();
        System.out.println("teclea el cambio de euros a dolares : ");
        float cambio = ler.nextFloat();
        System.out.println("area = " +euros*cambio);
    }
    
}
