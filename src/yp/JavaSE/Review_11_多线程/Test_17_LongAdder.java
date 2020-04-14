package yp.JavaSE.Review_11_多线程;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

public class Test_17_LongAdder {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(5);
        System.out.println(atomicLong.addAndGet(2));
        atomicLong.getAndIncrement();

        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.getAndIncrement();

        LongAdder longAdder = new LongAdder();
        longAdder.add(5);
        System.out.println(longAdder.intValue());
    }

}
