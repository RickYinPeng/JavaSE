package yp.JavaSE.Review_05;

/**
 * @author RickYinPeng
 * @ClassName Test_07_staticClass
 * @Description
 * @date 2019/1/19/15:22
 */
public class Test_07_staticClass {
    public static void main(String[] args) {
        /**
         * 创建静态内部类
         */
        Outer2.Inner2 inner2 = new Outer2.Inner2();



    }
}
class Outer2{

    private int age = 10;

    /**
     * 外部类可以访问静态内部类的静态成员变量，但是不能访问非静态成员变量
     */
    public void testOuter(){

        System.out.println(Inner2.age);
    }

    /**
     * 静态内部类
     */
    static class Inner2{
        /**
         * 静态内部类可以创建静态成员
         */
        static int age;

        public String name;

        public void show(){
            /**
             * 静态内部类不能直接访问外部类的成员变量
             */
            /*System.out.println(Outer2.this.age);*/
        }
    }

}


