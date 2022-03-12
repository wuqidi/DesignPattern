package com.wuqidi.designpattern.strategy;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd></dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/13 2:31
 */
public class JiSuanQi {
    public static int exect(int a,int b,Caluculator caluculator){
        return caluculator.exect(a,b);
    }
}
