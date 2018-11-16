package yp.JavaSE.Review_05;

/**
 * @author RickYinPeng
 * @ClassName TextExtends
 * @Description 测试继承
 * @date 2018/11/14/22:45
 */
public class TextExtends {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name="尹鹏";
        stu.height=180;
        stu.rest();
        Student stu2 = new Student("嘻嘻",180,"计算机");
        System.out.println(stu instanceof Student);
        System.out.println(stu2 instanceof Person);
    }
}
class Person /*extends Object*/{
    String name;
    int height;
    public void rest(){
        System.out.println("休息一会！！！");
    }
}
class Student extends Person{

    public Student() {
    }

    String major;

    public Student(String name,int height,String major) {
        this.name = name;
        this.height = height;
        this.major = major;
    }

    public void study(){
        System.out.println("学习两个小时！！");
    }
}
