package yp.JavaSE.Review_07;

/**
 * @author RickYinPeng
 * @ClassName Test_11_AutoBox
 * @Description
 * @date 2019/1/20/15:40
 */
public class Test_11_AutoBox {

    public static void main(String[] args) {
        /**
         * 其实编译器帮我执行的是：
         *         Integer a = Integer.valueof(234);
         */
        Integer a = 234;

        /**
         * 其实编译器帮我执行的是：
         *         int b = a.intValue();
         */
        int b = a;

        //自动装箱
        Integer c = null;

        //自动拆箱，报错，空指针异常
        int d = c;
    }
}
