/*
Crea un sistema para gestionar reservas en un hotel. Se desea emitir un ticket donde esté
la habitación reservada, datos personales del cliente y el pago por la habitación. Crear un
menú que simule gestionar habitaciones, usuarios y crear la reserva (impresión de ticket).
 */

public class Habitacion {

    private int numero;
    private String tipo;
    private double precioPorNoche;
    private boolean reservada;

    public Habitacion(int numero, String tipo, double precioPorNoche) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioPorNoche = precioPorNoche;
        this.reservada = false;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public boolean isReservada() {
        return reservada;
    }

    public void setReservada(boolean reservada) {
        this.reservada = reservada;
    }
}
