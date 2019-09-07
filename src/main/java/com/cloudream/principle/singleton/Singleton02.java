package com.cloudream.principle.singleton;

/**
 * @Author: George Wang
 * @Date: 2019/9/7 - 17:50
 * @VERSION: v1.0
 * @Description: 可能造成内存浪费
 */
public class Singleton02 {
    public static void main(String[] args) {
        Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance1 = Singleton2.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance.hashCode = " + instance.hashCode());
        System.out.println("instance1.hasCode = " + instance1.hashCode());
    }
}

/**
 * 饿汉式（静态代码块）
 */
class Singleton2 {
    private Singleton2() {}

    private static Singleton2 singleton2 ;
    static {
        singleton2 = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return singleton2;
    }
}
