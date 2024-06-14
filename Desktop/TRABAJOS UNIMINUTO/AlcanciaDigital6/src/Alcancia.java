/*
Crear un programa que permita simular una alcancía digital. La alcancía permite gestionar
el ingreso de monedas, el usuario en todo momento puede consultar la cantidad de dinero
que posee y la cantidad de transacciones de ingreso y egreso de dinero y cantidad de dinero
en cada transacción.
*/
import java.util.ArrayList;
import java.util.List;

public class Alcancia {

    private double totalDinero;
    private List<Transaccion> transacciones;

    public Alcancia() {
        this.totalDinero = 0.0;
        this.transacciones = new ArrayList<>();
    }

    public void ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            totalDinero += cantidad;
            transacciones.add(new Transaccion("Ingreso", cantidad));
        }
    }

    public void retirarDinero(double cantidad) {
        if (cantidad > 0 && cantidad <= totalDinero) {
            totalDinero -= cantidad;
            transacciones.add(new Transaccion("Egreso", cantidad));
        }
    }

    public double getTotalDinero() {
        return totalDinero;
    }

    public int getTotalTransacciones() {
        return transacciones.size();
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }
}
