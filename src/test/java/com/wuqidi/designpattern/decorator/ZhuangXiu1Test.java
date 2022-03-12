package com.wuqidi.designpattern.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/12 22:10
 */
class ZhuangXiu1Test {

    @Test
    void goHome() {
        Decorator decorator = new ZhuangXiu1(new MyHouse());
        decorator.goHome();
    }
}