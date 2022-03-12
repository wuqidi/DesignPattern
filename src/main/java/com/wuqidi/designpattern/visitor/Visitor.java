package com.wuqidi.designpattern.visitor;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/13 3:02
 */
public class Visitor extends IVisitor{
    @Override
    void visit(Ele1 ele1) {
        ele1.doSomething();
    }

    @Override
    void visit(Ele2 ele2) {
        ele2.doSomething();
    }
}
