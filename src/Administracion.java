public class Administracion implements ILibroMalEstado {
    @Override
    public void update(Subject subject, String evento, Libro libro) {
        if (evento.equals("LIBRO_MALO")) {
            System.out.println("Administración: Registro el daño de '" + libro.getTitulo() + "' en el sistema.");
        }
        if (evento.equals("LIBRO_BUENO")) {
            System.out.println("Administración: Confirmo que '" + libro.getTitulo() + "' sigue en buen estado.");
        }
    }
}