package com.wuqidi.designpattern.xiangyuan;

import com.wuqidi.designpattern.abstractfactory.BaseAbstractFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/12 22:43
 */
public class BatteryFactory {
    private static final Map<String,Battery> batteryMaps = new HashMap<>();//ConcurrentHashMap

    public static Battery get(String num){
        synchronized (BaseAbstractFactory.class){
            if(!batteryMaps.containsKey(num)){
                batteryMaps.put(num,new Battery2());
            }
        }
        return batteryMaps.get(num);
    }
}
