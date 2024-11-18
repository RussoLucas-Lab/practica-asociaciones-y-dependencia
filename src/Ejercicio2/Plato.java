package Ejercicio2;

import java.util.ArrayList;

public class Plato {

    private String nombreCompleto;
    private double precio;
    private boolean esBebida;
    private ArrayList<Ingrediente> ingredientes = new ArrayList<>();

    public Plato(String nombreCompleto, double precio){
        this.nombreCompleto=nombreCompleto;
        this.precio=precio;
        this.esBebida=esBebida;
        this.ingredientes=ingredientes;
    }

    public boolean getEsBebida(){
        return esBebida;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setEsBebida(boolean esBebida) {
        this.esBebida = esBebida;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    // Método para agregar un ingrediente
    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombreCompleto).append("\n");
        sb.append("Precio: $").append(precio).append("\n");
        if (!ingredientes.isEmpty()) {
            sb.append("Ingredientes:\n");
            sb.append("Nombre Cantidad Unidad de Medida\n");
            for (Ingrediente ingrediente : ingredientes) {
                sb.append(ingrediente).append("\n");
            }
        }
        return sb.toString();
    }

    // Verifica si el plato tiene ingredientes
    public boolean tieneIngredientes() {
        return !ingredientes.isEmpty();
    }
}
