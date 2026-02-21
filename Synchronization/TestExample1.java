package Synchronization;

public class TestExample1 {

    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThreadExample1 t1 = new MyThreadExample1(counter);
        MyThreadExample1 t2 = new MyThreadExample1(counter);

        t1.start();
        t2.start();

        // Without these the main thread won't wait for t1 t2 to print count
        try {
            t1.join();
            t2.join();
        } catch (Exception e){

        }
        System.out.println(counter.getCount());
    }
}
