//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       AlarmaLibro a = new AlarmaLibro();
        a.attach(new Compras());
        a.attach(new Administracion());
        a.attach(new Stock());

        Libro libro = new Libro();
        libro.setEstado("MALO");


        Biblioteca b = new Biblioteca();
        b.devuelveLibro(libro);


    }
}