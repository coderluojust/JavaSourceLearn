package test.concurrent.atomic;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description: 原子更新基本类型
 * @outhor: qige
 * @create: 2020-08-29 14:29
 */
public class AtomicBaseTest {

    @Test
    public void testAtomicIntegerTest() {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        int andIncrement = atomicInteger.getAndIncrement();
        System.out.println(andIncrement);
        System.out.println(atomicInteger.get());
    }

}
