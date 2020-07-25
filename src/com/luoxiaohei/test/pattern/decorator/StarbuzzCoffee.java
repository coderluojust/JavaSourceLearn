package com.luoxiaohei.test.pattern.decorator;

/**
 * @description:
 * @outhor: luoxiaohei
 * @create: 2020-05-24 10:40
 */

// 测试类
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();

        System.out.println(beverage.getDescription() + "$" + beverage.cost());

        Beverage beverage1 = new BlueMountainCoffee();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);
        System.out.println(beverage1.getDescription() + "$" + beverage1.cost());
    }
}
