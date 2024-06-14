/*
Crea un sistema para gestionar reservas en un hotel. Se desea emitir un ticket donde esté
la habitación reservada, datos personales del cliente y el pago por la habitación. Crear un
menú que simule gestionar habitaciones, usuarios y crear la reserva (impresión de ticket).
 */

public class Cliente {

    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public Cliente(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }
}
