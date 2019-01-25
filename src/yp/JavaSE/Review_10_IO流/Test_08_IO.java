package yp.JavaSE.Review_10_IO流;

import java.io.*;

/**
 * @author RickYinPeng
 * @ClassName Test_08_IO
 * @Description 文件字节输入流
 * @date 2019/1/25/12:59
 */
public class Test_08_IO {
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
        File src = new File("gg.txt");
        InputStream inputStream = null;
        try {
            /**
             * 2:选择流
             */
            inputStream = new FileInputStream(src);
             /**
             * 循环读操作
             */
            byte[] flush = new byte[1024];//缓冲容器  1024字节==1k
            int len = -1;//接受长度
            while ((len=inputStream.read(flush))!=-1){
                /**
                 * 字节数组--->字符串
                 */
                String str = new String(flush,0,len);
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            /**
             * 4：释放资源
             */
            try {
                if(null!=inputStream){
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
