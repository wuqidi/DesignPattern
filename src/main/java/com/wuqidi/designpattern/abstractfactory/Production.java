package com.wuqidi.designpattern.abstractfactory;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd>工厂方法模式 顶级抽象类</dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2021/11/14 20:03
 */
public abstract class Production {
    public String getName(){
        return "工厂顶级产品";
    }

    public void setType(){
        System.out.println("顶级类型");
    }

    public abstract String getPrice();
}
