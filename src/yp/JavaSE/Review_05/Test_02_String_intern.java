package yp.JavaSE.Review_05;

/**
 * @author RickYinPeng
 * @ClassName Test_02_String_intern
 * @Description
 * @date 2018/11/15/13:50
 */
public class Test_02_String_intern {
    public static void main(String[] args) {

        String s1 = new String("授予此");
        s1.intern();
        String s2 = "授予此";
        System.out.println(s1==s2);//false

        String s3 = new String("1") + new String("1");
        s3.intern();
        String s4 = "11";
        System.out.println(s3 == s4);//true

        String str2 = "SEUCalvin";//新加的一行代码，其余不变
        String str1 = new String("SEU")+ new String("Calvin");
        System.out.println(str1.intern() == str2);//true
        System.out.println(str1 == "SEUCalvin");//false
    }
}
