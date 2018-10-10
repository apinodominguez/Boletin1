
package boletin1_5;
import java.util.Scanner;

public class Boletin1_5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float factorConversion = 1852f;
        System.out.println("introduzca las millas marinas : ");
        float millasMarinas = ler.nextFloat();
        System.out.println("seran " + (millasMarinas*factorConversion) + " metros");
        
    }
    
}
