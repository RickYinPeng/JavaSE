package yp.JavaSE.Review_09_容器;

/**
 * @author RickYinPeng
 * @ClassName Test_07_右移三位
 * @Description 三位右移
 * @date 2019/1/23/12:35
 */
public class Test_07_右移三位 {

    public static void main(String[] args) {
        /**
         * 15的八位二进制：0000 1111
         * 15 >>> 3 :就是将15的二进制数整体向右移动三位，高位补0，地位舍弃
         *           0000 1111 >>>3 = 0000 0001(舍弃了向后移动的那三个1)
         *           0000 0001的值为1，所以 15 >>> 3 = 1
         */
        //System.out.println("15 >>> 3："+(15 >>> 3));

        //System.out.println(1 >>> 16);

        int n = 10 - 1;
        n |= n >>> 1;
        System.out.println(n);
        n |= n >>> 2;
        System.out.println(n);
        n |= n >>> 4;
        System.out.println(n);
        n |= n >>> 8;
        System.out.println(n);
        n |= n >>> 16;

        System.out.println(n);
    }
}
