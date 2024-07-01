package ss18.bai_tap.parity;

public class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <= 10; i = i + 2) {
            System.out.println("Thread: "+ Thread.currentThread().getName() + "Number: " + i);
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
