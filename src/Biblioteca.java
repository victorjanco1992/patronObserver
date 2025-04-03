public class Biblioteca {
    private AlarmaLibro alarma;

    public Biblioteca(AlarmaLibro alarma) {
        this.alarma = alarma;
    }

    public void devuelveLibro(Libro libro) {
        if (libro.estaDeteriorado()) {
            alarma.notifyObservers("LIBRO_MALO", libro);
        } else {
            alarma.notifyObservers("LIBRO_BUENO", libro);
        }
    }
}
