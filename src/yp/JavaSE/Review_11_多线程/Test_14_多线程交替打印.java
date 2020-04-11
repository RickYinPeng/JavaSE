package yp.JavaSE.Review_11_多线程;

public class Test_14_多线程交替打印 {
    public static void main(String[] args) {
        ThreeClass threeClass = new ThreeClass();
        new threadOne(threeClass).start();
        new threadTwo(threeClass).start();
    }
}
class threadOne extends Thread {
    private ThreeClass threeClass;
    public threadOne(ThreeClass threeClass) {
        this.threeClass = threeClass;
    }
    @Override
    public void run() {
        while (threeClass.count < 100) {
            try {
                threeClass.printThree1();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class threadTwo extends Thread {
    private ThreeClass threeClass;
    public threadTwo(ThreeClass threeClass) {
        this.threeClass = threeClass;
    }
    @Override
    public void run() {
        while (threeClass.count < 100) {
            try {
                threeClass.printThree2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class ThreeClass {
    public volatile int count = 0;
    public synchronized void printThree1() throws InterruptedException {
        this.wait();
        if (count > 100) {
            return;
        }
        System.out.println(Thread.currentThread().getName() + " : " + count++);
        System.out.println(Thread.currentThread().getName() + " : " + count++);
        this.notify();
    }
    public synchronized void printThree2() throws InterruptedException {
        this.notify();
        if (count > 100) {
            return;
        }
        System.out.println(Thread.currentThread().getName() + " : " + count++);
        this.wait();
    }
}