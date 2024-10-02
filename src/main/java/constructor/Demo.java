package constructor;
    class Animal {
        public void m1() {
            System.out.println("m1");
        }

        public void sum(int a, int b)
        {
            System.out.println(a+b);

        }

        Animal(int a){
            System.out.println(a);
        }
    }


public class Demo {

    public static void main(String args[]){

        Animal a = new Animal(10);
        a.m1();
        a.sum(2,4);


    }
}
