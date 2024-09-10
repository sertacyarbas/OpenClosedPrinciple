package good.notification.types;

import good.notification.Notification;

public class WhatsAppNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("WhatsApp bildirimi gönderiliyor: " + message);
    }
}