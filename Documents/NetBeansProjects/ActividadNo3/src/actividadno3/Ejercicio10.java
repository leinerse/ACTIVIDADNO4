package actividadno3;

/*
Realizar un programa que genere una matriz 7x7, inicializarla la diagonal
principal con el número “0”(cero), el resto de las posiciones deben ser - (guion).
Imprimir la matriz.
*/
public class Ejercicio10 {
    public static void main(String[] args) {
        // Crear una matriz 7x7
        char[][] matriz = new char[7][7];

        // Inicializar la matriz con guiones
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = '-';
            }
        }

        // Inicializar la diagonal principal con ceros
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][i] = '0';
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
