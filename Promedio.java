import java.util.InputMismatchException;
import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que calcula el promedio de un conjunto de números");
        double suma = 0; // Mover la declaración fuera del bloque try
        int cantidadNumeros = 0; // Mover la declaración fuera del bloque try

        try {
            System.out.println("¿Cuántos números deseas ingresar?");
            cantidadNumeros = scanner.nextInt();

            double[] miArreglo = new double[cantidadNumeros]; // Declarar un arreglo para almacenar los números

            System.out.println("Ingresa los números:");

            for (int i = 0; i < cantidadNumeros; i++) {
                miArreglo[i] = scanner.nextDouble(); // Leer cada número y almacenarlo en el arreglo
                suma += miArreglo[i];
            }
        } catch (InputMismatchException e) {
            System.out.println("Error, ingresa un valor numérico.");
            return; // Salir del programa si se ingresa un valor no numérico
        }

        final double promedio = suma / cantidadNumeros;

        System.out.println("El promedio es: " + promedio);
    }
}
