package com.wuqidi.designpattern.singleton.lh;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd>懒汉单例</dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/10 1:05
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getSingleton(){
        if(singleton==null){
            singleton = new Singleton();
            //一看就并发问题 懒汉就是懒啊~~~
        }
        return singleton;
    }

    public static synchronized Singleton getSingletonOfSyn(){
        //线程安全 直接缩到方法级别了 会有性能问题
        // 真正要锁的是创建实例这个步骤 不包括返回、获取对象的这个步骤
        // 锁到方法级别就把非共享数据也锁了
        if(singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }

    //升级
    static class SingleGood{
        private static volatile SingleGood singleGood;
        //volatile 保证可见性  但是不保证原子性，用什么保证原子性？synchronized
        private SingleGood() {}

        public static SingleGood getSingleGood(){
            if(singleGood==null){//这就直接锁定到了 共享数据上 不阻塞别的线程获取
                synchronized (SingleGood.class){
                    singleGood = new SingleGood();
                }
            }
            return singleGood;
        }
    }


}
