public class Compras implements ILibroMalEstado {
    @Override
    public void update(Subject subject, String evento, Libro libro) {
        if (evento.equals("LIBRO_MALO")) {
            System.out.println("Compras: Solicito nueva cotización para reemplazar '" + libro.getTitulo() + "'...");
        }
    }
}