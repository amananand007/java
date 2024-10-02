package Multithreading;

class YieldTest implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread());
            System.out.println("Yield thread");
        }
    }
}




public class YieldDemo {

    public static void main(String[] args) {


    }
}
