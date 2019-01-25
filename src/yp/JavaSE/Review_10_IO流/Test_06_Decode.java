package yp.JavaSE.Review_10_IO流;

import java.io.UnsupportedEncodingException;

/**
 * @author RickYinPeng
 * @ClassName Test_06_Decode 解码
 * @Description
 * @date 2019/1/25/11:38
 */
public class Test_06_Decode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg = "性命生命使命";

        /**
         * 编码：字节数组
         * 默认使用工程的字符集
         */
        byte[] bytes = msg.getBytes("GBK");

        /**
         * 解码：字符串
         */
        msg = new String(bytes,0,bytes.length,"gbk");

        System.out.println(msg);
    }

}
