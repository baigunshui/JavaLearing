package Test;

public class Test5 {
    public static void main(String[] args) {
        //System.out.println(MyChild5.b);
        System.out.println(MyParent5_1.thread);
    }
}

interface MyParent5{
    Thread thread = new Thread(){
        {
            System.out.println("MyParent5 invoked");
        }
    };
}

class MyChild5 implements MyParent5{
    public static int b = 5;
}

interface MyGrandpa5_1{
    Thread thread = new Thread(){
        {
            System.out.println("MyGrandpa5_1 invoked");
        }
    };
}

interface MyParent5_1 extends MyGrandpa5_1{
    Thread thread = new Thread(){
        {
            System.out.println("MyParent5_1 invoked");
        }
    };
}
