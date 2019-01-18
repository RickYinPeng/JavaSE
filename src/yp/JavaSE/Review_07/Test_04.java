package yp.JavaSE.Review_07;

/**
 * @author RickYinPeng
 * @ClassName Test_04
 * @Description
 * @date 2019/1/18/14:06
 */
public class Test_04 {
    public static void main(String[] args) {
        HttpServlet httpServlet = new MyHttpServlet();
        httpServlet.service();
    }
}
class HttpServlet {

    public void service(){
        System.out.println("调用HttpServlet的service方法");
        doGet();
    }
    public void doGet(){
        System.out.println("调用HttpServlet的doGet方法");
    }
}
class MyHttpServlet extends HttpServlet{
    @Override
    public void doGet() {
        System.out.println("调用MyHttpServlet的doGet方法");
    }
}