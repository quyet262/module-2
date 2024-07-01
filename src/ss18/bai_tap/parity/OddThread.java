package ss18.bai_tap.parity;

public class OddThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i = i + 2) {
            System.out.println("Thread: " + Thread.currentThread().getName() + " Number: "  + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
