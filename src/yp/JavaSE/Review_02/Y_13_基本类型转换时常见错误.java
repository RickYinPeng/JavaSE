package yp.JavaSE.Review_02;

/**
 * @author RickYinPeng
 * @ClassName Y_13_基本类型转换时常见错误
 * @Description
 * @date 2018/11/2/21:50
 */
public class Y_13_基本类型转换时常见错误 {
    public static void main(String[] args) {
        //10亿
        int money = 1000000000;

        int years = 20;

        //返回的total是负数，超过了int的范围
        int total = money*years;
        System.out.println("total="+total);

        //返回的total仍然是负数。默认是int，因此结果会转成int值，再转成long。但是已经发生//了数据丢失
        long total1 = money*years;
        System.out.println("total1="+total1);

        //返回的total2正确:先将一个因子变成long，整个表达式发生提升。全部用long来计算。
        long total2 = money*((long)years);
        System.out.println("total2="+total2);

     /*   int l = 2; //分不清是L还是1,
        long a = 23451l;//建议使用大写L
        System.out.println(l+1);*/
    }
}
