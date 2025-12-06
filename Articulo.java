public class Articulo{

    private String identificador;
    private String autor;
    private boolean disponible;
    private int anioPublicacion;

    public Articulo(String id, String nombreAutor, int anio) {
        this.identificador = id;
        this.autor = nombreAutor;
        this.anioPublicacion = anio;
        this.disponible = true;
    }

    public String getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(String nuevoId) {
        this.identificador = nuevoId;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String nuevoAutor) {
        this.autor = nuevoAutor;
    }

    public boolean isDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean estado) {
        this.disponible = estado;
    }

    // Getter para Año
    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }

    public void setAnioPublicacion(int anio) {
            this.anioPublicacion = anio;
    }

    public void reservar() {
        if (this.disponible) {
            this.disponible = false;
            System.out.println("Reserva exitosa para el artículo: " + this.identificador);
        } else {
            System.out.println("El artículo no está disponible para reserva.");
        }
    }

    public boolean Prestamoanio() {

        int anioActual = 2025;
        int antiguedad = anioActual - this.anioPublicacion;

        if (antiguedad > 5) {
            return true;
        } else {
            return false;
        }
    }
}