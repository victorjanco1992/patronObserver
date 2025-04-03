//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AlarmaLibro alarma = new AlarmaLibro();
        alarma.attach("LIBRO_MALO", new Compras());
        alarma.attach("LIBRO_MALO", new Administracion());
        alarma.attach("LIBRO_MALO", new Stock());
        alarma.attach("LIBRO_BUENO", new Administracion());
        alarma.attach("LIBRO_BUENO", new Stock());

        Biblioteca biblioteca = new Biblioteca(alarma);
        Libro libroMalo = new Libro("El Quijote", Libro.EstadoLibro.MALO);
        Libro libroBueno = new Libro("Cien Años de Soledad", Libro.EstadoLibro.BUENO);

        System.out.println("\nDevolviendo libro en mal estado:");
        biblioteca.devuelveLibro(libroMalo);

        System.out.println("\nDevolviendo libro en buen estado:");
        biblioteca.devuelveLibro(libroBueno);
    }
}