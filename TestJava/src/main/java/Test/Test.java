/*
    -XX:+TraceClassLoading用于追踪类的加载信息并打印出来

    +XX:+<option> 表示开启option选项
    +XX:-<option> 表示关闭option选项
    +XX:<option>=<value> 表示将option选项的值设为value
 */
package Test;

public class Test {
    public static void main(String[] args) {
//        System.out.println(teacher.str2);
        System.out.println(employee.num);
        System.out.println(employee.m);
        System.out.println(employee.i);
    }
}
class person{
    public static String str = "welcome";

    static {
        System.out.println("This is person block");
    }
}

class teacher extends person{
    public static String str2 = "hello";

    static {
        System.out.println("This is teacher block");
    }
}

class employee extends person{
    public static final String str3 = "hello world";
    public static final short num = 7;
    public static final int i = 2;
    public static int m = 128;
    static {
        System.out.println("This is employee block");
    }
}