package gb.list;

import java.util.Arrays;
import java.util.Iterator;

public class GBArrayList<W> implements GBList<W>{
    private W[] values;

    @SuppressWarnings("unchecked")
    public GBArrayList() {
        this.values= (W[]) new Object[0];
    }

    @Override
    public boolean add(W t) {

        try {
            W[]temp = values;
            values = (W[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[temp.length] = t;
            return true;
        }
        catch (ClassCastException e){
            e.printStackTrace();
        }

        return false;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void remove(int index) {
        try {
            W[]temp = values;
            values = (W[]) new Object[temp.length-1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElemAfterIndex= temp.length-index-1;
            System.arraycopy(temp,index+1,values,index,amountElemAfterIndex);

        }
        catch (ClassCastException e){
            e.printStackTrace();
        }



    }

    @Override
    public String toString() {
        return "GBArrayList{" +
                "values=" + Arrays.toString(values) +
                '}';
    }

    @Override
    public W get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, W t) {
        values[index]=t;
    }

    @Override
    public Iterator<W> iterator() {
        return new ArrayIterator<>(values);
    }
}
