package com.luoxiaohei.test.pattern.decorator;

/**
 * @description:
 * @outhor: luoxiaohei
 * @create: 2020-05-23 17:55
 */

// 调料抽象类即装饰者类，这个类必须要能替换 Beverage，所以要继承自 Beverage 类
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
}
