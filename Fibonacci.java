import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que calcula una secuencia de Fibonacci");

        try {
            System.out.println("¿De cuántos números deseas que sea la secuencia?");
            int n = scanner.nextInt();

            System.out.print("Esta es la secuencia de " + n + " números:");

            for (int i = 0; i < n; i++) {
                int numero = calcularFibonacci(i);
                System.out.print(" " + numero);
            }
        } catch (InputMismatchException e) {
            System.out.println("Error, ingresa un valor numérico.");
        }
    }

    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}
