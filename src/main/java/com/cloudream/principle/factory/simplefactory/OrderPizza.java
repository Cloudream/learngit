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
    public OrderPizza() {
        AbstractPizza pizza = null;
        String orderType;
        do {
            orderType = this.getPizzaType();
            if (orderType == "greek") {
                pizza = new GreekPizza();
            } else if (orderType == "cheese") {
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
            String s = br.readLine();
            return s;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
