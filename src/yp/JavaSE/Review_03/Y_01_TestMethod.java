package yp.JavaSE.Review_03;

/**
 * @author RickYinPeng
 * @ClassName Y_01_TestMethod
 * @Description
 * @date 2018/11/5/18:04
 */
public class Y_01_TestMethod {
    public static void main(String[] args) {
        Y_01_TestMethod a = new Y_01_TestMethod();
        int x = 1;
        int b = 2;
        int c = 3;
        a.add(x,b,c);
        System.out.println("x:"+x);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
    }

    void add(int a,int b,int c){
//        int sum = a+b+c;
//        System.out.println(sum);
        a = 10;
        b = 10;
        c = 10;
    }
}
