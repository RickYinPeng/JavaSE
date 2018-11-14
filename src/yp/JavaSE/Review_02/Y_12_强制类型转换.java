package yp.JavaSE.Review_02;

/**
 * @author RickYinPeng
 * @ClassName Y_12_强制类型转换
 * @Description
 * @date 2018/11/2/21:41
 */
public class Y_12_强制类型转换 {
    public static void main(String[] args) {
        double x  = 3.14;
        int nx = (int)x;   //值为3
        char c = 'a';
        int d = c+1;
        System.out.println(nx);
        System.out.println(d);
        System.out.println((char)d);
    }
}
