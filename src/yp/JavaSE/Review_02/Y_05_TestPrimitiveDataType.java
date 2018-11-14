package yp.JavaSE.Review_02;

/**
 * @author RickYinPeng
 * @ClassName Y_05_TestPrimitiveDataType
 * @Description 测试基本数据类型
 * @date 2018/10/26/17:56
 */
public class Y_05_TestPrimitiveDataType {
    public static void main(String[] args) {
        //测试整型
        int a = 15;
        int b = 015;    //以0开头是八进制
        int c = 0x16;   //0x开头是16进制
        int d = 0b1101; //0b开头是二进制
        System.out.println(b);//输出13，是因为1*8+5=13,十进制就是乘10了
        System.out.println(c);//1*16+6 = 22
        System.out.println(d);//13

        byte age = 30;
        short salary = 30000;
        int population = 20000000;   //整型常量默认是int类型
        long globPopulation = 7400000000L;//后面加L就是表示这是一个long类型的常量
    }
}
