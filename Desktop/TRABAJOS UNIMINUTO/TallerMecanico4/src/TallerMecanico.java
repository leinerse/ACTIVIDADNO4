import java.util.ArrayList;
import java.util.List;

public class TallerMecanico {

    private final List<Cotizacion> cotizaciones;

    public TallerMecanico() {
        cotizaciones = new ArrayList<>();
    }

    public void agregarCotizacion(Cotizacion cotizacion) {
        cotizaciones.add(cotizacion);
    }

    public void imprimirCotizaciones() {
        for (Cotizacion cotizacion : cotizaciones) {
            cotizacion.imprimirCotizacion();
        }
    }
}
