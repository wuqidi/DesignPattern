package com.wuqidi.designpattern.methodfactory;

import com.wuqidi.designpattern.Production;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2021/11/14 20:15
 */
public class FactoryMain {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Production production = creator.creatorProduction(FangFangMian.class);
        System.out.println(production.getName());
    }
}
