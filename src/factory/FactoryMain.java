package factory;

public class FactoryMain {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.get("SMS");
        if(notification != null){
            notification.send();
        }
    }
}
