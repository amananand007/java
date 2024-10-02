package InterfaceDemo;

interface Demo{

    int a = 10; // public,static,final
    void display(); // abstract, public
    // if abstract : then implementation will depend on child
}

class Test implements Demo{

    @Override
    public void display() {
        System.out.println("hello");
    }
}

public class InterfaceTest {

    public static void main(String[] args) {



    }
}
