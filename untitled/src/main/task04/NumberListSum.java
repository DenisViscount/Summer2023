package main.task04;

import java.util.List;

public class NumberListSum {

    public static double sumNumberLists(List<? extends Number> list1, List<? extends Number> list2) {
        double sum = 0;

        for (Number num : list1) {
            sum += num.doubleValue();
        }

        for (Number num : list2) {
            sum += num.doubleValue();
        }

        return sum;
    }


}
