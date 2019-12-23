package base.practice00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForLoopPractice00 {

    public static void main(String[] args) {
        String[] arr1 = {"1", "2", "3", "4", "5"};
        String[] arr2 = {"a", "b", "c", "d", "e", "f", "g"};

        List<String> list1 = Arrays.asList(arr1);
        List<String> list2 = Arrays.asList(arr2);

        List<String> list = new ArrayList<>();

//        for(Iterator<String> it1 = list1.iterator(); it1.hasNext();) {
//            for(Iterator<String> it2 = list2.iterator(); it2.hasNext();) {
//                list.add(it1.next() + it2.next());
//            }
//        }

        list1.forEach(s1 -> list2.forEach(s2 -> list.add(s1 + s2)));

//        for (String s1 : arr1) {
//            for (String s2 : arr2) {
//                list.add(s1 + s2);
//            }
//        }

        System.out.println(list);
    }
}
