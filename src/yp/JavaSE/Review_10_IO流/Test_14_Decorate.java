package yp.JavaSE.Review_10_IO流;

/**
 * @author RickYinPeng
 * @ClassName Test_14_Decorate
 * @Description 实现放大器对声音的放大功能
 * @date 2019/1/26/12:03
 */
public class Test_14_Decorate {
    public static void main(String[] args) {
        Person p = new Person();
        p.say();

        /**
         * 装饰
         */
        Amplifier a = new Amplifier(p);
        a.say();
    }
}
interface Say{
    void say();
}
class Person implements Say{
    /**
     * 属性
     */
    private int voice = 10;

    @Override
    public void say() {
        System.out.println("人的声音为:"+this.voice);
    }

    public int getVoice() {
        return voice;
    }

    public void setVoice(int voice) {
        this.voice = voice;
    }
}

class Amplifier implements Say{

    private Person p;

    public Amplifier(Person p) {
        this.p = p;
    }

    @Override
    public void say() {
        System.out.println("人的声音为："+p.getVoice()*100);
        System.out.println("噪音。。。。。");
    }
}