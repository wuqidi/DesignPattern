package com.wuqidi.designpattern.singleton.enums;

import org.junit.jupiter.api.Test;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/10 1:37
 */
class SingletonTest {

    @Test
    void doSomething() throws Exception{
        System.out.println(Singleton.SINGLETON.ordinal());
        Thread.sleep(1000);
        Singleton.SINGLETON.doSomething();
    }
}