package main.task03;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        List<Double> doubleList = List.of(1.1, 2.2, 3.3, 4.4, 5.5);

        double sumWildcard = NumberListSum.sumWithWildcard(integerList);
        System.out.println("Sum with Wildcard (Integers): " + sumWildcard);

        double sumType = NumberListSum.sumWithType(doubleList);
        System.out.println("Sum with Type (Doubles): " + sumType);


    }

}
