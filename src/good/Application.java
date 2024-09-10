package good;

import good.notification.NotificationService;
import good.notification.types.EmailNotification;
import good.notification.types.PushNotification;
import good.notification.types.SmsNotification;
import good.notification.types.WhatsAppNotification;

public class Application {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        
        service.sendNotification(new EmailNotification(), "E-posta mesajı");
        service.sendNotification(new SmsNotification(), "SMS mesajı");
        service.sendNotification(new PushNotification(), "Push mesajı");
        service.sendNotification(new WhatsAppNotification(), "WhatsApp mesajı");
    }
}
