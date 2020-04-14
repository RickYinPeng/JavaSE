package yp.JavaSE.Review_11_多线程;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Test_22_ThreadPoolExecutor {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = null;

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("aaa");
            }
        });

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("aaa");
            }
        });

        thread.start();
    }
}
