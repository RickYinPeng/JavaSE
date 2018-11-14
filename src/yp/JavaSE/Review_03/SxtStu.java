package yp.JavaSE.Review_03;

/**
 * @author RickYinPeng
 * @ClassName SxtStu
 * @Description 类和对象
 * @date 2018/11/6/17:53
 */
public class SxtStu {
    //属性
    int id;
    String name;
    int age;
    Computer computer;
    //构造方法,用于创建这个类的对象。无参的构造方法可以由系统自动创建
    SxtStu(){
    }
    //方法
    void study(){
        System.out.println("我在认真学习"+computer.brand);
    }
    void play(){
        System.out.println("我在玩皇帝养成计划！！！");
    }
    public static void main(String[] args) {
        SxtStu sxtStu = new SxtStu();
        sxtStu.id=1010;
        sxtStu.name="尹鹏";
        sxtStu.age=18;
        Computer c1 = new Computer();
        c1.brand= "联想";
        sxtStu.computer = c1;
        sxtStu.study();
        String s = new String();
        s.intern();
    }
}
class Computer{
    String brand;
}
