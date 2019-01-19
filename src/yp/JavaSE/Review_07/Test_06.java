package yp.JavaSE.Review_07;

/**
 * @author RickYinPeng
 * @ClassName Test_06
 * @Description 接口支持多继承
 * @date 2019/1/19/11:59
 */
public class Test_06 {
}
interface InterfaceA{
    void aaa();
}
interface InterfaceB{
    void bbb();
}

/**
 * 接口支持多继承，那么现在接口InterfaceC就拥有接口InterfaceA和InterfaceB的方法了,即拥有aaa()和bbb();
 */
interface InterfaceC extends InterfaceA,InterfaceB{
    void ccc();
}

/**
 * 所以当一个类实现InterfaceC的时候需要去重写这三个方法
 */
class TestClass implements InterfaceC{
    @Override
    public void aaa() {

    }

    @Override
    public void bbb() {

    }

    @Override
    public void ccc() {

    }
}