package gb.list;

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {
    private int index;
    private final E[] values;

    public ArrayIterator(E[] values) {
        this.index=0;
        this.values=values;

    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public E next() {
        return values[index++];
    }
}
