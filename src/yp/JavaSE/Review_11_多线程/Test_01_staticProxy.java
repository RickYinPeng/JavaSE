package yp.JavaSE.Review_11_多线程;

/**
 * @author RickYinPeng
 * @ClassName Test_01_staticProxy
 * @Description 静态代理
 * @date 2019/1/27/10:09
 */
/**
 * 静态代理
 * 公共接口：
 * 1、真实角色
 * 2、代理角色
 */
public class Test_01_staticProxy {
    public static void main(String[] args) {
        WeddingCompany weddingCompany = new WeddingCompany(new You());
        weddingCompany.happyMarry();

        /**
         * new Thread(new Runnable() ：此处就是使用的静态代理，后面我们会接触动态代理
         */
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}

/**
 * 公共接口
 */
interface Marry{
    void happyMarry();
}

/**
 * 真实角色
 */
class You implements Marry{

    @Override
    public void happyMarry() {
        System.out.println("你和你喜欢的女孩子结婚了");
    }
}

class WeddingCompany implements Marry{

    /**
     * 真实角色
     */
    private Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void happyMarry() {
        read();
        this.target.happyMarry();
        after();
    }

    private void after() {
        System.out.println("闹洞房");
    }

    private void read() {
        System.out.println("婚前布置");
    }
}