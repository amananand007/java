package finalDemo;

class Animal {

    String name = "Sumit"; // instance variable

    void display() {
     String  name1 = "Sumit22"; // local variable
    }
}

class Dog extends Animal{

    String name = "";
    void print(){
        this.name = "Aman";
        System.out.println(this.name);
        System.out.println(super.name);
    }
}




public class SuperAndThis {

    public static void main(String[] args) {

        Animal a = new Animal();

        Dog d = new Dog();
        d.print();
    }
}
