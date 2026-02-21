package Methods;

public class ThreadMethodInterrupt extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Thread is running...");
        } catch (InterruptedException e){
            System.out.println("Thread interrupted: " + e);
        }
    }

    public static void main(String[] args) {

        ThreadMethodInterrupt t1 = new ThreadMethodInterrupt();
        t1.start();

        t1.interrupt(); // Stop whatever is thread doing

    }
}
