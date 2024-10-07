package FunctionDemo;

import java.util.function.Function;

public class Test {
    public static void main(String[] args) {

        Function<String,Integer> i = s-> s.length();

        System.out.println(i.apply("Aman"));
    }
}
