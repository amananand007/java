package exception;

public class ExceptionDemo3 {

    public static void main(String[] args) {

        try {

//            System.out.println(10/0);
            throw new ArithmeticException("Request failed due to technical error");
        }

        catch (ArithmeticException e){
//            e.printStackTrace();
//            System.out.println(e);
        }



    }
}
