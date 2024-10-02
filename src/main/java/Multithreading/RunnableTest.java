package Multithreading;

class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("hi");
        }
    }
}



public class RunnableTest {
    public static void main(String[] args) {

        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();

//        System.out.println("Main thread");



    }
}
