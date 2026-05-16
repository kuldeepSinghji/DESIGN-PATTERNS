package observer;


import java.util.ArrayList;
import java.util.List;

//subject
public class CarAuction {
    List<Dealer> watchList = new ArrayList<>();
    private String carName;
    private double highestBid;
    private boolean isCarSold;

    public CarAuction(String carName){
        this.carName = carName;
    }

    private boolean isCarSold() {
        return isCarSold;
    }

    private void setCarSold(boolean carSold) {
        isCarSold = carSold;
    }

    public void addToWatchList(Dealer dealer){
        this.watchList.add(dealer);
    }

    public void placeBid(double amount, Dealer dealer){
        if(amount > highestBid && !isCarSold){
            this.highestBid = amount;
            System.out.println(dealer.getName() + " placed highest bid of amount: "
                    + amount + " for car: " + getCarName());
            notifyDealers("New highest bid of amount: " +
                    amount + " for car: " + getCarName());
        }
        if(isCarSold){
            System.out.println(dealer.getName() + " Sorry, car has been sold");
        }
    }

    public void notifyDealers(String message){
        for(Dealer dealer: watchList){
            dealer.update(message);
        }
    }

    public String getCarName(){
        return this.carName;
    }

    public void sellCar(Dealer dealer, double amount) {
        if(this.highestBid + 100 < amount){
            setCarSold(true);
            notifyDealers(dealer.getName() + " purchased the car with amount: " + amount);
        }
    }

}
