package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TallerMecanico taller = new TallerMecanico();

        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingrese los datos del vehiculo:");
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Color: ");
            String color = scanner.nextLine();
            System.out.print("Ano: ");
            int ano = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("Motivo de Reparacion: ");
            String motivoReparacion = scanner.nextLine();

            Vehiculo vehiculo = new Vehiculo(marca, modelo, color, ano, motivoReparacion);

            System.out.print("Mano de Obra ($): ");
            double manoDeObra = scanner.nextDouble();
            System.out.print("Precio Total de Repuestos ($): ");
            double precioRepuestos = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer

            Cotizacion cotizacion = new Cotizacion(vehiculo, manoDeObra, precioRepuestos);
            taller.agregarCotizacion(cotizacion);

            System.out.print("¿Desea agregar otra cotizacion? (s/n): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        System.out.println("Cotizaciones Generadas:");
        taller.imprimirCotizaciones();

        scanner.close();
    }

    private static class TallerMecanico {

        public TallerMecanico() {
        }

        private void imprimirCotizaciones() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void agregarCotizacion(Cotizacion cotizacion) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
