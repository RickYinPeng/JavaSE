package yp.JavaSE.Review_11_多线程.协作模型_生产者消费者实现方式;

/**
 * @author RickYinPeng
 * @ClassName Test_Co
 * @Description
 * @date 2019/1/27/12:12
 */
public class Test_Co {
    public static void main(String[] args) {
        SynContainer container = new SynContainer();
        new Productor(container).start();
        new Consumer(container).start();
    }
}

/**
 * 生产者
 */
class Productor extends Thread{

    SynContainer container;

    public Productor(SynContainer container) {
        this.container = container;
    }

    @Override
    public void run() {
        //生产
        for(int i = 0;i<100;i++){
            System.out.println("生产-->"+i+"个馒头");
            container.push(new Steamedbun(i));
        }
    }
}

/**
 * 消费者
 */
class Consumer extends Thread{

    SynContainer container;

    public Consumer(SynContainer container) {
        this.container = container;
    }


    @Override
    public void run() {
        //消费
        for(int i = 0;i<100;i++){
            System.out.println("消费-->"+container.pop().id+"个馒头");
        }
    }
}

/**
 * 缓冲区
 */
class SynContainer{
    Steamedbun[] buns = new Steamedbun[10];
    int count;//计数器
    /**
     * 存储 --- 生产
     */
    public synchronized void push(Steamedbun bun){
        /**
         * 何时生产--->容器中是否有空间
         * 容器满了就只能等待
         */
        if(count==buns.length){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        /**
         * 存在空间就可以消费
         */
        this.buns[count] = bun;
        count++;
        this.notify();
    }

    /**
     * 获取 --- 消费
     */
    public synchronized Steamedbun pop(){
        /**
         * 何时消费--->容器中是否存在数据
         * 没有数据就只能等待
         */
        if(count==0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        Steamedbun bun = buns[count];
        /**
         * 通知生产
         */
        this.notify();
        return bun;
    }
}

/**
 * 馒头
 */
class Steamedbun{
    int id;

    public Steamedbun(int id) {
        this.id = id;
    }
}

