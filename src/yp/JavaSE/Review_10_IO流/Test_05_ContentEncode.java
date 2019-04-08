package yp.JavaSE.Review_10_IO流;

import java.io.UnsupportedEncodingException;

/**
 * @author RickYinPeng
 * @ClassName Test_05_ContentEncode 编码
 * @Description 字符串----->字节··
 * @date 2019/1/25/10:08
 */
public class Test_05_ContentEncode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg = "性命生命使命";
        /**
         * 编码：字节数组
         * 默认使用工程的字符集
         */
        byte[] bytes = msg.getBytes();
        System.out.println(bytes.length);

        byte[] bytes1 = msg.getBytes("utf-8");
        System.out.println(bytes1.length);

        byte[] bytes2 = msg.getBytes("UTF-16LE");
        System.out.println(bytes2.length);

        byte[] bytes3 = msg.getBytes("GBK");
        System.out.println(bytes3.length);
    }
}
