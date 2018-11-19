package yp.JavaSE.Review_05;

/**
 * @author RickYinPeng
 * @ClassName TestTryCatch3
 * @Description
 * @date 2018/11/16/9:08
 *
 * 总结：
 *      我们来看这个trycatch模块，我们并没有主动抛出异常，也没有发生异常现象，也就是说catch并没有
 *      什么作用单纯看看try和finally在这里我们打印出foo方法的返回值和output的值，发现不一样这是为
 *      什么呢？？
 *      trycatch中当需要返回值时，先return当前返回值，再执行finally，也就是说当前的值是什么就直接
 *      返回不用考虑finally中的代码
 *
 *      总的来说就是：当trycatch中有返回值时，先返回再执行finally
 *
 */
public class TestTryCatch3 {
    public static String output = "";
    public static String  foo(int i){
        Integer integer;
        try {
            int j = 100/0;
            if (i == 0) {
                output += "1";
                return output;
            }
        }catch (Exception e){
            return output += "catch";
        }finally {
            output +="3";
        }
        return "0";
    }
    public static void main(String[] args) {
        TestTryCatch3 t = new TestTryCatch3();
        String foo = t.foo(0);
        System.out.println(foo);
        System.out.println(t.output);
        Integer.valueOf(10);

     /*   Integer i = Integer.valueOf(20);
        Integer x = 20;
        System.out.println(i==x);

        Integer f = 300;
        Integer j = Integer.valueOf(300);
        System.out.println(f==j);*/
    }

}
