package yp.JavaSE.Review_10_IO流;

import java.io.*;

/**
 * @author RickYinPeng
 * @ClassName Test_09_FileOutPutStream
 * @Description 文件字节输出流
 * @date 2019/1/25/13:27
 */
public class Test_09_FileOutPutStream {
    /**
     * 1：创建源
     * 2：选择流
     * 3：操作，写出内容
     * 4：释放资源
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 1：创建流，如果不存在会帮你创建，而InputStream必须存在，因为你是读取文件啊
         */
        File desc = new File("desc.txt");

        /**
         * 2：选择流
         */
        OutputStream os = null;

        try {
            /**
             * append参数：
             *          true:将当前所写的内容追加到desc文件的后面
             *          false：将当前所写的内容覆盖之前的内容
             */
            os = new FileOutputStream(desc,false);

            /**
             * 3：操作
             */
            String msg = "asdasdsad";

            //编码
            byte[] datas = msg.getBytes();

            os.write(datas,0,datas.length);

            /**
             * 避免我们的数据驻留在内存
             */
            os.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            /**
             * 4：释放资源
             */
            try {
                if(null!=os){
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
