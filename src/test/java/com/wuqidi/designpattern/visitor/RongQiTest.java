package com.wuqidi.designpattern.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/13 3:05
 */
class RongQiTest {

    @Test
    void get() {
        for (int i = 0; i < 10; i++) {
            Element element = RongQi.get();
            element.accept(new Visitor());
        }
    }
}