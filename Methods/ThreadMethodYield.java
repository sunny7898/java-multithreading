package Methods;

public class ThreadMethodYield extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.yield();
        }
    }

    public static void main(String[] args) {

        ThreadMethodYield t1 = new ThreadMethodYield();
        ThreadMethodYield t2 = new ThreadMethodYield();
        t1.start();
        t2.start();
    }
}
