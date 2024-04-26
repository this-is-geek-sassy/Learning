package java9.privateMethods;

public interface SendNotifications {

    default void sendNotifications() {
        establishConnection();
        System.out.println("sending multiple notifications");
    }

    default void sendNotification() {
        establishConnection();
        System.out.println("sending multiple notification");
    }

    private void establishConnection() {
        System.out.println("establishing a connection");
    }
}
