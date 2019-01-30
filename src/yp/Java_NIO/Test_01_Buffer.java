package yp.Java_NIO;

/**
 * @author RickYinPeng
 * @ClassName Test_01_Buffer
 * @Description NIO缓冲区
 * @date 2019/1/28/19:48
 */

import org.junit.Test;

import java.nio.ByteBuffer;

/**
 * 一、缓冲区（Buffer）：在 Java NIO 中负责数据的存取。缓冲区就是数组。用于存储不同类型的数据
 *
 * 根据数据类型不同（boolean 除外），提供了相应类型的缓冲区：
 *
 * ByteBuffer
 * CharBuffer
 * ShortBuffer
 * IntBuffer
 * LongBuffer
 * FloatBuffer
 * DoubleBuffer
 *
 * 上述缓冲区的管理方式几乎一致，通过 allocate() 获取缓冲区
 *
 * 二、缓冲区存取数据的两个核心方法：
 *      put() : 存入数据到缓冲区中
 *      get() : 获取缓冲区中的数据
 *
 * 四、缓冲区的四个核心属性：
 * capacity ：容量，表示缓冲区中最大存储数据的容量。一旦声明不能改变
 * limit ： 界限，表示缓冲区中可以操作数据的大小。（limit 后面的数据不能进行读写）
 * position ： 位置，表示缓冲区中正在操作数据的位置。
 *
 * position <= limit <= capacity
 */
public class Test_01_Buffer {

    @Test
    public void test1(){
        /**
         * 1、分配一个指定大小的缓冲区
         */
        ByteBuffer buf = ByteBuffer.allocate(1024);

        System.out.println("----------------allocate()------------------");
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());

        /**
         * 2、利用 put() 存入数据进去
         */
        String str = "abcde";
        buf.put(str.getBytes());

        System.out.println("----------------put()------------------");
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());

    }

}
