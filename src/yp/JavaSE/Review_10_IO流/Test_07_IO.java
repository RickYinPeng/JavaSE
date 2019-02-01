package yp.JavaSE.Review_10_IO流;

import java.io.*;

/**
 * @author RickYinPeng
 * @ClassName Test_07_IO
 * @Description 第一个程序
 * @date 2019/1/25/12:53
 *
 */
public class Test_07_IO {
    /**
     * 1：创建源
     * 2：选择流
     * 3：操作
     * 4：释放资源
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 1:创建源
         */
        File src = new File("1.txt");
        try {
            /**
             * 2:选择流
             */
            InputStream inputStream = new FileInputStream(src);

            /**
             * 3：操作(读取)
             */
            int data1 = inputStream.read();
            int data2 = inputStream.read();
            int data3 = inputStream.read();

            /**
             * 没有数据了，返回-1
             */
            int data4 = inputStream.read();


            System.out.println((char) data1);
            System.out.println((char) data2);
            System.out.println((char) data3);

            System.out.println(data4);

            /**
             * 4：释放资源
             */
            inputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
