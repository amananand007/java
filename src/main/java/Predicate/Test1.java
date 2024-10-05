package Predicate;

import java.util.function.Predicate;

public class Test1 {
    public static void main(String[] args) {

        int x[]  = {1,2,3,4,5,6};
        Predicate<Integer> p1 = I -> I % 2 == 0;
        Predicate<Integer> p2 = I -> I > 2;

        System.out.println("Print all even numbers");
        m1(p1,x);

        System.out.println("Print all numbers greater than 2");
        m1(p2,x);

    }

    public static void m1(Predicate <Integer> p,int [] x){
        for(int i:x){
            if(p.test(i)){
                System.out.println(i);
            }
        }
    }

}
