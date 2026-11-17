package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

/**
 * Clase principal: carga los tours desde el archivo, los muestra y aplica filtros.
 */
public class Main {

    public static void main(String[] args) {
        // 1. Carga de datos desde el archivo
        GestorDatos gestor = new GestorDatos();
        ArrayList<Tour> tours = gestor.cargarTours("resources/tours.txt");

        // 2. Recorrido: se muestran todos los tours
        System.out.println("=== CATALOGO COMPLETO DE TOURS (" + tours.size() + ") ===");
        for (Tour t : tours) {
            System.out.println(t);
        }

        // 3. Filtro: tours de tipo gastronomico
        System.out.println("\n=== TOURS GASTRONOMICOS ===");
        ArrayList<Tour> gastronomicos = new ArrayList<>();
        for (Tour t : tours) {
            if (t.getTipo().equalsIgnoreCase("gastronomico")) {
                gastronomicos.add(t);
            }
        }
        imprimir(gastronomicos);

        // 4. Filtro: tours con cupos disponibles (cupos > 0)
        System.out.println("\n=== TOURS CON CUPOS DISPONIBLES ===");
        ArrayList<Tour> disponibles = new ArrayList<>();
        for (Tour t : tours) {
            if (t.getCupos() > 0) {
                disponibles.add(t);
            }
        }
        imprimir(disponibles);
    }

    // Imprime una lista de tours o un mensaje si está vacía
    private static void imprimir(ArrayList<Tour> lista) {
        if (lista.isEmpty()) {
            System.out.println("No hay tours que cumplan la condición.");
            return;
        }
        for (Tour t : lista) {
            System.out.println(t);
        }
    }
}
