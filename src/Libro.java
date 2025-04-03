public class Libro {
    private String titulo;
    private EstadoLibro estado;

    public enum EstadoLibro {
        NUEVO, BUENO, REGULAR, MALO
    }

    public Libro(String titulo, EstadoLibro estado) {
        this.titulo = titulo;
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public EstadoLibro getEstado() {
        return estado;
    }

    public void setEstado(EstadoLibro estado) {
        this.estado = estado;
    }

    public boolean estaDeteriorado() {
        return estado == EstadoLibro.MALO || estado == EstadoLibro.REGULAR;
    }
}