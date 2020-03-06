package jdk8Test;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        FunctionTest test = new FunctionTest();
        System.out.println(test.compute(1, value ->{return 2*value;}));
        System.out.println(test.compute1(2, value -> value > 2));
    }

    public int compute(int a, Function<Integer,Integer> function){
        int result = function.apply(a);

        return result;
    }

    public boolean compute1(int a, Function<Integer,Boolean> function){
        boolean result = function.apply(a);

        return result;
    }

    public String convert(int a, Function<Integer,String> function){
        return function.apply(a);
    }
}
