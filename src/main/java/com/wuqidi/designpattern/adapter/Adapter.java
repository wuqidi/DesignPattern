package com.wuqidi.designpattern.adapter;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd>适配器</dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/12 19:51
 */
public class Adapter extends OldService implements NewService{
    //适配器就是 继承了我们的旧服务，方便把旧服务提供的方法进行处理
    // 实现新服务是将 旧服务进行有效转换


    public void hello() {
        //我们要将 旧服务转换为新的服务
        System.out.println("适配转换。。。");
        super.doSomething();
    }
}
