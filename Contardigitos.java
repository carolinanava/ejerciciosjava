import java.util.Scanner;

public class Contardigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que calcula el número de dígitos en un número entero.");
        try {
            System.out.println("Ingresa el numero:");
            int numero = scanner.nextInt();
            int digitos = contarDigitos(numero);
            System.out.println("El número de dígitos en " + numero + " es: " + digitos);
        } catch (Exception e) {
            System.out.println("Error, ingresa un valor numerico");
        }
    }

    public static int contarDigitos(int numero) {
        String numeroComoCadena = Integer.toString(numero);
        int cantidadDigitos = numeroComoCadena.length();
        return cantidadDigitos;
    }
}
