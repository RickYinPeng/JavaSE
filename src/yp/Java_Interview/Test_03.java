package yp.Java_Interview;

import java.lang.reflect.Field;

/**
 * @author RickYinPeng
 * @ClassName Test_03
 * @Description
 * @date 2019/1/29/9:47
 */
public class Test_03 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Integer i = 40;
        Field field = i.getClass().getDeclaredField("value");
        field.setAccessible(true);

        System.out.println(field.get(i));

        Integer a = 1;
        Integer b = 2;

        System.out.println("before swap a:" + a + "," + "b:" + b);
        swap(a, b);
        System.out.println("after swap a:" + a + "," + "b:" + b);
    }
    private static void swap(Integer num1, Integer num2) {
        Integer temp = num1;
        num1 = num2;
        num2 = temp;
    }
    private static void swap(String num1, String num2) {
        String temp = num1;
        num1 = num2;
        num2 = temp;
    }
    public void test(){
        Integer i = new Integer(1);
        String s = new String("a");
        Byte b = new Byte((byte) 1);
        Short ss = new Short((short) 1);
        Long l = new Long(1);
        Double d = new Double(12.3);
        Float f =new Float(12.3);
        Character c = new Character('c');
    }

    public void test2(){
        Integer i = 2;
        i = 3;
    }

}
