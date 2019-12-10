package thread.practice01;

import thread.practice01.Resource;

public class RescourceGet implements Runnable{

    private Resource resource;

    public RescourceGet(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (resource) {
                if (!resource.isFlag()) {
                    try {
                        resource.wait();
                    } catch (InterruptedException e) {
                        System.err.println(e.getMessage());
                    }

                    resource.setFlag(false);
                    resource.notify();
                }
                System.out.println(Thread.currentThread().getName() + ": " + resource.getName());
            }
        }
    }
}
