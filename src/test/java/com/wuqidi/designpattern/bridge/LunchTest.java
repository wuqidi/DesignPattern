package com.wuqidi.designpattern.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/12 21:22
 */
class LunchTest {
    @Test
    public void test1(){
        Breakfast breakfast = new Breakfast(new DaLiYuan());
        breakfast.eat();

        Lunch lunch = new Lunch(new QiuLin());
        lunch.eat();

    }

}