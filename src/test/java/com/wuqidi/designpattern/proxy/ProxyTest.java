package com.wuqidi.designpattern.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/12 23:07
 */
class ProxyTest {

    @Test
    void doSomething() {
        Proxy proxy = new Proxy(new AAAServiceImpl());
        proxy.doSomething();
    }
}