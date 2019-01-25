package yp.JavaSE.Review_10_IO流;

import java.io.*;

/**
 * @author RickYinPeng
 * @ClassName Test_09_FileOutPutStream
 * @Description 字节数组输出流
 * @date 2019/1/25/13:27
 */
public class Test_12_ByteArrayOutputStream {
    /**
     * 1：创建源
     * 2：选择流
     * 3：操作，写出内容
     * 4：释放资源
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 1：创建源
         */
        byte[] desc = null;

        /**
         * 2：选择流(新增方法)
         */
        ByteArrayOutputStream bao = null;

        try {
            bao = new ByteArrayOutputStream();

            /**
             * 3：操作
             */
            String msg = "show me the code";

            //编码
            byte[] datas = msg.getBytes();

            bao.write(datas,0,datas.length);

            /**
             * 避免我们的数据驻留在内存
             */
            bao.flush();

            /**
             * 获取数据
             */
            desc = bao.toByteArray();
            System.out.println(new String(desc,0,desc.length));
            System.out.println(new String(datas,0,datas.length));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            /**
             * 4：释放资源
             */
            try {
                bao.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
