package yp.Java_NIO;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.SortedMap;

/**
 * 一、通道（Channel）：用于源节点与目标节点的一个连接。在Java NIO中负责缓冲区中数据的传输。
 *     通道（Channel）本身不存储数据，因此需要配合缓冲区进行操作。
 *
 * 二、通道的主要实现类
 *      java.nio.Channel 接口：
 *          |-- FileChannel
 *          |-- SocketChannel
 *          |-- ServerSocketChannel
 *          |-- DatagramChannel
 * 三、获取通道
 *      1、Java针对支持的通道类提供了 getChannel() 方法
 *         本地IO:
 *          FileInputStream/FileOutputStream
 *          RandomAccessFile
 *         网络IO：
 *          Socket
 *          ServerSocket：
 *          DatagramSocket：
 *      2、在JDK1.7中的 NIO2 针对各个通道提供了一个静态方法 open()
 *      3、在JDK1.7中的 NIO2 的 Files 工具类的 newByteChannel()
 * 四、通道之间的数据传输
 *      transferFrom()
 *      transferTo()
 * 五、分散（Scatter）与聚集（Gather）
 *      分散读取（Scattering Reads）：将通道中的数据分散到多个缓冲区中
 *      聚集写入（Gathering Writes）：将多个缓冲区中的数据聚集到通道中
 * 六、字符集：Charset
 *      编码：字符集 -> 字节数组
 *      解码：字节数组 -> 字符串
 */
public class Test_02_Channel {

    /**
     *
     */
    @Test
    public void test6() throws CharacterCodingException {
        /**
         * 获取某种字符集
         */
        Charset gbk = Charset.forName("GBK");

        /**
         * 获取编码器
         */
        CharsetEncoder encoder = gbk.newEncoder();

        /**
         * 获取解码器
         */
        CharsetDecoder decoder = gbk.newDecoder();

        CharBuffer charBuffer = CharBuffer.allocate(1024);
        charBuffer.put("尚硅谷威武！");
        charBuffer.flip();

        /**
         * 编码
         */
        ByteBuffer byteBuffer = encoder.encode(charBuffer);

        for(int i = 0;i<12;i++){
            System.out.println(byteBuffer.get());
        }
        /**
         * 解码
         */
        byteBuffer.flip();
        CharBuffer decode = decoder.decode(byteBuffer);
        System.out.println(decode.toString());
        System.out.println("-----");

    }


    /**
     * 查看有多少种字符集
     */
    @Test
    public void test5(){
        SortedMap<String, Charset> map = Charset.availableCharsets();
        for (String s : map.keySet()) {
            Charset charset = map.get(s);
            System.out.println(s+"="+charset);
        }
    }


    //分散和聚集
    @Test
    public void test4() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("1.txt","rw");

        /**
         * 1、获取通道
         */
        FileChannel channel = randomAccessFile.getChannel();

        /**
         * 2、分配指定大小的缓冲区
         */
        ByteBuffer buf1 = ByteBuffer.allocate(100);
        ByteBuffer buf2 = ByteBuffer.allocate(1024);

        /**
         * 3、分散读取
         */
        ByteBuffer[] bufs = {buf1,buf2};
        channel.read(bufs);

        for (ByteBuffer buf : bufs) {
            buf.flip();
        }
        System.out.println(new String(bufs[0].array(),0,bufs[0].limit()));
        System.out.println("--------------------------------");
        System.out.println(new String(bufs[1].array(),0,bufs[1].limit()));

        /**
         * 4、聚集写入
         */
        RandomAccessFile accessFile = new RandomAccessFile("2.txt","rw");

        FileChannel channel1 = accessFile.getChannel();

        channel.write(bufs);

        channel1.close();
        channel.close();

    }


    /**
     * 通道之间的数据传输（直接缓冲区）
     */
    @Test
    public void test3() throws IOException {
        FileChannel inChannel = FileChannel.open(Paths.get("1.png"), StandardOpenOption.READ);
        FileChannel outChannel = FileChannel.open(Paths.get("4.png"), StandardOpenOption.WRITE,StandardOpenOption.READ,StandardOpenOption.CREATE_NEW);

        //inChannel.transferTo(0,inChannel.size(),outChannel);
        outChannel.transferFrom(inChannel,0,inChannel.size());

        inChannel.close();
        outChannel.close();
    }


    /**
     * 2、使用直接缓冲区完成文件的复制（内存映射文件）
     */
    @Test
    public void test2() throws IOException {
        /**
         * open(Path path,OpenOption...options):
         *      Path:路径，可以通过 Paths.get("1.png") 来得到
         *      OpenOption...options：可变参数，其实现类 StandardOpenOption ，StandardOpenOption.READ：读模式
         */
        FileChannel inChannel = FileChannel.open(Paths.get("1.png"), StandardOpenOption.READ);

        /**
         * open(Path path,OpenOption...options):
         *      Path ：路径，可以通过 Paths.get("1.png") 来得到
         *      OpenOption...options ：可变参数，其实现类 StandardOpenOption ，StandardOpenOption.WRITE：写模式,StandardOpenOption.READ 读，模式
         *      StandardOpenOption.CREATE_NEW ：写入的文件如果不存在则创建一个新的文件，如果存在则会报错
         *      StandardOpenOption.CREATE ： 写入的文件如果不存在则创建一个新的文件，如果存在则覆盖
         */
        FileChannel outChannel = FileChannel.open(Paths.get("4.png"), StandardOpenOption.WRITE,StandardOpenOption.READ,StandardOpenOption.CREATE_NEW);

        /**
         * 内存映射文件
         *  下面这句代码跟 ByteBuffer.allocateDirect(1024); 作用一样，只不过是获取的方式不同
         */
        MappedByteBuffer inMappedBuf = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, inChannel.size());

        /**
         * 注意：直接缓冲区的方式只有ByteBuffer支持，就是只能是字节
         */

        MappedByteBuffer outMappedBuf = outChannel.map(FileChannel.MapMode.READ_WRITE, 0, inChannel.size());

        /**
         * 直接对缓冲区进行数据读写操作
         */
        byte[] dst = new byte[inMappedBuf.limit()];
        inMappedBuf.get(dst);
        outMappedBuf.put(dst);

        inChannel.close();
        outChannel.close();

    }
    /**
     * 1、利用通道完成文件的复制（非直接缓冲区）
     */
    @Test
    public void test1(){
        FileInputStream fis = null;
        FileOutputStream fos = null;

        FileChannel inChannel = null;
        FileChannel outChannel = null;
        try {
            fis = new FileInputStream("1.png");

            fos = new FileOutputStream("3.png");

            //①：获取通道
            inChannel = fis.getChannel();
            outChannel = fos.getChannel();

            //②：分配指定大小缓冲区
            ByteBuffer buf = ByteBuffer.allocate(1024);

            //③：将通道中的数据存入缓冲区
            while (inChannel.read(buf)!=-1){
                buf.flip();//切换读取数据的模式

                //④：将缓冲区中的数据写入通道
                outChannel.write(buf);
                buf.clear();//清空缓冲区
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outChannel.close();
                inChannel.close();
                fos.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
