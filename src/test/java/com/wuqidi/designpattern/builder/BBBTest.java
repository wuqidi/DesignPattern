package com.wuqidi.designpattern.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/11 0:16
 */
class BBBTest {

    @Test
    void builder() {
        BBB b = BBB.builder()
                .age(18).name("泥猴桃")
                .build();

        System.out.println(b);
    }
}