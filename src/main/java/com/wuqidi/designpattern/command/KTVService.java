package com.wuqidi.designpattern.command;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/13 0:20
 */
public class KTVService implements BaseService{
    @Override
    public void doSomething() {
        System.out.println("老板~ 来唱歌啊...");
    }
}
