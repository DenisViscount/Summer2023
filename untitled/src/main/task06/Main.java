package task06;

public class Main {
    public static void main(String[] args) {
        BankAccount<String> bankAccount = new BankAccount<>("1000","12");
        BankAccount<Integer> bankAccount1 = new BankAccount<>(1000,13);
        BankAccount<Double> bankAccount2 = new BankAccount<>(1000.555,15.00);


    }
}
