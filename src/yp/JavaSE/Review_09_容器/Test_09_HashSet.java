package yp.JavaSE.Review_09_容器;

import java.util.HashSet;
import java.util.Set;

/**
 * @author RickYinPeng
 * @ClassName Test_09_HashSet
 * @Description 测试HashSet
 * @date 2019/1/24/9:45
 */
public class Test_09_HashSet {
    public static void main(String[] args) {

        /**
         * Set：没有顺序，不可重复
         * List：有顺序，可重复
         */
        Set<String> set1 = new HashSet<>();

        /**
         * HashSet底层使用的时HashMap
         * 因为HashSet底层是使用的HashMap，因为HashMap的key是不能重复的
         * 而我们HashSet底层将我们当前要add的值作为HashMap的keyput进去，所以Set集合的元素唯一
         */
        set1.add("aa");
        set1.add("bb");
        set1.add("aa");
        System.out.println(set1);
        set1.remove("bb");
        System.out.println(set1);

        Set<String> set2 = new HashSet<>();
        set2.add("尹鹏");
        set2.addAll(set1);
        System.out.println(set2);



    }
}
