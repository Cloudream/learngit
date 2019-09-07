package com.cloudream.principle.singleton;

/**
 * @Author: George Wang
 * @Date: 2019/9/7 - 18:26
 * @VERSION: v1.0
 * @Description:
 */
public class Singleton05 {
    public static void main(String[] args) {
        Singleton5 instance = Singleton5.getInstance();
        Singleton5 instance1 = Singleton5.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance.hashCode = " + instance.hashCode());
        System.out.println("instance1.hasCode = " + instance1.hashCode());
    }
}

/**
 * 双重检查，解决线程安全，与效率问题、懒加载
 * volatile 可以让修改值立即更新到主存（轻量级synchronized）
 */
class Singleton5 {
    private static volatile Singleton5 singleton5;

    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        if (singleton5 == null) {
            synchronized (Singleton5.class) {
                if (singleton5 == null) {
                    singleton5 = new Singleton5();
                }
            }
        }
        return singleton5;
    }
}