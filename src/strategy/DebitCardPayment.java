package strategy;

public class DebitCardPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Debit card payment method amount: " + amount);
    }
}
