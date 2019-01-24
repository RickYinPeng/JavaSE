package yp.JavaSE.Review_10_IO流;

import java.io.File;

/**
 * @author RickYinPeng
 * @ClassName Test_02_File
 * @Description File
 * @date 2019/1/24/15:47
 */
public class Test_02_File {

    public static void main(String[] args) {
        String path = "E:/IdeaWorpace/Java_SE/gg.txt";

        /**
         * 1：构造File对象
         */
        File src = new File(path);
        System.out.println(src.length());

        /**
         * 2：构造File对象
         */
        src = new File("E:/IdeaWorpace/Java_SE/gg.txt");
    }


}
