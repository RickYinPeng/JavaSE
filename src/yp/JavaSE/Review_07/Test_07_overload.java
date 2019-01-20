package yp.JavaSE.Review_07;

/**
 * @author RickYinPeng
 * @ClassName Test_07_overload
 * @Description 测试方法重载
 * @date 2019/1/20/8:49
 */
public class Test_07_overload {

    public void show(int a) {
        System.out.println(a);
    }

    /**
     * 重载：
     * 方法重载返回值不同不能重载
     *
     * @param a
     */
    /*public String show(){}*/
    public void show(String a) {
        System.out.println(a);

        /**
         * 1.刚刚我试图去new一个Arrays类，但发现new不出来，我点进源码发现它的构造函数是私有的
         * 2.在 Java 中，区别一个方法和另一个方法的关键是“方法签名”。
         * 3.方法签名不是单一元素，而是一个组合。方法签名由 方法名+参数列表 构成（返回值不同，Java编程思想中说过）
         *
         */
    }
    /**
     * 重写：协变返回
     *     1.父类的返回值类型是 Object 而子类的返回值类型是 String 等任意一个，这种情况是没问题的，而且好像有一个很高大上的术语叫“协变返回”
     *     2.如果子类的返回值类型是父类的返回值类型的子类，比如例子中 Object 和 String 或者其它自定义类但是具有继承关系的情况。
     *     3.注意，假如父类中是 Object 而子类中是 int 不构成协变返回，int 是基本数据类型，和 Object 不构成继承关系。如果是Integer 没问题
     * 重写中还需要注意以下两点
     *     1.子类重写的方法的访问控制符不能比父类的可见性小可以一样，也可以比父类的大，一般都保持一致\
     *     2.在抛出异常方面，子类重写的方法抛出的异常的检查范围不能比父类的大。
     */
}

