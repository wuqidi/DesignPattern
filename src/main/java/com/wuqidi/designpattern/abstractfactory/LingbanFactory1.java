package com.wuqidi.designpattern.abstractfactory;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/10 23:36
 */
public class LingbanFactory1 extends BaseAbstractFactory{
    public BaseService getInstance(Class<? extends BaseService> zlass) throws Exception {
        //这里就不判断了 try 啥的自己写
        Class<?> forName = Class.forName(zlass.getName());
        return (BaseService) forName.newInstance();
    }
}
