import java.util.Scanner;

public class Parimparcero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que determina si un número es positivo, negativo o cero.");
        
        try {
            System.out.println("Ingresa el número:");
            int numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println("El número: " + numero + " es positivo45.");
            } else if (numero < 0) {
                System.out.println("El número: " + numero + " es negativo.");
            } else {
                System.out.println("El número es cero.");
            }
        } catch (Exception e) {
            System.out.println("Error, ingresa un valor numérico.");
        }
    }
}
