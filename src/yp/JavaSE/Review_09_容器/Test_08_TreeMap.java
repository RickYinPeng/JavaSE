package yp.JavaSE.Review_09_容器;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author RickYinPeng
 * @ClassName Test_08_TreeMap
 * @Description 测试TreeMap
 * @date 2019/1/24/9:03
 */
public class Test_08_TreeMap {
    public static void main(String[] args) {
        Map<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1,"a");
        treeMap.put(2,"b");
        treeMap.put(3,"c");

        /**
         * TreeMap按照key递增的方式进行排序
         */
        for (Integer key : treeMap.keySet()) {
            System.out.println(key+"------"+treeMap.get(key));
        }

        Map<Emp,String> treeMap2 = new TreeMap<>();
        treeMap2.put(new Emp(100,"张三",50000),"张三是一个好小伙");
        treeMap2.put(new Emp(200,"李四",5000),"李四工作不积极");
        treeMap2.put(new Emp(300,"王五",6000),"王五工作还不错");
        treeMap2.put(new Emp(50,"赵六",6000),"赵六是个开心果");

        for (Emp emp : treeMap2.keySet()) {
            System.out.println(emp+"------"+treeMap2.get(emp));
        }

    }
}

class Emp implements Comparable<Emp>{
    private int id;
    private String name;
    private double salary;

    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    /**
     * 负数：小于、0：等于、正数：大于
     * @param o
     * @return
     */
    @Override
    public int compareTo(Emp o) {
        if(this.salary>o.salary){
            return 1;
        }else if(this.salary<o.salary){
            return -1;
        }else{
            if(this.id>o.id){
                return 1;
            }else if(this.id<o.id){
                return -1;
            }else{
                return  0;
            }
        }
    }
}