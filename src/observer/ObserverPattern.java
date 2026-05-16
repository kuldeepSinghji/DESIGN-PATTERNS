package observer;

public class ObserverPattern {
    public static void main(String[] args) {
        Dealer dealer1 = new CarDealer("A");
        Dealer dealer2 = new CarDealer("B");
        Dealer dealer3 = new CarDealer("C");

        CarAuction auction = new CarAuction("Ford 134");
        auction.addToWatchList(dealer1);
        auction.addToWatchList(dealer2);
        auction.addToWatchList(dealer3);

        auction.placeBid(100, dealer3);
        auction.placeBid(200, dealer1);

        auction.sellCar(dealer2, 3233);
        auction.placeBid( 12323, dealer1);
    }
}
