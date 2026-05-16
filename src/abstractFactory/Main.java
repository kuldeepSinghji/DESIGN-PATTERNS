package abstractFactory;

import factory.Notification;

public class Main {
    public static void main(String[] args) {
        AbstractNotification notification = new EmailFactory();
        Notification notification1 = notification.createNotification();
        if(notification1 != null){
            notification1.send();
        }
    }
}
