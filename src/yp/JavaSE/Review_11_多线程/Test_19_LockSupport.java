package yp.JavaSE.Review_11_多线程;

import java.util.concurrent.locks.LockSupport;

public class Test_19_LockSupport {
    public static void main(String[] args) {
        System.out.println("begin park!");
        LockSupport.park();
        System.out.println("end park");
    }
}
