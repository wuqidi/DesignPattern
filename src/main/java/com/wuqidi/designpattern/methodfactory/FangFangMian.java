package com.wuqidi.designpattern.methodfactory;


import com.wuqidi.designpattern.abstractfactory.Production;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd>方方面</dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2021/11/14 20:06
 */
public class FangFangMian extends Production {
    @Override
    public String getName() {
        return "方方面";
    }

    public String getPrice() {
        return "￥1.12";
    }
}
