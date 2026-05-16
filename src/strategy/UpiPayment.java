package strategy;

public class UpiPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("UPI payment method amount: " + amount);
    }
}
