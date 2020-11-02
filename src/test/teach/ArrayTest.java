package test.teach;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @description:
 * @outhor: qige
 * @create: 2020-10-18 18:47
 */
public class ArrayTest {

    public static void main(String[] args) {

        int[] aa = {7, 2, 89, 23, 46, 67, 8};
        // 排序前
        System.out.println(Arrays.toString(aa));
        Arrays.sort(aa);
        // 排序后
        System.out.println(Arrays.toString(aa));
    }


}

