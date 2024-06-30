package pets.io;

import java.util.Comparator;

public class ComparatorNome implements Comparator<Gato>{

    @Override
    public int compare(Gato o1, Gato o2) {
        return o1.getNome().compareToIgnoreCase(o2.getNome());
    }

}
