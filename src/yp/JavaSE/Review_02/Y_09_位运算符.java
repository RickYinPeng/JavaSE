package yp.JavaSE.Review_02;

/**
 * @author RickYinPeng
 * @ClassName Y_09_位运算符
 * @Description 位运算符
 * @date 2018/11/2/20:10
 */
public class Y_09_位运算符 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);

        //移位运算
        //左移：相当于乘2
        int c = 3<<2;//3*2*2 = 12
        System.out.println(c);
        //右移：相当于除2
        int d = 12>>1;//12/2 = 6
        System.out.println(d);
    }
}
