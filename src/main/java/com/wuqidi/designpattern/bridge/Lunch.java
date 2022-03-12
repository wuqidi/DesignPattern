package com.wuqidi.designpattern.bridge;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd>午餐食物</dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/12 21:19
 */
public class Lunch extends Food{

    public Lunch(Brand brand) {
        super(brand);
    }

    //这里也可以 覆写父类的一些方法
}
