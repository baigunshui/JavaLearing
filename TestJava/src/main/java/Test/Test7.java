package Test;

public class Test7 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> class1 = Class.forName("java.lang.String");
        System.out.println(class1.getClassLoader());

        Class<?> class2 = Class.forName("Test.C");
        System.out.println(class2.getClassLoader());
    }
}

class C{

}