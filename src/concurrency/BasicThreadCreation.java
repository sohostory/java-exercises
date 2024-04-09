package concurrency;

public class BasicThreadCreation extends Thread {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Hello from my thread!");
        });
        thread.start();
    }
}
