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
 *      根据数据类型不同（boolean 除外），提供了相应类型的缓冲区：
 *
 *      ByteBuffer
 *      CharBuffer
 *      ShortBuffer
 *      IntBuffer
 *      LongBuffer
 *      FloatBuffer
 *      DoubleBuffer
 *
 *      上述缓冲区的管理方式几乎一致，通过 allocate() 获取缓冲区
 *
 * 二、缓冲区存取数据的两个核心方法：
 *      put() : 存入数据到缓冲区中
 *      get() : 获取缓冲区中的数据
 *
 * 四、缓冲区的四个核心属性：
 *      capacity ：容量，表示缓冲区中最大存储数据的容量。一旦声明不能改变
 *      limit ： 界限，表示缓冲区中可以操作数据的大小。（limit 后面的数据不能进行读写）
 *      position ： 位置，表示缓冲区中正在操作数据的位置。
 *
 *      mark ：标记，表示记录当前position的位置。可以通过reset()恢复到mark的位置
 *
 *      position <= limit <= capacity
 *
 * 五、直接缓冲区和非直接缓冲区：
 *      非直接缓冲区：通过 allocate()方法 分配缓冲区，将缓冲区建立在JVM的内存中
 *      直接缓冲区：通过 allocateDirect()方法 分配直接缓冲区，将缓冲区建立在操作系统的物理内存中，可以提高效率
 *
 */
public class Test_01_Buffer {

    @Test
    public void test3(){
        /**
         * 分配直接缓冲区
         */
        ByteBuffer buf = ByteBuffer.allocateDirect(1024);


        /**
         * 判断该缓冲区是否是直接缓冲区
         */
        System.out.println(buf.isDirect());
    }


    @Test
    public void test2(){
        String str = "abcde";

        /**
         * 非直接缓冲区
         */
        ByteBuffer buf = ByteBuffer.allocate(1024);

        buf.put(str.getBytes());

        /**
         * 调用flip之后，读写指针指到缓存头部，并且设置了最多只能读出之前写入的数据长度(而不是整个缓存的容量大小)
         */
        buf.flip();

        byte[] dst = new byte[buf.limit()];
        buf.get(dst,0,2);
        System.out.println(new String(dst,0,2));

        System.out.println(buf.position());

        /**
         * mark()标记一下
         * 调用buffer.remak()时，会将当前的position值赋给remak属性，
         * 保存当前操作的状态，然后get继续执行，当调用buffer.reset（）时，会将之前当前的remark值赋予position,
         */
        buf.mark();

        buf.get(dst,2,2);
        System.out.println(new String(dst,2,2));

        System.out.println(buf.position());

        /**
         * reset() : 恢复到mark的位置
         */
        buf.reset();
        System.out.println(buf.position());//position的位置由 4 --> 2(mark所在的位置)

        /**
         * 判断缓冲区中是否还有剩余数据
         */
        if(buf.hasRemaining()){

            /**
             * 获取缓冲区中可以操作的数量
             */
            System.out.println(buf.remaining());
        }
    }


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

        /**
         * 3、切换成读取数据的模式
         */
        buf.flip();
        System.out.println("----------------flip()------------------");
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());

        /**
         * 4、利用 get() 方法读取缓冲区中的数据
         */
        byte[] dst = new byte[buf.limit()];
        buf.get(dst);
        System.out.println(new String(dst,0,dst.length));

        System.out.println("----------------get()------------------");
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());

        /**
         * 5、rewind() :可重复性读数据，上面我们不是刚刚读完吗，调用rewind方法后，指针跟调用flip方法的一样
         */
        buf.rewind();
        System.out.println("----------------rewind()------------------");
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());

        /**
         * 6、clear() : 清空缓冲区,但是缓冲区中的数据依然存在，数据处于一种 "被遗忘" 状态
         */
        buf.clear();
        System.out.println("----------------clear()------------------");
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());

        /**
         * 不信咱们可以取一下，打印出来
         */
        System.out.println((char)buf.get());
    }
}
