package yp.JavaSE.Review_09_容器;

import org.junit.Test;

import java.util.*;

/**
 * @author RickYinPeng
 * @ClassName Test_11_Iterator
 * @Description
 * @date 2019/1/24/11:45
 */
public class Test_11_Iterator {
    public static void main(String[] args) {
        testIteratorList();
        //testIteratorSet();



    }

    /**
     * 迭代器遍历List集合
     */
    public static void testIteratorList(){
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        Iterator<String> iteratora = list.iterator();


        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            /**
             * 将当前内容返回，并且将游标指向下一个
             */
            String next =  iterator.next();
            System.out.println(next);
        }
    }

    /**
     * 迭代器遍历Set集合
     */
    public static void testIteratorSet(){
        Set<String> set = new HashSet<>();

        set.add("aa");
        set.add("bb");
        set.add("cc");

        for(Iterator<String> iterator = set.iterator();iterator.hasNext();){
            String next = iterator.next();
            System.out.println(next);
        }
    }

    /**
     * 迭代器遍历Map集合方式一
     */
    @Test
    public  void testIteratorMap_01(){
        Map<Integer,String> map = new HashMap<>();
        map.put(100,"aa");
        map.put(200,"bb");
        map.put(300,"cc");

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();

        for (Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator(); iterator.hasNext(); ) {
            Map.Entry<Integer, String> next =  iterator.next();
            System.out.println(next);
        }
    }

    /**
     * 迭代器遍历Map集合方式二
     */
    @Test
    public  void testIteratorMap_02(){
        Map<Integer,String> map = new HashMap<>();
        map.put(100,"aa");
        map.put(200,"bb");
        map.put(300,"cc");

        Set<Integer> integers = map.keySet();
        for (Iterator<Integer> iterator = integers.iterator(); iterator.hasNext(); ) {
            Integer next =  iterator.next();
            System.out.println(map.get(next));
        }
    }
}
