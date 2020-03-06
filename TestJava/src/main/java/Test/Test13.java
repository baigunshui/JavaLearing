package Test;

public class Test13 {

    public static void main(String[] args) throws Exception {
        Test12 loader1 = new Test12("loader1");

        loader1.setPath("C:\\Users\\lianzw\\Desktop\\file\\");
        Class<?> clazz = loader1.loadClass("Test.MySample");
        System.out.println("class:" + clazz.hashCode());

        /**
         * 如果注释掉改行，那么并不会实例化MySample对象，即MySample构造方法不会被调用
         * 因此不会实例化MyCat对象，即没有对MyCat进行主动使用，这里就不会加载MyCat Class
         */

        Object object = clazz.newInstance();
        System.out.println(object);
    }
}
