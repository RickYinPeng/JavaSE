package yp.JavaSE.Review_11_多线程;

public class Test_13_ThreadLocal {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("test");
        threadLocal.get();
        Thread t = new Thread();
        InheritableThreadLocal inheritableThreadLocal = new InheritableThreadLocal();
    }
}
