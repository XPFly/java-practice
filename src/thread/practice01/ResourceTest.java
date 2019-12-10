package thread.practice01;

public class ResourceTest {
    public static void main(String[] args) {
        Resource r = new Resource();

        new Thread(new ResourceAdd(r)).start();
        new Thread(new RescourceGet(r)).start();
    }
}
