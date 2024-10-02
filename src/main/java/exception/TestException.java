package exception;

public class TestException {

    public static void main(String[] args) {

        System.out.println("Before try");

        try{
            System.out.println("before risky code");
            System.out.println(10/0);
            System.out.println("after risky code");
        }

        catch(Exception e){
            System.out.println("In catch block");
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println(e);

        }
        System.out.println("Aman");
        System.out.println("Anand");
    }
}
