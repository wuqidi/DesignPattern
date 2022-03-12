package com.wuqidi.designpattern.proxy;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/12 23:06
 */
public class Proxy implements AAAService{
    private AAAService aaaService;

    public Proxy(AAAService aaaService) {
        this.aaaService = aaaService;
    }

    @Override
    public void doSomething() {
        System.out.println("方法执行前操作");
        aaaService.doSomething();
        System.out.println("方法执行后操作");
    }
}
