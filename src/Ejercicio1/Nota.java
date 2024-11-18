package Ejercicio1;

public class Nota {

    private String catedra;
    private double notaExamen;

    // Constructor, getter y setter
    public Nota(String catedra, double notaExamen){
        this.catedra = catedra;
        this.notaExamen = notaExamen;

    }

    public double getNotaExamen() {
        return notaExamen;
    }

    public String getCatedra() {
        return catedra;
    }

    public void setCatedra(String catedra) {
        this.catedra = catedra;
    }

    public void setNotaExamen(double notaExamen) {
        this.notaExamen = notaExamen;
    }

}
