package com.wuqidi.designpattern.decorator;

/**
 * <dl>
 * <dt>Description：</dt>
 * <dd>我从地产商手里买的房子</dd>
 * </dl>
 *
 * @author 泥猴桃
 * @date 2022/3/12 21:52
 */
public class MyHouse extends House{
    void goHome() {
        System.out.println("回我自己家");
    }
}
