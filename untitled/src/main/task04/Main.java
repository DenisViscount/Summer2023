package main.task04;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        List<Double> doubleList = List.of(1.1, 2.2, 3.3, 4.4, 5.5);

        double sum = NumberListSum.sumNumberLists(integerList, doubleList);
        System.out.println("Sum of Number Lists: " + sum);

    }




}
