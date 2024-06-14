import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese los apellidos del cliente: ");
        String apellidos = scanner.nextLine();
        System.out.print("Ingrese el documento del cliente: ");
        String documento = scanner.nextLine();

        Cliente cliente = new Cliente(nombre, apellidos, documento);
        Compra compra = new Compra(cliente);
        
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese la descripcion del producto: ");
            String descripcion = scanner.nextLine();
            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            System.out.print("Ingrese la cantidad del producto: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            compra.agregarProducto(descripcion, precio, cantidad);

            System.out.print("¿Desea agregar otro producto? (s/n): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        compra.imprimirFactura();
        scanner.close();
    }
}