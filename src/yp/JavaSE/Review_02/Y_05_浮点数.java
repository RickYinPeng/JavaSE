package yp.JavaSE.Review_02;

/**
 * @author RickYinPeng
 * @ClassName Y_05_浮点数
 * @Description
 * @date 2018/11/1/17:46
 */
public class Y_05_浮点数 {

    float a = 3.14f;
    double b = 6.28;
    double c = 628E-2;

    public static void main(String[] args) {
        float f = 0.1f;
        double d = 1.0/10;
        System.out.println(f==d);//false

        //浮点数不精确，一定不要用于比较
        float d1 = 423432423f;
        float d2 = d1+1;
        if(d1==d2){
            System.out.println("d1==d2");//输出结果为d1==d2
        }else{
            System.out.println("d1!=d2");
        }
    }
}
