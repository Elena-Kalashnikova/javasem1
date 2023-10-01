package gb.linkedlist;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class GBLinkedList<E> implements GBLL<E> {
    private int size;
    private Node<E> first;
     private Node<E> last;

    public GBLinkedList() {
        this.size = 0;
        this.last = new Node<>(null, first,null);
        this.first =new Node<>( null,null,last);
    }

    private static class Node<E> {
        private E currentElem;
        private Node<E> prevElem;
        private Node<E> nextElem;

        Node(E currentElem,  Node<E> prevElem,Node<E> nextElem) {
            this.currentElem = currentElem;
            this.nextElem = nextElem;
            this.prevElem = prevElem;
        }

        public void setCurrentElem(E currentElem) {
            this.currentElem = currentElem;
        }

        public void setNextElem(Node<E> nextElem) {
            this.nextElem = nextElem;
        }

        public Node<E> getNextElem() {
            return nextElem;
        }

        public E getCurrentElem() {
            return currentElem;
        }
    }

    @Override
    public void addLast(E value) {
        Node<E> prev = last;
       prev.setCurrentElem(value);
       last = new Node<>(null,prev,null);
       prev.setNextElem(last);
        size++;
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        Node<E> target = first.getNextElem();
        for (int i = 0; i < index; i++) {
            target= getNextElem(target);
        }
        return target.getCurrentElem();
    }
    private Node<E> getNextElem(Node<E> elem){
        return elem.getNextElem();
    }

    @Override
    public Iterator<E> iterator() {

        return new Iterator<E>() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public E next() {
                return get(counter++);
            }
        };


    }
}

