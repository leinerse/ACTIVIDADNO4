package actividadno3;
    /*
  Leer N cantidad de notas (validar rango de notas), imprimir el promedio de las
  notas, la nota más alta y la más baja.
    */
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de notas al usuario
        System.out.print("Ingrese la cantidad de notas: ");
        int N = scanner.nextInt();

        // Validar que N sea un número positivo
        while (N <= 0) {
            System.out.print("La cantidad de notas debe ser un número positivo. Ingrese nuevamente: ");
            N = scanner.nextInt();
        }

        double[] notas = new double[N];
        double suma = 0;
        double notaMaxima = Double.MIN_VALUE;
        double notaMinima = Double.MAX_VALUE;

        // Leer las N notas y validar el rango de cada una
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + " (entre 0 y 10): ");
            double nota = scanner.nextDouble();

            while (nota < 0 || nota > 10) {
                System.out.print("Nota inválida. Ingrese una nota entre 0 y 10: ");
                nota = scanner.nextDouble();
            }

            notas[i] = nota;
            suma += nota;

            if (nota > notaMaxima) {
                notaMaxima = nota;
            }

            if (nota < notaMinima) {
                notaMinima = nota;
            }
        }

        // Calcular el promedio
        double promedio = suma / N;

        // Imprimir el promedio, la nota más alta y la más baja
        System.out.printf("El promedio de las notas es: %.2f\n", promedio);
        System.out.printf("La nota mas alta es: %.2f\n", notaMaxima);
        System.out.printf("La nota mas baja es: %.2f\n", notaMinima);
    }
}