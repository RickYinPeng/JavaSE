package yp.JavaSE.Review_05;

/**
 * @author RickYinPeng
 * @ClassName TestTryCatch
 * @Description
 * @date 2018/11/16/8:45
 *
 * 总结：
 *      trycatch中如果（主动）抛出异常则trycatch外的语句将不会再执行
 */
public class TestTryCatch {
    public static void main(String[] args) {
        try {
            int i = 100/0;
            /**
             * 执行 i = 100/0 时候就发生异常，所以后面的 System.out.println(i); 就不会再执行
             */
            System.out.println(i);
        }catch (Exception e){
            System.out.println(1);
            /**
             * ①：这里捕获到异常后会执行 System.out.println(1); 然后抛出新的异常
             * ②：抛出异常之后最后会执行finally中的代码
             * ③：其余代码不会执行，也就是说 System.out.println(3); 不会再执行了
             */
            throw new RuntimeException();//主动抛出异常

        }finally {
            System.out.println(2);
        }
        System.out.println(3);
    }
}
