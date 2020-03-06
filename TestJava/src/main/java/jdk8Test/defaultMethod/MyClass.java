package jdk8Test.defaultMethod;

import java.io.File;
import java.util.Set;
import java.util.TreeSet;

public class MyClass extends MyImplement1 implements MyInterface2{



    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.myMethod();
        Set<String> words = new TreeSet<String>();
        System.out.println(words);
    }
}
