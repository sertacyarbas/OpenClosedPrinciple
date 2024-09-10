package bad;

import bad.notification.NotificationService;
import bad.notification.NotificationType;

public class Application {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification(NotificationType.WHATSAPP, "WhatsApp mesajı");
    }
}
