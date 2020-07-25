package com.qige.test.pattern.decorator;

/**
 * @description:
 * @outhor: luoxiaohei
 * @create: 2020-05-24 10:32
 */

// 摩卡是一个装饰者，所以扩展自 CondimentDecorator
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    // 首先调用委托被装饰者对象，以计算价钱，然后再加上Mocha价钱
    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
