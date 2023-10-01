package gb.list;

public class Main {
    public static void main(String[] args) {
        GBList<Integer> list = new GBArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(3);
        System.out.println(list.get(1));
        list.update(4,2);
        System.out.println(list);
        System.out.println(list.size());
    }
}
