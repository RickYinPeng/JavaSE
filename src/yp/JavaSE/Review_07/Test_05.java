package yp.JavaSE.Review_07;

/**
 * @author RickYinPeng
 * @ClassName Test_05
 * @Description 接口
 * @date 2019/1/19/11:36
 */
public class Test_05 {
}

interface MyInterface{
    /**
     * 接口中只有：常量和抽象方法
     * 注意：
     *      接口中的常量前面的修饰是 public static final 你写都不写他都有
      */
    /*public static final */String MAX_GREAD="BOSS";
    int MAX_SPEED=120;

    /**
     * 注意：
     *      接口中的方法不能是私有的，也即不能是private修饰的
     */
    /*private void test03();*/

    /**
     * 注意：
     *      接口中的方法默认修饰就是 public abstract 修饰的，你写与不写都是一样的
     */
    /*public abstract */void test01();
    public int test02(int a,int b);

    /**
     * JDK1.8中接口中可以有方法了，但是必须是default修饰的
     */
    default void test(){
        System.out.println();
    }
}

/**
 * 实现接口，必须实现接口中的方法，默认方法可以不用实现
 */
class MyClass implements MyInterface{

    @Override
    public void test01() {
        /**
         * 所以接口中这个常量是 public static final 修饰的(加于不加都是这样)
         */
        String a = MyInterface.MAX_GREAD;
        System.out.println("test01");
    }

    @Override
    public int test02(int a, int b) {
        System.out.println(a+b);
        return a+b;
    }
}