package Test;

public class Test17 {
    static {
        System.out.println("Test17 initializer");
    }

    public static void main(String[] args) {
        System.out.println(Test17.class.getClassLoader());
        System.out.println(Test1.class.getClassLoader());
    }
}
