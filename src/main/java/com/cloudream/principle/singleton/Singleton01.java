package com.cloudream.principle.singleton;

/**
 * @author : George Wang
 * @date ate: 2019/9/7 - 17:35
 * @version : v1.0
 * @description: 可能造成内存浪费
 */
public class Singleton01 {
    public static void main(String[] args) {
        Singleton1 instance = Singleton1.getInstance();
        Singleton1 instance1 = Singleton1.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance.hashCode = " + instance.hashCode());
        System.out.println("instance1.hasCode = " + instance1.hashCode());
    }
}

/**
 * 饿汉式(静态常量)
 */
class Singleton1 {
    private Singleton1() {
    }

    private static final Singleton1 singleton1 = new Singleton1();

    public static Singleton1 getInstance() {
        return singleton1;
    }
}
