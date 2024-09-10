package bad.notification;

public class NotificationService {
    public void sendNotification(NotificationType notificationType, String message) {
        if (notificationType.equals(NotificationType.EMAIL)) {
            sendEmail(message);
        } else if (notificationType.equals(NotificationType.SMS)) {
            sendSms(message);
        } else if (notificationType.equals(NotificationType.PUSH)) {
            sendPushNotification(message);
        } else if (notificationType.equals(NotificationType.WHATSAPP)) {
            sendWhatsAppNotification(message);
        } else {
            throw new IllegalArgumentException("Geçersiz bildirim türü.");
        }
    }

    private void sendEmail(String message) {
        System.out.println("Email gönderiliyor: " + message);
    }

    private void sendSms(String message) {
        System.out.println("SMS gönderiliyor: " + message);
    }

    private void sendPushNotification(String message) {
        System.out.println("Push Bildirimi gönderiliyor: " + message);
    }

    private void sendWhatsAppNotification(String message) {
        System.out.println("WhatsApp bildirimi gönderiliyor:" + message);
    }
}