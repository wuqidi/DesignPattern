package com.wuqidi.designpattern.singleton;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd>静态内部类形式的单例</dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2021/11/14 16:29
 */
public class StaticInnerSingleton {

    public static StaticInnerSingleton getInstance() {
        return InnerClazz.SINGLETON;
    }


    static class InnerClazz {
        public static final StaticInnerSingleton SINGLETON = new StaticInnerSingleton();
    }
}
