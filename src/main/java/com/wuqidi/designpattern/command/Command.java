package com.wuqidi.designpattern.command;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/13 0:21
 */
public class Command {
    private BaseService baseService;
    void todo(){
        baseService.doSomething();
    }

    public Command(BaseService baseService) {
        this.baseService = baseService;
    }
}
