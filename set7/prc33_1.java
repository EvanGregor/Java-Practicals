class SumThread extends Thread {
    private int start;
    private int end;
    private int partialSum;

    // Constructor to define range of numbers this thread will handle
    public SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        partialSum = 0;
        for (int i = start; i <= end; i++) {
            partialSum += i;
        }
    }

    // Method to return the partial sum calculated by this thread
    public int getPartialSum() {
        return partialSum;
    }
}

public class prc33_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input N and number of threads
        System.out.print("Enter the value of N (sum numbers from 1 to N): ");
        int N = scanner.nextInt();
        
        System.out.print("Enter the number of threads: ");
        int numThreads = scanner.nextInt();

        // Create an array to hold threads
        SumThread[] threads = new SumThread[numThreads];

        // Calculate the range of numbers each thread should handle
        int range = N / numThreads;
        int start = 1;

        // Create and start threads
        for (int i = 0; i < numThreads; i++) {
            int end = (i == numThreads - 1) ? N : (start + range - 1); // Last thread takes the remaining range
            threads[i] = new SumThread(start, end);
            threads[i].start();
            start = end + 1;
        }

        // Wait for all threads to finish and collect results
        int totalSum = 0;
        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join(); // Wait for the thread to finish
                totalSum += threads[i].getPartialSum(); // Add each thread's partial sum to total sum
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }

        // Display the final result
        System.out.println("The sum of numbers from 1 to " + N + " is: " + totalSum);
    }
}
