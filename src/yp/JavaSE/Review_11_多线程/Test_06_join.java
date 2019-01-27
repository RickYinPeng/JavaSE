package yp.JavaSE.Review_11_多线程;

/**
 * @author RickYinPeng
 * @ClassName Test_06_join
 * @Description
 * @date 2019/1/27/14:42
 */
public class Test_06_join {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i<100;i++){
                    System.out.println("t1----->"+i);
                }
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i<100;i++){
                    System.out.println("t2----->"+i);
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("main");
    }
}
