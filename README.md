# Llanquihue Tour

Aplicación de consola en Java que lee los tours de la agencia **Llanquihue Tour** desde un archivo `.txt`, los carga como objetos en un `ArrayList` y permite recorrerlos y filtrarlos (por tipo de tour y por cupos disponibles).

Actividad formativa de la asignatura Desarrollo Orientado a Objetos I (Duoc UC).

## Estructura de carpetas

```
llanquihue-tour/
├── src/
│   ├── model/
│   │   └── Tour.java          # Clase con atributos, getters, setters y toString()
│   ├── data/
│   │   └── GestorDatos.java   # Lee tours.txt y crea el ArrayList<Tour>
│   └── ui/
│       └── Main.java          # Recorre y filtra la colección
├── resources/
│   └── tours.txt              # Datos: nombre;tipo;duracionHoras;precio;cupos
└── README.md
```

## Formato de `tours.txt`

Un tour por línea, campos separados por `;` y sin espacios:

```
nombre;tipo;duracionHoras;precio;cupos
```

## Cómo ejecutar la clase Main

### Desde IntelliJ IDEA
1. Abrir la carpeta del proyecto (`File > Open`).
2. Marcar `src` como *Sources Root* (clic derecho > *Mark Directory as > Sources Root*).
3. Abrir `src/ui/Main.java` y presionar el botón **Run**.
   El directorio de trabajo debe ser la raíz del proyecto, para que se encuentre `resources/tours.txt`.

### Desde la terminal (JDK 8 o superior)
Ubicado en la raíz del proyecto:

```bash
javac -d out src/model/*.java src/data/*.java src/ui/*.java
java -cp out ui.Main
```
