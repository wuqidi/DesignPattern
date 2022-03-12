package com.wuqidi.designpattern.bridge;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd>早餐食物</dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/12 21:19
 */
public class Breakfast extends Food{

    //假设我们不将 food和brand分开 放到一个类中 可以么？可以，就像我们项目分层的意义mvc mvvc ddd等 都是为了后续迭代的方便
    //为什么一个抽象 一个接口？接口本身就是抽象的特例，二者行为差异还是蛮大的，具体落实桥梁模式，没必要照搬，主要是理解设计的思路。

    public Breakfast(Brand brand) {
        super(brand);
    }

    //这里也可以 覆写父类的一些方法

    @Override
    public void eat() {
        System.out.println("我们的早餐 吃点啥？");
        super.eat();
    }
}
