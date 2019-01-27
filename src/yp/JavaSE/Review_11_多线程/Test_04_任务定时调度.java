package yp.JavaSE.Review_11_多线程;

import java.util.*;

/**
 * @author RickYinPeng
 * @ClassName Test_04_任务定时调度
 * @Description Timer 和 TimerTask
 * @date 2019/1/27/12:41
 */
public class Test_04_任务定时调度 {
    public static void main(String[] args) {

        Timer timer = new Timer();
        /**
         * 执行安排
         */

        /**
         * 1秒后执行我们的MyTask
         */
        /*timer.schedule(new MyTask(),1000);*/

        /**
         * 1秒后执行我们的MyTask,每隔1秒执行一次
         */
        /*timer.schedule(new MyTask(),1000,1000);*/

        /**
         * 5秒后开始每隔1秒执行一次
         */
        Calendar cal = new GregorianCalendar(2019,1,27,12,52,30);
        timer.schedule(new MyTask(),cal.getTime(),1000);




    }
}

/**
 * 任务类：这是一个多线程的
 */
class MyTask extends TimerTask{

    @Override
    public void run() {
        for(int i = 0;i<10;i++){
            System.out.println("防控大脑休息一会");
        }
        System.out.println("----------end----------");
    }
}