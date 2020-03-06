package jdk8Test;

import java.util.function.Supplier;

public class StudentTest {

    public static void main(String[] args) {
        Supplier<Student> supplier = () ->new Student();
        System.out.println(supplier.get().getName());

        Supplier<Student> supplier1 = Student::new;
        System.out.println(supplier1.get().getName());
    }
}
