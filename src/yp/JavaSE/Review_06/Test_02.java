package yp.JavaSE.Review_06;

/**
 * @author RickYinPeng
 * @ClassName Test_02
 * @Description
 * @date 2019/1/21/15:44
 */
public class Test_02 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(-10);
    }
}
class Person{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            throw new IllegalAgeException("年龄不能为负数");
        }
        this.age = age;
    }
}
class IllegalAgeException extends RuntimeException{
    public IllegalAgeException() {
    }

    public IllegalAgeException(String message) {
        super(message);
    }
}