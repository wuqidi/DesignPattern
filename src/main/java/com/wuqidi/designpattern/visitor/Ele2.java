package com.wuqidi.designpattern.visitor;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/13 3:00
 */
public class Ele2 extends Element{
    @Override
    void doSomething() {
        System.out.println("2号元素");
    }

    @Override
    void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
