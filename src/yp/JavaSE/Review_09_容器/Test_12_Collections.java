package yp.JavaSE.Review_09_容器;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author RickYinPeng
 * @ClassName Test_12_Collections
 * @Description Collections辅助类的作用
 * @date 2019/1/24/12:21
 */
public class Test_12_Collections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        for(int i = 0;i<10;i++){
            list.add("gao"+i);
        }
        System.out.println(list);

        /**
         * 随机排列list中的元素
         */
        Collections.shuffle(list);
        System.out.println(list);

        /**
         * 逆序排列
         */
        Collections.reverse(list);
        System.out.println(list);

        /**
         * 按照递增的方式排序
         */
        Collections.sort(list);
        System.out.println(list);

        /**
         * 二分查找法
         */
        System.out.println(Collections.binarySearch(list,"张三"));
        System.out.println(Collections.binarySearch(list,"gao1"));

    }
}
