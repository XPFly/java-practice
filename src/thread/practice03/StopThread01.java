package thread.practice03;

import java.util.concurrent.TimeUnit;

public class StopThread01 {
    private static boolean stopRequest;

    private static synchronized void requestStop() {
        stopRequest = true;
    }

    private static synchronized boolean isStopRequest() {
        return stopRequest;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread stopThread = new Thread(() -> {
            int i = 0;
            System.err.println(stopRequest);
            while (!isStopRequest()) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                i++;
                if (i > 50) {
                    break;
                }
            }
        });

        stopThread.start();

        TimeUnit.SECONDS.sleep(1);

        requestStop();
    }
}
