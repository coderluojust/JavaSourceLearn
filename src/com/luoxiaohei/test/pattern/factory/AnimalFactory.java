package com.luoxiaohei.test.pattern.factory;

// 抽象出来的动物工厂----它只负责生产一种产品
public  class AnimalFactory {
    // 工厂方法
    public static void main(String[] args) {
        Student5 student5 = Student5.getSingletonInstance();
    }

}

