package yp.JavaSE.Review_11_多线程;

/**
 * @author RickYinPeng
 * @ClassName Test_07_join2
 * @Description
 * @date 2019/1/27/15:03
 */
public class Test_07_join2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i<100;i++){
                    System.out.println("lambda-------------"+i);
                }
            }
        });
        t.start();
        for(int i = 0;i<100;i++){
            if(i==20){
                t.join();
            }
            System.out.println("main......"+i);
        }
    }
}
