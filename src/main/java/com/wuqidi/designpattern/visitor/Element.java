package com.wuqidi.designpattern.visitor;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/13 2:57
 */
public abstract class Element {
    abstract void doSomething();//元素特有操作
    abstract void accept(IVisitor visitor);//允许的访问者
}
