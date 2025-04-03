import java.util.*;

public interface Subject {
    void attach(String evento, ILibroMalEstado observador);
    void detach(String evento, ILibroMalEstado observador);
    void notifyObservers(String evento, Libro libro);
}