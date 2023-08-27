package main.task05;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3);
        List<Double> doubleList = List.of(1.1, 2.2, 3.3);

        List<Number> targetList = new ArrayList<>();

        NumberListAddition.addAllToList(integerList, targetList);
        NumberListAddition.addAllToList(doubleList, targetList);

        System.out.println("Target List: " + targetList);


    }
}
