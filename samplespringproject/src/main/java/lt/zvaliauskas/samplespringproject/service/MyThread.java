package lt.zvaliauskas.samplespringproject.service;

public class MyThread extends Thread {

    private int i;

    public MyThread(int i) {
        this.i = i;
    }

    public void run(){
        for(int i = 0; i < 50; i ++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("MyThread num " + this.i + " running");
        }
    }
}