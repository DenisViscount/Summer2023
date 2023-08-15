package task01;

public class Main {
    public static void main(String[] args) {
        MayClass<Integer,String> intStringMayClass = new MayClass<>(1,"Hello");
        String value = intStringMayClass.getValue();
        Integer key = intStringMayClass.getKey();

        System.out.println("key = " + key );
        System.out.println("value = " + value);

        intStringMayClass.setValue("world");
        intStringMayClass.setKey(8);

        System.out.println("Ubdate Key = " + intStringMayClass.getValue());
        System.out.println("Ubdate Value = " + intStringMayClass.getKey());




    }
}