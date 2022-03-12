package com.wuqidi.designpattern.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/12 19:54
 */
class AdapterTest {

    @Test
    void hello() {
        //原来
        OldService oldService = new OldService();
        oldService.doSomething();

        //适配之后
        Adapter adapter = new Adapter();
        adapter.hello();
    }
}