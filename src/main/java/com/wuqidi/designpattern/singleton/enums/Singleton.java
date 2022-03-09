package com.wuqidi.designpattern.singleton.enums;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd>枚举单例</dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/10 1:28
 */
public enum Singleton {
    SINGLETON;

    public void doSomething(){
        //...
        System.out.println("卧槽操作了");
    }

    //枚举已经继承了 java.lang.Enumle类,所以不能继承其他的类了，只能去实现
    //经过编译后，所有的枚举类型 都变为 public static final 类型 属性名
    //所以说本质上也是对饿汉模式的一个升级，它也是在你用的时候进行加载
}
