package main.task03;

import java.util.List;

public class NumberListSum {
    // Метод с wildcard
    public static double sumWithWildcard(List<? extends Number> numberList) {
        double sum = 0;
        for (Number num : numberList) {
            sum += num.doubleValue();
        }
        return sum;
    }

    // Метод с типом Т
    public static <T extends Number> double sumWithType(List<T> numberList) {
        double sum = 0;
        for (T num : numberList) {
            sum += num.doubleValue();
        }
        return sum;
    }

}
