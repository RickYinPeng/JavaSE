package yp.JavaSE.Review_02;

import java.util.Scanner;

/**
 * @author RickYinPeng
 * @ClassName Y_14_键盘输入
 * @Description
 * @date 2018/11/4/19:26
 */
public class Y_14_键盘输入 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入名字：");
        String name = sc.nextLine();
        System.out.println("请输入你的爱好：");
        String hobby = sc.nextLine();
        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();

        System.out.println("---------------------");
        System.out.println(name);
        System.out.println(hobby);
        System.out.println("来到地球的天数"+age*365);

    }
}
