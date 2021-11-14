package com.wuqidi.designpattern.methodfactory;

import com.wuqidi.designpattern.Production;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2021/11/14 20:10
 */
public class ConcreteCreator extends Creator {
    public <T extends Production> T creatorProduction(Class<T> c) {
        Production result = null;
        try {
            result = (Production) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) result;
    }
}
