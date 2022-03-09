package com.wuqidi.designpattern.singleton.innerClass;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd>静态内部类单例</dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/10 1:18
 */
public class Singleton {
    private Singleton(){}

    //静态内部类加载时机：使用到静态内部类、非静态内部类 才会加载，外部类加载不会加载内部类。
    // 但是，如果加载静态内部类，会加载外部类
    // 那么我们运用静态内部类的机制优化了 饿汉单例模式，就保证了使用时加载，占内存问题
    private static class SingletonInner{
        private static final Singleton SINGLETON = new Singleton();
    }

    public static Singleton getSingleton(){
        return SingletonInner.SINGLETON;
    }
}
