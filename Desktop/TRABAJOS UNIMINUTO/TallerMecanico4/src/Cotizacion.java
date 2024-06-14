public class Cotizacion {
    private Vehiculo vehiculo;
    private double manoDeObra;
    private double precioRepuestos;
    
    public Cotizacion(Vehiculo vehiculo, double manoDeObra, double precioRepuestos) {
        this.vehiculo = vehiculo;
        this.manoDeObra = manoDeObra;
        this.precioRepuestos = precioRepuestos;
    }

    public double calcularGastosAdministrativos() {
        return 0.15 * (manoDeObra + precioRepuestos);
    }

    public double calcularTotal() {
        return manoDeObra + precioRepuestos + calcularGastosAdministrativos();
    }

    public void imprimirCotizacion() {
        System.out.println("Cotizacion de Reparacion:");
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Modelo: " + vehiculo.getModelo());
        System.out.println("Color: " + vehiculo.getColor());
        System.out.println("Año: " + vehiculo.getAno());
        System.out.println("Motivo de Reparacion: " + vehiculo.getMotivoReparacion());
        System.out.println("Mano de Obra: $" + manoDeObra);
        System.out.println("Precio de Repuestos: $" + precioRepuestos);
        System.out.println("Gastos Administrativos: $" + calcularGastosAdministrativos());
        System.out.println("Total a Pagar: $" + calcularTotal());
        System.out.println("-----------------------------");
    }
}