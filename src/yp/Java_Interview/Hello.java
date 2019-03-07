package yp.Java_Interview;

/**
 * 静态代码块在构造函数之前执行，且只执行一次
 */
class A{
    static{
        System.out.println("1");
    }

    public A() {
        System.out.println("2");
    }
}

class B extends A{
    static {
        System.out.println("a");
    }

    public B() {
        System.out.println("b");
    }
}

public class Hello {
    public static void main(String[] args) {
        A ab = new B();
        ab = new B();
    }
}
