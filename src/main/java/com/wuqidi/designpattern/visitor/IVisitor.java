package com.wuqidi.designpattern.visitor;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd>访问者</dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/13 2:58
 */
public abstract class IVisitor {
    abstract void visit(Ele1 ele1);
    abstract void visit(Ele2 ele2);
}
