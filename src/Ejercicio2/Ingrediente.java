package Ejercicio2;

public class Ingrediente {

    private String nombre;
    private double cantidad;
    private String unidadDeMedida;

    public Ingrediente(String nombre, double cantidad, String unidadDeMedida){
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.unidadDeMedida=unidadDeMedida;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setUnidadDeMedida(String unidadDeMedida) {
        this.unidadDeMedida = unidadDeMedida;
    }
    @Override
    public String toString() {
        return nombre + " " + cantidad + " " + unidadDeMedida;
    }

}
