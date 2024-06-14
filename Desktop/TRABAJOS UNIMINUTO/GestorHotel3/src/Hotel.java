
import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Habitacion> habitaciones;
    private List<Cliente> clientes;
    private List<Reserva> reservas;

    public Hotel() {
        habitaciones = new ArrayList<>();
        clientes = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public List<Habitacion> getHabitacionesDisponibles() {
        List<Habitacion> disponibles = new ArrayList<>();
        for (Habitacion habitacion : habitaciones) {
            if (!habitacion.isReservada()) {
                disponibles.add(habitacion);
            }
        }
        return disponibles;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}
