
import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que calcula el área de un círculo");
        try {
        
        System.out.println("Ingresa el radio del círculo en metros:");
        int radio = scanner.nextInt();
        double pi = Math.PI;
        int area = (int) (pi * (radio * radio));
        System.out.println("El área del círculo es: " + area + " metros cuadrados"   );
            
        } catch (Exception e) {
             System.out.println("Error, ingresa un valor numerico");
        }
    }
}
