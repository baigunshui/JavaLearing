package jdk8Test.defaultMethod;

public interface MyInterface1 {
    default void myMethod(){
        System.out.println("MyInterface1");
    }
}
