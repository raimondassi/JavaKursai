package lt.zvaliauskas.samplespringproject.service;

public class ExampleMain {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread(1));
        Thread thread2 = new Thread(new MyThread(2));
        Thread thread3 = new Thread(new MyThread(3));
        Thread thread4 = new Thread(new MyThread(4));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

}
