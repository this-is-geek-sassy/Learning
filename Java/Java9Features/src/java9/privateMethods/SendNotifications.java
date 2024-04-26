package java9.privateMethods;

public interface SendNotifications {

    static void sendNotifications() {
        establishConnection();
        System.out.println("sending multiple notifications");
    }

    default void sendNotification() {
        establishConnection();
        System.out.println("sending multiple notification");
    }

    private static void establishConnection() {
        System.out.println("establishing a connection");
    }
}
