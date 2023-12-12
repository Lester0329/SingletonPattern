package SingletonPattern;

public class queueSystemDemo {
    public static void main(String[] args) {
        QueueManager display = QueueManager.getInstance();

        display.serveNextCustomer();
        display.serveNextCustomer();
        display.serveNextCustomer();

        System.out.println("Current queue number: " + display.getCurrentQueueNumber());

        display.resetNumber(5);

        display.serveNextCustomer();
        display.serveNextCustomer();
        display.serveNextCustomer();

        System.out.println("Updated queue number: " + display.getCurrentQueueNumber());
    }
}
