package task02;

import java.util.ArrayList;

public class Util {
    public static <T> void printArrayList(ArrayList<T> list){
        for (T item: list) {
            System.out.println(item);

        }

    }

    public static <T> void fillList(ArrayList<T> list, T value){
        for (int i = 0; i < list.size(); i++) {
            list.set(i, value);

        }

    }
    public static <T> void addList(ArrayList<T> list, T value){
            list.add(value);

    }
    public static <T> T getList(ArrayList<T> list, int index){
        if(index < 0 || index >= list.size()){
            throw new IndexOutOfBoundsException("Invalid index");

        }
        return list.get(index);
    }


}