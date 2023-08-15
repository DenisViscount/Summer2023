package task02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(8);
        Util.printArrayList(intList);


         Util.fillList(intList,1);
        Util.printArrayList(intList);

        Util.addList(intList,100);
        Util.printArrayList(intList);

        int number1 = Util.getList(intList,3);
        System.out.println(number1);









    }

}