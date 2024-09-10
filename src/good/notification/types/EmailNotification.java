package good.notification.types;

import good.notification.Notification;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Email gönderiliyor: " + message);
    }
}