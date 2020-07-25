package com.qige.test.pattern.factory;

public class Student5 {
    /**
     * volatile 关键字确保对象初始化完成，避免出现指令重排序导致赋值不为 null，但是还未初始化的情况出现
     */
    private volatile static Student5 student5;
    private Student5() {}

    /* 获取实例 */
    public static Student5 getSingletonInstance() {
        if (student5 == null) {
            synchronized (Student5.class) {
                if (student5 == null) {
                    student5 = new Student5();
                }
            }
        }
        return student5;
    }
}