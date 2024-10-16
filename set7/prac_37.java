import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// Shared buffer class with synchronization
class SharedBuffer {
    private Queue<Integer> buffer = new LinkedList<>();
    private int capacity;

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }

    // Method for the producer to add items to the buffer
    public synchronized void produce(int item) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait();  // Wait if the buffer is full
        }
        buffer.add(item);
        System.out.println("Produced: " + item);
        notifyAll();  // Notify the consumer that an item has been produced
    }

    // Method for the consumer to take items from the buffer
    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait();  // Wait if the buffer is empty
        }
        int item = buffer.poll();
        System.out.println("Consumed: " + item);
        notifyAll();  // Notify the producer that space is available in the buffer
        return item;
    }
}

// Producer thread class
class Producer extends Thread {
    private SharedBuffer buffer;
    private int itemsToProduce;

    public Producer(SharedBuffer buffer, int itemsToProduce) {
        this.buffer = buffer;
        this.itemsToProduce = itemsToProduce;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < itemsToProduce; i++) {
                buffer.produce(i);
                Thread.sleep(500);  // Simulate time taken to produce an item
            }
        } catch (InterruptedException e) {
            System.out.println("Producer interrupted.");
        }
    }
}

// Consumer thread class
class Consumer extends Thread {
    private SharedBuffer buffer;
    private int itemsToConsume;

    public Consumer(SharedBuffer buffer, int itemsToConsume) {
        this.buffer = buffer;
        this.itemsToConsume = itemsToConsume;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < itemsToConsume; i++) {
                buffer.consume();
                Thread.sleep(1000);  // Simulate time taken to consume an item
            }
        } catch (InterruptedException e) {
            System.out.println("Consumer interrupted.");
        }
    }
}

public class prac_37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for buffer capacity
        System.out.print("Enter the buffer capacity: ");
        int bufferCapacity = scanner.nextInt();

        // Input for the number of items to produce and consume
        System.out.print("Enter the number of items to produce: ");
        int itemsToProduce = scanner.nextInt();

        System.out.print("Enter the number of items to consume: ");
        int itemsToConsume = scanner.nextInt();

        // Create shared buffer
        SharedBuffer sharedBuffer = new SharedBuffer(bufferCapacity);

        // Create and start producer and consumer threads
        Producer producer = new Producer(sharedBuffer, itemsToProduce);
        Consumer consumer = new Consumer(sharedBuffer, itemsToConsume);

        producer.start();
        consumer.start();

        try {
            // Wait for both threads to complete execution
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Producer and Consumer execution completed.");
    }
}
