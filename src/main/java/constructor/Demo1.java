package constructor;

class Animal1{

    Monkey1 m;
    Animal1(Monkey1 m){
        m.sound1();
    }

    public void species(){
        System.out.println("I am of this species");
    }
}


class Monkey1 {
    public void sound1(){
        System.out.println("khaw khaw");
    }

}

public class Demo1 {
    public static void main(String[] args) {

        Animal1 a = new Animal1(new Monkey1());

    }
}
