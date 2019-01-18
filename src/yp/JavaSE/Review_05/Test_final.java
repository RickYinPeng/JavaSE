package yp.JavaSE.Review_05;

/**
 * @author RickYinPeng
 * @ClassName Test_final
 * @Description
 * @date 2019/1/18/12:30
 */
public class Test_final {
}
class Father2{
    public final void see(){
        System.out.println("final修饰的方法不能被重写,会报错");
    }
}
class Son2 extends Father2{

}