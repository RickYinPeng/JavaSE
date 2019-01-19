package yp.JavaSE.Review_05;

/**
 * @author RickYinPeng
 * @ClassName Test_05_回调
 * @Description
 * @date 2019/1/19/12:22
 */
public class Test_05_回调 {
}
class Myframe{
    public void paint(){
        System.out.println("吧自己窗口画出来");
    }
}

class GameFrame01 extends Myframe{
    @Override
    public void paint() {
        System.out.println("GameFrame01.paint()");
        System.out.println("画窗口");
    }
}
class PaintFrame{
    public static void drawFrame(Myframe f){
        System.out.println("启动线程");
        System.out.println("增加循环");
        System.out.println("查看消息栈");

        /**
         * 传入不同的子类就会执行不同的paint方法
         */
        //画窗口
        f.paint();

        System.out.println("启动缓存，增加效率");
    }

    public static void main(String[] args) {
        drawFrame(new GameFrame01());
    }
}