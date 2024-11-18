package Ejercicio1;

import java.util.ArrayList;

public class Alumno {
    private String nombreCompleto;
    private long legajo;
    private ArrayList<Nota> notas;

    // Constructor modificado para aceptar una lista de notas
    public Alumno(String nombreCompleto, long legajo, ArrayList<Nota> notas) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
        this.notas = notas;
    }

    // Getters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public long getLegajo() {
        return legajo;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    // Calcular promedio de las notas
    public double calcularPromedio() {
        if (notas.isEmpty()) return 0.0;
        double suma = 0.0;
        for (Nota nota : notas) {
            suma += nota.getNotaExamen();
        }
        return suma / notas.size();
    }

    // Método toString
    @Override
    public String toString() {
        return "Alumno: " + nombreCompleto + " (Legajo: " + legajo + ")";
    }
}