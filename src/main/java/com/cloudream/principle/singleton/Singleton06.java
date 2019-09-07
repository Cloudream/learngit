package com.cloudream.principle.singleton;

/**
 * @Author: George Wang
 * @Date: 2019/9/7 - 18:42
 * @VERSION: v1.0
 * @Description: 保证线程安全、利用静态内部类的特点实现延时加载、效率高、强烈推荐使用
 */
public class Singleton06 {
    public static void main(String[] args) {
        Singleton6 instance = Singleton6.getInstance();
        Singleton6 instance1 = Singleton6.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance.hashCode = " + instance.hashCode());
        System.out.println("instance1.hasCode = " + instance1.hashCode());
    }
}

/**
 * 静态内部类
 * 1、外部类加载时不会加载内部类
 * 2、类的静态属性只会在类加载的时候初始化、JVM保证了线程的安全
 */
class Singleton6 {
    private Singleton6() {
    }

    private static class SingletonHolder {
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    public static Singleton6 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
