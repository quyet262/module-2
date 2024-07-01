package ss18.bai_tap.thread;

public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() +
                    ", Number: " + i +
                    ", HashCode: " + this.hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
