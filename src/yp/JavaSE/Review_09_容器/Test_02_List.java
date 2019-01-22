package yp.JavaSE.Review_09_容器;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author RickYinPeng
 * @ClassName Test_02_List
 * @Description 测试Collection接口中的方法
 * @date 2019/1/22/11:01
 */
public class Test_02_List {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList();

        System.out.println(c.size());
        System.out.println(c.isEmpty());

        c.add("1");
        c.add("2");
        System.out.println(c);

        System.out.println(c.contains("1"));


        /**
         * 转换成Object数组
         */
        Object[] objects = c.toArray();

        /**
         * 从容器中移除，并不是删除，被移除的对象还在
         */
        c.remove("2");
        System.out.println(c);

        /**
         * 移除所有元素
         */
        c.clear();

        System.out.println(c);
    }

}
