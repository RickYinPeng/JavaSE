package yp.JavaSE.Review_11_多线程;

/**
 * @author RickYinPeng
 * @ClassName Test_08_DCL单例模式
 * @Description DCL单例模式
 * @date 2019/1/27/15:12
 */
public class Test_08_DCL单例模式 {
    public static void main(String[] args) {

    }
}
/**
 * 单例模式：在懒汉式基础上，在多线程环境下对外存在一个对象
 * 1：构造器私有化-->避免外部new构造器
 * 2：提供私有的静态属性-->存储对象的地址
 * 3：提供公有的静态方法-->获取属性
 */
class DoubleCheckedLovking{

    private static volatile DoubleCheckedLovking instance;

    //1:构造器私有化
    private DoubleCheckedLovking() {
    }

    public static DoubleCheckedLovking getInstance() {
        /**
         * 再次检查,避免不必要的同步
         */
        if(null!=instance){
            return instance;
        }

        synchronized (DoubleCheckedLovking.class) {
            if (null == instance) {
                instance = new DoubleCheckedLovking();
            }
        }
        return instance;
    }
}

