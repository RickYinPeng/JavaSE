package yp.JavaSE.Review_11_多线程;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Test_16_Random {
    public static void main(String[] args) {
        Random random = new Random();
        random.nextInt(5);
        random.nextInt();
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        threadLocalRandom.nextInt();
    }
}
