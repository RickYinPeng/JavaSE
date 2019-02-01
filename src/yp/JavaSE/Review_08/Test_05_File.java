package yp.JavaSE.Review_08;

import java.io.File;
import java.io.IOException;

/**
 * @author RickYinPeng
 * @ClassName Test_05_File
 * @Description File类
 * @date 2019/1/21/11:38
 */
public class Test_05_File {
    public static void main(String[] args) throws IOException {
        /**
         * 两种写法都ok
         */
        //File file = new File("g:/a.txt");
        File file = new File("g:\\a.txt");

        System.out.println(file);
        /**
         * 对文件改名
         */
        file.renameTo(new File("g:\\bb.txt"));

        /**
         * 项目的路径
         */
        System.out.println(System.getProperty("user.dir"));

        File f2 = new File("1.txt");
        f2.createNewFile();


    }
}
