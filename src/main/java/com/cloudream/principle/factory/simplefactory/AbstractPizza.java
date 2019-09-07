package com.cloudream.principle.factory.simplefactory;

/**
 * @author: George Wang
 * @date: 2019/9/7 - 19:56
 * @version: v1.0
 * @description:
 */
public abstract class AbstractPizza {
    protected String pizzaName;

    /**
     * prepare
     */
    abstract void prepare();

    /**
     * bake
     */
    public void bake() {
        System.out.println(pizzaName + "baking;");
    }

    /**
     * cut
     */
    public void cut() {
        System.out.println(pizzaName + "cutting;");
    }

    public void pack() {
        System.out.println(pizzaName + "packing;");
    }


    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }
}
