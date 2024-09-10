package good.notification.types;

import good.notification.Notification;

public class SmsNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("SMS gönderiliyor: " + message);
    }
}