package yp.Java_NIO;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author RickYinPeng
 * @ClassName Test_04_BlockingNIO2
 * @Description
 * @date 2019/2/1/12:38
 */
public class Test_04_BlockingNIO2 {

    //客户端
    @Test
    public void client() throws IOException, InterruptedException {
        SocketChannel sChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 9898));

        FileChannel inChannel = FileChannel.open(Paths.get("1.txt"), StandardOpenOption.READ);

        ByteBuffer buf = ByteBuffer.allocate(1024);

        System.out.println("客户端开始读取信息");
        while(inChannel.read(buf)!=-1){
            Thread.sleep(100);
            System.out.println("客户端----");
            buf.flip();
            sChannel.write(buf);
            buf.clear();
        }
        System.out.println("客户端读取完毕并且发送过去");

        sChannel.shutdownOutput();

        System.out.println("客户端等待服务端");
        //接受服务端的反馈
        int len = 0;
        while ((len = sChannel.read(buf))!=-1){
            Thread.sleep(1000);
            System.out.println("客户端等待服务端的数据");
            buf.flip();
            System.out.println(new String(buf.array(),0,len));
            buf.clear();
        }
        System.out.println("客户端已经接受服务端消息");

        inChannel.close();
        sChannel.close();
    }

    //服务端
    @Test
    public void server() throws IOException, InterruptedException {
        ServerSocketChannel ssChannel = ServerSocketChannel.open();

        ssChannel.bind(new InetSocketAddress(9898));

        SocketChannel sChannel = ssChannel.accept();

        ByteBuffer buf = ByteBuffer.allocate(1024);

        FileChannel outChannel = FileChannel.open(Paths.get("2.txt"), StandardOpenOption.WRITE, StandardOpenOption.CREATE);

        System.out.println("服务端等待接受客户端消息");
        while (sChannel.read(buf)!=-1){
            System.out.println("服务端------");
            Thread.sleep(1000);
            buf.flip();
            outChannel.write(buf);
            buf.clear();
        }
        System.out.println("服务端接受客户端消息成功");

        //给客户端返回信息
        buf.put("服务端接受客户端数据成功".getBytes());
        buf.flip();
        sChannel.write(buf);

        outChannel.close();
        sChannel.close();
        ssChannel.close();


    }

}
