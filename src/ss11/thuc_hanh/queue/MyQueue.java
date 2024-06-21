package ss11.thuc_hanh.queue;

public class MyQueue {
    int capacity;
    int [] queueArr;
    int head = 0;
    int tail = -1;
    int currentSize = 0;
    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        this.queueArr = new int[this.capacity];
    }
    public boolean isQueueFull(){
        if(currentSize == capacity){
            return true;
        }
        return false;
    }
    public boolean isQueueEmpty(){
        if(currentSize == 0){
            return true;
        }
        return false;
    }
    public void enqueue(int element){
        if(isQueueFull()){
            System.out.println("Queue is full");
        }else {
            tail++;
            if(tail == capacity - 1){
                tail = 0;
            }
            queueArr[tail] = element;
            currentSize++;
            System.out.println("Enqueue " + element);
        }
    }
    public void dequeue(){
        if(isQueueEmpty()){
            System.out.println("Queue is empty");
        }else {
            head++;
            if(head == capacity-1){
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
                head = 0;
            }else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }
}
