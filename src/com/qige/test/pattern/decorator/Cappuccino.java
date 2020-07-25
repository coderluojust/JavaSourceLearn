package com.qige.test.pattern.decorator;

/**
 * @description:
 * @outhor: luoxiaohei
 * @create: 2020-05-23 18:00
 */
// 卡布奇诺
public class Cappuccino extends Beverage {

    public Cappuccino() {
        description = "Cappuccino";
    }

    @Override
    public double cost() {
        return 23;
    }
}
