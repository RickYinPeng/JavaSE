package yp.JavaSE.Review_07;

import java.util.Arrays;

/**
 * @author RickYinPeng
 * @ClassName Test_08_冒泡排序
 * @Description 优化冒泡排序
 * @date 2019/1/20/10:01
 */
public class Test_08_冒泡排序 {

    public static void main(String[] args) {
        int[] values = {3,4,2,4,5,7,1,2,8,9,10};

        for(int i = 0;i<values.length;i++){
            boolean flag = true;
            for(int j = 0;j<values.length-1-i;j++){
                if(values[j]>values[j+1]){
                    int temp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = temp;
                    flag = false;
                }
                System.out.println(Arrays.toString(values));
            }
            System.out.println("---------------------------");
            if(flag == true){
                break;
            }
        }
    }
}
