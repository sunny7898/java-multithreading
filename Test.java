public class Test {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();

        for(; ;) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
