package com.wuqidi.designpattern.visitor;

import java.util.Random;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd>容器</dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/13 3:03
 */
public class RongQi {
    public static Element get(){
        if(new Random().nextInt(10)>4){
            return new Ele1();
        }else{
            return new Ele2();
        }
    }
}
