package com.wuqidi.designpattern.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/10 23:38
 */
class LingbanFactoryTest {

    @Test
    void getInstance() throws Exception {
        LingbanFactory1 factory1 = new LingbanFactory1();
        BaseService instance = factory1.getInstance(XiJiaoService.class);
        instance.doSomething1();
        instance.doSomething2();
        //只有这两项基础服务

        LingbanFactory2 factory2 = new LingbanFactory2();
        GaoJiService instance2 = factory2.getInstance(KTVSerivce.class);
        instance2.doSomething1();
        instance2.doSomething2();
        instance2.doSomething3(); //高级的多了一项


        //下面会报错 基础服务没有高级功能
        GaoJiService instance1 = factory2.getInstance(CuoZaoService.class);
        instance2.doSomething1();
        instance2.doSomething2();
        instance2.doSomething3();
    }
}