package good.notification.types;

import good.notification.Notification;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Push Bildirimi gönderiliyor: " + message);
    }
}