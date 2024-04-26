package java9.privateMethods;

public class SendNotificationsImpl implements SendNotifications{

    public static void main(String[] args) {

        SendNotifications sendNotifications = new SendNotificationsImpl();
        sendNotifications.sendNotification();
        SendNotifications.sendNotifications();
    }
}
