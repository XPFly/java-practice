package base.practice03;

import java.math.BigDecimal;

public class DoubleAndFloatPractice00 {

    public static void main(String[] args) {
        double d = 1.00;
        double f = 0.90;
        System.out.println(d - f);

        BigDecimal b1 = new BigDecimal(1.00);
        BigDecimal b2 = new BigDecimal(0.90);

        System.out.println(b2.equals(0.90000000000000002220446049250313080847263336181640625));
        System.out.println(b1.subtract(b2));

        System.out.println("0.90000 00000 00000 02220 44604 92503 13080 84726 33361 81640 625".length());

    }
}
