package com.wuqidi.designpattern.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/11 0:42
 */
class LaLaLaTest {

    @Test
    void testClone() throws Exception{
        String[] ss = new String[]{"a","b"};
        LaLaLa la = LaLaLa.builder()
                .arr(ss).age(123).mm(new Long(123123L)).name("泥猴桃")
                .build();
        System.out.println(la);

        LaLaLa clone = la.clone();
        System.out.println(clone);

        System.out.println(la==clone);


    }
}