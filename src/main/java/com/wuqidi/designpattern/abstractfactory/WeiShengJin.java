package com.wuqidi.designpattern.abstractfactory;


/**
 * <dl>
 * <dt>Description：</dt>
 * <dd>方方面</dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2021/11/14 20:06
 */
public class WeiShengJin extends Production {
    @Override
    public String getName() {
        return "卫生巾";
    }

    public String getPrice() {
        return "￥2.22";
    }
}
