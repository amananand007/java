package constructor;

class Monkey {
    public void sound(){
        System.out.println("khaow khaow!");
    }

}
class Animals {


     Animals(Monkey m) {
        m.sound();
    }

}



public class Main {
    public static void main(String[] args) {

        Monkey m = new Monkey();
       Animals a = new Animals(m);

    }
}
