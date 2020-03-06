package jdk8Test.newjdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest {
    public static String getString(Supplier<String> supplier){
        return supplier.get() + "test";
    }

    public static String getString2(String str, Function<String, String> function){
        return function.apply(str);
    }

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 10);
        Student student2 = new Student("lisi", 90);
        Student student3 = new Student("wangwu", 50);
        Student student4 = new Student("zhaoliu", 40);


        List<Student> students = Arrays.asList(student1, student2, student3, student4);

//        students.sort((studentParam1, studentParam2) ->
//                Student.compareStudentByScore(studentParam1, studentParam2));
//        students.forEach(item -> System.out.println(item.getScore()));
//
//        students.sort(Student::compareStudentByName);
//        students.forEach(System.out::println);

//        StudentComparator studentComparator = new StudentComparator();
//
//        students.sort((studentParam1, studentParam2) ->
//                studentComparator.compareStudentByScore(studentParam1,studentParam2));
//        students.forEach(student -> System.out.println(student.getScore()));
//
//        students.sort(studentComparator::compareStudentByScore);
//        students.forEach(student -> System.out.println(student.getScore()));
//
        students.sort(Student::compareByName);
        students.forEach(student -> System.out.println(student.getName()));

//        List<String> cities = Arrays.asList("beijing", "tianjin", "wuhan", "guangzhou");
//        Collections.sort(cities, (city1, city2) -> city1.compareToIgnoreCase(city2));
//        cities.forEach(System.out::println);
//
//        Collections.sort(cities, String::compareToIgnoreCase);
//        cities.forEach(System.out::println);

        MethodReferenceTest methodReferenceTest = new MethodReferenceTest();
        System.out.println(methodReferenceTest.getString(String::new));
        System.out.println(methodReferenceTest.getString2("hello", String::new));
    }
}
