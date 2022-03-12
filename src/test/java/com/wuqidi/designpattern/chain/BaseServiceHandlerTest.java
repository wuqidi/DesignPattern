package com.wuqidi.designpattern.chain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/12 23:47
 */
class BaseServiceHandlerTest {

    @Test
    void todo() {
        BaseServiceHandler g3 = new Girl3(null);
        BaseServiceHandler g2 = new Girl2(g3);
        BaseServiceHandler g1 = new Girl1(g2);
        Req req = new Req(10);
        g1.todo(req);
    }
}