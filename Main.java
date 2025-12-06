public class Main {
    public static void main(String[] args) {

        Articulo info = new Articulo("LIBRO-1", "MAX", 2010);

        System.out.println("Libro: " + info.getIdentificador());
        System.out.println("Autor: " + info.getAutor());

        System.out.println("\n RESERVA POR ATIGUEDAD");
        boolean esApto = info.Prestamoanio();
        if (esApto) {
            System.out.println("El libro es apto para préstamo (Antiguo).");
        } else {
            System.out.println("El libro es demasiado nuevo.");
        }

        System.out.println("\n Estado de la reserva");
        info.reservar();

        System.out.println(" Estado de la reserva");
        info.reservar();
    }
}