package main.task06;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = List.of(1, 2, 3);
        List<Number> numberList = new ArrayList<>();

        ListElementCopier.copyElements(integerList, numberList);

        System.out.println("Number List: " + numberList);
    }

}
