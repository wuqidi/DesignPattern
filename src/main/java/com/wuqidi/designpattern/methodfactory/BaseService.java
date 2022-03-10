package com.wuqidi.designpattern.methodfactory;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd>基础服务类</dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/10 22:48
 */
public abstract class BaseService {
    //这个类 也可以是接口的形式 主要还是看你想表达什么

    public Object doSomething1(){
        //这里可以调用子类实现的方法等 进而去做一些操作
        doSomething2();
        return "doSomething1";
    }

    public abstract void doSomething2();//子类去实现这个类
}
