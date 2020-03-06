package Test;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class Test10 {
    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();

        //ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        String name = "Test/Test9.class";

        Enumeration<URL> urls = classLoader.getResources(name);
        while (urls.hasMoreElements()) {
            URL url = urls.nextElement();
            System.out.println(url);
        }

        System.out.println("------------");

        Class<?> clazz1 = String.class;
        System.out.println(clazz1.getClassLoader());

        System.out.println("--------------");
        Class<?> clazz2 = Test9.class;
        System.out.println(clazz2.getClassLoader());
    }
}
