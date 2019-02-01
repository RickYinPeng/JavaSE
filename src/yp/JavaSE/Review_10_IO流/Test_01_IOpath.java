package yp.JavaSE.Review_10_IO流;

import java.io.File;

/**
 * @author RickYinPeng
 * @ClassName Test_01_IOpath
 * @Description
 * @date 2019/1/24/15:40
 */
public class Test_01_IOpath {
    /**
     *  \ /:名称分隔符 separator
     * @param args
     */
    public static void main(String[] args) {
        String path = "E:\\IdeaWorpace\\Java_SE\\1.txt";

        /**
         * 输出：\
         */
        System.out.println(File.separatorChar);

        /**
         * 建议
         * 1：使用 /
         */
        path = "E:/IdeaWorpace/Java_SE/1.txt";
        System.out.println(path);

        /**
         * 2：常量拼接
         */
        path = "E:"+File.separator+"IdeaWorpace"+File.separator+"Java_SE"+File.separator+"Java_SE";
        System.out.println(path);
    }

}
