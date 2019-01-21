package yp.JavaSE.Review_07;

/**
 * @author RickYinPeng
 * @ClassName Test_12_String
 * @Description
 * @date 2019/1/20/16:49
 */
public class Test_12_String {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = "abc";
        System.out.println(s1==s2);//false
        System.out.println(s1==s3);//true


        StringBuilder sb = new StringBuilder("123");

        sb.append("a");
        System.out.println(sb);

        StringBuffer s = new StringBuffer();

        s.append("a");
    }
}
