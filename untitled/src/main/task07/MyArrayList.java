package task07;

import java.util.Arrays;

public class MyArrayList<T> {
    private int size;
    private Object[] array;

    public MyArrayList( Object[] array) {
        this.size = array.length;
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object[] getArray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }

    private  <T>  T[] addElement(T [] array, T element){
       T [] arr = Arrays.copyOf(array,array.length + 1);
       array[array.length] = element;
       return arr;

    }
    private T getIndexElement( int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("invalid index");
        }
       T element = (T) array[index];
        return element;
    }
    private  T setElement(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("invalid index");
        }
        array[index] = element;
        return element;


    }
}
