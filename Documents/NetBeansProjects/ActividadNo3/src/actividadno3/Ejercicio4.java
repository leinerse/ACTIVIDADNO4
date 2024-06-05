package actividadno3;

/*
Realizar una matriz 5x5, inicializarla totalmente en 1 y luego en la diagonal
trasversa colocar el número cero (0). Imprimir la matriz
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        // Crear una matriz 5x5
        int[][] matriz = new int[5][5];

        // Inicializar la matriz completamente con el valor 1
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 1;
            }
        }

        // Colocar ceros en la diagonal transversal
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][matriz.length - 1 - i] = 0;
        }

        // Imprimir la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}