package yp.JavaSE.Review_03;

/**
 * @author RickYinPeng
 * @ClassName Y_Test_This
 * @Description
 * @date 2018/11/7/16:26
 */
public class Y_Test_This {
    int a, b, c;

    public Y_Test_This() {
    }
    public Y_Test_This(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public Y_Test_This(int a, int b, int c) {
        this(a,b);
        this.c = c;
    }
    void sing() {
    }
    void eat() {
        this.sing(); // 调用本类中的sing();
        System.out.println("你妈妈喊你回家吃饭！");
    }
    public static void main(String[] args) {
        Y_Test_This hi = new Y_Test_This();
        hi.eat();

        Integer i01 = 59;
        int i02 = 59;

        Integer i03 = Integer.valueOf(59);
        Integer i04 = new Integer(59);

        Integer.valueOf("asdsa");

        System.out.println(i01==i02);//true
        System.out.println(i01==i03);//true
        System.out.println(i03==i04);//false
        System.out.println(i02==i04);//true
    }
}
