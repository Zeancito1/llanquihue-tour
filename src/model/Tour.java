package model;

/**
 * Representa un tour ofrecido por la agencia Llanquihue Tour.
 */
public class Tour {

    // Atributos del tour
    private String nombre;
    private String tipo;
    private int duracionHoras;
    private int precio;
    private int cupos;

    // Constructor con todos los atributos
    public Tour(String nombre, String tipo, int duracionHoras, int precio, int cupos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.duracionHoras = duracionHoras;
        this.precio = precio;
        this.cupos = cupos;
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getDuracionHoras() { return duracionHoras; }
    public void setDuracionHoras(int duracionHoras) { this.duracionHoras = duracionHoras; }

    public int getPrecio() { return precio; }
    public void setPrecio(int precio) { this.precio = precio; }

    public int getCupos() { return cupos; }
    public void setCupos(int cupos) { this.cupos = cupos; }

    // Representación en texto del objeto
    @Override
    public String toString() {
        return "Tour{nombre='" + nombre + "', tipo='" + tipo + "', duracionHoras=" + duracionHoras
                + ", precio=$" + precio + ", cupos=" + cupos + "}";
    }
}
