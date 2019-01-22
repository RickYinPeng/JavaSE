package yp.JavaSE.Review_09_容器;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RickYinPeng
 * @ClassName Test_01_Generic
 * @Description 测试泛型
 * @date 2019/1/22/10:47
 */
public class Test_01_Generic {
    public static void main(String[] args) {
        MyCollection<String> mc = new MyCollection<String>();
        mc.set("尹鹏",0);

        /**
         * 这里报错，前面我们定义的泛型是String，那么我们Set的时候也必须是String
         */
        /*mc.set(9888,1);
        int  o = (int) mc.get(1)*/;

        String s = mc.get(0);

        List list = new ArrayList();
    }
}
class MyCollection<E>{
    Object[] objs = new Object[5];
    public void set(E e,int index){
        objs[index] = e;
    }
    public E get(int index) {
        return (E) objs[index];
    }
}
