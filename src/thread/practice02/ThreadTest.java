package thread.practice02;

public class ThreadTest {
    public static void main(String[] args) {
//        HelloThread r = new HelloThread();
//
//        Thread t1 = new Thread(r);
//        Thread t2 = new Thread(r);
//
//        t1.start();
//        t2.start();

        ThreadsToField threadsToField = new ThreadsToField();
        new Thread(threadsToField).start();
        new Thread(threadsToField).start();
    }
}
