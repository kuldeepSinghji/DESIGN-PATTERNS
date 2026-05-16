package abstractFactory;

import factory.Notification;
import factory.SMS;

public class SMSFactory extends AbstractNotification{
    @Override
    Notification createNotification() {
        return new SMS();
    }
}
