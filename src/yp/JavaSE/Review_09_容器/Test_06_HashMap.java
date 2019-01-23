package yp.JavaSE.Review_09_容器;

import java.util.HashMap;
import java.util.Map;

/**
 * @author RickYinPeng
 * @ClassName Test_06_HashMap
 * @Description 测试HashMap的使用
 * @date 2019/1/23/9:22
 */
public class Test_06_HashMap {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");

        System.out.println("hashCode"+":"+Integer.valueOf(1).hashCode());

        /**
         * 根据key获取map中的值
         */
        String one = map.get(1);
        System.out.println(one);

        /**
         * 获取map的大小
         */
        System.out.println(map.size());

        /**
         * 判断map是否为空
         */
        System.out.println(map.isEmpty());
        /**
         * 判断map中是否包含指定的key
         */
        System.out.println(map.containsKey(2));
        /**
         * 判断map中是否包含指定的值
         */
        System.out.println(map.containsValue("three"));


        Map<Integer,String> map2 = new HashMap<>();
        map2.put(4,"四");
        map2.put(5,"五");

        /**
         * 将整个 map2 中的键和值全部放入 map 中
         */
        map.putAll(map2);

        System.out.println(map);

        /**
         * map中的键不能重复;如果重复(是否重复是根据 equals 方法来判断的)，则新的值覆盖旧的值
         */
        map.put(3,"三");
        System.out.println(map);

        /**
         * map中的值重复，则不影响结果
         */
        map.put(6,"三");
        System.out.println(map);

    }
}
