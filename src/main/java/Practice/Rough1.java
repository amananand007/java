package Practice;


import java.util.Scanner;

class Addition{

    int sum(int a, int b){

        int c = a +b;
        return c;
    }
}


public class Rough1 {

    public static void main (String args[]){

        int a = 5;
        int b =10;

        Addition add = new Addition();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first value:");
        int c = sc.nextInt();
        System.out.println("Enter the second value:");
        int d = sc.nextInt();
        int result = add.sum(c,d);
        System.out.println(result);

    }
}
