package com.cloudream.principle.singleton;

/**
 * @Author: George Wang
 * @Date: 2019/9/7 - 18:04
 * @VERSION: v1.0
 * @Description: 起到懒加载方式的功能、只能在单线程下使用，多线程会存在问题
 */
public class Singleton03 {
    public static void main(String[] args) {
        Singleton3 instance = Singleton3.getInstance();
        Singleton3 instance1 = Singleton3.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance.hashCode = " + instance.hashCode());
        System.out.println("instance1.hasCode = " + instance1.hashCode());
    }
}

/**
 * 懒汉式（线程不安全）
 */
class Singleton3 {
    private static Singleton3 singleton3;

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        if (singleton3 == null) {
            singleton3 = new Singleton3();
        }
        return singleton3;
    }


}
