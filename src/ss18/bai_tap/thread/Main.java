package ss18.bai_tap.thread;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        NumberGenerator generator2 = new NumberGenerator();

        Thread thread1 = new Thread(generator);
        Thread thread2 = new Thread(generator2);

//        thread1.setPriority(Thread.MAX_PRIORITY);
//        thread2.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();
    }
}
