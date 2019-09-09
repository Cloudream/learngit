package com.cloudream.principle.factory.simplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: George Wang
 * @date: 2019/9/7 - 20:06
 * @version: v1.0
 * @description:
 */
public class OrderPizza {
    private final String GREEK = "greek";
    private final String CHEESE = "cheese";

    public OrderPizza() {
        AbstractPizza pizza = null;
        String orderType;
        do {
            orderType = this.getPizzaType();
            if (GREEK.equals(orderType)) {
                pizza = new GreekPizza();
            } else if (CHEESE.equals(orderType)) {
                pizza = new CheesePizza();
            } else {
                break;
            }
        } while (true);
    }

    private String getPizzaType() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please input pizza type:");
        try {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
