package yp.JavaSE.Review_10_IO流;

import java.io.*;

/**
 * @author RickYinPeng
 * @ClassName Test_17_BufferReader
 * @Description 文件字符输入缓冲流
 * @date 2019/1/26/15:14
 */
public class Test_17_BufferReader {

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

            BufferedReader reader = null;

            try {
                /**
                 * 2:选择流
                 */
                reader = new BufferedReader(new FileReader(src));

                /**
                 * 3：操作：注意：之前我们的字节流操作的是Byte数组，而这里操作的是我们的字符数组
                 */
                String line = null;
                while ((line = reader.readLine()) != null) {
                    /**
                     * 字符数组---->字符串（不存在解码）
                     */
                    System.out.println(line);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
}