package Multithreading;

class PriorityTest implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread());
            System.out.println("Child thread");
        }
    }
}


public class PriorityDemo {

    public static void main(String[] args) {

        Thread t1 = new Thread();
    }

}
