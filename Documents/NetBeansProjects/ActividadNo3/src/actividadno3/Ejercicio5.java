package actividadno3;

/*
Realizar un programa que genere una matriz 5x6 y se rellene dinámicamente con
los números impares partiendo desde n (n es dada por el usuario) y se imprima.
*/
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el numero n al usuario
        System.out.print("Ingrese un numero: ");
        int n = scanner.nextInt();

        // Crear una matriz 5x6
        int[][] matriz = new int[5][6];

        // Encontrar el primer numero impar despues de (o igual a) n
        if (n % 2 == 0) {
            n++;
        }

        // Rellenar la matriz con numeros impares comenzando desde n
        int currentNumber = n;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = currentNumber;
                currentNumber += 2;
            }
        }

        // Imprimir la matriz
        System.out.println("Matriz 5x6 rellena con numeros impares partiendo desde " + n + ":");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}