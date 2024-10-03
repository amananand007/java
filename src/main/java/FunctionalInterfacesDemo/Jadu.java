package FunctionalInterfacesDemo;

@FunctionalInterface
interface Inter{
    public abstract void m1();
}

//class A implements Inter{
//    @Override
//    public void m1(){
//        System.out.println("hello-m1");
//    }
//}
public class Jadu {
    public static void main(String[] args) {
//        A a = new A();
//        a.m1();

        Inter i = () -> System.out.println("good night");
        i.m1();
    }
}
