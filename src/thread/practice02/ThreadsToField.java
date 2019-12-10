package thread.practice02;

public class ThreadsToField implements Runnable{

    int i;

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + ": " + i++);
            if (i == 50) {
                break;
            }
        }
    }

    public static void main(String[] args) {

    }
}
