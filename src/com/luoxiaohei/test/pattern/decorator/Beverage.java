package com.luoxiaohei.test.pattern.decorator;

/**
 * @description:
 * @outhor: luoxiaohei
 * @create: 2020-05-23 17:51
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }
    // cost必须在子类实现
    public abstract double cost();
}
