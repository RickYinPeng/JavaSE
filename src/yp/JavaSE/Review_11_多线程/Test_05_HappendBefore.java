package yp.JavaSE.Review_11_多线程;

/**
 * @author RickYinPeng
 * @ClassName Test_05_HappendBefore
 * @Description 指令重排
 * @date 2019/1/27/14:25
 */
public class Test_05_HappendBefore {

    private static int a = 0;

    private static boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        /**
         * 读取数据
         */
        Thread t1 = new Thread(() -> {
            a = 1;
            flag =true;
        });

        Thread t2 = new Thread(() -> {
            if(flag){
                a *=1;
            }
            if(a == 0){
                System.out.println("happend before a->"+a);
            }
        });

        t2.start();
        t1.start();

        t1.join();
        t2.join();

    }
}
