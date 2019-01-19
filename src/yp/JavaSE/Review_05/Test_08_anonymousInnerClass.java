package yp.JavaSE.Review_05;

/**
 * @author RickYinPeng
 * @ClassName Test_08_anonymousInnerClass
 * @Description 测试匿名内部类
 * @date 2019/1/19/15:51
 */
public class Test_08_anonymousInnerClass {
    public static void main(String[] args) {
        Test_08_anonymousInnerClass.test01(new A() {
            @Override
            public void aa() {
                System.out.println("匿名内部类");
            }
        });
    }

    public static void test01(A a){
        a.aa();
    }

}

interface A{
    void aa();
}