package base.practice04;

/**
 * @description:
 * @author: xu_pf@suixingpay.com
 * @create: 2019-12-20 11:03
 **/
public class Entity00 {

    private String name;

    private String score;

    public Entity00(String name, String score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Entity00{" + "name='" + name + '\'' + ", score='" + score + '\'' + '}';
    }
}
