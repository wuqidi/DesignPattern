package com.wuqidi.designpattern.strategy;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/13 2:30
 */
public class SUBCaluculator extends Caluculator {
    @Override
    int exect(int a, int b) {
        return a - b;
    }
}
