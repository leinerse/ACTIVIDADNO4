package actividadno3;

/*
Generar un arreglo unidimensional de 50 posiciones que se llene con valores
aleatorios y contar la cantidad de positivos, negativos y ceros del arreglo.
*/
import java.util.Random;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Crear un objeto Random para generar valores aleatorios
        Random random = new Random();

        // Crear un arreglo unidimensional de 50 posiciones
        int[] arreglo = new int[50];

        // Contadores para positivos, negativos y ceros
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        // Llenar el arreglo con valores aleatorios y contar positivos, negativos y ceros
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(21) - 10; // Valores aleatorios entre -10 y 10

            if (arreglo[i] > 0) {
                positivos++;
            } else if (arreglo[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        // Imprimir los resultados
        System.out.println("Cantidad de numeros positivos: " + positivos);
        System.out.println("Cantidad de numeros negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
    }
}