package yp.JavaSE.Review_08;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author RickYinPeng
 * @ClassName Test_02_DateFormat
 * @Description
 * @date 2019/1/21/9:42
 */
public class Test_02_DateFormat {
    public static void main(String[] args) throws ParseException {

        /**
         * 把时间对象按照"格式字符串指定的格式"转成相应的字符串
         */
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String date = format.format(new Date());
        System.out.println(date);

        /**
         * 把字符串按照"格式字符串指定的格式"转成相应的时间对象
         */
        DateFormat format2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        Date date1 = format2.parse("2019-10-19 14:24:34");

        System.out.println(date1);
    }
}
