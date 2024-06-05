package actividadno3;
public class Ejercicio1 {
  /*
Realizar un programa que genere una matriz 5x5, inicializarla en 2 e imprimirla.
  */
        public static void main(String[] args) {
        // Crear una matriz 5x5
        int[][] matriz = new int[5][5];

        // Inicializar la matriz con el valor 2
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 2;
            }
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