package yp.JavaSE.Review_07;

import java.util.Arrays;

/**
 * @author RickYinPeng
 * @ClassName Test_09_二分查找
 * @Description 二分查找
 * @date 2019/1/20/11:39
 */
public class Test_09_二分查找 {

    public static void main(String[] args) {
        int[] arry = {30,20,50,10,80,9,7,12,100,40,8};
        Arrays.sort(arry);

        int value = 10;

        System.out.println(Arrays.toString(arry));
        int i = myBinarySearch(arry, value);
        System.out.println(i);

    }

    public static int myBinarySearch(int[] arr,int value){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(value==arr[mid]){
                return mid;
            }
            if(value>arr[mid]){
                low = mid+1;
            }

            if(value<arr[mid]){
                high = mid-1;
            }
        }
        return -1;
    }
}
