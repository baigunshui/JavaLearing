package Test;

public class Test18 {

    public static void main(String[] args) {
        System.out.println(System.getProperty("sun.boot.class.path").replace(";" , "\n"));
        System.out.println("---------------------");
        System.out.println(System.getProperty("java.ext.dirs").replace(";" , "\n"));
        System.out.println("---------------------");
        System.out.println(System.getProperty("java.class.path").replace(";" , "\n"));
    }
}
