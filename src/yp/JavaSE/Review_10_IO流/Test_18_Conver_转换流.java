package yp.JavaSE.Review_10_IO流;

import java.io.*;

/**
 * @author RickYinPeng
 * @ClassName Test_18_Conver_转换流
 * @Description 转换六：InputStreamReader   OutputStreamWriter
 * @date 2019/1/26/15:34
 */
public class Test_18_Conver_转换流 {
    public static void main(String[] args) {
        try (
                /**
                 * 操作Sysytem.in  和 System.out
                 */
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {

            /**
             * 循环获取键盘的输入（exit退出），输出此内容
             */
            String msg = "";
            while (!msg.equals("exit")) {
                msg = br.readLine();
                bw.write(msg);
                bw.newLine();
                /**
                 * BufferedWriter是缓冲输入流，意思是调用BufferedWriter的write方法时候。
                 * 数据是先写入到缓冲区里，并没有直接写入到目的文件里。
                 * 必须调用BufferedWriter的flush()方法。这个方法会刷新一下该缓冲流，
                 * 也就是会把数据写入到目的文件里。或者你可以调用BufferedWriter的close()方法，
                 * 该方法会在关闭该输入流之前先刷新一下该缓冲流。也会把数据写入到目的文件里。
                 */
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
