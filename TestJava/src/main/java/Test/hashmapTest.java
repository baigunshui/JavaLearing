package Test;

import java.util.HashMap;

public class hashmapTest {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1","2");
        System.out.println(hashMap.values());
        String value = hashMap.put("1","3");
        System.out.println(value);
        System.out.println(hashMap.values());
    }
}
