package gb.linkedlist;

import java.util.Iterator;

public interface GBLL <E> {
    void addLast(E value);

    int size();

    E get(int index);

    Iterator<E> iterator();
}
