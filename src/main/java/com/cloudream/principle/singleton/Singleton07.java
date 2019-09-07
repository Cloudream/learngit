package com.cloudream.principle.singleton;

/**
 * @Author: George Wang
 * @Date: 2019/9/7 - 18:51
 * @VERSION: v1.0
 * @Description: 不仅解决了线程同步，延时加载等问题，而且还能防止反序列化重新创建新的对象、Effective作者强烈推荐
 */
public class Singleton07 {
    public static void main(String[] args) {
        Singleton7 instance = Singleton7.INSTANCE;
        Singleton7 instance1 = Singleton7.INSTANCE;
        System.out.println(instance == instance1);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance1.hashCode=" + instance1.hashCode());
        instance.say();
    }
}

/**
 * 枚举方法实现单例
 */
enum Singleton7 {
    INSTANCE;

    public void say() {
        System.out.println("OK");
    }
}