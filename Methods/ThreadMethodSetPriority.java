package Methods;

public class ThreadMethodSetPriority extends Thread{

    public ThreadMethodSetPriority(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        for (int i = 3; i >= 0; i--) {
            System.out.println(Thread.currentThread().getName()
                    + " - Priority: "
                    + Thread.currentThread().getPriority() + " - count: " + i
            );
            try {
                Thread.sleep(100);
            } catch (Exception ignored){

            }
        }
    }

    public static void main(String[] args) {

        ThreadMethodSetPriority myThread1 = new ThreadMethodSetPriority("Low");
        ThreadMethodSetPriority myThread2 = new ThreadMethodSetPriority("Medium");
        ThreadMethodSetPriority myThread3 = new ThreadMethodSetPriority("High");

        myThread1.setPriority(Thread.MIN_PRIORITY);
        myThread2.setPriority(Thread.NORM_PRIORITY);
        myThread3.setPriority(Thread.MAX_PRIORITY);

        myThread1.start();
        myThread2.start();
        myThread3.start();

    }
}
