public class Libro {
    private String titulo;
    private String estado;

    public Libro(String estado) {
        this.estado = "MALO";
    }

    public Libro() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
