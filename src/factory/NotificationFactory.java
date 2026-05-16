package factory;

public class NotificationFactory {
    public static Notification get(String type){
        if(type.equalsIgnoreCase("EMAIL")){
            return new Email();
        }else if(type.equalsIgnoreCase("SMS")){
            return new SMS();
        }
        return null;
    }
}
