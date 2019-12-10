package thread.practice00;

public class ThreadCreate00 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }

    public static void main(String[] args) {
        ThreadCreate00 t1 = new ThreadCreate00();
        ThreadCreate00 t2 = new ThreadCreate00();
        t1.start();
        t2.start();
    }
}
