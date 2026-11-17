package data;

import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Se encarga de leer el archivo de texto y construir la lista de tours.
 */
public class GestorDatos {

    /**
     * Lee el archivo línea por línea, separa los campos con split(";"),
     * crea un objeto Tour por línea y los guarda en un ArrayList.
     */
    public ArrayList<Tour> cargarTours(String rutaArchivo) {
        ArrayList<Tour> tours = new ArrayList<>();

        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                if (linea.trim().isEmpty()) {
                    continue; // se ignoran líneas vacías
                }
                // Separación de los campos por punto y coma
                String[] campos = linea.split(";");
                if (campos.length != 5) {
                    System.out.println("Línea con formato incorrecto, se omite: " + linea);
                    continue;
                }
                try {
                    String nombre = campos[0];
                    String tipo = campos[1];
                    int duracion = Integer.parseInt(campos[2]);
                    int precio = Integer.parseInt(campos[3]);
                    int cupos = Integer.parseInt(campos[4]);

                    // Se crea el objeto y se agrega a la colección
                    tours.add(new Tour(nombre, tipo, duracion, precio, cupos));
                } catch (NumberFormatException e) {
                    System.out.println("Dato numérico inválido, se omite: " + linea);
                }
            }
        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo: " + e.getMessage());
        }

        return tours;
    }
}
