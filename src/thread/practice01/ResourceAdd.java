package thread.practice01;

public class ResourceAdd implements Runnable{

    private Resource resource;

    public ResourceAdd(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        int x = 0;
        while (true) {
            synchronized (resource) {
                if (resource.isFlag()) {
                    try {
                        resource.wait();
                    } catch (InterruptedException e) {
                        System.err.println(e.getMessage());
                    }
                }

                if (x == 0) {
                    resource.setName("张三");
                    resource.setAge(18);
                } else {
                    resource.setName("李四");
                    resource.setAge(29);
                }
                System.out.println(Thread.currentThread().getName() + ": " + resource.toString());
                resource.setFlag(true);
                resource.notify();
            }
            x = (x+1) % 2;
        }
    }
}
