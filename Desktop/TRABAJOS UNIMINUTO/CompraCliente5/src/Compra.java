/*
 Calcular el valor a pagar de un cliente por su compra, se desea saber los productos que ha
comprado: precio, cantidad, descripción. También el total a pagar y cálculo de impuestos,
adicional se debe tener el nombre, apellidos y documento del cliente.
 */
import java.util.ArrayList;
import java.util.List;

public class Compra {

    private Cliente cliente;
    private List<Producto> productos;
    private final double IMPUESTO = 0.16; // 16% de impuestos

    public Compra(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(String descripcion, double precio, int cantidad) {
        productos.add(new Producto(descripcion, precio, cantidad));
    }

    public double calcularSubtotal() {
        double subtotal = 0;
        for (Producto producto : productos) {
            subtotal += producto.calcularSubtotal();
        }
        return subtotal;
    }

    public double calcularImpuestos() {
        return calcularSubtotal() * IMPUESTO;
    }

    public double calcularTotal() {
        return calcularSubtotal() + calcularImpuestos();
    }

    public void imprimirFactura() {
        System.out.println("Factura de Compra:");
        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellidos());
        System.out.println("Documento: " + cliente.getDocumento());
        System.out.println("Productos Comprados:");
        for (Producto producto : productos) {
            System.out.println("Descripción: " + producto.getDescripcion() + ", Precio: $" + producto.getPrecio() + ", Cantidad: " + producto.getCantidad() + ", Subtotal: $" + producto.calcularSubtotal());
        }
        System.out.println("Subtotal: $" + calcularSubtotal());
        System.out.println("Impuestos: $" + calcularImpuestos());
        System.out.println("Total a Pagar: $" + calcularTotal());
        System.out.println("-----------------------------");
    }

    private class Producto {

        private String descripcion;
        private double precio;
        private int cantidad;

        public Producto(String descripcion, double precio, int cantidad) {
            this.descripcion = descripcion;
            this.precio = precio;
            this.cantidad = cantidad;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public double getPrecio() {
            return precio;
        }

        public int getCantidad() {
            return cantidad;
        }

        public double calcularSubtotal() {
            return precio * cantidad;
        }
    }
}
