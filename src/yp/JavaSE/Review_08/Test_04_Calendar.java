package yp.JavaSE.Review_08;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author RickYinPeng
 * @ClassName Test_04_Calendar
 * @Description 可视化日历程序
 * @date 2019/1/21/10:05
 */
public class Test_04_Calendar {

    public static void main(String[] args) throws ParseException {
        String str = "2019-01-21";
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format.parse(str);

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);

        calendar.set(Calendar.DAY_OF_MONTH,1);

        System.out.println("日\t一\t二\t三\t四\t五\t六");

        for (int i = 1;i<=31;i++){
            System.out.print(calendar.get(Calendar.DAY_OF_MONTH)+"\t");

            if(calendar.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY){
                System.out.println();
            }

            calendar.add(Calendar.DAY_OF_MONTH,1);
        }

    }

}
