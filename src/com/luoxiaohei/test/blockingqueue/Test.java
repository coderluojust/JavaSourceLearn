package com.luoxiaohei.test.blockingqueue;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @outhor: qige
 * @create: 2020-07-20 7:18
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(2);

        arrayBlockingQueue.offer(1);
        arrayBlockingQueue.put("2");
        System.out.println("满了");
        boolean offer = arrayBlockingQueue.offer(3, 3000, TimeUnit.MILLISECONDS);
        System.out.println(offer);
        for (Object i : arrayBlockingQueue) {
            System.out.println(i);
        }
    }
}
