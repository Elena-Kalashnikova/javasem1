package gb.list;

public interface GBList<W> extends Iterable<W>{
  //  boolean add(T t), void remove(int index), T get(int index), int size(), void update(int index, T t)
  boolean add(W t);

  void remove(int index);

  W get(int index);

  int size();

  void update(int index, W t);

}
