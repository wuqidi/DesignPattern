package com.wuqidi.designpattern.methodtemplate;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2021/11/14 20:57
 */
public abstract class SaoMiao {
    final public void start(){
        System.out.println("启动红线电源,扫描商品：");
        templateMethod();
        System.out.println("将扫描结果传给电脑");
    }

    protected abstract void templateMethod();
}
