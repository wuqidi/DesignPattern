package com.wuqidi.designpattern.builder;

import com.wuqidi.designpattern.abstractfactory.Production;
import com.wuqidi.designpattern.abstractfactory.FangFangMian;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2021/11/14 21:14
 */
public class FangFangMianBuilder extends Builder{
    FangFangMian fangFangMian = new FangFangMian();
    public void setType() {
        fangFangMian.setType();
    }

    public Production buildProduction() {
        return fangFangMian;
    }
}
