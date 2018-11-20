package yp.JavaSE.Review_05;

/**
 * @author RickYinPeng
 * @ClassName Test_03_super
 * @Description
 * @date 2018/11/20/18:13
 */
public class Test_03_super {
}

class Father{
    int value = 0;

 /*   public Father() {
    }*/

    public Father(int value) {
        this.value = value;
    }
}

class Son extends Father{
    public Son(int value) {
        super(value);
    }
}