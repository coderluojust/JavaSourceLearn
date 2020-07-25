package com.luoxiaohei.test.pattern.decorator;

/**
 * @description:
 * @outhor: luoxiaohei
 * @create: 2020-05-23 18:02
 */
// 蓝山
public class BlueMountainCoffee extends Beverage {

    public BlueMountainCoffee() {
        description = "BlueMountainCoffee";
    }

    @Override
    public double cost() {
        return 0;
    }
}
