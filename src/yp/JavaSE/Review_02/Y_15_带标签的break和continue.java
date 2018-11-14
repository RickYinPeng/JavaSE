package yp.JavaSE.Review_02;

/**
 * @author RickYinPeng
 * @ClassName Y_15_带标签的break和continue
 * @Description 打印101-150之间所有的质数
 * @date 2018/11/5/17:51
 */
public class Y_15_带标签的break和continue {
    public static void main(String[] args) {
        outer: for (int i = 101; i < 150; i++) {
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0){
                    continue outer;
                }
            }
            System.out.print(i + "  ");
        }
    }
}
