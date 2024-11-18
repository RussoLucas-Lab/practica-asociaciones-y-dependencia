package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Plato> platosMenu = new ArrayList<>();

        System.out.println("Ingrese la cantidad de platos que desea cargar:");
        int cantidadPlatos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        for (int i = 0; i < cantidadPlatos; i++) {
            System.out.println("Ingrese el nombre del plato:");
            String nombrePlato = scanner.nextLine();

            System.out.println("Ingrese el precio del plato:");
            double precioPlato = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea

            System.out.println("¿El plato es una bebida? (sí/no):");
            String esBebida = scanner.nextLine().toLowerCase();

            Plato plato = new Plato(nombrePlato, precioPlato);

            if (!esBebida.equals("sí")) {
                System.out.println("Ingrese la cantidad de ingredientes para " + nombrePlato + ":");
                int cantidadIngredientes = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                if (cantidadIngredientes <= 0) {
                    System.out.println("Debe ingresar al menos un ingrediente.");
                    i--; // Repetir la carga de este plato
                    continue;
                }

                for (int j = 0; j < cantidadIngredientes; j++) {
                    System.out.println("Ingrese el nombre del ingrediente " + (j + 1) + ":");
                    String nombreIngrediente = scanner.nextLine();

                    System.out.println("Ingrese la cantidad del ingrediente:");
                    double cantidadIngrediente = scanner.nextDouble();
                    scanner.nextLine(); // Consumir el salto de línea

                    System.out.println("Ingrese la unidad de medida del ingrediente:");
                    String unidadMedida = scanner.nextLine();

                    Ingrediente ingrediente = new Ingrediente(nombreIngrediente, cantidadIngrediente, unidadMedida);
                    plato.agregarIngrediente(ingrediente);
                }
            }

            platosMenu.add(plato);
        }

        // Mostrar el menú
        System.out.println("\n--- MENÚ DEL RESTAURANT ---");
        for (Plato plato : platosMenu) {
            System.out.println(plato);
            System.out.println("------------------------------");
        }

        scanner.close();
    }
}
