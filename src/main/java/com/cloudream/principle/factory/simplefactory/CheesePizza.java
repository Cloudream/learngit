package com.cloudream.principle.factory.simplefactory;

/**
 * @author: George Wang
 * @date: 2019/9/7 - 20:03
 * @version: v1.0
 * @description:
 */
public class CheesePizza extends AbstractPizza {
    @Override
    void prepare() {
        System.out.println("Cheese prepare....");
    }
}
