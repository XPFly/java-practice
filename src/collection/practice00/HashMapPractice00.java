package collection.practice00;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice00 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        String key = "a";

        System.out.println(key.hashCode() >>> 16);

        System.out.println(hash(key));

        int i = 15;
        System.out.println();

        System.out.println(key.getBytes().length);
    }

    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}
