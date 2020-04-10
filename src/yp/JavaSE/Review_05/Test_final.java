package yp.JavaSE.Review_05;

/**
 * @author RickYinPeng
 * @ClassName Test_final
 * @Description
 * @date 2019/1/18/12:30
 */
public class Test_final {
}
class Father2{
    public final void see(){
        System.out.println("final修饰的方法不能被重写,会报错");
    }

    public static void main(String[] args) {
        String a = "hello2";
        final String b = "hello";
        String d = "hello";
        String c = b + 2;
        String e = d + 2;
        System.out.println((a == c)); // true    a:Hello2
        System.out.println((a == e)); // false
        System.out.println(d == b); // true

        String f = "xxx";
        String g = "xxx";
        System.out.println(f == g); // true
    }
}
class Son2 extends Father2{
    /**
     * final成员变量表示常量，只能被赋值一次，赋值后值不再改变。
     * 当final修饰一个基本数据类型时，表示该基本数据类型的值一旦在初始化后便不能发生变化；
     * 如果final修饰一个引用类型时，则在对其初始化之后便不能再让其指向其他对象了，但该引用所指向的对象的内容是可以发生变化的
     * final修饰一个成员变量（属性），必须要显示初始化,这里有两种初始化方式:
     *  一种是在变量声明的时候初始化；
     *  二种方法是在声明变量的时候不赋初值，但是要在这个变量所在的类的所有的构造函数中对这个变量赋初值。
     */
    private final int a;

    public Son2(int a) {
        this.a = a;
    }
}