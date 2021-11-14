package com.wuqidi.designpattern.singleton;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd>枚举形式的单例</dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2021/11/14 15:29
 */
public enum EnumSingleton {
    INSTANCE(new SyncSingleton());

    private SyncSingleton singleton;

    public SyncSingleton getSingleton() {
        return singleton;
    }

    EnumSingleton(SyncSingleton singleton) {
        this.singleton = singleton;
    }
}
