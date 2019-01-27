package yp.JavaSE.Review_11_多线程;

/**
 * @author RickYinPeng
 * @ClassName Test_09_wait
 * @Description
 * @date 2019/1/27/15:43
 */
public class Test_09_wait {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t.start();
    }
}
