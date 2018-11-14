package yp.JavaSE.Review_03;

/**
 * @author RickYinPeng
 * @ClassName Y_04_测试静态代码块
 * @Description
 * @date 2018/11/7/22:02
 */
public class Y_04_测试静态代码块 {
}
class User3 {
    int id;        //id
    String name;   //账户名
    String pwd;   //密码
    static String company; //公司名称
    static {
        System.out.println("执行类的初始化工作");
        company = "北京尚学堂";
        printCompany();
        //这里不能调用不同的属性和方法，注意是普通的，可以调用static修饰的，
        //你想啊，你在造汽车的时候，你想让它跑起来可还行？？？？
    }
    public static void printCompany(){
        System.out.println(company);
    }
    public static void main(String[] args) {
        User3  u3 = new User3();
    }
}

