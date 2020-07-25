package com.luoxiaohei.test.pattern.decorator;

/**
 * @description:
 * @outhor: luoxiaohei
 * @create: 2020-05-23 17:58
 */
// 拿铁
public class Latte extends Beverage {

    public Latte() {
        description = "Latte";
    }

    @Override
    public double cost() {
        return .89;
    }
}
