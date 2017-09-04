package lt.zvaliauskas.samplespringproject.service;

public class MyRunnable implements Runnable {

    private final int i;

    public MyRunnable(int i) {
        this.i = i;
    }

    public void run(){
        for(int i = 0; i < 5000; i ++) {
            System.out.println("MyRunnable num " + this.i + " running");
        }
    }
}