package yp.JavaSE.Review_09_容器;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author RickYinPeng
 * @ClassName Test_10_TreeSet
 * @Description TreeSet集合
 * @date 2019/1/24/11:18
 */
public class Test_10_TreeSet {
    public static void main(String[] args) {

        /**
         * TreeSet底层使用的是 TreeMap
         */
        Set<Integer> set = new TreeSet<>();

        /**
         * 按照元素递增的方式
         */
        set.add(300);
        set.add(200);
        set.add(100);
        set.add(400);
        set.add(500);

        for (Integer integer : set) {
            System.out.println(integer);
        }
    }

}
