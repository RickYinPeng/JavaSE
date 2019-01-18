package yp.JavaSE.Review_07;

/**
 * @author RickYinPeng
 * @ClassName Test_01
 * @Description
 * @date 2019/1/18/13:06
 */
public class Test_01 {
    public static void main(String[] args) {
        //数组的静态初始化
        int[] a = {2,4,6};
        User[] users = {
                new User(1,"张三"),
                new User(2,"李四"),
                new User(3,"王五"),
                        };
        //默认初始化
        int[] b = new int[3];   //默认给数组元素赋值 数字：0 布尔：false 引用：null

        //直接通过下标挨个赋值就是动态初始化


    }
}
