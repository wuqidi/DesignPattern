package com.wuqidi.designpattern.builder;

import com.wuqidi.designpattern.abstractfactory.Production;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2021/11/14 21:18
 */
public class Directory {
    Builder builder = new FangFangMianBuilder();
    public Production getFangFangMian(){
        builder.setType();
        return builder.buildProduction();
    }
}
