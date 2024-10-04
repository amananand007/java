package DefaultMethod;

interface I{
    default void m1(){
        System.out.println("Hello m1-I");
    }
}

interface J{
    default void m1(){
        System.out.println("Hello m1-J");
    }
}

public class DefaultMethodDemo implements I,J{
    public static void main(String[] args) {
        DefaultMethodDemo d = new DefaultMethodDemo();
        d.m1();
    }

    @Override
    public void m1() {
        System.out.println("Hi I am here");
    }
}
