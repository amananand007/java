package Predicate;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        Predicate<Integer> p = I -> I > 50;
        Predicate<String> p1 = s -> s.length() > 5;

        System.out.println(p.test(100));
        System.out.println(p1.test("Mohn"));
    }
}
