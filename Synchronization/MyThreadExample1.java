package Synchronization;

public class MyThreadExample1 extends Thread{

    private Counter counter;

    public MyThreadExample1(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1_00_00; i++) {
            counter.increment();
        }
    }
}
