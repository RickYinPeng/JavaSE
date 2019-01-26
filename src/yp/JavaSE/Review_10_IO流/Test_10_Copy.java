package yp.JavaSE.Review_10_IO流;

        import java.io.*;

/**
 * @author RickYinPeng
 * @ClassName Test_10_Copy
 * @Description 文件拷贝
 * @date 2019/1/25/13:43
 */
public class Test_10_Copy {
    public static void main(String[] args) {
        /**
         * 源头
         */
        File src = new File("gg.txt");
        /**
         * 拷贝的目的地
         */
        File desc = new File("desc.txt");

        OutputStream os = null;
        InputStream is = null;

        try {
            is = new FileInputStream(src);
            os = new FileOutputStream(desc);

            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = is.read(flush))!=-1){
                os.write(flush,0,len);
            }
            os.flush();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                /**
                 * 释放资源：先打开的后关闭
                 */
                //先使用到输入流所以后关闭输入流
                if(null!=os){
                    os.close();
                }
                if(null!=is){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
