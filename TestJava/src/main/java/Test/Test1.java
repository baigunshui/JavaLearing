package Test;

import java.util.UUID;

public class Test1 {

    static {
        System.out.println("Test1 initializer");
    }
    public static void main(String[] args) {
        System.out.println(person1.str);
    }
}
class person1{
    public static String str = UUID.randomUUID().toString();

    static {
        System.out.println("person static code");
    }
}
