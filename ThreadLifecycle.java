public class ThreadLifecycle extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLifecycle myThread = new ThreadLifecycle(); // NEW
        System.out.println(myThread.getState());

        myThread.start();  // RUNNABLE (RUNNING)
        System.out.println(myThread.getState());
        // Even though this is running, this will still show main thread as RUNNABLE
        System.out.println("Main thread state: " + Thread.currentThread().getState());

        Thread.sleep(100); // Pause the current: main thread To give time to other thread
        System.out.println(myThread.getState()); // TIMED_WAITING

        myThread.join(); // main thread waits for this thread to complete itself and join back the flow
        System.out.println(myThread.getState());
    }
}
