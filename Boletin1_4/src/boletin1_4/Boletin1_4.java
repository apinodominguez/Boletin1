package boletin1_4;
import java.util.Scanner;

public class Boletin1_4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        System.out.println("introduce el primer numero : ");
        float num1 = ler.nextFloat();
        System.out.println("introduce el segundo numero : ");
        float num2 = ler.nextFloat();
        System.out.println("suma = " +(num1+num2) + "\nresta = " +(num1-num2) + "\nproducto = " + num1*num2 + "\ncociente = " +num1/num2);
    }
    
}

