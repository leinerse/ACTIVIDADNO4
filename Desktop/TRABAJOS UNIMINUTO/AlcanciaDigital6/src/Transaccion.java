
public class Transaccion {

    private String tipo;
    private double cantidad;

    public Transaccion(String tipo, double cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public double getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Cantidad: $" + cantidad;
    }
}
