package Ejercicio1;


import java.util.ArrayList;
import java.util.Scanner;

public class CargaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<>();

        System.out.println("Ingrese la cantidad de alumnos a cargar:");
        int cantidadAlumnos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Ingrese el nombre completo del alumno:");
            String nombreCompleto = scanner.nextLine();

            System.out.println("Ingrese el legajo del alumno:");
            long legajo = scanner.nextLong();
            scanner.nextLine(); // Consumir el salto de línea

            ArrayList<Nota> notas = new ArrayList<>();

            System.out.println("Ingrese la cantidad de notas para " + nombreCompleto + ":");
            int cantidadNotas = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            if (cantidadNotas <= 0) {
                System.out.println("Debe ingresar al menos una nota.");
                i--; // Repetir la carga de este alumno
                continue;
            }

            for (int j = 0; j < cantidadNotas; j++) {
                System.out.println("Ingrese la cátedra de la nota " + (j + 1) + ":");
                String catedra = scanner.nextLine();

                System.out.println("Ingrese la nota del examen:");
                double notaExamen = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea

                Nota nota = new Nota(catedra, notaExamen);
                notas.add(nota);
            }

            // Pasamos el ArrayList de notas al constructor del alumno
            Alumno alumno = new Alumno(nombreCompleto, legajo, notas);
            alumnos.add(alumno);
        }

        // Mostrar la información de los alumnos y sus promedios
        System.out.println("\n--- Información de los alumnos ---");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
            System.out.println("Notas:");
            for (Nota nota : alumno.getNotas()) {
                System.out.println(nota);
            }
            System.out.printf("Promedio de notas: %.2f%n", alumno.calcularPromedio());
            System.out.println("-------------------------------");
        }

        scanner.close();
    }
}