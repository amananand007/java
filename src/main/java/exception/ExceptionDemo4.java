package exception;

public class ExceptionDemo4 {

    public static void main(String[] args) {

        int arr[] = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = i;
        }

        try {
          int res = arr[0]/0;
            throw new ArithmeticException("Request failed due to technical error");
        }

        catch (ArithmeticException e) {
            System.out.println("I am in catch");
            e.printStackTrace();
        }
    }
}
