package yp.JavaSE.Review_08;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author RickYinPeng
 * @ClassName Test_03_Canlendar
 * @Description 测试日期通用类
 * @date 2019/1/21/11:06
 */
public class Test_03_Canlendar {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2999,10,9,22,10,55);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int date = calendar.get(Calendar.DATE);//获得几号,也可以使用 DAY_OF_MONTH 作用一样
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);//星期几. 1-7 1:星期几  2：星期一

        System.out.println(year);
        System.out.println(month);//0-11 表示对应的月份 。0是1月 1是2月 3是4月 11是12月 这里我们传的10其实就是1月
        System.out.println(weekday);
        System.out.println(date);

    }
}
