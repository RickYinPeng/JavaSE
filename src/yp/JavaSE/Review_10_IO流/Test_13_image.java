package yp.JavaSE.Review_10_IO流;

import java.io.*;

/**
 * @author RickYinPeng
 * @ClassName Test_13_image
 * @Description 将图片读取到字节数组中
 * @date 2019/1/25/16:49
 */
public class Test_13_image {
    public static void main(String[] args) throws FileNotFoundException {
        byte[] bytes = fileToByteArray("1.png");
        byteArrayToFile(bytes,"a.png");
    }

    /**
     * 将图片读取到字节数组
     * 1：图片到程序：FileInputStream
     * 2：程序到字节数组：ByteArrayOutputStream
     */
    public static byte[] fileToByteArray(String filePath){
        /**
         * 1：创建数据源和目的地
         */
        File src = new File(filePath);
        byte[] desc = null;

        InputStream inputStream = null;
        ByteArrayOutputStream baos = null;
        try {
            /**
             * 2:选择流
             */
            inputStream = new FileInputStream(src);
            baos = new ByteArrayOutputStream();

            /**
             * 循环读操作
             */
            byte[] flush = new byte[1024];//缓冲容器  1024字节==1k
            int len = -1;//接受长度
            while ((len=inputStream.read(flush))!=-1){
                /**
                 * 写出到字节数组中
                 */
                baos.write(flush,0,len);
            }
            baos.flush();
            return baos.toByteArray();

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
        return null;
    }

    /**
     * 将字节数组写出到图片
     * 1：字节数组写出到图片：ByteArrayInputStream
     * 2：程序写出到文件：FileOutputStream
     */
    public static void byteArrayToFile(byte[] src,String filePath) throws FileNotFoundException {
        /**
         * 创建源
         */
        File desc = new File(filePath);

        /**
         * 2：选择流
         */
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new ByteArrayInputStream(src);
            os = new FileOutputStream(desc);

            /**
             * 3：操作
             */
            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = is.read(flush))!=-1){
                os.write(flush,0,len);
            }
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                /**
                 * close方法这里可以不用调
                 */
                is.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
