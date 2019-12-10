package thread.practice02;

/**
 * @description:
 * @author: xu_pf@suixingpay.com
 * @create: 2019-12-10 13:55
 **/
public class HelloThread implements Runnable {
    private static ThreadLocal<Integer> local = new ThreadLocal<>();


    int count;

    @Override
    public void run()
    {
//        int i = 0;
//        local.set(0);
//        Integer count = local.get();
        while (true)
        {

            System.out.println(Thread.currentThread().getName() + " - Hello number: " + count++);

            try
            {
                Thread.sleep((long) Math.random() * 1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            if (50 == count)
            {
                break;
            }
        }

    }
}