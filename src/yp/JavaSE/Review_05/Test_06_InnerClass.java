package yp.JavaSE.Review_05;

/**
 * @author RickYinPeng
 * @ClassName Test_InnerClass_06
 * @Description 测试非静态内部类
 * @date 2019/1/19/15:04
 */
public class Test_06_InnerClass {
    public static void main(String[] args) {

        //创建内部类对象
        Outer.Inner inner = new Outer().new Inner();

        inner.show();
    }
}
class Outer{
    private int age = 10;

    public void testOuter(){
        System.out.println("Outer.testOuter()");
    }

    /**
     * 虽然Inner是Outer的内部类，但是在编译生成的时候还是会生成两个class文件
     */
    /**
     * 非静态内部类：class Inner{}
     *        1：非静态内部类可以直接访问外部类的成员，但是外部类不能直接访问非静态内部类成员
     *        2：静态内部类不能有静态方法、静态属性和静态初始化块
     * 静态内部类： static class Inner{}
     *        1：当一个静态内部类存在时，并不一定存在对应的外部类对象。所以静态内部类的实例方法不能直接访问外部类的实例方法
     *        2：静态内部类看作外部类的一个静态成员，因此，外部类的方法中可以通过:"静态内部类.名字"的方式访问静态内部类的静态成员
     *        3：通过 new 静态内部类()访问静态内部类的实例
     */
    class Inner{

        /*static {
           会报错
        }*/

        int age = 20;

        public void show(){
            int age = 30;
            System.out.println("外部类的成员变量age："+Outer.this.age);
            System.out.println("内部类的成员变量age："+this.age);
            System.out.println("局部变量age："+age);
        }
    }
}