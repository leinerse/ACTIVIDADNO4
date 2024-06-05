package actividadno3;
   /*
Hacer un programa en Java que sume los siguientes 25 impares que le siguen al
número n (n es determinado por el usuario). Imprimir los 25 impares y la suma.
  */
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número n al usuario
        System.out.print("Ingrese un numero: ");
        int n = scanner.nextInt();

        // Encontrar el primer numero impar después de n
        int start = (n % 2 == 0) ? n + 1 : n + 2;

        int[] impares = new int[25];
        int suma = 0;

        // Generar los siguientes 25 numeros impares y calcular la suma
        for (int i = 0; i < 25; i++) {
            impares[i] = start + (i * 2);
            suma += impares[i];
        }

        // Imprimir los 25 numeros impares
        System.out.println("Los siguientes 25 numeros impares despues de " + n + " son:");
        for (int i = 0; i < 25; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println();

        // Imprimir la suma de los 25 numeros impares
        System.out.println("La suma de los 25 numeros impares es: " + suma);
    }
}