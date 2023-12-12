package SingletonPattern;

public class QueueManager {
    private static volatile QueueManager instance;
    private int currentNumber;

    private QueueManager() {
        this.currentNumber = 1;
    }

    public static QueueManager getInstance() {
        if (instance == null) {
            synchronized (QueueManager.class) {
                if (instance == null) {
                    instance = new QueueManager();
                }
            }
        }
        return instance;
    }

    public void resetNumber(int newNumber) {
        if (isValidQueueNumber(newNumber)) {
            currentNumber = newNumber;
            System.out.println("Queue number reset to: " + newNumber);
        } else {
            System.out.println("Invalid queue number. Reset not performed.");
        }
    }

    public void serveNextCustomer() {
        System.out.println("Serving customer with queue number: "+currentNumber);
        currentNumber++;
    }
    public int getCurrentQueueNumber() {
        return currentNumber;
    }

    private boolean isValidQueueNumber(int queueNumber) {
        return queueNumber >= 1;
    }
}
