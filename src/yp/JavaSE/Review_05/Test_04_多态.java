package yp.JavaSE.Review_05;

/**
 * @author RickYinPeng
 * @ClassName Test_04_多态
 * @Description
 * @date 2018/11/20/18:57
 */
public class Test_04_多态 {
    public static void main(String[] args) {
        Animal a = new Animal();
        animalCry(a);

        Dog d = new Dog();
        animalCry(d);

        animalCry(new Cat());

        Animal b = new Cat();
        b.shout();

    }
    static void animalCry(Animal a){
        a.shout();
    }
}
class Animal {
    public void shout() {
        System.out.println("叫了一声！");
    }
}
class Dog extends Animal {
    public void shout() {
        System.out.println("旺旺旺！");
    }
    public void seeDoor() {
        System.out.println("看门中....");
    }
}
class Cat extends Animal {
    public void shout() {
        System.out.println("喵喵喵喵！");
    }
}