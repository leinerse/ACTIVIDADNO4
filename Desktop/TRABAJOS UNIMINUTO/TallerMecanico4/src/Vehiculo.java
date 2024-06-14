/*
Un taller mecánico desea hacer cotizaciones de reparación de un vehículo, para ellos se
necesitan los datos de los vehículos: la marca, modelo, color, año y motivo de reparación.
Se debe pedir mano de obra del mecánico, precio total de repuestos y gatos administrativos
que es el 15% de la obra de mano + el precio total de repuestos. En la cotización se debe
imprimir los datos del vehículo y el detalle de la cotización y monto total.
 */
public class Vehiculo {

    private String marca;
    private String modelo;
    private String color;
    private int ano;
    private String motivoReparacion;

    public Vehiculo(String marca, String modelo, String color, int ano, String motivoReparacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.ano = ano;
        this.motivoReparacion = motivoReparacion;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getAno() {
        return ano;
    }

    public String getMotivoReparacion() {
        return motivoReparacion;
    }
}
