package task06;

public class BankAccount <T> {
    private T sum;
    private T id;

    public BankAccount(T sum, T id) {
        this.sum = sum;
        this.id = id;
    }

    public T getSum() {
        return sum;
    }

    public void setSum(T sum) {
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}
