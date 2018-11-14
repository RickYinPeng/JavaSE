package yp.JavaSE.Review_04;

/**
 * @author RickYinPeng
 * @ClassName Y_01_测试值传递
 * @Description 测试值传递
 * @date 2018/11/8/17:26
 */

class User{
    int id;
    String name;
    String pwd;

    //无参构造
    public User() {

    }

    //带两个参数的构造
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void testParameterTransfer01(User u){
        u.name="风清扬";
    }

    public void testparametertransfer02(User u){
        u = new User(200,"东方不败");
    }
}

public class Y_01_测试值传递 {
    public static void main(String[] args) {
        User user = new User(100,"张三丰");
        System.out.println(user.name);

        user.testParameterTransfer01(user);
        System.out.println(user.name);

        user.testparametertransfer02(user);
        System.out.println(user.name);

        String[] s = new String[10];
        System.out.println(s[9]);
    }
}
