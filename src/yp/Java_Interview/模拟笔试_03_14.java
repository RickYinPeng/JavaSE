package yp.Java_Interview;

import java.util.HashMap;
import java.util.Stack;

/**
 * 走斜线
 */
public class 模拟笔试_03_14 {

    public static void test(){
        HashMap<Integer,Integer[]> map = new HashMap<>();

        Integer[] a = {0,1};
        Integer[] b = {1,1};
        Integer[] c = {1,0};
        Integer[] d = {1,-1};
        Integer[] e = {0,-1};
        Integer[] f = {-1,-1};
        Integer[] g = {-1,0};
        Integer[] h = {-1,1};
        map.put(1,a);
        map.put(2,b);
        map.put(3,c);
        map.put(4,d);
        map.put(5,e);
        map.put(6,f);
        map.put(7,g);
        map.put(8,h);

        Integer[][] arr = new Integer[10][10];

        Stack stack = new Stack();
    }
}
