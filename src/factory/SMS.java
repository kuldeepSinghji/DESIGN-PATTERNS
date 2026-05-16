package factory;

public class SMS implements Notification{
    @Override
    public void send() {
        System.out.println("Sending SMS:..............!");
    }
}
