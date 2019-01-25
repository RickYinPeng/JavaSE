package yp.JavaSE.Review_10_IO流;

import java.io.*;

/**
 * @author RickYinPeng
 * @ClassName Test_11_FileRead
 * @Description 文件输入字符流
 * @date 2019/1/25/15:46
 */
public class Test_11_FileRead {
    /**
     * 1：创建源
     * 2：选择流
     * 3：操作
     * 4：释放资源
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 1：创建源
         */
        File src = new File("desc.txt");

        Reader reader = null;

        try {
            /**
             * 2:选择流
             */
            reader = new FileReader(src);

            /**
             * 3：操作：注意：之前我们的字节流操作的是Byte数组，而这里操作的是我们的字符数组
             */
            char[] flush = new char[1];
            int len = -1;

            while ((len = reader.read(flush))!=-1){
                /**
                 * 字符数组---->字符串（不存在解码）
                 */
                String str = new String(flush,0,len);
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
