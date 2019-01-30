package yp.Java_Interview;

/**
 * @author RickYinPeng
 * @ClassName Test_01
 * @Description
 * @date 2019/1/28/20:09
 */

import java.lang.reflect.Field;

/**
 * 在main中定义了两个Integer a和b ，通过swap方法，交换两个值，请写出swap方法
 */
public class Test_01 {
    public static void main(String[] args) {
        Integer a = 1;//自动装箱 = Integer.valueof(1)
        Integer b = 2;
        System.out.println(a==b);//false;

        System.out.println("before swap a:" + a + "," + "b:" + b);
        swap(a, b);
        System.out.println("after swap a:" + a + "," + "b:" + b);

    }

    private static void swap(Integer num1, Integer num2) {
        try {
            Field field = Integer.class.getDeclaredField("value");
            field.setAccessible(true);

            int temp = num1.intValue();
            System.out.println(temp);

            field.set(num1,num2);// IntegerCache[129] = num2 = 2 ===> IntegerCache[129]=2

          /*  Integer bb = 1; // bb 到底是什么值？ 值是2
            System.out.println(bb);//打印的是 2，有意思*/

            System.out.println(temp);

            field.set(num2,new Integer(temp));// IntegerCache[130] = temp = ? = 2
           /*
           或者这样
            field.setInt(num1,temp);
            */

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
