package com.wuqidi.designpattern.abstractfactory;


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
    public FangFangMian creatorF() {
        return new FangFangMian();
    }

    public WeiShengJin creatorW() {
        return new WeiShengJin();
    }
}
