package com.wuqidi.designpattern.abstractfactory;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd>基础抽象工厂类</dd>
 * </dl>
 * @author 泥猴桃
 * @date 2022/3/10 23:23
 */
public abstract class BaseAbstractFactory {
    public abstract BaseService getInstance(Class<? extends BaseService> zlass) throws Exception;
}
