public class ThreadMethodDaemon extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread is running");
        }
    }

    public static void main(String[] args) {

        ThreadMethodDaemon t1 = new ThreadMethodDaemon();
        t1.setDaemon(true);
        t1.start();
        System.out.println("Main done");
    }
}
