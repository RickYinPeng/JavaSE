package yp.JavaSE.Review_11_多线程;

public class Test_12_Synchronized {
    public void method() {
        synchronized (this) {
            System.out.println("synchronized 代码块");
        }
    }
}
