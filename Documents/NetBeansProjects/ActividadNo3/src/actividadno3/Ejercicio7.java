package actividadno3;

/*
Dado N cantidad de precios de gaseosas en un supermercado el gerente de ventas
desea que se genere un programa que le permita saber cuál de las gaseosas tiene
el mayor precio, cuál tiene menor precio y cuál es el precio promedio. Hacer las
impresiones según lo requerido
*/
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de precios
        System.out.print("Ingrese la cantidad de precios de gaseosas: ");
        int cantidadPrecios = scanner.nextInt();

        // Validar que la cantidad de precios sea mayor que 0
        while (cantidadPrecios <= 0) {
            System.out.print("La cantidad de precios debe ser mayor que 0. Ingrese nuevamente: ");
            cantidadPrecios = scanner.nextInt();
        }

        // Inicializar variables para el máximo, mínimo y suma de precios
        double precioMaximo = Double.MIN_VALUE;
        double precioMinimo = Double.MAX_VALUE;
        double sumaPrecios = 0;

        // Leer los precios y actualizar máximo, mínimo y suma
        for (int i = 1; i <= cantidadPrecios; i++) {
            System.out.print("Ingrese el precio de la gaseosa " + i + ": ");
            double precio = scanner.nextDouble();
            
            if (precio > precioMaximo) {
                precioMaximo = precio;
            }
            
            if (precio < precioMinimo) {
                precioMinimo = precio;
            }
            
            sumaPrecios += precio;
        }

        // Calcular el precio promedio
        double precioPromedio = sumaPrecios / cantidadPrecios;

        // Imprimir los resultados
        System.out.println("El precio máximo es: " + precioMaximo);
        System.out.println("El precio mínimo es: " + precioMinimo);
        System.out.println("El precio promedio es: " + precioPromedio);
    }
}