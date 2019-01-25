package yp.JavaSE.Review_10_IO流;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author RickYinPeng
 * @ClassName Test_12_ByteArrayInputStream
 * @Description 字节数组输入流
 * @date 2019/1/25/16:28
 */
public class Test_12_ByteArrayInputStream {
    public static void main(String[] args) {
        /**
         * 1：创建源：字节数组，不要太大
         */
        byte[] src = "talk is cheap show me the code".getBytes();

        /**
         * 2：选择流
         */
        InputStream is = null;

        try {
            is = new ByteArrayInputStream(src);

            /**
             * 3：操作
             */
            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = is.read(flush))!=-1){
                String str = new String(flush,0,len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                /**
                 * close方法这里可以不用调
                 */
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
