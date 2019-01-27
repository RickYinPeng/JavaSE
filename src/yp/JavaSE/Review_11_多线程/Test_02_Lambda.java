package yp.JavaSE.Review_11_多线程;

/**
 * @author RickYinPeng
 * @ClassName Test_02_Lambda
 * @Description Lambda表达式
 * @date 2019/1/27/10:25
 */
public class Test_02_Lambda {
    public static void main(String[] args) {
        /**
         * 匿名内部类实现线程调用
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类");
            }
        });

        /**
         * jdk8 简化 lambda :简化简单的线程类
         */
        new Thread(() -> {
            System.out.println("lambda");
            }
        ).start();

    }
}
