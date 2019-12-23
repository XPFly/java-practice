package thread.practice03;

import java.util.concurrent.TimeUnit;

public class StopThread00 {
    private static boolean stopRequest;

    public static void main(String[] args) throws InterruptedException {
        Thread stopThread = new Thread(() -> {
            int i = 0;
            while (!stopRequest) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                i++;
                if (i > 50) {
                    break;
                }
            }
        });

        stopThread.start();

        TimeUnit.SECONDS.sleep(1);

        stopRequest = true;
    }
}
