package thread.practice01;

public class Resource {
    private String name;
    private Integer age;
    private boolean flag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Resource{" + "name='" + name + '\'' + ", age=" + age + ", flag=" + flag + '}';
    }
}
