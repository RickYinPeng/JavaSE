package yp.JavaSE.Review_03;

/**
 * @author RickYinPeng
 * @ClassName Y_03_测试静态代码块
 * @Description
 * @date 2018/11/7/21:55
 */
class Parent {
    static {
        System.out.println("Parent类初始化");
    }
}
class Son extends Parent{
    static {
        System.out.println("Son类初始化");
    }
}


public class Y_03_测试静态代码块 {
    public static void main(String[] args) {
        Son s = new Son();
    }
}

