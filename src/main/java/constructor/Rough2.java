package constructor;

class SuperDad{
        int a = 10;
        public void plot(){
            System.out.println("2000 ghaj ka plot");
        }
    }

    class Dad extends SuperDad{





    }




public class Rough2 {
    public static void main(String[] args){
    Dad d = new Dad();
    d.plot();
        System.out.println(d.a);

    }
}
