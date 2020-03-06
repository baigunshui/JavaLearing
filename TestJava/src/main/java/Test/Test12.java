package Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Test12 extends ClassLoader {
    private String classLoaderName;

    private final String fileExtension = ".class";

    private String path;

    public Test12(String classLoaderName) {
        super(); //将系统类加载器当作该类加载器的父加载器
        this.classLoaderName = classLoaderName;
    }

    public Test12(ClassLoader parent, String classLoaderName) {
        super(parent); //显式指定该类加载器的父加载器
        this.classLoaderName = classLoaderName;
    }

    public void setPath(String path) {
        this.path = path;
    }

//    @Override
//    public String toString() {
//        return "[" + this.classLoaderName + "]";
//    }

    @Override
    protected Class<?> findClass(String className) throws ClassNotFoundException {
        System.out.println("findClass invoked: " + className);
        System.out.println("class loader name: " + this.classLoaderName);
        byte[] data = this.loadClassData(className);

        return this.defineClass(className, data, 0, data.length);
    }

    public byte[] loadClassData(String className) {
        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream baos = null;

        className = className.replace(".", "\\");

        try {
            //this.classLoaderName = this.classLoaderName.replace(".", "/");

            is = new FileInputStream(new File(this.path + className + this.fileExtension));
            System.out.println(is.toString());
            baos = new ByteArrayOutputStream();

            int ch = 0;

            while (-1 != (ch = is.read())) {
                baos.write(ch);
            }


            data = baos.toByteArray();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                is.close();
                baos.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        return data;
    }

    public static void main(String[] args) throws Exception {
        Test12 loader1 = new Test12("loader1");
        loader1.setPath("C:\\Users\\lianzw\\Desktop\\file\\");

        Class<?> clazz = loader1.loadClass("Test.Test10");
        System.out.println("class: " + clazz.hashCode());
        Object object = clazz.newInstance();
        System.out.println(object.getClass().getClassLoader());
        System.out.println();

//        loader1 = null;
//        clazz = null;
//        object = null;
//        System.gc();


//        Test12 loader2 = new Test12(loader1,"loader2");
//        loader2.setPath("C:\\Users\\lianzw\\Desktop\\file\\");
//
//        Class<?> clazz2 = loader2.loadClass("Test.Test10");
//        System.out.println("class2: " + clazz2.hashCode());
//        Object object2 = clazz2.newInstance();
//        System.out.println(object2);
//        System.out.println();
//
//        Test12 loader3 = new Test12(loader2,"loader3");
//        loader3.setPath("C:\\Users\\lianzw\\Desktop\\file\\");
//
//        Class<?> clazz3 = loader3.loadClass("Test.Test10");
//        System.out.println("class3: " + clazz3.hashCode());
//        Object object3 = clazz3.newInstance();
//        System.out.println(object3);
//        System.out.println();

//        loader1 = new Test12("loader1");
//        loader1.setPath("C:\\Users\\lianzw\\Desktop\\file\\");
//
//        clazz = loader1.loadClass("Test.Test10");
//        System.out.println("class: " + clazz.hashCode());
//        object = clazz.newInstance();
//        System.out.println(object);
//        System.out.println();

        //test(loader1);
    }

//    public static void test(ClassLoader classLoader) throws Exception {
//        Class<?> clazz = classLoader.loadClass("Test.Test10");
//        Object object = clazz.newInstance();
//
//        System.out.println(object);
//    }
}
