package task01;

import java.util.List;

public class Main {
    public static void main(String[] args) {


    }
    public static void processExtends(List<? extends Number> list) {
        // Метод принимает список элементов, которые являются Number или его подклассами
        for (Number num : list) {

            System.out.println(num.doubleValue());
        }

        // Нельзя добавить элементы в список, так как неизвестно точно, какие подклассы Number ожидаются

    }
    public static void processSuper(List<? super Integer> list) {
        // Метод принимает список элементов, которые являются Integer или его суперклассами (Object)
        for (Object obj : list) {

            System.out.println(obj);
        }

        // Можно добавить элементы Integer и его подклассов
        list.add(5);
        list.add(new Integer(10));
        //  нельзя добавить элементы других классов, так как мы не знаем точно, какие суперклассы ожидаются

    }



}
