package yp.JavaSE.Review_07;

/**
 * @author RickYinPeng
 * @ClassName Animal
 * @Description 抽象类和抽象方法
 * @date 2019/1/19/11:18
 */
public abstract class Animal {

    /**
     * 抽象类也可以定义普通的字段属性
     */
    private String name;

    /**
     * 抽象类可以包含构造方法，但是我们不能调用这个构造方法，会报错
     */
    public Animal() {
    }

    /**
     * 如果一个类中有抽象方法，那么这个类一定是抽象类
     * 抽象方法的意义在于：将方法的设计和方法的实现分离了
     */
    public abstract void run();

    /**
     * 抽象类中可以有普通方法，就跟我们平常的类一样
     */
    public void breath(){
        System.out.println("普通方法");
        /**
         * 我们在这个抽象类的普通方法中调用了它的一个抽象方法，有人就疑惑了，其实这里会调用子类的run方法
         * 这个我们之前说过，在多态提高篇中说过
         */
        run();
    }
}

/**
 * 子类继承一个抽象类：
 * 1：要么实现抽象类的所有抽象方法
 * 2：要么将其本身定义为抽象类，就像这样：class abstract Cat extends Animal{} 这样就可以不用重写抽象方法了
 */
class Cat extends Animal{

    /**
     * 子类继承抽象类，那么必须实现抽象类中的抽象方法
     */
    @Override
    public void run() {

    }

}