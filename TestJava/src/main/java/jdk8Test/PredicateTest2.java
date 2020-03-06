package jdk8Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        PredicateTest2 predicateTest2 = new PredicateTest2();

        predicateTest2.conditionFilter(list, item -> item % 2 == 0);
        System.out.println("-------------");
        predicateTest2.conditionFilter(list, item -> true);
        System.out.println("-------------");

        predicateTest2.conditionFilter2(list, item -> item > 5, item -> item % 2 == 0);
        System.out.println("-------------");

        System.out.println(Predicate.isEqual("test").test("test"));
    }

    public void conditionFilter(List<Integer> list, Predicate<Integer> predicate){
        for (Integer integer : list){
            if(predicate.test(integer)){
                System.out.println(integer);
            }
        }
    }

    public void conditionFilter2(List<Integer> list, Predicate<Integer> predicate,
                                 Predicate<Integer> predicate2){
        for (Integer integer : list){
            if (predicate.and(predicate2).test(integer)){
                System.out.println(integer);
            }
        }
    }
//以前的方法
    public void findAllEvens(List<Integer> list){
        for (Integer integer : list){
            if (integer % 2 == 0){
                System.out.println(integer);
            }
        }
    }
}
