package com.luoxiaohei.test.pattern.decorator;

/**
 * @description:
 * @outhor: luoxiaohei
 * @create: 2020-05-23 18:01
 */
// 意式浓缩咖啡
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 25;
    }
}
