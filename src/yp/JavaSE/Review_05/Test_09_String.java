package yp.JavaSE.Review_05;

/**
 * @author RickYinPeng
 * @ClassName Test_09_String
 * @Description
 * @date 2019/1/19/16:12
 */
public class Test_09_String {
    public static void main(String[] args) {
        String str = "abc";

        String str2 = new String("def");

        String str3 = "abc"+"deda";

        /**
         * 不是加法，是字符串的连接符,只要有一个是字符串，那么就会当作字符串连接符来处理
         */
        String str4 = "18"+19;
        String str5 = 18+"19";
        System.out.println(str4);
        System.out.println(str5);
    }
}
