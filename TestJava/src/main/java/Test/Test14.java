package Test;

import sun.misc.Launcher;

public class Test14 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("sun.boot.class.path").replace(";" , "\n"));
        System.out.println("---------------------");
        System.out.println(System.getProperty("java.ext.dirs").replace(";" , "\n"));
        System.out.println("---------------------");
        System.out.println(System.getProperty("java.class.path").replace(";" , "\n"));

        System.out.println(ClassLoader.class.getClassLoader());

        //扩展类加载器与系统类加载器也是有启动类加载器所加载的
        System.out.println(Launcher.class.getClassLoader());

        System.out.println("---------------------");
        System.out.println(System.getProperty("java.system.class.loader"));
        System.out.println(Test14.class.getClassLoader());
        System.out.println(ClassLoader.getSystemClassLoader());
    }
}
