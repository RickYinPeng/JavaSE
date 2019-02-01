package yp.JavaSE.Review_10_IO流;

import java.io.File;

/**
 * @author RickYinPeng
 * @ClassName Test_03_FilePath
 * @Description
 * @date 2019/1/24/15:53
 */
public class Test_03_FilePath {
    public static void main(String[] args) {
        String path = "E:/IdeaWorpace/Java_SE/1.txt";

        /**
         * 绝对路径
         */
        File src = new File(path);
        System.out.println(src.getAbsolutePath());

        /**
         * 相对路径
         */
        System.out.println(System.getProperty("user.dir"));
        src = new File("1.txt");
        System.out.println(src.getAbsolutePath());
    }
}
