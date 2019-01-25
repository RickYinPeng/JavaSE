package yp.JavaSE.Review_10_IO流;

import java.io.*;

/**
 * @author RickYinPeng
 * @ClassName Test_11_FileRead
 * @Description 文件输出字符流
 * @date 2019/1/25/15:46
 */
public class Test_11_FileWriter {
    /**
     * 1：创建源
     * 2：选择流
     * 3：操作
     * 4：释放资源
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 1：创建源
         */
        File src = new File("desc.txt");

        Writer writer = null;

        try {
            /**
             * 2:选择流
             */
            writer = new FileWriter(src);

            /**
             * 3：操作：注意：之前我们的字节流操作的是Byte数组，而这里操作的是我们的字符数组
             */

            /**
             * 写法一：
             */
/*            String msg = "你好啊，傻逼";
            writer.write(msg);
            writer.flush();*/

            /**
             * 写法二:
             */
/*            String msg = "你好啊，傻逼";
            char[] datas = msg.toCharArray();
            writer.write(datas,0,datas.length);
            writer.flush();*/

            /**
             * 写法三：
             */
            writer.append("asdasd").append("你好啊世界");
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
