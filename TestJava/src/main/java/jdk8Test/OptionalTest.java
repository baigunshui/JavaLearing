package jdk8Test;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");

        if(optional.isPresent()) {
            System.out.println(optional.get());//不要这样使用代码
        }

        optional.ifPresent(item -> System.out.println(item));//推荐的optional的使用形式
        System.out.println("----------------");
        System.out.println(optional.orElse("world"));
        System.out.println("----------------");
        System.out.println(optional.orElseGet(() -> "nihao"));
    }
}
