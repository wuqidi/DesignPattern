package com.wuqidi.designpattern.methodfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/10 23:03
 */
class ServiceFactoryTest {

    @Test
    void getInstance() throws Exception{
        BaseService cuozao = ServiceFactory.getInstance(CuoZaoService.class);
        cuozao.doSomething1();
        cuozao.doSomething2();

        BaseService xijiao = ServiceFactory.getInstance(XiJiaoService.class);
        xijiao.doSomething1();
        xijiao.doSomething2();

        //******搓澡******
        //******洗脚******
        //******洗脚******
        //搓澡怎么一次？因为搓澡覆写了父方法，父方法是调用了doSomething2的
        //洗脚两次 父方法调用一次 这里显示调用一次
    }
}