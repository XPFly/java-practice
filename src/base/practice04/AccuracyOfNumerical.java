package base.practice04;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @description: 数值的精度问题
 * @author: xu_pf@suixingpay.com
 * @create: 2019-12-20 10:41
 **/
public class AccuracyOfNumerical {

    public static void main(String[] args) {
        //int float double long
        //BigDecimal BigInteger

        byte b = -128;
        System.out.println(b);

        //float -> int 强制转化 导致精度丢失
        int int_a = (int) 3.9;
        System.out.println(int_a);

        Entity00 e0 = new Entity00("Tom", "10");
        Entity00 e1 = new Entity00("Jack", "6.37");
        Entity00 e2 = new Entity00("Lily", "9.21");

        List<Entity00> list = new ArrayList<>();
        list.add(e0);
        list.add(e1);
        list.add(e2);
        list.sort(Comparator.comparing(Entity00::getScore));
//        list.sort(Comparator.comparing(entity00 -> new BigDecimal(entity00.getScore())));
        System.out.println(list.toString());

        System.out.println("9.56".compareTo("10"));

    }
}
