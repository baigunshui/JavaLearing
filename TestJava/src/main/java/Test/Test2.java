package Test;

public class Test2 {
    public static void main(String[] args) {
        person2 person2 = new person2();
        person2[] person2s = new person2[1];
        System.out.println(person2s.getClass());

        person2[][] person2s1 = new person2[1][1];
        System.out.println(person2s1.getClass());

        System.out.println(person2s.getClass().getSuperclass());
        System.out.println(person2s1.getClass().getSuperclass());

        System.out.println("========");

        int[] ints = new int[1];
        System.out.println(ints.getClass());
        System.out.println(ints.getClass().getSuperclass());
    }
}

class person2 {
    static {
        System.out.println("person1 static block");
    }
}
