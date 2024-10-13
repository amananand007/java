package StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
        System.out.println(l1);
        System.out.println("__________________________");


        // WAP to take out list where num greater than 20
        List<Integer> collect = l1.stream().filter(i -> i > 20).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("__________________________");

        // WAP to take out final list where we are adding 5 to each element
       List<Integer> collect2 = l1.stream().map(i -> i+5).collect(Collectors.toList());
       System.out.println(collect2);
       System.out.println("__________________________");

       // Terminal operations
        Stream<Integer> s = Stream.of(1,2,3,4,5,6);

        Object[] array = s.toArray();
        for(Object a:array){
            System.out.print(a+ " ");
        }

        System.out.println();
        System.out.println("_______________");

        Stream<Integer> s1  = Stream.of(1,2,3,4,5,6);
        long count = s1.count();
        System.out.println(count);

        System.out.println();
        System.out.println("_______________");

        // forEach()
        Stream<Integer> s2 = Stream.of(1,2,3,4,5,6);
        s2.forEach(ele -> System.out.print(ele + " "));


    }
}
