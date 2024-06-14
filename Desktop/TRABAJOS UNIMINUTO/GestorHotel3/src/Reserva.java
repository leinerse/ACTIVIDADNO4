/*
Crea un sistema para gestionar reservas en un hotel. Se desea emitir un ticket donde esté
la habitación reservada, datos personales del cliente y el pago por la habitación. Crear un
menú que simule gestionar habitaciones, usuarios y crear la reserva (impresión de ticket).
 */

public class Reserva {

    private Cliente cliente;
    private Habitacion habitacion;
    private int noches;

    public Reserva(Cliente cliente, Habitacion habitacion, int noches) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.noches = noches;
        this.habitacion.setReservada(true);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public int getNoches() {
        return noches;
    }

    public double calcularTotal() {
        return habitacion.getPrecioPorNoche() * noches;
    }

    public void imprimirTicket() {
        System.out.println("Ticket de Reserva:");
        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Habitación Número: " + habitacion.getNumero());
        System.out.println("Tipo de Habitación: " + habitacion.getTipo());
        System.out.println("Precio por Noche: " + habitacion.getPrecioPorNoche());
        System.out.println("Noches: " + noches);
        System.out.println("Total a Pagar: " + calcularTotal());
        System.out.println("-----------------------------");
    }
}
