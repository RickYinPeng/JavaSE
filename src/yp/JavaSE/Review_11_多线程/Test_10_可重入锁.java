package yp.JavaSE.Review_11_多线程;

/**
 * @author RickYinPeng
 * @ClassName Test_10_可重入锁
 * @Description 可重入锁：锁可以重复使用 ---> 在内部还判断了是否是当前线程，而且还有一个锁的计数器
 * @date 2019/1/27/16:29
 */
public class Test_10_可重入锁 {

    public static void main(String[] args) {
        Test_10_可重入锁 test_10_可重入锁 = new Test_10_可重入锁();
        test_10_可重入锁.test();
    }

    public void test(){
        /**
         * 第一次获取锁
         */
        synchronized (this){
            while (true){
                /**
                 * 第二次获取锁
                 */
                synchronized (this){
                    System.out.println("ReetrantLock");
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
