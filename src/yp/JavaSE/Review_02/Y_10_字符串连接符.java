package yp.JavaSE.Review_02;

import java.util.Stack;

/**
 * @author RickYinPeng
 * @ClassName Y_10_字符串连接符
 * @Description 字符串连接符
 * @date 2018/11/2/20:37
 */
public class Y_10_字符串连接符 {
    public static void main(String[] args) {
        String a = "3";
        int b = 4;
        int c = 5;
        char d = 'a';
        System.out.println(a+b+c);//345
        System.out.println(b+c+a);//93
        System.out.println(d+4);//'a'在ASCII码表中是97，Unicode中也是97,97+4=101

        Stack<String> s = new Stack<>();
        s.get(3);
    }
}
