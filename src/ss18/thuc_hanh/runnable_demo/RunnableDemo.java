package ss18.thuc_hanh.runnable_demo;

public class RunnableDemo implements Runnable {
    private Thread t;
    private final String threadName;
    public RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }
    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try{
            for (int i = 4; i > 0; i--) {
                System.out.println("Theard " + threadName + "," + i);
                Thread.sleep(50);
            }
        }catch(InterruptedException e){
            System.out.println("Theard " + threadName + " interrupted");
        }
        System.out.println("Theard " + threadName + " Exiting");
    }
    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

}
