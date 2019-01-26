package yp.JavaSE.Review_10_IO流;


import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author RickYinPeng
 * @ClassName Test_22_RandomStream
 * @Description 随机读取和写入流 RandomAccessFile
 * @date 2019/1/26/20:37
 */
public class Test_22_RandomStream {
    public static void main(String[] args) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(new File("desc.txt"),"r");

        /**
         * 随机读取,此处是从文件的第2个位置开始
         */
        randomAccessFile.seek(2);

        /**
         * 操作
         */
        byte[] flush = new byte[1024];

        int len = -1;

        while((len = randomAccessFile.read(flush))!=-1){
            System.out.println(new String(flush,0,len));
        }

        randomAccessFile.close();
    }
    @Test
    public void test() throws IOException {

        RandomAccessFile randomAccessFile = new RandomAccessFile(new File("E:\\IdeaWorpace\\Java_SE\\src\\yp\\JavaSE\\Review_10_IO流\\Test_13_image.java"),"r");

        /**
         * 起始位置
         */
        int beginPos = 2;
        /**
         * 实际大小
         */
        int activateSize = 1026;

        randomAccessFile.seek(2);

        /**
         * 操作
         */
        byte[] flush = new byte[1024];

        int len = -1;

        while((len = randomAccessFile.read(flush))!=-1){
            /**
             * 获取本次所有内容
             */
            if(activateSize>len){
                System.out.println("-------------------------------------");
                System.out.println(new String(flush,0,len));
                activateSize -= len;
            }else{
                System.out.println("-------------------------------------");
                System.out.println(new String(flush,0,activateSize));
                break;
            }
        }
        randomAccessFile.close();
    }
}
