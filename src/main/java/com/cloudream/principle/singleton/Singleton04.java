package com.cloudream.principle.singleton;

/**
 * @Author: George Wang
 * @Date: 2019/9/7 - 18:13
 * @VERSION: v1.0
 * @Description: 效率太低、不推荐
 */
public class Singleton04 {
    public static void main(String[] args) {
        Singleton4 instance = Singleton4.getInstance();
        Singleton4 instance1 = Singleton4.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance.hashCode = " + instance.hashCode());
        System.out.println("instance1.hasCode = " + instance1.hashCode());
    }
}

/**
 * 懒汉式（线程安全,同步方法）
 */
class Singleton4 {
    private static Singleton4 singleton4;

    private Singleton4() {
    }

    public static synchronized Singleton4 getInstance() {
        if (singleton4 == null) {
            singleton4 = new Singleton4();
        }
        return singleton4;
    }
}

/**
 * 这种写法是完全错误,多线程下亦会创建多个实例
 */
class Singleton004 {
    private static Singleton004 singleton004;

    private Singleton004() {
    }

    public static synchronized Singleton004 getInstance() {
        if (singleton004 == null) {
            synchronized (Singleton004.class) {
                singleton004 = new Singleton004();
            }
        }
        return singleton004;
    }
}
