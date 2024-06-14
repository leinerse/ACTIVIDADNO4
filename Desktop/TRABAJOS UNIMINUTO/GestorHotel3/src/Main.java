
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();

        // Agregar algunas habitaciones para ejemplo
        hotel.agregarHabitacion(new Habitacion(101, "Sencilla", 100.0));
        hotel.agregarHabitacion(new Habitacion(102, "Doble", 150.0));
        hotel.agregarHabitacion(new Habitacion(103, "Suite", 200.0));

        boolean continuar = true;

        while (continuar) {
            System.out.println("Menu del Hotel:");
            System.out.println("1. Gestionar Habitaciones");
            System.out.println("2. Gestionar Clientes");
            System.out.println("3. Crear Reserva");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println("Habitaciones Disponibles:");
                    List<Habitacion> disponibles = hotel.getHabitacionesDisponibles();
                    for (Habitacion habitacion : disponibles) {
                        System.out.println("Numero: " + habitacion.getNumero() + ", Tipo: " + habitacion.getTipo() + ", Precio por Noche: " + habitacion.getPrecioPorNoche());
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el apellido del cliente: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Ingrese el email del cliente: ");
                    String email = scanner.nextLine();
                    System.out.print("Ingrese el telefono del cliente: ");
                    String telefono = scanner.nextLine();

                    Cliente cliente = new Cliente(nombre, apellido, email, telefono);
                    hotel.agregarCliente(cliente);
                    System.out.println("Cliente agregado correctamente.");
                    break;

                case 3:
                    System.out.println("Clientes Registrados:");
                    List<Cliente> clientes = hotel.getClientes();
                    for (int i = 0; i < clientes.size(); i++) {
                        Cliente c = clientes.get(i);
                        System.out.println((i + 1) + ". " + c.getNombre() + " " + c.getApellido());
                    }

                    System.out.print("Seleccione un cliente (numero): ");
                    int clienteIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // Limpiar el buffer

                    if (clienteIndex < 0 || clienteIndex >= clientes.size()) {
                        System.out.println("Cliente no valido.");
                        break;
                    }

                    System.out.println("Habitaciones Disponibles:");
                    disponibles = hotel.getHabitacionesDisponibles();
                    for (int i = 0; i < disponibles.size(); i++) {
                        Habitacion h = disponibles.get(i);
                        System.out.println((i + 1) + ". Numero: " + h.getNumero() + ", Tipo: " + h.getTipo() + ", Precio por Noche: " + h.getPrecioPorNoche());
                    }

                    System.out.print("Seleccione una habitación (numero): ");
                    int habitacionIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // Limpiar el buffer

                    if (habitacionIndex < 0 || habitacionIndex >= disponibles.size()) {
                        System.out.println("Habitacion no valida.");
                        break;
                    }

                    System.out.print("Ingrese el numero de noches: ");
                    int noches = scanner.nextInt();

                    Reserva reserva = new Reserva(clientes.get(clienteIndex), disponibles.get(habitacionIndex), noches);
                    hotel.agregarReserva(reserva);
                    reserva.imprimirTicket();
                    break;

                case 4:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        }

        scanner.close();
    }
}