package com.wuqidi.designpattern.abstractfactory;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/10 23:27
 */
public class KTVSerivce extends GaoJiService{
    public void doSomething2() {
        System.out.println("有请老板高歌一曲 我的老父亲 感谢在座的兄弟们");

    }

    @Override
    public Object doSomething1() {
        super.doSomething1();
        System.out.println("掌声");
        return "大郎喝药！";
    }

    public void doSomething3() {
        System.out.println("拒绝黄~拒绝赌~拒绝黄赌毒~~");
    }
}
