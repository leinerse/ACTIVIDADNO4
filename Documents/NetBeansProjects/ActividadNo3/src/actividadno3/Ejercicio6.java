package actividadno3;

/*
Hacer un programa en Java que cuente y sume los múltiplos de 5 y 3 (para ser
sumado debe verificarse que sea múltiplo de 5 y 3 a la vez) comprendidos entre 1
y n (n es determinado por el usuario). Imprimir la cantidad de múltiplos de 5 y 3.
*/

import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el valor de n
        System.out.print("Ingrese un numero: ");
        int n = scanner.nextInt();

        int suma = 0;
        int contador = 0;

        // Contar y sumar los multiplos de 5 y 3
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                suma += i;
                contador++;
            }
        }

        // Imprimir los resultados
        System.out.println("Cantidad de multiplos de 5 y 3 entre 1 y " + n + ": " + contador);
        System.out.println("Suma de los multiplos de 5 y 3 entre 1 y " + n + ": " + suma);
    }
}