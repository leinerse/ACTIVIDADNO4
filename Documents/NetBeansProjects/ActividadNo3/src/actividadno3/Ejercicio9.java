package actividadno3;

/*
Realizar un programa que genere un arreglo de 50 posiciones y se rellene de con
la función ramdom de Java (los números deben ser 1 a 99), luego de llenar hacer
la impresión de la matriz.
*/
import java.util.Random;

public class Ejercicio9 {
    public static void main(String[] args) {
        // Crear un objeto Random para generar valores aleatorios
        Random random = new Random();

        // Crear un arreglo de 50 posiciones
        int[] arreglo = new int[50];

        // Llenar el arreglo con números aleatorios entre 1 y 99
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(99) + 1;
        }

        // Imprimir el arreglo
        System.out.println("Arreglo generado:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println(); // Imprimir una línea en blanco al final
    }
}