package task02;

import java.util.List;

public class NumberListPrinter {
    public static void printNumberList(List<? extends Number> numberList) {
        for (Number num : numberList) {
            System.out.println(num);
        }
    }
}
