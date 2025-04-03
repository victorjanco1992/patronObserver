import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AlarmaLibro implements Subject {
    private Map<String, Set<ILibroMalEstado>> observadores = new HashMap<>();

    @Override
    public void attach(String evento, ILibroMalEstado observador) {
        observadores.putIfAbsent(evento, new HashSet<>());
        observadores.get(evento).add(observador);
    }

    @Override
    public void detach(String evento, ILibroMalEstado observador) {
        if (observadores.containsKey(evento)) {
            observadores.get(evento).remove(observador);
            if (observadores.get(evento).isEmpty()) {
                observadores.remove(evento);
            }
        }
    }

    @Override
    public void notifyObservers(String evento, Libro libro) {
        if (observadores.containsKey(evento)) {
            for (ILibroMalEstado observador : observadores.get(evento)) {
                observador.update(this, evento, libro);
            }
        }
    }
}
