package Test;

public class Test11 {
    public static void main(String[] args) {
        String[] strings = new String[2];
        System.out.println(strings.getClass());
        System.out.println(strings.getClass().getClassLoader());
        System.out.println("------------");

        Test9[] test9s = new Test9[2];
        System.out.println(test9s.getClass());
        System.out.println(test9s.getClass().getClassLoader());
        System.out.println("--------------");

        int[] a = new int[2];
        System.out.println(a.getClass());
        System.out.println(a.getClass().getClassLoader());


    }
}
