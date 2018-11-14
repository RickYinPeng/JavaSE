package yp.JavaSE.Review_02;

/**
 * @author RickYinPeng
 * @ClassName TestVariable
 * @Description 测试变量
 * @date 2018/10/26/12:21
 */
public class TestVariable {

    private static int a;

    public static void main(String[] args) {
        int age;
        age = 18;
        int salary = 50000;

/*      局部变量使用前需要初始化，如果不初始化当你用的时候就会报错，就比如你直接打印它
        int yin;
        System.out.println(yin);*/

        /**
         * 但是成员变量可以，你在外面定义了成员变量，但是没有初始化它，但是你打印的时候就不会报错
         * JVM会给成员变量初始化值
         */
        System.out.println(a);
    }
}
