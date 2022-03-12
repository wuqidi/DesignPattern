package com.wuqidi.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/13 1:14
 */
public abstract class Creator {
    private List<Listener> listeners = new ArrayList<>();//ConcurrentSkipListSet

    public void addListener(Listener listener){
        listeners.add(listener);
    }

    public void removeListener(Listener listener){
        //不实现了
    }

    void note(Message message){
        listeners.forEach(v->{
            v.sendMsg(message);
        });
    }
}
