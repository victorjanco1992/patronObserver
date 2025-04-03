public class Stock implements ILibroMalEstado {
    @Override
    public void update(Subject subject, String evento, Libro libro) {
        if (evento.equals("LIBRO_MALO")) {
            System.out.println("Stock: Le doy de baja el libro '" + libro.getTitulo() + "'...");
        }
        if (evento.equals("LIBRO_BUENO")) {
            System.out.println("Stock: Registro que el libro '" + libro.getTitulo() + "' sigue en buen estado.");
        }
    }
}