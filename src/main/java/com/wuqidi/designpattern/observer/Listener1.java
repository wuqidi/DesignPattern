package com.wuqidi.designpattern.observer;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/13 1:20
 */
public class Listener1 implements Listener{
    @Override
    public void sendMsg(Message message) {
        System.out.println("1号监听者收到消息:"+message.getContent());
    }
}
