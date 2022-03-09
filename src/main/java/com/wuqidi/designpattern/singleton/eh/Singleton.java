package com.wuqidi.designpattern.singleton.eh;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd>饿汉模式</dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/10 0:59
 */
public class Singleton {

    private static final Singleton SINGLETON = new Singleton();
    //静态 不可变  保证在类加载的时候就进行初始化并固定下来了 并发也没有问题
    //问题就是，如果没有使用到这个类或者说全程用不到，但是还是进行实例化了，占内存
    //还有个变种，就是这个实例化放到静态代码块中，没个屁用，还是一样问题

    private Singleton() {
    }

    public static Singleton getSingleton(){
        return SINGLETON;
    }
}
