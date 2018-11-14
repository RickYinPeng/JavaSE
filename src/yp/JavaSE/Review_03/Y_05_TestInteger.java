package yp.JavaSE.Review_03;

/**
 * @author RickYinPeng
 * @ClassName Y_05_TestInteger
 * @Description
 * @date 2018/11/8/11:25
 */
public class Y_05_TestInteger {

    public static void main(String[] args) {
        Integer i01 = 59;
        int i02 = 59;

        Integer i03 = Integer.valueOf(59);
        Integer i04 = new Integer(59);
        System.out.println("i01:"+i01);
        System.out.println("i02:"+i02);
        System.out.println("i03:"+i03);
        System.out.println("i04:"+i04);

        System.out.println("i01==i02:"+(i01==i02));//true
        System.out.println("i01==i03:"+(i01==i03));//true
        System.out.println("i03==i04:"+(i03==i04));//false
        System.out.println("i02==i04:"+(i02==i04));//true

        Integer a1 = new Integer(59);
        Integer a2 = new Integer(59);

        Integer b1 = 100;
        Integer b2 = Integer.valueOf(100);
        Integer b3 = 100;

        System.out.println(a1==a2);

        System.out.println(b1==b2);

    }

}
