package com.wuqidi.designpattern.decorator;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd>装饰类</dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/12 21:54
 */
public abstract class Decorator extends House{
    private House house;

    public Decorator(House house) {
        this.house = house;
    }

    void goHome() {
        System.out.println("经过统一装饰后");
        this.house.goHome();
    }
}