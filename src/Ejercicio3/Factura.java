package Ejercicio3;

import java.util.ArrayList;

public class Factura {
    private String fechaFactura;
    private long numeroFactura;
    private double totalCalculadoFactura;
    private String cliente;
    private ArrayList<DetalleFactura> detallesFactura;

    // Constructor
    public Factura() {
        this.detallesFactura = new ArrayList<>();
    }

    // Getters y Setters
    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public long getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(long numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public double getTotalCalculadoFactura() {
        return totalCalculadoFactura;
    }

    public void setTotalCalculadoFactura(double totalCalculadoFactura) {
        this.totalCalculadoFactura = totalCalculadoFactura;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public ArrayList<DetalleFactura> getDetallesFactura() {
        return detallesFactura;
    }

    // Método para calcular el total
    public void calcularMontoTotal() {
        totalCalculadoFactura = 0;
        for (DetalleFactura detalle : detallesFactura) {
            totalCalculadoFactura += detalle.getSubtotal();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fecha: ").append(fechaFactura).append("\n");
        sb.append("Numero: ").append(numeroFactura).append("\n");
        sb.append("Cliente: ").append(cliente).append("\n");
        sb.append("Código Artículo Nombre Artículo Cantidad Precio Unitario Descuento Subtotal\n");
        for (DetalleFactura detalle : detallesFactura) {
            sb.append(detalle).append("\n");
        }
        sb.append("Total: ").append(totalCalculadoFactura).append("\n");
        return sb.toString();
    }
}
