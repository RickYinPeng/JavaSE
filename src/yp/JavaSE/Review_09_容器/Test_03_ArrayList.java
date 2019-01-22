package yp.JavaSE.Review_09_容器;

import java.util.ArrayList;

/**
 * @author RickYinPeng
 * @ClassName Test_03_ArrayList
 * @Description
 * @date 2019/1/22/11:42
 */
public class Test_03_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list01 = new ArrayList<>();

        list01.add("01_aa");

        list01.add("02_bb");

        list01.add("03_cc");

        list01.add("04_cc");

        list01.add("05_cc");

        list01.add("06_cc");

        list01.add("07_cc");

        list01.add("08_cc");

        list01.add("09_cc");

        list01.add("10_cc");

        list01.add("11_cc");

    }
}
/* List<String> list02 = new ArrayList<>();
        list02.add("aa");
        list02.add("dd");
        list02.add("ee");

        System.out.println("list01:"+list01);
        *//**
 * 删除list01和list02中共同有的部分，就是删除交集
 *//*
        list01.removeAll(list02);
        System.out.println("list01:"+list02);

        *//**
 * 取交集
 *//*
        list01.retainAll(list02);

        System.out.println("list01:"+list01);*/