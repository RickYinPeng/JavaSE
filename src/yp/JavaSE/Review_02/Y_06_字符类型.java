package yp.JavaSE.Review_02;

import org.junit.Test;

/**
 * @author RickYinPeng
 * @ClassName Y_06_字符类型
 * @Description 测试字符类型和布尔类型
 * @date 2018/11/1/19:04
 */
public class Y_06_字符类型 {
    public static void main(String[] args) {
        char a = 'T';
        char b = '尚';
        char c = '\u0061';
        System.out.println(c);

        //转义字符
        System.out.println(""+'a'+'\n'+'b');
        System.out.println(""+'a'+'\t'+'b');
        System.out.println(""+'a'+'\''+'b');//想表示 a'b

        //String就是字符序列
        String d = "abc";

        //测试布尔类型
        boolean man = true;

        //第一种写法
        if(man){
            System.out.println("男性");
        }

        //第二种写法，但是不建议这样写
        if(man==true){
            System.out.println("男性");
        }

        //如果你将第二种写法写错，那么这个语句就会变为：
        //先给把true赋值给man，再判断man的值
        man = false;
        if(man=true){
            System.out.println("男性");
        }
    }

    @Test
    public void test(){
        char a = 'a';
        char b = 'b';
        System.out.println(a+b);
    }

}
