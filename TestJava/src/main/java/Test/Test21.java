package Test;

import java.sql.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * 现场上下文加载器的一般使用模式（获取-使用-还原）
 *
 * ClassLoader classloader = Thread.currentThread().getContextClassLoader();
 *
 * try{
 *     Thread.currentThread().setContextClassLoader(targetTccl);
 *     myMethod();
 * }finally{
 *     Thread.currentThread().setContextClassloader(classloader);
 * }
 *
 * 当高层提供了统一的接口让低层去实现，同时又要高层加载（或实例化）低层的类时，就必须要通过线程上下文加载器来帮助高层的ClassLoader
 * 找到并加载类。
 */

public class Test21 {
    public static void main(String[] args) {
        //Thread.currentThread().setContextClassLoader(Test21.class.getClassLoader().getParent());
        ServiceLoader<Driver> loader = ServiceLoader.load(Driver.class);
        Iterator<Driver> iterator = loader.iterator();

        while (iterator.hasNext()) {
            Driver driver = iterator.next();
            System.out.println("driver: " + driver.getClass() + ",loader: " + driver.getClass().getClassLoader());
        }

        System.out.println("当前线程上下文类加载器：" + Thread.currentThread().getContextClassLoader());
        System.out.println("ServiceLoader的类加载器：" + ServiceLoader.class.getClassLoader());
    }
}
