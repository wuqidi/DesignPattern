package com.wuqidi.designpattern.command;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/13 0:23
 */
public class Boss {
    private Command command;

    public Boss(Command command) {
        this.command = command;
    }

    public  void play(){
        command.todo();
    }
}
