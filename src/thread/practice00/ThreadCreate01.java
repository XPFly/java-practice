package thread.practice00;

public class ThreadCreate01 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }

    public static void main(String[] args) {
        new Thread(new ThreadCreate01()).start();
        new Thread(new ThreadCreate01()).start();
    }
}
