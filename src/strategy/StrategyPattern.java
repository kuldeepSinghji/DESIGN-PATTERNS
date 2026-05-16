package strategy;

public class StrategyPattern {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(new UpiPayment());
        cart.checkout(100);
    }
}
