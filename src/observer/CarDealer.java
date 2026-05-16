package observer;

// observer
public class CarDealer implements Dealer{
    private String name;

    public CarDealer(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received Notification: " + message);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
