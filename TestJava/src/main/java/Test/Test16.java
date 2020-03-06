package Test;

import java.lang.reflect.Method;

public class Test16 {
    public static void main(String[] args) throws Exception {
        Test12 loader1 = new Test12("loader1");
        Test12 loader2 = new Test12("loader2");

//        loader1.setPath("C:\\Users\\lianzw\\Desktop\\file\\");
//        loader2.setPath("C:\\Users\\lianzw\\Desktop\\file\\");

        Class<?> clazz1 = loader1.loadClass("Test.MyPerson");
        Class<?> clazz2 = loader2.loadClass("Test.MyPerson");

        System.out.println(clazz1.equals(clazz2));

        Object object1 = clazz1.newInstance();
        Object object2 = clazz2.newInstance();

        Method method = clazz1.getMethod("setMyPerson", Object.class);
        method.invoke(object1, object2);
    }
}
