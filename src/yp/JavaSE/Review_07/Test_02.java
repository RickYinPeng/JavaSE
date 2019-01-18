package yp.JavaSE.Review_07;

/**
 * @author RickYinPeng
 * @ClassName Test_02
 * @Description
 * @date 2019/1/18/13:16
 */
public class Test_02 {
    public static void main(String[] args) {
        int[] a = new int[4];

        //初始化数组元素的值
        for (int i = 0;i<a.length;i++){
            a[i] = 100*i;
        }

        //foreach循环，用于读取元素的值，不能修改元素的值
        for (int i : a) {
            i = 3;
            System.out.println(i);
        }

        System.out.println("---------------------");

        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
