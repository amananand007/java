package exception;

public class ExceptionDemo2 {
    public static void main(String[] args) {

        int arr[] = new int[5];

        int res;


        try {
            res = arr[1] / 0; // primary logic

        } catch (ArithmeticException e) {

            // handling code

            res = 10;  // secondary logic
        }
        System.out.println(res);
    }
}
