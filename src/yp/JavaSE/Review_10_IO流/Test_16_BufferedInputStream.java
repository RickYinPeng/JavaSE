package yp.JavaSE.Review_10_IO流;

import java.io.*;

/**
 * @author RickYinPeng
 * @ClassName Test_16_BufferedInputStream
 * @Description
 * @date 2019/1/26/12:27
 */
public class Test_16_BufferedInputStream {
    public static void main(String[] args) {
        /**
         * 1:创建源
         */
        File src = new File("1.txt");
        BufferedInputStream bufferedInputStream = null;
        try {
            /**
             * 2:选择流
             */
            bufferedInputStream = new BufferedInputStream(new FileInputStream(src));
            /**
             * 循环读操作
             */
            byte[] flush = new byte[1024];//缓冲容器  1024字节==1k
            int len = -1;//接受长度
            while ((len=bufferedInputStream.read(flush))!=-1){
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
            /**
             * BufferedInputStream在内部会帮我们关闭
             */
            /*try {
                if(null!=inputStream){
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }*/
            try {
                bufferedInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void test() throws FileNotFoundException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("1.png"));
    }
}
