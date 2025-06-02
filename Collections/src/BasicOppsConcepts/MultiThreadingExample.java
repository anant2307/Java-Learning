package BasicOppsConcepts;

// Thread class using extends Thread
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("MyThread: " + i);
            try {
                Thread.sleep(1000); // pause for 500ms
            } catch (InterruptedException e) {
                System.out.println("MyThread interrupted");
            }
        }
    }
}

// Runnable implementation
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("MyRunnable: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("MyRunnable interrupted");
            }
        }
    }
}

public class MultiThreadingExample {
    public static void main(String[] args) {
        // Using Thread class
        MyThread t1 = new MyThread();
        
        // Using Runnable interface
        Thread t2 = new Thread(new MyRunnable());

        // Start both threads
        t1.start();
        t2.start();

        // Main thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("MainThread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("MainThread interrupted");
            }
        }
    }
}
