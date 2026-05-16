package abstractFactory;

import factory.Email;
import factory.Notification;

public class EmailFactory extends AbstractNotification {

    @Override
    Notification createNotification() {
        return new Email();
    }
}
