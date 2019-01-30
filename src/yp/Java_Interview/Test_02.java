package yp.Java_Interview;

/**
 * @author RickYinPeng
 * @ClassName Test_02
 * @Description
 * @date 2019/1/28/21:34
 */
public class Test_02 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("a");
        System.out.println(sb);
        test(sb);
        System.out.println(sb);
    }
    public static void test(StringBuffer a){
        a.append("x");
    }
}
