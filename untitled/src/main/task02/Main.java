package main.task02;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        List<Double> doubleList = List.of(1.1, 2.2, 3.3, 4.4, 5.5);

        System.out.println("Integer List:");
        task02.NumberListPrinter.printNumberList(integerList);

        System.out.println("Double List:");
        task02.NumberListPrinter.printNumberList(doubleList);



    }






}
