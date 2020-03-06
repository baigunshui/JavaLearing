package Test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(MyChild3.b);
    }
}

interface MyParent3{
    public static int a = new Random().nextInt(3);
}

interface MyChild3 extends MyParent3{
    public static int b = new Random().nextInt(5);
}