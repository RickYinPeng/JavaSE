package yp.JavaSE.Review_05;

/**
 * @author RickYinPeng
 * @ClassName TestTryCatch2
 * @Description
 * @date 2018/11/16/8:58
 *
 * 总结：
 *      之前我们说过在trycatch中如果主动抛出异常，那么trycatch以外的代码将不会再执行，
 *      这里我们在trycatch中加了return语句，经debug调试之后发现，在(catch模块)return（结束）的时候它
 *      会先执行完finally语句再return
 *
 */
public class TestTryCatch2 {
    public static String output = "";
    public static void foo(int i){
        try {
            if (i == 1) {
                throw new Exception();//主动抛出异常
            }
        }catch (Exception e){
            output += "2";
            return;
        }finally {
            output +="3";
        }
        output +="4";
    }

    public static void main(String[] args) {
        foo(0);
        foo(1);
        System.out.println(output);
    }
}
