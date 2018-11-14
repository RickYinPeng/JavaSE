package yp.JavaSE.Review_02;

/**
 * @author RickYinPeng
 * @ClassName Y_08_逻辑运算符
 * @Description
 * @date 2018/11/1/20:54
 */
public class Y_08_逻辑运算符 {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1&b2); //false
        System.out.println(b1|b2); //true
        System.out.println(b1^b2); //true 相同为false 相异为true
        System.out.println(!b2);   //true

        //短路
        //前面走了1>2为false，所以这个值最终肯定为false，所以后面就不用走了，后面有个异常3/0
        boolean b3 = 1>2&&2<(3/0);
        System.out.println(b3);
    }


}
