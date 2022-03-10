package com.wuqidi.designpattern.methodfactory;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/10 22:55
 */
public class CuoZaoService extends BaseService{
    public void doSomething2() {
        System.out.println("******搓澡******");
    }

    @Override
    public Object doSomething1() {
        return "覆盖基础类的方法";
    }
}
