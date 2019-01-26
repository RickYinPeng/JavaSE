package yp.JavaSE.Review_10_IO流;

/**
 * @author RickYinPeng
 * @ClassName Test_20_ObjectStream
 * @Description 对象流 ObjectOutputStream  ObjectInputStream
 * @date 2019/1/26/16:23
 */

import java.io.*;
import java.util.Date;

/**
 * 对象流：
 * 1：写出后读取
 * 2：读取的顺序与写出保持一致
 * 3：不是所有的对象都可以序列化，必须实现Serializable
 */
public class Test_20_ObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
         * 写出
         */
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream dos = new ObjectOutputStream(new BufferedOutputStream(baos));
        /**
         * 操作数据累计+数据
         */
        dos.writeUTF("编码辛酸泪");
        dos.writeInt(18);
        dos.writeBoolean(false);
        dos.writeChar('a');


        /**
         * String对象实现了Serializable接口，所以可以序列化
         * Date对象也实现了Serializable接口
         */
        dos.writeObject("谁解其中味");
        dos.writeObject(new Date());
        dos.writeObject(new Employee("尹鹏",500000));

        dos.flush();

        byte[] datas = baos.toByteArray();
        System.out.println(datas.length);
        /**
         * 读取
         */
        ObjectInputStream dis = new ObjectInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));

        /**
         * 顺序与写出一致
         */
        String msg = dis.readUTF();
        System.out.println(msg);
        int age = dis.readInt();
        System.out.println(age);
        boolean flag = dis.readBoolean();
        System.out.println(flag);
        char c = dis.readChar();
        System.out.println(c);

        /**
         * 看看这种写法
         */
        Object str = dis.readObject();
        if(str instanceof String) {
            System.out.println(str);
        }
        Object date  = dis.readObject();
        if(date instanceof Date) {
            System.out.println(date);
        }
        Object emp= dis.readObject();
        if(emp instanceof Employee){
            System.out.println(emp);
        }
    }
}
class Employee implements Serializable{
    /**
     * 加入我不想让对象中某个字段序列化，比如你像一些敏感信息，如密码之类
     * 那我们就可以在这个字段上加上 transient 就可以让这个字段不序列化
     */
    private transient String name;
    private double salary;

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}