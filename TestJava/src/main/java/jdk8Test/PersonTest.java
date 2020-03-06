package jdk8Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("zhangsan", 20);
        Person person2 = new Person("lisi", 30);
        Person person3 = new Person("wangwu", 40);

        List<Person> personList = Arrays.asList(person1, person2, person3);
        PersonTest personTest = new PersonTest();

//        List<Person> personResult = personTest.getPersonByUsername("lisi", personList);
//        personResult.forEach(person -> System.out.println(person.getUsername()));

//        List<Person> personResult = personTest.getPersonByAge(
//                20, personList);
//        personResult.forEach(person -> System.out.println(person.getUsername()));
        List<Person> personResult = personTest.getPersonByAge2(20, personList, (age, persons) -> {
            return persons.stream().filter(person -> person.getAge() > age).collect(Collectors.toList());
        });
        personResult.forEach(person -> System.out.println(person.getUsername()));

    }

    public List<Person> getPersonByUsername(String username, List<Person> personList){
        System.out.println(personList.stream().filter(person -> person.getUsername().equals(username)));
        return personList.stream().filter(person -> person.getUsername().equals(username)).
                collect(Collectors.toList());
    }

    public List<Person> getPersonByAge(int age, List<Person> personList){

        BiFunction<Integer, List<Person>, List<Person>> biFunction = (ageOfPerson, persons) ->{
            return persons.stream().filter((Person person) -> person.getAge() > ageOfPerson).collect(Collectors.toList());
        };

        return biFunction.apply(age, personList);
    }

    public List<Person> getPersonByAge2(int age, List<Person> persons, BiFunction<Integer,List<Person>, List<Person>> biFunction){
        return biFunction.apply(age, persons);
    }


}
