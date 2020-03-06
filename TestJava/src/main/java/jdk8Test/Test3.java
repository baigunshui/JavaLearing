package jdk8Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Test3 {
    public static void main(String[] args) {
//        MyInterface3_0 i1 = () -> {};
//        System.out.println(i1.getClass().getInterfaces()[0]);
//
//        MyInterface3_0 i2 = () -> {};
//        System.out.println(i2.getClass().getInterfaces()[0]);
//
//        new Thread(()->{
//            System.out.println("hello world");
//        }).start();

        List<String> list = Arrays.asList("hello", "world", "hello world");

//        list.forEach(item -> {
//            System.out.println(item.toUpperCase());
//        });

        List<String> list2 = new ArrayList<>();
//        list.forEach(item -> {
//            list2.add(item.toUpperCase());
//        });
//        list2.forEach(item -> {
//            System.out.println(item);
//        });
        /**
         * list.stream()是指串型流
         * list.parallelStream()是指并行流
         */

//        list.stream().map(item -> item.toUpperCase()).forEach(item -> System.out.println(item));
//        list.stream().map(String::toUpperCase).forEach(item -> System.out.println(item));

        Function<String, String> function = String::toUpperCase;
        System.out.println(function.getClass().getInterfaces()[0]);
    }
}

@FunctionalInterface
interface MyInterface3_0{
    void myMethod3_0();
}

@FunctionalInterface
interface MyInterface3_1{
    void myMethod3_1();
}