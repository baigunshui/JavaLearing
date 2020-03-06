package Test;

public class Test4 {
    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();
        System.out.println("counter1: " + SingleTon.counter1);
        System.out.println("counter2: " + SingleTon.counter2);
    }
}

class SingleTon{
    public static int counter1;

    private static SingleTon singleTon = new SingleTon();

    static {
        System.out.println("Me First");
    }

    private SingleTon(){
        counter1++;
        counter2++;
        System.out.println(counter1);
        System.out.println(counter1);
    }

    public static int counter2 = 0;
    static {
        System.out.println(counter1+"out");
    }

    public static SingleTon getInstance(){
        return singleTon;
    }
}