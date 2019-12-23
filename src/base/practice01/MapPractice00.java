package base.practice01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapPractice00 {

    public static void main(String[] args) {

        Entity00 e1 = new Entity00("a", "1");
        Entity00 e2 = new Entity00("b", "2");
        Entity00 e3 = new Entity00("c", "3");
        Entity00 e4 = new Entity00("a", "4");
        Entity00 e5 = new Entity00("e", "5");

        List<Entity00> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        Map<String, String> collect = list.stream().collect(Collectors.toMap(Entity00::getName, Entity00::getAge));
        System.out.println(collect);
    }
}
