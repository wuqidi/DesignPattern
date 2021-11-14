package com.wuqidi.designpattern.singleton;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd>线程同步形式的单例</dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2021/11/14 15:31
 */
public class SyncSingleton {

    private static volatile SyncSingleton singleton;

    public static SyncSingleton getInstance(){
        if(singleton==null){
            synchronized (SyncSingleton.class){
                if(singleton==null){
                    singleton = new SyncSingleton();
                }
            }
        }
        return singleton;
    }
}
