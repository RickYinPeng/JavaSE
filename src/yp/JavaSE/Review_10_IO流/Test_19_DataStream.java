package yp.JavaSE.Review_10_IO流;

import java.io.*;

/**
 * @author RickYinPeng
 * @ClassName Test_19_DataStream
 * @Description 数据流：DataInputStream DataOutputStream
 * @date 2019/1/26/16:05
 */
public class Test_19_DataStream {

    /**
     * 处理我们的八大基本数据类的流
     */
    public static void main(String[] args) throws IOException {
        /**
         * 写出
         */
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(baos));
        /**
         * 操作数据累计+数据
         */
        dos.writeUTF("编码辛酸泪");
        dos.writeInt(18);
        dos.writeBoolean(false);
        dos.writeChar('a');
        dos.flush();

        byte[] datas = baos.toByteArray();
        System.out.println(datas.length);
        /**
         * 读取
         */
        DataInputStream dis = new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));

        /**
         * 顺序与写出一致
         */
        String msg = dis.readUTF();
        System.out.println(msg);
        int age = dis.readInt();
        System.out.println(age);
        boolean flag = dis.readBoolean();
        System.out.println(flag);
        char c = dis.readChar();
        System.out.println(c);
    }
}
