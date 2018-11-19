package yp.JavaSE.Review_05;

/**
 * @author RickYinPeng
 * @ClassName Test_01_String_intern
 * @Description
 * @date 2018/11/16/12:35
 *
 * 总结：
 *      当我们首次声明一个字符串时如：
 *      String s1 = "风清扬";
 *      这个时候jvm由于是第一次碰见"风清扬"这个字符串,所以它会在字符串常量池中放一个"风清扬"的引用
 *      为什么是引用呢？？？
 *
 *      其实在jdk1.6的时候，那个时候Java的字符串常量池是在方法区中的，当我们首次遇到一个字符串时我
 *      们会将这个字符串复制到字符串常量池中，注意这里是复制。我们来看两个代码
 */
public class Test_01_String_intern {
    public static void main(String[] args) {
        String s1 = "hellow";
        String s2 = "hellow";
        System.out.println(s1==s2);//true

        String s3 = "world";
        String s4 = new String("world");
        System.out.println(s3==s4);//false

        String s5 = "风清扬";
        String s6 = new String("风清扬");
        System.out.println(s6.intern()==s5);//true


        String s7 = new String("东方不败");
        String s8 = "东方不败";
        System.out.println(s7==s8);//false


        String s9 = new String("杨过")+new String("aaa");
        System.out.println(s9.intern()==s9);//true


        String s10 = new String("风清扬")+new String("独孤求败");
        System.out.println(s10.intern()==s10);
        String s11 = "风清扬独孤求败";
        System.out.println("-------------------------");
        String s12 = "风清扬独孤求败";
        System.out.println(s11==s10);
        System.out.println(s11==s12);
    }


}
