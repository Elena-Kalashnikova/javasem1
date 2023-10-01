package gb.linkedlist;

public class Main {
    public static void main(String[] args) {
        GBLinkedList <String> list = new GBLinkedList<>();
        list.addLast("A");
        list.addLast("B");
        list.addLast("C");
        list.addLast("D");


        System.out.println("Size: " + list.size());
        System.out.println("Element at index 2: " + list.get(0));
    }
}

