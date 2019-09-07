package com.cloudream.principle.factory.simplefactory;

/**
 * @author: George Wang
 * @date: 2019/9/7 - 20:04
 * @version: v1.0
 * @description:
 */
public class GreekPizza extends AbstractPizza {
    @Override
    void prepare() {
        System.out.println("Greek prepare");
    }
}
