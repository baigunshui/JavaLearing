package Test;

//调用ClassLoader类的loadClass方法加载一个类，并不是对类的主动使用，不会导致类的初始化
class
CL{
    static {
        System.out.println("Class CL");
    }
}

public class Test8 {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader loader = ClassLoader.getSystemClassLoader();

        Class<?> clazz = loader.loadClass("Test.CL");

        System.out.println(clazz);
        System.out.println("-------------");

        clazz = Class.forName("Test.CL");

        System.out.println(clazz);
    }
}
