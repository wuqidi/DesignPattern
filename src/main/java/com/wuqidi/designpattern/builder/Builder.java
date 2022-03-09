package com.wuqidi.designpattern.builder;

import com.wuqidi.designpattern.abstractfactory.Production;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2021/11/14 21:12
 */
public abstract class Builder {
    public abstract void setType();
    public abstract Production buildProduction();
}
