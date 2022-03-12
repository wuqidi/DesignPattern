package com.wuqidi.designpattern.observer;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/13 1:19
 */
public class Creator1 extends Creator{
    public void doSomething(){
        Message message = new Message();
        message.setContent("1号通知");
        super.note(message);
    }
}
