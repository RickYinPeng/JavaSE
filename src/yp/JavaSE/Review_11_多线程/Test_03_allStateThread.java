package yp.JavaSE.Review_11_多线程;

/**
 * @author RickYinPeng
 * @ClassName Test_03_allStateThread
 * @Description 观察线程的状态
 * @date 2019/1/27/11:47
 */
public class Test_03_allStateThread {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (int i = 0;i<5;i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("......");
            }
        });

        /**
         * 观察状态
         */
        Thread.State state = t.getState();
        /**
         * 处于 NEW 状态：新生状态，就是刚刚new出来，并未执行
         */
        System.out.println(state);

        t.start();
        state = t.getState();
        /**
         * 处于 RUNNABLE 状态，运行中状态
         */
        System.out.println(state);

        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            state = t.getState();
            /**
             * TERMINATED 时间等待状态，属于阻塞的一种
             */
            System.out.println(state);
        }

    }
}
