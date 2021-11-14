package com.wuqidi.designpattern.methodfactory;

import com.wuqidi.designpattern.Production;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2021/11/14 20:08
 */
public abstract class Creator {
    public abstract <T extends Production> T creatorProduction(Class<T> c);
}
