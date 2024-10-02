package InheritanceDemo;


class CarsHorn{

    public void horn(){
        System.out.println("It's the normal horn");
    }

}


class Nano extends CarsHorn{

    int a = 10;
    public void horn(){
        System.out.println("It's me nano horn");
    }


}

public class Car {

    public static void main(String[] args) {

       Nano nano = new Nano();
       nano.horn();

       CarsHorn ch = new CarsHorn();

//        System.out.println(ch.horn());


       ch.horn();

    }

}
