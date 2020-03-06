package Test;

import java.lang.reflect.Method;

public class Test15 {

    public static void main(String[] args) throws Exception {
        Test12 loader1 = new Test12("loader1");
        Test12 loader2 = new Test12("loader2");

        Class<?> clazz1 = loader1.loadClass("Test.MyPerson");
        Class<?> clazz2 = loader2.loadClass("Test.MyPerson");

        System.out.println(clazz1.equals(clazz2));

        Object object1 = clazz1.newInstance();
        Object object2 = clazz2.newInstance();

        Method method = clazz1.getMethod("setMyPerson", Object.class);
        method.invoke(object1, object2);
        method = clazz1.getMethod("getMyPerson");
        System.out.println(object1);
        System.out.println(object2);
        System.out.println(method.invoke(object1).toString());
    }
}
